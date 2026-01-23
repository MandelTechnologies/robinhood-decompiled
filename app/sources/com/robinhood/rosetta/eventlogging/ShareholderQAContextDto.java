package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.BooleanDto;
import com.robinhood.rosetta.eventlogging.ShareholderQAContext;
import com.robinhood.rosetta.eventlogging.ShareholderQAContextDto;
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

/* compiled from: ShareholderQAContextDto.kt */
@Metadata(m3635d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 02\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\b/0123456B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013¢\u0006\u0004\b\u0006\u0010\u0014JB\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u0013J\b\u0010!\u001a\u00020\u0002H\u0016J\b\u0010\"\u001a\u00020\tH\u0016J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0096\u0002J\b\u0010'\u001a\u00020(H\u0016J\u0018\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020(H\u0016J\b\u0010.\u001a\u00020(H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\f\u001a\u00020\r8F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u00118F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0012\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u00067"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$Surrogate;)V", "event_slug", "", "entry_point", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;", "event_state", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "is_shareholder", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "vote_button_state", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto;", "event_section", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto;", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto;)V", "getEvent_slug", "()Ljava/lang/String;", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;", "getEvent_state", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getVote_button_state", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto;", "getEvent_section", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto;", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "EntryPointDto", "EventStateDto", "VoteButtonStateDto", "EventSectionDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class ShareholderQAContextDto implements Dto3<ShareholderQAContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<ShareholderQAContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<ShareholderQAContextDto, ShareholderQAContext>> binaryBase64Serializer$delegate;
    private static final ShareholderQAContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ ShareholderQAContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private ShareholderQAContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final String getEvent_slug() {
        return this.surrogate.getEvent_slug();
    }

    public final EntryPointDto getEntry_point() {
        return this.surrogate.getEntry_point();
    }

    public final EventStateDto getEvent_state() {
        return this.surrogate.getEvent_state();
    }

    public final BooleanDto is_shareholder() {
        return this.surrogate.is_shareholder();
    }

    public final VoteButtonStateDto getVote_button_state() {
        return this.surrogate.getVote_button_state();
    }

    public final EventSectionDto getEvent_section() {
        return this.surrogate.getEvent_section();
    }

    public /* synthetic */ ShareholderQAContextDto(String str, EntryPointDto entryPointDto, EventStateDto eventStateDto, BooleanDto booleanDto, VoteButtonStateDto voteButtonStateDto, EventSectionDto eventSectionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EntryPointDto.INSTANCE.getZeroValue() : entryPointDto, (i & 4) != 0 ? EventStateDto.INSTANCE.getZeroValue() : eventStateDto, (i & 8) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 16) != 0 ? VoteButtonStateDto.INSTANCE.getZeroValue() : voteButtonStateDto, (i & 32) != 0 ? EventSectionDto.INSTANCE.getZeroValue() : eventSectionDto);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ShareholderQAContextDto(String event_slug, EntryPointDto entry_point, EventStateDto event_state, BooleanDto is_shareholder, VoteButtonStateDto vote_button_state, EventSectionDto event_section) {
        this(new Surrogate(event_slug, entry_point, event_state, is_shareholder, vote_button_state, event_section));
        Intrinsics.checkNotNullParameter(event_slug, "event_slug");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(event_state, "event_state");
        Intrinsics.checkNotNullParameter(is_shareholder, "is_shareholder");
        Intrinsics.checkNotNullParameter(vote_button_state, "vote_button_state");
        Intrinsics.checkNotNullParameter(event_section, "event_section");
    }

    public static /* synthetic */ ShareholderQAContextDto copy$default(ShareholderQAContextDto shareholderQAContextDto, String str, EntryPointDto entryPointDto, EventStateDto eventStateDto, BooleanDto booleanDto, VoteButtonStateDto voteButtonStateDto, EventSectionDto eventSectionDto, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareholderQAContextDto.surrogate.getEvent_slug();
        }
        if ((i & 2) != 0) {
            entryPointDto = shareholderQAContextDto.surrogate.getEntry_point();
        }
        if ((i & 4) != 0) {
            eventStateDto = shareholderQAContextDto.surrogate.getEvent_state();
        }
        if ((i & 8) != 0) {
            booleanDto = shareholderQAContextDto.surrogate.is_shareholder();
        }
        if ((i & 16) != 0) {
            voteButtonStateDto = shareholderQAContextDto.surrogate.getVote_button_state();
        }
        if ((i & 32) != 0) {
            eventSectionDto = shareholderQAContextDto.surrogate.getEvent_section();
        }
        VoteButtonStateDto voteButtonStateDto2 = voteButtonStateDto;
        EventSectionDto eventSectionDto2 = eventSectionDto;
        return shareholderQAContextDto.copy(str, entryPointDto, eventStateDto, booleanDto, voteButtonStateDto2, eventSectionDto2);
    }

    public final ShareholderQAContextDto copy(String event_slug, EntryPointDto entry_point, EventStateDto event_state, BooleanDto is_shareholder, VoteButtonStateDto vote_button_state, EventSectionDto event_section) {
        Intrinsics.checkNotNullParameter(event_slug, "event_slug");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(event_state, "event_state");
        Intrinsics.checkNotNullParameter(is_shareholder, "is_shareholder");
        Intrinsics.checkNotNullParameter(vote_button_state, "vote_button_state");
        Intrinsics.checkNotNullParameter(event_section, "event_section");
        return new ShareholderQAContextDto(new Surrogate(event_slug, entry_point, event_state, is_shareholder, vote_button_state, event_section));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public ShareholderQAContext toProto() {
        return new ShareholderQAContext(this.surrogate.getEvent_slug(), (ShareholderQAContext.EntryPoint) this.surrogate.getEntry_point().toProto(), (ShareholderQAContext.EventState) this.surrogate.getEvent_state().toProto(), (Boolean) this.surrogate.is_shareholder().toProto(), (ShareholderQAContext.VoteButtonState) this.surrogate.getVote_button_state().toProto(), (ShareholderQAContext.EventSection) this.surrogate.getEvent_section().toProto(), null, 64, null);
    }

    public String toString() {
        return "[ShareholderQAContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof ShareholderQAContextDto) && Intrinsics.areEqual(((ShareholderQAContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: ShareholderQAContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 <2\u00020\u0001:\u0002;<BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fBW\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u000e\u0010\u0014J\t\u0010'\u001a\u00020\u0003HÆ\u0003J\t\u0010(\u001a\u00020\u0005HÆ\u0003J\t\u0010)\u001a\u00020\u0007HÆ\u0003J\t\u0010*\u001a\u00020\tHÆ\u0003J\t\u0010+\u001a\u00020\u000bHÆ\u0003J\t\u0010,\u001a\u00020\rHÆ\u0003JE\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00101\u001a\u00020\u0011HÖ\u0001J\t\u00102\u001a\u00020\u0003HÖ\u0001J%\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00002\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u000209H\u0001¢\u0006\u0002\b:R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001c\u0010\u0016\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001f\u0010\u0016\u001a\u0004\b\b\u0010 R\u001c\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b!\u0010\u0016\u001a\u0004\b\"\u0010#R\u001c\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b$\u0010\u0016\u001a\u0004\b%\u0010&¨\u0006="}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$Surrogate;", "", "event_slug", "", "entry_point", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;", "event_state", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "is_shareholder", "Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "vote_button_state", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto;", "event_section", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;Lcom/robinhood/rosetta/eventlogging/BooleanDto;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEvent_slug$annotations", "()V", "getEvent_slug", "()Ljava/lang/String;", "getEntry_point$annotations", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;", "getEvent_state$annotations", "getEvent_state", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "is_shareholder$annotations", "()Lcom/robinhood/rosetta/eventlogging/BooleanDto;", "getVote_button_state$annotations", "getVote_button_state", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto;", "getEvent_section$annotations", "getEvent_section", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final EntryPointDto entry_point;
        private final EventSectionDto event_section;
        private final String event_slug;
        private final EventStateDto event_state;
        private final BooleanDto is_shareholder;
        private final VoteButtonStateDto vote_button_state;

        public Surrogate() {
            this((String) null, (EntryPointDto) null, (EventStateDto) null, (BooleanDto) null, (VoteButtonStateDto) null, (EventSectionDto) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, String str, EntryPointDto entryPointDto, EventStateDto eventStateDto, BooleanDto booleanDto, VoteButtonStateDto voteButtonStateDto, EventSectionDto eventSectionDto, int i, Object obj) {
            if ((i & 1) != 0) {
                str = surrogate.event_slug;
            }
            if ((i & 2) != 0) {
                entryPointDto = surrogate.entry_point;
            }
            if ((i & 4) != 0) {
                eventStateDto = surrogate.event_state;
            }
            if ((i & 8) != 0) {
                booleanDto = surrogate.is_shareholder;
            }
            if ((i & 16) != 0) {
                voteButtonStateDto = surrogate.vote_button_state;
            }
            if ((i & 32) != 0) {
                eventSectionDto = surrogate.event_section;
            }
            VoteButtonStateDto voteButtonStateDto2 = voteButtonStateDto;
            EventSectionDto eventSectionDto2 = eventSectionDto;
            return surrogate.copy(str, entryPointDto, eventStateDto, booleanDto, voteButtonStateDto2, eventSectionDto2);
        }

        @SerialName("entryPoint")
        @JsonAnnotations2(names = {"entry_point"})
        public static /* synthetic */ void getEntry_point$annotations() {
        }

        @SerialName("eventSection")
        @JsonAnnotations2(names = {"event_section"})
        public static /* synthetic */ void getEvent_section$annotations() {
        }

        @SerialName("eventSlug")
        @JsonAnnotations2(names = {"event_slug"})
        public static /* synthetic */ void getEvent_slug$annotations() {
        }

        @SerialName("eventState")
        @JsonAnnotations2(names = {"event_state"})
        public static /* synthetic */ void getEvent_state$annotations() {
        }

        @SerialName("voteButtonState")
        @JsonAnnotations2(names = {"vote_button_state"})
        public static /* synthetic */ void getVote_button_state$annotations() {
        }

        @SerialName("isShareholder")
        @JsonAnnotations2(names = {"is_shareholder"})
        public static /* synthetic */ void is_shareholder$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final String getEvent_slug() {
            return this.event_slug;
        }

        /* renamed from: component2, reason: from getter */
        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        /* renamed from: component3, reason: from getter */
        public final EventStateDto getEvent_state() {
            return this.event_state;
        }

        /* renamed from: component4, reason: from getter */
        public final BooleanDto getIs_shareholder() {
            return this.is_shareholder;
        }

        /* renamed from: component5, reason: from getter */
        public final VoteButtonStateDto getVote_button_state() {
            return this.vote_button_state;
        }

        /* renamed from: component6, reason: from getter */
        public final EventSectionDto getEvent_section() {
            return this.event_section;
        }

        public final Surrogate copy(String event_slug, EntryPointDto entry_point, EventStateDto event_state, BooleanDto is_shareholder, VoteButtonStateDto vote_button_state, EventSectionDto event_section) {
            Intrinsics.checkNotNullParameter(event_slug, "event_slug");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            Intrinsics.checkNotNullParameter(event_state, "event_state");
            Intrinsics.checkNotNullParameter(is_shareholder, "is_shareholder");
            Intrinsics.checkNotNullParameter(vote_button_state, "vote_button_state");
            Intrinsics.checkNotNullParameter(event_section, "event_section");
            return new Surrogate(event_slug, entry_point, event_state, is_shareholder, vote_button_state, event_section);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return Intrinsics.areEqual(this.event_slug, surrogate.event_slug) && this.entry_point == surrogate.entry_point && this.event_state == surrogate.event_state && this.is_shareholder == surrogate.is_shareholder && this.vote_button_state == surrogate.vote_button_state && this.event_section == surrogate.event_section;
        }

        public int hashCode() {
            return (((((((((this.event_slug.hashCode() * 31) + this.entry_point.hashCode()) * 31) + this.event_state.hashCode()) * 31) + this.is_shareholder.hashCode()) * 31) + this.vote_button_state.hashCode()) * 31) + this.event_section.hashCode();
        }

        public String toString() {
            return "Surrogate(event_slug=" + this.event_slug + ", entry_point=" + this.entry_point + ", event_state=" + this.event_state + ", is_shareholder=" + this.is_shareholder + ", vote_button_state=" + this.vote_button_state + ", event_section=" + this.event_section + ")";
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return ShareholderQAContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, String str, EntryPointDto entryPointDto, EventStateDto eventStateDto, BooleanDto booleanDto, VoteButtonStateDto voteButtonStateDto, EventSectionDto eventSectionDto, SerializationConstructorMarker serializationConstructorMarker) {
            this.event_slug = (i & 1) == 0 ? "" : str;
            if ((i & 2) == 0) {
                this.entry_point = EntryPointDto.INSTANCE.getZeroValue();
            } else {
                this.entry_point = entryPointDto;
            }
            if ((i & 4) == 0) {
                this.event_state = EventStateDto.INSTANCE.getZeroValue();
            } else {
                this.event_state = eventStateDto;
            }
            if ((i & 8) == 0) {
                this.is_shareholder = BooleanDto.INSTANCE.getZeroValue();
            } else {
                this.is_shareholder = booleanDto;
            }
            if ((i & 16) == 0) {
                this.vote_button_state = VoteButtonStateDto.INSTANCE.getZeroValue();
            } else {
                this.vote_button_state = voteButtonStateDto;
            }
            if ((i & 32) == 0) {
                this.event_section = EventSectionDto.INSTANCE.getZeroValue();
            } else {
                this.event_section = eventSectionDto;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (!Intrinsics.areEqual(self.event_slug, "")) {
                output.encodeStringElement(serialDesc, 0, self.event_slug);
            }
            if (self.entry_point != EntryPointDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 1, EntryPointDto.Serializer.INSTANCE, self.entry_point);
            }
            if (self.event_state != EventStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 2, EventStateDto.Serializer.INSTANCE, self.event_state);
            }
            if (self.is_shareholder != BooleanDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 3, BooleanDto.Serializer.INSTANCE, self.is_shareholder);
            }
            if (self.vote_button_state != VoteButtonStateDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, VoteButtonStateDto.Serializer.INSTANCE, self.vote_button_state);
            }
            if (self.event_section != EventSectionDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 5, EventSectionDto.Serializer.INSTANCE, self.event_section);
            }
        }

        public Surrogate(String event_slug, EntryPointDto entry_point, EventStateDto event_state, BooleanDto is_shareholder, VoteButtonStateDto vote_button_state, EventSectionDto event_section) {
            Intrinsics.checkNotNullParameter(event_slug, "event_slug");
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            Intrinsics.checkNotNullParameter(event_state, "event_state");
            Intrinsics.checkNotNullParameter(is_shareholder, "is_shareholder");
            Intrinsics.checkNotNullParameter(vote_button_state, "vote_button_state");
            Intrinsics.checkNotNullParameter(event_section, "event_section");
            this.event_slug = event_slug;
            this.entry_point = entry_point;
            this.event_state = event_state;
            this.is_shareholder = is_shareholder;
            this.vote_button_state = vote_button_state;
            this.event_section = event_section;
        }

        public final String getEvent_slug() {
            return this.event_slug;
        }

        public /* synthetic */ Surrogate(String str, EntryPointDto entryPointDto, EventStateDto eventStateDto, BooleanDto booleanDto, VoteButtonStateDto voteButtonStateDto, EventSectionDto eventSectionDto, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EntryPointDto.INSTANCE.getZeroValue() : entryPointDto, (i & 4) != 0 ? EventStateDto.INSTANCE.getZeroValue() : eventStateDto, (i & 8) != 0 ? BooleanDto.INSTANCE.getZeroValue() : booleanDto, (i & 16) != 0 ? VoteButtonStateDto.INSTANCE.getZeroValue() : voteButtonStateDto, (i & 32) != 0 ? EventSectionDto.INSTANCE.getZeroValue() : eventSectionDto);
        }

        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        public final EventStateDto getEvent_state() {
            return this.event_state;
        }

        public final BooleanDto is_shareholder() {
            return this.is_shareholder;
        }

        public final VoteButtonStateDto getVote_button_state() {
            return this.vote_button_state;
        }

        public final EventSectionDto getEvent_section() {
            return this.event_section;
        }
    }

    /* compiled from: ShareholderQAContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<ShareholderQAContextDto, ShareholderQAContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<ShareholderQAContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ShareholderQAContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<ShareholderQAContextDto> getBinaryBase64Serializer() {
            return (KSerializer) ShareholderQAContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<ShareholderQAContext> getProtoAdapter() {
            return ShareholderQAContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ShareholderQAContextDto getZeroValue() {
            return ShareholderQAContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ShareholderQAContextDto fromProto(ShareholderQAContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new ShareholderQAContextDto(new Surrogate(proto.getEvent_slug(), EntryPointDto.INSTANCE.fromProto(proto.getEntry_point()), EventStateDto.INSTANCE.fromProto(proto.getEvent_state()), BooleanDto.INSTANCE.fromProto(proto.getIs_shareholder()), VoteButtonStateDto.INSTANCE.fromProto(proto.getVote_button_state()), EventSectionDto.INSTANCE.fromProto(proto.getEvent_section())), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ShareholderQAContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ShareholderQAContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new ShareholderQAContextDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShareholderQAContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0015\u0016B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ENTRY_POINT_UNSPECIFIED", "STOCK_DETAIL_CARD", "STOCK_DETAIL_EARNINGS_ROW", "PUSH_NOTIFICATION", "INBOX_MESSAGE", "CARD", "SHARE", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EntryPointDto implements Dto2<ShareholderQAContext.EntryPoint>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPointDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EntryPointDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EntryPointDto, ShareholderQAContext.EntryPoint>> binaryBase64Serializer$delegate;
        public static final EntryPointDto ENTRY_POINT_UNSPECIFIED = new ENTRY_POINT_UNSPECIFIED("ENTRY_POINT_UNSPECIFIED", 0);
        public static final EntryPointDto STOCK_DETAIL_CARD = new STOCK_DETAIL_CARD("STOCK_DETAIL_CARD", 1);
        public static final EntryPointDto STOCK_DETAIL_EARNINGS_ROW = new STOCK_DETAIL_EARNINGS_ROW("STOCK_DETAIL_EARNINGS_ROW", 2);
        public static final EntryPointDto PUSH_NOTIFICATION = new PUSH_NOTIFICATION("PUSH_NOTIFICATION", 3);
        public static final EntryPointDto INBOX_MESSAGE = new INBOX_MESSAGE("INBOX_MESSAGE", 4);
        public static final EntryPointDto CARD = new CARD("CARD", 5);
        public static final EntryPointDto SHARE = new SHARE("SHARE", 6);

        private static final /* synthetic */ EntryPointDto[] $values() {
            return new EntryPointDto[]{ENTRY_POINT_UNSPECIFIED, STOCK_DETAIL_CARD, STOCK_DETAIL_EARNINGS_ROW, PUSH_NOTIFICATION, INBOX_MESSAGE, CARD, SHARE};
        }

        public /* synthetic */ EntryPointDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EntryPointDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EntryPointDto.ENTRY_POINT_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENTRY_POINT_UNSPECIFIED extends EntryPointDto {
            ENTRY_POINT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EntryPoint toProto() {
                return ShareholderQAContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
            }
        }

        private EntryPointDto(String str, int i) {
        }

        static {
            EntryPointDto[] entryPointDtoArr$values = $values();
            $VALUES = entryPointDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ShareholderQAContextDto$EntryPointDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareholderQAContextDto.EntryPointDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EntryPointDto.STOCK_DETAIL_CARD", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STOCK_DETAIL_CARD extends EntryPointDto {
            STOCK_DETAIL_CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EntryPoint toProto() {
                return ShareholderQAContext.EntryPoint.STOCK_DETAIL_CARD;
            }
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EntryPointDto.STOCK_DETAIL_EARNINGS_ROW", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class STOCK_DETAIL_EARNINGS_ROW extends EntryPointDto {
            STOCK_DETAIL_EARNINGS_ROW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EntryPoint toProto() {
                return ShareholderQAContext.EntryPoint.STOCK_DETAIL_EARNINGS_ROW;
            }
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EntryPointDto.PUSH_NOTIFICATION", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class PUSH_NOTIFICATION extends EntryPointDto {
            PUSH_NOTIFICATION(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EntryPoint toProto() {
                return ShareholderQAContext.EntryPoint.PUSH_NOTIFICATION;
            }
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EntryPointDto.INBOX_MESSAGE", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class INBOX_MESSAGE extends EntryPointDto {
            INBOX_MESSAGE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EntryPoint toProto() {
                return ShareholderQAContext.EntryPoint.INBOX_MESSAGE;
            }
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EntryPointDto.CARD", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CARD extends EntryPointDto {
            CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EntryPoint toProto() {
                return ShareholderQAContext.EntryPoint.CARD;
            }
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EntryPointDto.SHARE", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class SHARE extends EntryPointDto {
            SHARE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EntryPoint toProto() {
                return ShareholderQAContext.EntryPoint.SHARE;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EntryPointDto, ShareholderQAContext.EntryPoint> {

            /* compiled from: ShareholderQAContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ShareholderQAContext.EntryPoint.values().length];
                    try {
                        iArr[ShareholderQAContext.EntryPoint.ENTRY_POINT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ShareholderQAContext.EntryPoint.STOCK_DETAIL_CARD.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ShareholderQAContext.EntryPoint.STOCK_DETAIL_EARNINGS_ROW.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ShareholderQAContext.EntryPoint.PUSH_NOTIFICATION.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ShareholderQAContext.EntryPoint.INBOX_MESSAGE.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ShareholderQAContext.EntryPoint.CARD.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ShareholderQAContext.EntryPoint.SHARE.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EntryPointDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntryPointDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EntryPointDto> getBinaryBase64Serializer() {
                return (KSerializer) EntryPointDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ShareholderQAContext.EntryPoint> getProtoAdapter() {
                return ShareholderQAContext.EntryPoint.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto getZeroValue() {
                return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto fromProto(ShareholderQAContext.EntryPoint proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
                    case 2:
                        return EntryPointDto.STOCK_DETAIL_CARD;
                    case 3:
                        return EntryPointDto.STOCK_DETAIL_EARNINGS_ROW;
                    case 4:
                        return EntryPointDto.PUSH_NOTIFICATION;
                    case 5:
                        return EntryPointDto.INBOX_MESSAGE;
                    case 6:
                        return EntryPointDto.CARD;
                    case 7:
                        return EntryPointDto.SHARE;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EntryPointDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EntryPointDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EntryPointDto, ShareholderQAContext.EntryPoint> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ShareholderQAContext.EntryPoint", EntryPointDto.getEntries(), EntryPointDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EntryPointDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EntryPointDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EntryPointDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EntryPointDto valueOf(String str) {
            return (EntryPointDto) Enum.valueOf(EntryPointDto.class, str);
        }

        public static EntryPointDto[] values() {
            return (EntryPointDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShareholderQAContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0016\u0017B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "EVENT_STATE_UNSPECIFIED", "EARLY", "QA_EVENT_OPEN", "QA_EVENT_CLOSED_CALL_COUNTDOWN", "QA_EVENT_CLOSED_DAY_OF_COUNTDOWN", "EARNINGS_CALL_LIVE", "EARNINGS_CALL_ENDED", "ANSWERS_POSTED", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EventStateDto implements Dto2<ShareholderQAContext.EventState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EventStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EventStateDto, ShareholderQAContext.EventState>> binaryBase64Serializer$delegate;
        public static final EventStateDto EVENT_STATE_UNSPECIFIED = new EVENT_STATE_UNSPECIFIED("EVENT_STATE_UNSPECIFIED", 0);
        public static final EventStateDto EARLY = new EARLY("EARLY", 1);
        public static final EventStateDto QA_EVENT_OPEN = new QA_EVENT_OPEN("QA_EVENT_OPEN", 2);
        public static final EventStateDto QA_EVENT_CLOSED_CALL_COUNTDOWN = new QA_EVENT_CLOSED_CALL_COUNTDOWN("QA_EVENT_CLOSED_CALL_COUNTDOWN", 3);
        public static final EventStateDto QA_EVENT_CLOSED_DAY_OF_COUNTDOWN = new QA_EVENT_CLOSED_DAY_OF_COUNTDOWN("QA_EVENT_CLOSED_DAY_OF_COUNTDOWN", 4);
        public static final EventStateDto EARNINGS_CALL_LIVE = new EARNINGS_CALL_LIVE("EARNINGS_CALL_LIVE", 5);
        public static final EventStateDto EARNINGS_CALL_ENDED = new EARNINGS_CALL_ENDED("EARNINGS_CALL_ENDED", 6);
        public static final EventStateDto ANSWERS_POSTED = new ANSWERS_POSTED("ANSWERS_POSTED", 7);

        private static final /* synthetic */ EventStateDto[] $values() {
            return new EventStateDto[]{EVENT_STATE_UNSPECIFIED, EARLY, QA_EVENT_OPEN, QA_EVENT_CLOSED_CALL_COUNTDOWN, QA_EVENT_CLOSED_DAY_OF_COUNTDOWN, EARNINGS_CALL_LIVE, EARNINGS_CALL_ENDED, ANSWERS_POSTED};
        }

        public /* synthetic */ EventStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EventStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EventStateDto.EVENT_STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_STATE_UNSPECIFIED extends EventStateDto {
            EVENT_STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EventState toProto() {
                return ShareholderQAContext.EventState.EVENT_STATE_UNSPECIFIED;
            }
        }

        private EventStateDto(String str, int i) {
        }

        static {
            EventStateDto[] eventStateDtoArr$values = $values();
            $VALUES = eventStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ShareholderQAContextDto$EventStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareholderQAContextDto.EventStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EventStateDto.EARLY", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EARLY extends EventStateDto {
            EARLY(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EventState toProto() {
                return ShareholderQAContext.EventState.EARLY;
            }
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EventStateDto.QA_EVENT_OPEN", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class QA_EVENT_OPEN extends EventStateDto {
            QA_EVENT_OPEN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EventState toProto() {
                return ShareholderQAContext.EventState.QA_EVENT_OPEN;
            }
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EventStateDto.QA_EVENT_CLOSED_CALL_COUNTDOWN", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class QA_EVENT_CLOSED_CALL_COUNTDOWN extends EventStateDto {
            QA_EVENT_CLOSED_CALL_COUNTDOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EventState toProto() {
                return ShareholderQAContext.EventState.QA_EVENT_CLOSED_CALL_COUNTDOWN;
            }
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EventStateDto.QA_EVENT_CLOSED_DAY_OF_COUNTDOWN", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class QA_EVENT_CLOSED_DAY_OF_COUNTDOWN extends EventStateDto {
            QA_EVENT_CLOSED_DAY_OF_COUNTDOWN(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EventState toProto() {
                return ShareholderQAContext.EventState.QA_EVENT_CLOSED_DAY_OF_COUNTDOWN;
            }
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EventStateDto.EARNINGS_CALL_LIVE", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EARNINGS_CALL_LIVE extends EventStateDto {
            EARNINGS_CALL_LIVE(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EventState toProto() {
                return ShareholderQAContext.EventState.EARNINGS_CALL_LIVE;
            }
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EventStateDto.EARNINGS_CALL_ENDED", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EARNINGS_CALL_ENDED extends EventStateDto {
            EARNINGS_CALL_ENDED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EventState toProto() {
                return ShareholderQAContext.EventState.EARNINGS_CALL_ENDED;
            }
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EventStateDto.ANSWERS_POSTED", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ANSWERS_POSTED extends EventStateDto {
            ANSWERS_POSTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EventState toProto() {
                return ShareholderQAContext.EventState.ANSWERS_POSTED;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EventStateDto, ShareholderQAContext.EventState> {

            /* compiled from: ShareholderQAContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ShareholderQAContext.EventState.values().length];
                    try {
                        iArr[ShareholderQAContext.EventState.EVENT_STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ShareholderQAContext.EventState.EARLY.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ShareholderQAContext.EventState.QA_EVENT_OPEN.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ShareholderQAContext.EventState.QA_EVENT_CLOSED_CALL_COUNTDOWN.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[ShareholderQAContext.EventState.QA_EVENT_CLOSED_DAY_OF_COUNTDOWN.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    try {
                        iArr[ShareholderQAContext.EventState.EARNINGS_CALL_LIVE.ordinal()] = 6;
                    } catch (NoSuchFieldError unused6) {
                    }
                    try {
                        iArr[ShareholderQAContext.EventState.EARNINGS_CALL_ENDED.ordinal()] = 7;
                    } catch (NoSuchFieldError unused7) {
                    }
                    try {
                        iArr[ShareholderQAContext.EventState.ANSWERS_POSTED.ordinal()] = 8;
                    } catch (NoSuchFieldError unused8) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EventStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventStateDto> getBinaryBase64Serializer() {
                return (KSerializer) EventStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ShareholderQAContext.EventState> getProtoAdapter() {
                return ShareholderQAContext.EventState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventStateDto getZeroValue() {
                return EventStateDto.EVENT_STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventStateDto fromProto(ShareholderQAContext.EventState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                switch (WhenMappings.$EnumSwitchMapping$0[proto.ordinal()]) {
                    case 1:
                        return EventStateDto.EVENT_STATE_UNSPECIFIED;
                    case 2:
                        return EventStateDto.EARLY;
                    case 3:
                        return EventStateDto.QA_EVENT_OPEN;
                    case 4:
                        return EventStateDto.QA_EVENT_CLOSED_CALL_COUNTDOWN;
                    case 5:
                        return EventStateDto.QA_EVENT_CLOSED_DAY_OF_COUNTDOWN;
                    case 6:
                        return EventStateDto.EARNINGS_CALL_LIVE;
                    case 7:
                        return EventStateDto.EARNINGS_CALL_ENDED;
                    case 8:
                        return EventStateDto.ANSWERS_POSTED;
                    default:
                        throw new NoWhenBranchMatchedException();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EventStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EventStateDto, ShareholderQAContext.EventState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ShareholderQAContext.EventState", EventStateDto.getEntries(), EventStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EventStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EventStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EventStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EventStateDto valueOf(String str) {
            return (EventStateDto) Enum.valueOf(EventStateDto.class, str);
        }

        public static EventStateDto[] values() {
            return (EventStateDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShareholderQAContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$VoteButtonState;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "VOTE_BUTTON_STATE_UNSPECIFIED", "UPVOTED", "DISABLED", "DEFAULT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class VoteButtonStateDto implements Dto2<ShareholderQAContext.VoteButtonState>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ VoteButtonStateDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<VoteButtonStateDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<VoteButtonStateDto, ShareholderQAContext.VoteButtonState>> binaryBase64Serializer$delegate;
        public static final VoteButtonStateDto VOTE_BUTTON_STATE_UNSPECIFIED = new VOTE_BUTTON_STATE_UNSPECIFIED("VOTE_BUTTON_STATE_UNSPECIFIED", 0);
        public static final VoteButtonStateDto UPVOTED = new UPVOTED("UPVOTED", 1);
        public static final VoteButtonStateDto DISABLED = new DISABLED("DISABLED", 2);
        public static final VoteButtonStateDto DEFAULT = new DEFAULT("DEFAULT", 3);

        private static final /* synthetic */ VoteButtonStateDto[] $values() {
            return new VoteButtonStateDto[]{VOTE_BUTTON_STATE_UNSPECIFIED, UPVOTED, DISABLED, DEFAULT};
        }

        public /* synthetic */ VoteButtonStateDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<VoteButtonStateDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private VoteButtonStateDto(String str, int i) {
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.VoteButtonStateDto.VOTE_BUTTON_STATE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$VoteButtonState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class VOTE_BUTTON_STATE_UNSPECIFIED extends VoteButtonStateDto {
            VOTE_BUTTON_STATE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.VoteButtonState toProto() {
                return ShareholderQAContext.VoteButtonState.VOTE_BUTTON_STATE_UNSPECIFIED;
            }
        }

        static {
            VoteButtonStateDto[] voteButtonStateDtoArr$values = $values();
            $VALUES = voteButtonStateDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(voteButtonStateDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ShareholderQAContextDto$VoteButtonStateDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareholderQAContextDto.VoteButtonStateDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.VoteButtonStateDto.UPVOTED", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$VoteButtonState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class UPVOTED extends VoteButtonStateDto {
            UPVOTED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.VoteButtonState toProto() {
                return ShareholderQAContext.VoteButtonState.UPVOTED;
            }
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.VoteButtonStateDto.DISABLED", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$VoteButtonState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DISABLED extends VoteButtonStateDto {
            DISABLED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.VoteButtonState toProto() {
                return ShareholderQAContext.VoteButtonState.DISABLED;
            }
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.VoteButtonStateDto.DEFAULT", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$VoteButtonState;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class DEFAULT extends VoteButtonStateDto {
            DEFAULT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.VoteButtonState toProto() {
                return ShareholderQAContext.VoteButtonState.DEFAULT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$VoteButtonState;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<VoteButtonStateDto, ShareholderQAContext.VoteButtonState> {

            /* compiled from: ShareholderQAContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ShareholderQAContext.VoteButtonState.values().length];
                    try {
                        iArr[ShareholderQAContext.VoteButtonState.VOTE_BUTTON_STATE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ShareholderQAContext.VoteButtonState.UPVOTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ShareholderQAContext.VoteButtonState.DISABLED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[ShareholderQAContext.VoteButtonState.DEFAULT.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<VoteButtonStateDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<VoteButtonStateDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<VoteButtonStateDto> getBinaryBase64Serializer() {
                return (KSerializer) VoteButtonStateDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ShareholderQAContext.VoteButtonState> getProtoAdapter() {
                return ShareholderQAContext.VoteButtonState.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public VoteButtonStateDto getZeroValue() {
                return VoteButtonStateDto.VOTE_BUTTON_STATE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public VoteButtonStateDto fromProto(ShareholderQAContext.VoteButtonState proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return VoteButtonStateDto.VOTE_BUTTON_STATE_UNSPECIFIED;
                }
                if (i == 2) {
                    return VoteButtonStateDto.UPVOTED;
                }
                if (i == 3) {
                    return VoteButtonStateDto.DISABLED;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return VoteButtonStateDto.DEFAULT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$VoteButtonStateDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<VoteButtonStateDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<VoteButtonStateDto, ShareholderQAContext.VoteButtonState> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ShareholderQAContext.VoteButtonState", VoteButtonStateDto.getEntries(), VoteButtonStateDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public VoteButtonStateDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (VoteButtonStateDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, VoteButtonStateDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static VoteButtonStateDto valueOf(String str) {
            return (VoteButtonStateDto) Enum.valueOf(VoteButtonStateDto.class, str);
        }

        public static VoteButtonStateDto[] values() {
            return (VoteButtonStateDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShareholderQAContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventSection;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "EVENT_SECTION_UNSPECIFIED", "EVENT_NEW", "EVENT_PAST", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EventSectionDto implements Dto2<ShareholderQAContext.EventSection>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventSectionDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EventSectionDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EventSectionDto, ShareholderQAContext.EventSection>> binaryBase64Serializer$delegate;
        public static final EventSectionDto EVENT_SECTION_UNSPECIFIED = new EVENT_SECTION_UNSPECIFIED("EVENT_SECTION_UNSPECIFIED", 0);
        public static final EventSectionDto EVENT_NEW = new EVENT_NEW("EVENT_NEW", 1);
        public static final EventSectionDto EVENT_PAST = new EVENT_PAST("EVENT_PAST", 2);

        private static final /* synthetic */ EventSectionDto[] $values() {
            return new EventSectionDto[]{EVENT_SECTION_UNSPECIFIED, EVENT_NEW, EVENT_PAST};
        }

        public /* synthetic */ EventSectionDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<EventSectionDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EventSectionDto.EVENT_SECTION_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventSection;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_SECTION_UNSPECIFIED extends EventSectionDto {
            EVENT_SECTION_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EventSection toProto() {
                return ShareholderQAContext.EventSection.EVENT_SECTION_UNSPECIFIED;
            }
        }

        private EventSectionDto(String str, int i) {
        }

        static {
            EventSectionDto[] eventSectionDtoArr$values = $values();
            $VALUES = eventSectionDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventSectionDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.ShareholderQAContextDto$EventSectionDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return ShareholderQAContextDto.EventSectionDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EventSectionDto.EVENT_NEW", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventSection;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_NEW extends EventSectionDto {
            EVENT_NEW(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EventSection toProto() {
                return ShareholderQAContext.EventSection.EVENT_NEW;
            }
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/ShareholderQAContextDto.EventSectionDto.EVENT_PAST", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventSection;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class EVENT_PAST extends EventSectionDto {
            EVENT_PAST(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public ShareholderQAContext.EventSection toProto() {
                return ShareholderQAContext.EventSection.EVENT_PAST;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventSection;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EventSectionDto, ShareholderQAContext.EventSection> {

            /* compiled from: ShareholderQAContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[ShareholderQAContext.EventSection.values().length];
                    try {
                        iArr[ShareholderQAContext.EventSection.EVENT_SECTION_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[ShareholderQAContext.EventSection.EVENT_NEW.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[ShareholderQAContext.EventSection.EVENT_PAST.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final KSerializer<EventSectionDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventSectionDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<EventSectionDto> getBinaryBase64Serializer() {
                return (KSerializer) EventSectionDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<ShareholderQAContext.EventSection> getProtoAdapter() {
                return ShareholderQAContext.EventSection.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventSectionDto getZeroValue() {
                return EventSectionDto.EVENT_SECTION_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EventSectionDto fromProto(ShareholderQAContext.EventSection proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return EventSectionDto.EVENT_SECTION_UNSPECIFIED;
                }
                if (i == 2) {
                    return EventSectionDto.EVENT_NEW;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return EventSectionDto.EVENT_PAST;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: ShareholderQAContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$EventSectionDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EventSectionDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EventSectionDto, ShareholderQAContext.EventSection> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.ShareholderQAContext.EventSection", EventSectionDto.getEntries(), EventSectionDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public EventSectionDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (EventSectionDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, EventSectionDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static EventSectionDto valueOf(String str) {
            return (EventSectionDto) Enum.valueOf(EventSectionDto.class, str);
        }

        public static EventSectionDto[] values() {
            return (EventSectionDto[]) $VALUES.clone();
        }
    }

    /* compiled from: ShareholderQAContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<ShareholderQAContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.ShareholderQAContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, ShareholderQAContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public ShareholderQAContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new ShareholderQAContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: ShareholderQAContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4192_8)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.ShareholderQAContextDto";
        }
    }
}
