package com.robinhood.rosetta.eventlogging;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.idl.common.MultibindingShard;
import com.robinhood.android.instant.p160ui.InstantCashConstants;
import com.robinhood.idl.Dto2;
import com.robinhood.idl.Dto3;
import com.robinhood.idl.DtoParcelableCreator;
import com.robinhood.idl.DtoParcelableCreator2;
import com.robinhood.idl.RhGenerated;
import com.robinhood.idl.serialization.BinaryBase64DtoSerializer;
import com.robinhood.idl.serialization.EnumDtoSerializer;
import com.robinhood.rosetta.eventlogging.RecommendationsContext;
import com.robinhood.rosetta.eventlogging.RecommendationsContextDto;
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

/* compiled from: RecommendationsContextDto.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0006*+,-./B\u0011\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007BE\b\u0016\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0006\u0010\u0011JB\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u000bJ\b\u0010\u001c\u001a\u00020\u0002H\u0016J\b\u0010\u001d\u001a\u00020\u000bH\u0016J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0096\u0002J\b\u0010\"\u001a\u00020#H\u0016J\u0018\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020#H\u0016J\b\u0010)\u001a\u00020#H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\n\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\f\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\r\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000e\u001a\u00020\u000f8F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\u0010\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0015¨\u00060"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto;", "Lcom/robinhood/idl/MessageDto;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext;", "Landroid/os/Parcelable;", "surrogate", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$Surrogate;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$Surrogate;)V", "entry_point", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto;", "entry_point_logging_id", "", "entry_point_source", "account_number", "recommendations_type", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "(Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto;Ljava/lang/String;)V", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto;", "getEntry_point_logging_id", "()Ljava/lang/String;", "getEntry_point_source", "getAccount_number", "getRecommendations_type", "()Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto;", "getAccount_type", "copy", "toProto", "toString", "equals", "", "other", "", "hashCode", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "describeContents", "Surrogate", "Companion", "RecommendationsTypeDto", "EntryPointDto", "Serializer", "MultibindingModule", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@Serializable(with = Serializer.class)
@RhGenerated
/* loaded from: classes19.dex */
public final class RecommendationsContextDto implements Dto3<RecommendationsContext>, Parcelable {

    @JvmField
    public static final Parcelable.Creator<RecommendationsContextDto> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final Lazy<BinaryBase64DtoSerializer<RecommendationsContextDto, RecommendationsContext>> binaryBase64Serializer$delegate;
    private static final RecommendationsContextDto zeroValue;
    private final Surrogate surrogate;

    public /* synthetic */ RecommendationsContextDto(Surrogate surrogate, DefaultConstructorMarker defaultConstructorMarker) {
        this(surrogate);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private RecommendationsContextDto(Surrogate surrogate) {
        this.surrogate = surrogate;
    }

    public final EntryPointDto getEntry_point() {
        return this.surrogate.getEntry_point();
    }

    public final String getEntry_point_logging_id() {
        return this.surrogate.getEntry_point_logging_id();
    }

    public final String getEntry_point_source() {
        return this.surrogate.getEntry_point_source();
    }

    public final String getAccount_number() {
        return this.surrogate.getAccount_number();
    }

    public final RecommendationsTypeDto getRecommendations_type() {
        return this.surrogate.getRecommendations_type();
    }

    public final String getAccount_type() {
        return this.surrogate.getAccount_type();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public /* synthetic */ RecommendationsContextDto(com.robinhood.rosetta.eventlogging.RecommendationsContextDto.EntryPointDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.robinhood.rosetta.eventlogging.RecommendationsContextDto.RecommendationsTypeDto r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
        /*
            r1 = this;
            r9 = r8 & 1
            if (r9 == 0) goto La
            com.robinhood.rosetta.eventlogging.RecommendationsContextDto$EntryPointDto$Companion r2 = com.robinhood.rosetta.eventlogging.RecommendationsContextDto.EntryPointDto.INSTANCE
            com.robinhood.rosetta.eventlogging.RecommendationsContextDto$EntryPointDto r2 = r2.getZeroValue()
        La:
            r9 = r8 & 2
            java.lang.String r0 = ""
            if (r9 == 0) goto L11
            r3 = r0
        L11:
            r9 = r8 & 4
            if (r9 == 0) goto L16
            r4 = r0
        L16:
            r9 = r8 & 8
            if (r9 == 0) goto L1b
            r5 = r0
        L1b:
            r9 = r8 & 16
            if (r9 == 0) goto L25
            com.robinhood.rosetta.eventlogging.RecommendationsContextDto$RecommendationsTypeDto$Companion r6 = com.robinhood.rosetta.eventlogging.RecommendationsContextDto.RecommendationsTypeDto.INSTANCE
            com.robinhood.rosetta.eventlogging.RecommendationsContextDto$RecommendationsTypeDto r6 = r6.getZeroValue()
        L25:
            r8 = r8 & 32
            if (r8 == 0) goto L31
            r9 = r0
            r7 = r5
            r8 = r6
            r5 = r3
            r6 = r4
            r3 = r1
            r4 = r2
            goto L38
        L31:
            r9 = r7
            r8 = r6
            r6 = r4
            r7 = r5
            r4 = r2
            r5 = r3
            r3 = r1
        L38:
            r3.<init>(r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.RecommendationsContextDto.<init>(com.robinhood.rosetta.eventlogging.RecommendationsContextDto$EntryPointDto, java.lang.String, java.lang.String, java.lang.String, com.robinhood.rosetta.eventlogging.RecommendationsContextDto$RecommendationsTypeDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public RecommendationsContextDto(EntryPointDto entry_point, String entry_point_logging_id, String entry_point_source, String account_number, RecommendationsTypeDto recommendations_type, String account_type) {
        this(new Surrogate(entry_point, entry_point_logging_id, entry_point_source, account_number, recommendations_type, account_type));
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(entry_point_logging_id, "entry_point_logging_id");
        Intrinsics.checkNotNullParameter(entry_point_source, "entry_point_source");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(recommendations_type, "recommendations_type");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
    }

    public static /* synthetic */ RecommendationsContextDto copy$default(RecommendationsContextDto recommendationsContextDto, EntryPointDto entryPointDto, String str, String str2, String str3, RecommendationsTypeDto recommendationsTypeDto, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            entryPointDto = recommendationsContextDto.surrogate.getEntry_point();
        }
        if ((i & 2) != 0) {
            str = recommendationsContextDto.surrogate.getEntry_point_logging_id();
        }
        if ((i & 4) != 0) {
            str2 = recommendationsContextDto.surrogate.getEntry_point_source();
        }
        if ((i & 8) != 0) {
            str3 = recommendationsContextDto.surrogate.getAccount_number();
        }
        if ((i & 16) != 0) {
            recommendationsTypeDto = recommendationsContextDto.surrogate.getRecommendations_type();
        }
        if ((i & 32) != 0) {
            str4 = recommendationsContextDto.surrogate.getAccount_type();
        }
        RecommendationsTypeDto recommendationsTypeDto2 = recommendationsTypeDto;
        String str5 = str4;
        return recommendationsContextDto.copy(entryPointDto, str, str2, str3, recommendationsTypeDto2, str5);
    }

    public final RecommendationsContextDto copy(EntryPointDto entry_point, String entry_point_logging_id, String entry_point_source, String account_number, RecommendationsTypeDto recommendations_type, String account_type) {
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(entry_point_logging_id, "entry_point_logging_id");
        Intrinsics.checkNotNullParameter(entry_point_source, "entry_point_source");
        Intrinsics.checkNotNullParameter(account_number, "account_number");
        Intrinsics.checkNotNullParameter(recommendations_type, "recommendations_type");
        Intrinsics.checkNotNullParameter(account_type, "account_type");
        return new RecommendationsContextDto(new Surrogate(entry_point, entry_point_logging_id, entry_point_source, account_number, recommendations_type, account_type));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.robinhood.idl.Dto
    public RecommendationsContext toProto() {
        return new RecommendationsContext((RecommendationsContext.EntryPoint) this.surrogate.getEntry_point().toProto(), this.surrogate.getEntry_point_logging_id(), this.surrogate.getEntry_point_source(), this.surrogate.getAccount_number(), (RecommendationsContext.RecommendationsType) this.surrogate.getRecommendations_type().toProto(), this.surrogate.getAccount_type(), null, 64, null);
    }

    public String toString() {
        return "[RecommendationsContextDto]:" + toProto();
    }

    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof RecommendationsContextDto) && Intrinsics.areEqual(((RecommendationsContextDto) other).surrogate, this.surrogate);
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
    /* compiled from: RecommendationsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 72\u00020\u0001:\u000267BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fBW\b\u0010\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u000b\u0010\u0011J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0005HÆ\u0003J\t\u0010$\u001a\u00020\u0005HÆ\u0003J\t\u0010%\u001a\u00020\u0005HÆ\u0003J\t\u0010&\u001a\u00020\tHÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003JE\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010,\u001a\u00020\u000eHÖ\u0001J\t\u0010-\u001a\u00020\u0005HÖ\u0001J%\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u00002\u0006\u00101\u001a\u0002022\u0006\u00103\u001a\u000204H\u0001¢\u0006\u0002\b5R\u001c\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u0013\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u001a\u0010\u0018R\u001c\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001b\u0010\u0013\u001a\u0004\b\u001c\u0010\u0018R\u001c\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001d\u0010\u0013\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0013\u001a\u0004\b!\u0010\u0018¨\u00068"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$Surrogate;", "", "entry_point", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto;", "entry_point_logging_id", "", "entry_point_source", "account_number", "recommendations_type", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto;", InstantCashConstants.ACCOUNT_TYPE_KEY, "<init>", "(Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getEntry_point$annotations", "()V", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto;", "getEntry_point_logging_id$annotations", "getEntry_point_logging_id", "()Ljava/lang/String;", "getEntry_point_source$annotations", "getEntry_point_source", "getAccount_number$annotations", "getAccount_number", "getRecommendations_type$annotations", "getRecommendations_type", "()Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto;", "getAccount_type$annotations", "getAccount_type", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$data_platform_event_logging_externalRelease", "$serializer", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable
    static final /* data */ class Surrogate {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private final String account_number;
        private final String account_type;
        private final EntryPointDto entry_point;
        private final String entry_point_logging_id;
        private final String entry_point_source;
        private final RecommendationsTypeDto recommendations_type;

        public Surrogate() {
            this((EntryPointDto) null, (String) null, (String) null, (String) null, (RecommendationsTypeDto) null, (String) null, 63, (DefaultConstructorMarker) null);
        }

        public static /* synthetic */ Surrogate copy$default(Surrogate surrogate, EntryPointDto entryPointDto, String str, String str2, String str3, RecommendationsTypeDto recommendationsTypeDto, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                entryPointDto = surrogate.entry_point;
            }
            if ((i & 2) != 0) {
                str = surrogate.entry_point_logging_id;
            }
            if ((i & 4) != 0) {
                str2 = surrogate.entry_point_source;
            }
            if ((i & 8) != 0) {
                str3 = surrogate.account_number;
            }
            if ((i & 16) != 0) {
                recommendationsTypeDto = surrogate.recommendations_type;
            }
            if ((i & 32) != 0) {
                str4 = surrogate.account_type;
            }
            RecommendationsTypeDto recommendationsTypeDto2 = recommendationsTypeDto;
            String str5 = str4;
            return surrogate.copy(entryPointDto, str, str2, str3, recommendationsTypeDto2, str5);
        }

        @SerialName("accountNumber")
        @JsonAnnotations2(names = {"account_number"})
        public static /* synthetic */ void getAccount_number$annotations() {
        }

        @SerialName("accountType")
        @JsonAnnotations2(names = {InstantCashConstants.ACCOUNT_TYPE_KEY})
        public static /* synthetic */ void getAccount_type$annotations() {
        }

        @SerialName("entryPoint")
        @JsonAnnotations2(names = {"entry_point"})
        public static /* synthetic */ void getEntry_point$annotations() {
        }

        @SerialName("entryPointLoggingId")
        @JsonAnnotations2(names = {"entry_point_logging_id"})
        public static /* synthetic */ void getEntry_point_logging_id$annotations() {
        }

        @SerialName("entryPointSource")
        @JsonAnnotations2(names = {"entry_point_source"})
        public static /* synthetic */ void getEntry_point_source$annotations() {
        }

        @SerialName("recommendationsType")
        @JsonAnnotations2(names = {"recommendations_type"})
        public static /* synthetic */ void getRecommendations_type$annotations() {
        }

        /* renamed from: component1, reason: from getter */
        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        /* renamed from: component2, reason: from getter */
        public final String getEntry_point_logging_id() {
            return this.entry_point_logging_id;
        }

        /* renamed from: component3, reason: from getter */
        public final String getEntry_point_source() {
            return this.entry_point_source;
        }

        /* renamed from: component4, reason: from getter */
        public final String getAccount_number() {
            return this.account_number;
        }

        /* renamed from: component5, reason: from getter */
        public final RecommendationsTypeDto getRecommendations_type() {
            return this.recommendations_type;
        }

        /* renamed from: component6, reason: from getter */
        public final String getAccount_type() {
            return this.account_type;
        }

        public final Surrogate copy(EntryPointDto entry_point, String entry_point_logging_id, String entry_point_source, String account_number, RecommendationsTypeDto recommendations_type, String account_type) {
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            Intrinsics.checkNotNullParameter(entry_point_logging_id, "entry_point_logging_id");
            Intrinsics.checkNotNullParameter(entry_point_source, "entry_point_source");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(recommendations_type, "recommendations_type");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            return new Surrogate(entry_point, entry_point_logging_id, entry_point_source, account_number, recommendations_type, account_type);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Surrogate)) {
                return false;
            }
            Surrogate surrogate = (Surrogate) other;
            return this.entry_point == surrogate.entry_point && Intrinsics.areEqual(this.entry_point_logging_id, surrogate.entry_point_logging_id) && Intrinsics.areEqual(this.entry_point_source, surrogate.entry_point_source) && Intrinsics.areEqual(this.account_number, surrogate.account_number) && this.recommendations_type == surrogate.recommendations_type && Intrinsics.areEqual(this.account_type, surrogate.account_type);
        }

        public int hashCode() {
            return (((((((((this.entry_point.hashCode() * 31) + this.entry_point_logging_id.hashCode()) * 31) + this.entry_point_source.hashCode()) * 31) + this.account_number.hashCode()) * 31) + this.recommendations_type.hashCode()) * 31) + this.account_type.hashCode();
        }

        public String toString() {
            return "Surrogate(entry_point=" + this.entry_point + ", entry_point_logging_id=" + this.entry_point_logging_id + ", entry_point_source=" + this.entry_point_source + ", account_number=" + this.account_number + ", recommendations_type=" + this.recommendations_type + ", account_type=" + this.account_type + ")";
        }

        /* compiled from: RecommendationsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$Surrogate$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$Surrogate;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final KSerializer<Surrogate> serializer() {
                return RecommendationsContextDto2.INSTANCE;
            }
        }

        public /* synthetic */ Surrogate(int i, EntryPointDto entryPointDto, String str, String str2, String str3, RecommendationsTypeDto recommendationsTypeDto, String str4, SerializationConstructorMarker serializationConstructorMarker) {
            this.entry_point = (i & 1) == 0 ? EntryPointDto.INSTANCE.getZeroValue() : entryPointDto;
            if ((i & 2) == 0) {
                this.entry_point_logging_id = "";
            } else {
                this.entry_point_logging_id = str;
            }
            if ((i & 4) == 0) {
                this.entry_point_source = "";
            } else {
                this.entry_point_source = str2;
            }
            if ((i & 8) == 0) {
                this.account_number = "";
            } else {
                this.account_number = str3;
            }
            if ((i & 16) == 0) {
                this.recommendations_type = RecommendationsTypeDto.INSTANCE.getZeroValue();
            } else {
                this.recommendations_type = recommendationsTypeDto;
            }
            if ((i & 32) == 0) {
                this.account_type = "";
            } else {
                this.account_type = str4;
            }
        }

        @JvmStatic
        public static final /* synthetic */ void write$Self$data_platform_event_logging_externalRelease(Surrogate self, Encoding3 output, SerialDescriptor serialDesc) {
            if (self.entry_point != EntryPointDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 0, EntryPointDto.Serializer.INSTANCE, self.entry_point);
            }
            if (!Intrinsics.areEqual(self.entry_point_logging_id, "")) {
                output.encodeStringElement(serialDesc, 1, self.entry_point_logging_id);
            }
            if (!Intrinsics.areEqual(self.entry_point_source, "")) {
                output.encodeStringElement(serialDesc, 2, self.entry_point_source);
            }
            if (!Intrinsics.areEqual(self.account_number, "")) {
                output.encodeStringElement(serialDesc, 3, self.account_number);
            }
            if (self.recommendations_type != RecommendationsTypeDto.INSTANCE.getZeroValue()) {
                output.encodeSerializableElement(serialDesc, 4, RecommendationsTypeDto.Serializer.INSTANCE, self.recommendations_type);
            }
            if (Intrinsics.areEqual(self.account_type, "")) {
                return;
            }
            output.encodeStringElement(serialDesc, 5, self.account_type);
        }

        public Surrogate(EntryPointDto entry_point, String entry_point_logging_id, String entry_point_source, String account_number, RecommendationsTypeDto recommendations_type, String account_type) {
            Intrinsics.checkNotNullParameter(entry_point, "entry_point");
            Intrinsics.checkNotNullParameter(entry_point_logging_id, "entry_point_logging_id");
            Intrinsics.checkNotNullParameter(entry_point_source, "entry_point_source");
            Intrinsics.checkNotNullParameter(account_number, "account_number");
            Intrinsics.checkNotNullParameter(recommendations_type, "recommendations_type");
            Intrinsics.checkNotNullParameter(account_type, "account_type");
            this.entry_point = entry_point;
            this.entry_point_logging_id = entry_point_logging_id;
            this.entry_point_source = entry_point_source;
            this.account_number = account_number;
            this.recommendations_type = recommendations_type;
            this.account_type = account_type;
        }

        public final EntryPointDto getEntry_point() {
            return this.entry_point;
        }

        /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
            java.lang.NullPointerException
            */
        public /* synthetic */ Surrogate(com.robinhood.rosetta.eventlogging.RecommendationsContextDto.EntryPointDto r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, com.robinhood.rosetta.eventlogging.RecommendationsContextDto.RecommendationsTypeDto r6, java.lang.String r7, int r8, kotlin.jvm.internal.DefaultConstructorMarker r9) {
            /*
                r1 = this;
                r9 = r8 & 1
                if (r9 == 0) goto La
                com.robinhood.rosetta.eventlogging.RecommendationsContextDto$EntryPointDto$Companion r2 = com.robinhood.rosetta.eventlogging.RecommendationsContextDto.EntryPointDto.INSTANCE
                com.robinhood.rosetta.eventlogging.RecommendationsContextDto$EntryPointDto r2 = r2.getZeroValue()
            La:
                r9 = r8 & 2
                java.lang.String r0 = ""
                if (r9 == 0) goto L11
                r3 = r0
            L11:
                r9 = r8 & 4
                if (r9 == 0) goto L16
                r4 = r0
            L16:
                r9 = r8 & 8
                if (r9 == 0) goto L1b
                r5 = r0
            L1b:
                r9 = r8 & 16
                if (r9 == 0) goto L25
                com.robinhood.rosetta.eventlogging.RecommendationsContextDto$RecommendationsTypeDto$Companion r6 = com.robinhood.rosetta.eventlogging.RecommendationsContextDto.RecommendationsTypeDto.INSTANCE
                com.robinhood.rosetta.eventlogging.RecommendationsContextDto$RecommendationsTypeDto r6 = r6.getZeroValue()
            L25:
                r8 = r8 & 32
                if (r8 == 0) goto L31
                r9 = r0
                r7 = r5
                r8 = r6
                r5 = r3
                r6 = r4
                r3 = r1
                r4 = r2
                goto L38
            L31:
                r9 = r7
                r8 = r6
                r6 = r4
                r7 = r5
                r4 = r2
                r5 = r3
                r3 = r1
            L38:
                r3.<init>(r4, r5, r6, r7, r8, r9)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.robinhood.rosetta.eventlogging.RecommendationsContextDto.Surrogate.<init>(com.robinhood.rosetta.eventlogging.RecommendationsContextDto$EntryPointDto, java.lang.String, java.lang.String, java.lang.String, com.robinhood.rosetta.eventlogging.RecommendationsContextDto$RecommendationsTypeDto, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
        }

        public final String getEntry_point_logging_id() {
            return this.entry_point_logging_id;
        }

        public final String getEntry_point_source() {
            return this.entry_point_source;
        }

        public final String getAccount_number() {
            return this.account_number;
        }

        public final RecommendationsTypeDto getRecommendations_type() {
            return this.recommendations_type;
        }

        public final String getAccount_type() {
            return this.account_type;
        }
    }

    /* compiled from: RecommendationsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0002X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$Companion;", "Lcom/robinhood/idl/MessageDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements Dto3.Creator<RecommendationsContextDto, RecommendationsContext> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<RecommendationsContextDto> serializer() {
            return Serializer.INSTANCE;
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RecommendationsContextDto> getDefaultSerializer() {
            return serializer();
        }

        @Override // com.robinhood.idl.Dto.SerializableCreator
        public KSerializer<RecommendationsContextDto> getBinaryBase64Serializer() {
            return (KSerializer) RecommendationsContextDto.binaryBase64Serializer$delegate.getValue();
        }

        @Override // com.robinhood.idl.Dto.Creator
        public ProtoAdapter<RecommendationsContext> getProtoAdapter() {
            return RecommendationsContext.ADAPTER;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RecommendationsContextDto getZeroValue() {
            return RecommendationsContextDto.zeroValue;
        }

        @Override // com.robinhood.idl.Dto.Creator
        public RecommendationsContextDto fromProto(RecommendationsContext proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            return new RecommendationsContextDto(new Surrogate(EntryPointDto.INSTANCE.fromProto(proto.getEntry_point()), proto.getEntry_point_logging_id(), proto.getEntry_point_source(), proto.getAccount_number(), RecommendationsTypeDto.INSTANCE.fromProto(proto.getRecommendations_type()), proto.getAccount_type()), null);
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RecommendationsContextDto$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return RecommendationsContextDto.binaryBase64Serializer_delegate$lambda$0();
            }
        });
        zeroValue = new RecommendationsContextDto(null, null, null, null, null, null, 63, null);
        CREATOR = new DtoParcelableCreator(companion);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
        return new BinaryBase64DtoSerializer(INSTANCE);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecommendationsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0011\u0012B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$RecommendationsType;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "RECOMMENDATIONS_TYPE_UNSPECIFIED", "FIRST_TRADE_RECOMMENDATIONS", "RECS_RETIREMENT", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class RecommendationsTypeDto implements Dto2<RecommendationsContext.RecommendationsType>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ RecommendationsTypeDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<RecommendationsTypeDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<RecommendationsTypeDto, RecommendationsContext.RecommendationsType>> binaryBase64Serializer$delegate;
        public static final RecommendationsTypeDto RECOMMENDATIONS_TYPE_UNSPECIFIED = new RECOMMENDATIONS_TYPE_UNSPECIFIED("RECOMMENDATIONS_TYPE_UNSPECIFIED", 0);
        public static final RecommendationsTypeDto FIRST_TRADE_RECOMMENDATIONS = new FIRST_TRADE_RECOMMENDATIONS("FIRST_TRADE_RECOMMENDATIONS", 1);
        public static final RecommendationsTypeDto RECS_RETIREMENT = new RECS_RETIREMENT("RECS_RETIREMENT", 2);

        private static final /* synthetic */ RecommendationsTypeDto[] $values() {
            return new RecommendationsTypeDto[]{RECOMMENDATIONS_TYPE_UNSPECIFIED, FIRST_TRADE_RECOMMENDATIONS, RECS_RETIREMENT};
        }

        public /* synthetic */ RecommendationsTypeDto(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, i);
        }

        public static EnumEntries<RecommendationsTypeDto> getEntries() {
            return $ENTRIES;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        private RecommendationsTypeDto(String str, int i) {
        }

        /* compiled from: RecommendationsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecommendationsContextDto.RecommendationsTypeDto.RECOMMENDATIONS_TYPE_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$RecommendationsType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECOMMENDATIONS_TYPE_UNSPECIFIED extends RecommendationsTypeDto {
            RECOMMENDATIONS_TYPE_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecommendationsContext.RecommendationsType toProto() {
                return RecommendationsContext.RecommendationsType.RECOMMENDATIONS_TYPE_UNSPECIFIED;
            }
        }

        static {
            RecommendationsTypeDto[] recommendationsTypeDtoArr$values = $values();
            $VALUES = recommendationsTypeDtoArr$values;
            $ENTRIES = EnumEntries2.enumEntries(recommendationsTypeDtoArr$values);
            Companion companion = new Companion(null);
            INSTANCE = companion;
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RecommendationsContextDto$RecommendationsTypeDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecommendationsContextDto.RecommendationsTypeDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: RecommendationsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecommendationsContextDto.RecommendationsTypeDto.FIRST_TRADE_RECOMMENDATIONS", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$RecommendationsType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class FIRST_TRADE_RECOMMENDATIONS extends RecommendationsTypeDto {
            FIRST_TRADE_RECOMMENDATIONS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecommendationsContext.RecommendationsType toProto() {
                return RecommendationsContext.RecommendationsType.FIRST_TRADE_RECOMMENDATIONS;
            }
        }

        /* compiled from: RecommendationsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecommendationsContextDto.RecommendationsTypeDto.RECS_RETIREMENT", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$RecommendationsType;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class RECS_RETIREMENT extends RecommendationsTypeDto {
            RECS_RETIREMENT(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecommendationsContext.RecommendationsType toProto() {
                return RecommendationsContext.RecommendationsType.RECS_RETIREMENT;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: RecommendationsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$RecommendationsType;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<RecommendationsTypeDto, RecommendationsContext.RecommendationsType> {

            /* compiled from: RecommendationsContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[RecommendationsContext.RecommendationsType.values().length];
                    try {
                        iArr[RecommendationsContext.RecommendationsType.RECOMMENDATIONS_TYPE_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RecommendationsContext.RecommendationsType.FIRST_TRADE_RECOMMENDATIONS.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RecommendationsContext.RecommendationsType.RECS_RETIREMENT.ordinal()] = 3;
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

            public final KSerializer<RecommendationsTypeDto> serializer() {
                return Serializer.INSTANCE;
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RecommendationsTypeDto> getDefaultSerializer() {
                return serializer();
            }

            @Override // com.robinhood.idl.Dto.SerializableCreator
            public KSerializer<RecommendationsTypeDto> getBinaryBase64Serializer() {
                return (KSerializer) RecommendationsTypeDto.binaryBase64Serializer$delegate.getValue();
            }

            @Override // com.robinhood.idl.Dto.Creator
            public ProtoAdapter<RecommendationsContext.RecommendationsType> getProtoAdapter() {
                return RecommendationsContext.RecommendationsType.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RecommendationsTypeDto getZeroValue() {
                return RecommendationsTypeDto.RECOMMENDATIONS_TYPE_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public RecommendationsTypeDto fromProto(RecommendationsContext.RecommendationsType proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return RecommendationsTypeDto.RECOMMENDATIONS_TYPE_UNSPECIFIED;
                }
                if (i == 2) {
                    return RecommendationsTypeDto.FIRST_TRADE_RECOMMENDATIONS;
                }
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                return RecommendationsTypeDto.RECS_RETIREMENT;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RecommendationsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$RecommendationsTypeDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<RecommendationsTypeDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<RecommendationsTypeDto, RecommendationsContext.RecommendationsType> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.RecommendationsContext.RecommendationsType", RecommendationsTypeDto.getEntries(), RecommendationsTypeDto.INSTANCE.getZeroValue());

            @Override // kotlinx.serialization.KSerializer2
            public RecommendationsTypeDto deserialize(Decoding2 decoder) {
                Intrinsics.checkNotNullParameter(decoder, "decoder");
                return (RecommendationsTypeDto) this.$$delegate_0.deserialize(decoder);
            }

            @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
            public SerialDescriptor getDescriptor() {
                return this.$$delegate_0.getDescriptor();
            }

            @Override // kotlinx.serialization.KSerializer3
            public void serialize(Encoding4 encoder, RecommendationsTypeDto value) {
                Intrinsics.checkNotNullParameter(encoder, "encoder");
                Intrinsics.checkNotNullParameter(value, "value");
                this.$$delegate_0.serialize(encoder, (Enum) value);
            }

            private Serializer() {
            }
        }

        public static RecommendationsTypeDto valueOf(String str) {
            return (RecommendationsTypeDto) Enum.valueOf(RecommendationsTypeDto.class, str);
        }

        public static RecommendationsTypeDto[] values() {
            return (RecommendationsTypeDto[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: RecommendationsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00000\u0004:\u0002\u0012\u0013B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0016j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto;", "Lcom/robinhood/idl/EnumDto;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$EntryPoint;", "Landroid/os/Parcelable;", "", "<init>", "(Ljava/lang/String;I)V", "ENTRY_POINT_UNSPECIFIED", "BROWSE_UPSELL", "CARD", "MENU_OF_OPTIONS", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "", "describeContents", "Companion", "Serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @Serializable(with = Serializer.class)
    @RhGenerated
    public static final class EntryPointDto implements Dto2<RecommendationsContext.EntryPoint>, Parcelable {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPointDto[] $VALUES;

        @JvmField
        public static final Parcelable.Creator<EntryPointDto> CREATOR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private static final Lazy<BinaryBase64DtoSerializer<EntryPointDto, RecommendationsContext.EntryPoint>> binaryBase64Serializer$delegate;
        public static final EntryPointDto ENTRY_POINT_UNSPECIFIED = new ENTRY_POINT_UNSPECIFIED("ENTRY_POINT_UNSPECIFIED", 0);
        public static final EntryPointDto BROWSE_UPSELL = new BROWSE_UPSELL("BROWSE_UPSELL", 1);
        public static final EntryPointDto CARD = new CARD("CARD", 2);
        public static final EntryPointDto MENU_OF_OPTIONS = new MENU_OF_OPTIONS("MENU_OF_OPTIONS", 3);

        private static final /* synthetic */ EntryPointDto[] $values() {
            return new EntryPointDto[]{ENTRY_POINT_UNSPECIFIED, BROWSE_UPSELL, CARD, MENU_OF_OPTIONS};
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

        /* compiled from: RecommendationsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecommendationsContextDto.EntryPointDto.ENTRY_POINT_UNSPECIFIED", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class ENTRY_POINT_UNSPECIFIED extends EntryPointDto {
            ENTRY_POINT_UNSPECIFIED(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecommendationsContext.EntryPoint toProto() {
                return RecommendationsContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
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
            binaryBase64Serializer$delegate = LazyKt.lazy(new Function0() { // from class: com.robinhood.rosetta.eventlogging.RecommendationsContextDto$EntryPointDto$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return RecommendationsContextDto.EntryPointDto.binaryBase64Serializer_delegate$lambda$0();
                }
            });
            CREATOR = new DtoParcelableCreator(companion);
        }

        /* compiled from: RecommendationsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecommendationsContextDto.EntryPointDto.BROWSE_UPSELL", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class BROWSE_UPSELL extends EntryPointDto {
            BROWSE_UPSELL(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecommendationsContext.EntryPoint toProto() {
                return RecommendationsContext.EntryPoint.BROWSE_UPSELL;
            }
        }

        /* compiled from: RecommendationsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecommendationsContextDto.EntryPointDto.CARD", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class CARD extends EntryPointDto {
            CARD(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecommendationsContext.EntryPoint toProto() {
                return RecommendationsContext.EntryPoint.CARD;
            }
        }

        /* compiled from: RecommendationsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\bÊ\u0001\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, m3636d2 = {"com/robinhood/rosetta/eventlogging/RecommendationsContextDto.EntryPointDto.MENU_OF_OPTIONS", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto;", "toProto", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$EntryPoint;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        static final class MENU_OF_OPTIONS extends EntryPointDto {
            MENU_OF_OPTIONS(String str, int i) {
                super(str, i, null);
            }

            @Override // com.robinhood.idl.Dto
            public RecommendationsContext.EntryPoint toProto() {
                return RecommendationsContext.EntryPoint.MENU_OF_OPTIONS;
            }
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            DtoParcelableCreator2.writeToParcel(INSTANCE, this, dest);
        }

        /* compiled from: RecommendationsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0003H\u0016J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00020\u0007R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000b\u0010\tR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u00168\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto$Companion;", "Lcom/robinhood/idl/EnumDto$Creator;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContext$EntryPoint;", "<init>", "()V", "defaultSerializer", "Lkotlinx/serialization/KSerializer;", "getDefaultSerializer", "()Lkotlinx/serialization/KSerializer;", "binaryBase64Serializer", "getBinaryBase64Serializer", "binaryBase64Serializer$delegate", "Lkotlin/Lazy;", "protoAdapter", "Lcom/squareup/wire/ProtoAdapter;", "getProtoAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "zeroValue", "getZeroValue", "()Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto;", "CREATOR", "Landroid/os/Parcelable$Creator;", "fromProto", "proto", "serializer", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion implements Dto2.Creator<EntryPointDto, RecommendationsContext.EntryPoint> {

            /* compiled from: RecommendationsContextDto.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* loaded from: classes26.dex */
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[RecommendationsContext.EntryPoint.values().length];
                    try {
                        iArr[RecommendationsContext.EntryPoint.ENTRY_POINT_UNSPECIFIED.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[RecommendationsContext.EntryPoint.BROWSE_UPSELL.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[RecommendationsContext.EntryPoint.CARD.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[RecommendationsContext.EntryPoint.MENU_OF_OPTIONS.ordinal()] = 4;
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
            public ProtoAdapter<RecommendationsContext.EntryPoint> getProtoAdapter() {
                return RecommendationsContext.EntryPoint.ADAPTER;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto getZeroValue() {
                return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
            }

            @Override // com.robinhood.idl.Dto.Creator
            public EntryPointDto fromProto(RecommendationsContext.EntryPoint proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return EntryPointDto.ENTRY_POINT_UNSPECIFIED;
                }
                if (i == 2) {
                    return EntryPointDto.BROWSE_UPSELL;
                }
                if (i == 3) {
                    return EntryPointDto.CARD;
                }
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                return EntryPointDto.MENU_OF_OPTIONS;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final BinaryBase64DtoSerializer binaryBase64Serializer_delegate$lambda$0() {
            return new BinaryBase64DtoSerializer(INSTANCE);
        }

        /* compiled from: RecommendationsContextDto.kt */
        @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0096\u0001J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0002H\u0096\u0001R\u0012\u0010\r\u001a\u00020\u000eX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$EntryPointDto;", "<init>", "()V", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes26.dex */
        public static final class Serializer implements KSerializer<EntryPointDto> {
            public static final Serializer INSTANCE = new Serializer();
            private final /* synthetic */ EnumDtoSerializer<EntryPointDto, RecommendationsContext.EntryPoint> $$delegate_0 = new EnumDtoSerializer<>("type.googleapis.com/rosetta.event_logging.RecommendationsContext.EntryPoint", EntryPointDto.getEntries(), EntryPointDto.INSTANCE.getZeroValue());

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

    /* compiled from: RecommendationsContextDto.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0002H\u0016J\u0010\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$Serializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto;", "<init>", "()V", "surrogateSerializer", "Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$Surrogate;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes26.dex */
    public static final class Serializer implements KSerializer<RecommendationsContextDto> {
        public static final Serializer INSTANCE = new Serializer();
        private static final SerialDescriptor descriptor;
        private static final KSerializer<Surrogate> surrogateSerializer;

        private Serializer() {
        }

        static {
            KSerializer<Surrogate> kSerializerSerializer = Surrogate.INSTANCE.serializer();
            surrogateSerializer = kSerializerSerializer;
            descriptor = SerialDescriptors3.SerialDescriptor("type.googleapis.com/rosetta.event_logging.RecommendationsContext", kSerializerSerializer.getDescriptor());
        }

        @Override // kotlinx.serialization.KSerializer, kotlinx.serialization.KSerializer3, kotlinx.serialization.KSerializer2
        public SerialDescriptor getDescriptor() {
            return descriptor;
        }

        @Override // kotlinx.serialization.KSerializer3
        public void serialize(Encoding4 encoder, RecommendationsContextDto value) {
            Intrinsics.checkNotNullParameter(encoder, "encoder");
            Intrinsics.checkNotNullParameter(value, "value");
            encoder.encodeSerializableValue(surrogateSerializer, value.surrogate);
        }

        @Override // kotlinx.serialization.KSerializer2
        public RecommendationsContextDto deserialize(Decoding2 decoder) {
            Intrinsics.checkNotNullParameter(decoder, "decoder");
            return new RecommendationsContextDto((Surrogate) decoder.decodeSerializableValue(surrogateSerializer), null);
        }
    }

    /* compiled from: RecommendationsContextDto.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/RecommendationsContextDto$MultibindingModule;", "", "<init>", "()V", "provideIntoMap", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MultibindingModule {
        public static final MultibindingModule INSTANCE = new MultibindingModule();

        private MultibindingModule() {
        }

        @MultibindingShard(number = MultibindingShard.Number.f4187_3)
        public final String provideIntoMap() {
            return "com.robinhood.rosetta.eventlogging.RecommendationsContextDto";
        }
    }
}
