package com.robinhood.rosetta.eventlogging;

import com.plaid.internal.EnumC7081g;
import com.robinhood.rosetta.eventlogging.ShareholderQAContext;
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

/* compiled from: ShareholderQAContext.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 '2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0005'()*+BM\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001e\u001a\u00020\u0002H\u0017J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0096\u0002J\b\u0010#\u001a\u00020$H\u0016J\b\u0010%\u001a\u00020\u0004H\u0016JL\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0019R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext;", "Lcom/squareup/wire/Message;", "", "event_slug", "", "entry_point", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "event_state", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "is_shareholder", "Lcom/robinhood/rosetta/eventlogging/Boolean;", "vote_button_state", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$VoteButtonState;", "event_section", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventSection;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;Lcom/robinhood/rosetta/eventlogging/Boolean;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$VoteButtonState;Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventSection;Lokio/ByteString;)V", "getEvent_slug", "()Ljava/lang/String;", "getEntry_point", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "getEvent_state", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "()Lcom/robinhood/rosetta/eventlogging/Boolean;", "getVote_button_state", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$VoteButtonState;", "getEvent_section", "()Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventSection;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "EntryPoint", "EventState", "VoteButtonState", "EventSection", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class ShareholderQAContext extends Message {

    @JvmField
    public static final ProtoAdapter<ShareholderQAContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ShareholderQAContext$EntryPoint#ADAPTER", jsonName = "entryPoint", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final EntryPoint entry_point;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ShareholderQAContext$EventSection#ADAPTER", jsonName = "eventSection", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final EventSection event_section;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "eventSlug", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String event_slug;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ShareholderQAContext$EventState#ADAPTER", jsonName = "eventState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final EventState event_state;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Boolean#ADAPTER", jsonName = "isShareholder", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Boolean is_shareholder;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ShareholderQAContext$VoteButtonState#ADAPTER", jsonName = "voteButtonState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final VoteButtonState vote_button_state;

    public ShareholderQAContext() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24564newBuilder();
    }

    public final String getEvent_slug() {
        return this.event_slug;
    }

    public /* synthetic */ ShareholderQAContext(String str, EntryPoint entryPoint, EventState eventState, Boolean r4, VoteButtonState voteButtonState, EventSection eventSection, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EntryPoint.ENTRY_POINT_UNSPECIFIED : entryPoint, (i & 4) != 0 ? EventState.EVENT_STATE_UNSPECIFIED : eventState, (i & 8) != 0 ? Boolean.BOOLEAN_UNSPECIFIED : r4, (i & 16) != 0 ? VoteButtonState.VOTE_BUTTON_STATE_UNSPECIFIED : voteButtonState, (i & 32) != 0 ? EventSection.EVENT_SECTION_UNSPECIFIED : eventSection, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final EntryPoint getEntry_point() {
        return this.entry_point;
    }

    public final EventState getEvent_state() {
        return this.event_state;
    }

    /* renamed from: is_shareholder, reason: from getter */
    public final Boolean getIs_shareholder() {
        return this.is_shareholder;
    }

    public final VoteButtonState getVote_button_state() {
        return this.vote_button_state;
    }

    public final EventSection getEvent_section() {
        return this.event_section;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShareholderQAContext(String event_slug, EntryPoint entry_point, EventState event_state, Boolean is_shareholder, VoteButtonState vote_button_state, EventSection event_section, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(event_slug, "event_slug");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(event_state, "event_state");
        Intrinsics.checkNotNullParameter(is_shareholder, "is_shareholder");
        Intrinsics.checkNotNullParameter(vote_button_state, "vote_button_state");
        Intrinsics.checkNotNullParameter(event_section, "event_section");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.event_slug = event_slug;
        this.entry_point = entry_point;
        this.event_state = event_state;
        this.is_shareholder = is_shareholder;
        this.vote_button_state = vote_button_state;
        this.event_section = event_section;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24564newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ShareholderQAContext)) {
            return false;
        }
        ShareholderQAContext shareholderQAContext = (ShareholderQAContext) other;
        return Intrinsics.areEqual(unknownFields(), shareholderQAContext.unknownFields()) && Intrinsics.areEqual(this.event_slug, shareholderQAContext.event_slug) && this.entry_point == shareholderQAContext.entry_point && this.event_state == shareholderQAContext.event_state && this.is_shareholder == shareholderQAContext.is_shareholder && this.vote_button_state == shareholderQAContext.vote_button_state && this.event_section == shareholderQAContext.event_section;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((((unknownFields().hashCode() * 37) + this.event_slug.hashCode()) * 37) + this.entry_point.hashCode()) * 37) + this.event_state.hashCode()) * 37) + this.is_shareholder.hashCode()) * 37) + this.vote_button_state.hashCode()) * 37) + this.event_section.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("event_slug=" + Internal.sanitize(this.event_slug));
        arrayList.add("entry_point=" + this.entry_point);
        arrayList.add("event_state=" + this.event_state);
        arrayList.add("is_shareholder=" + this.is_shareholder);
        arrayList.add("vote_button_state=" + this.vote_button_state);
        arrayList.add("event_section=" + this.event_section);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ShareholderQAContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ShareholderQAContext copy$default(ShareholderQAContext shareholderQAContext, String str, EntryPoint entryPoint, EventState eventState, Boolean r4, VoteButtonState voteButtonState, EventSection eventSection, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareholderQAContext.event_slug;
        }
        if ((i & 2) != 0) {
            entryPoint = shareholderQAContext.entry_point;
        }
        if ((i & 4) != 0) {
            eventState = shareholderQAContext.event_state;
        }
        if ((i & 8) != 0) {
            r4 = shareholderQAContext.is_shareholder;
        }
        if ((i & 16) != 0) {
            voteButtonState = shareholderQAContext.vote_button_state;
        }
        if ((i & 32) != 0) {
            eventSection = shareholderQAContext.event_section;
        }
        if ((i & 64) != 0) {
            byteString = shareholderQAContext.unknownFields();
        }
        EventSection eventSection2 = eventSection;
        ByteString byteString2 = byteString;
        VoteButtonState voteButtonState2 = voteButtonState;
        EventState eventState2 = eventState;
        return shareholderQAContext.copy(str, entryPoint, eventState2, r4, voteButtonState2, eventSection2, byteString2);
    }

    public final ShareholderQAContext copy(String event_slug, EntryPoint entry_point, EventState event_state, Boolean is_shareholder, VoteButtonState vote_button_state, EventSection event_section, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(event_slug, "event_slug");
        Intrinsics.checkNotNullParameter(entry_point, "entry_point");
        Intrinsics.checkNotNullParameter(event_state, "event_state");
        Intrinsics.checkNotNullParameter(is_shareholder, "is_shareholder");
        Intrinsics.checkNotNullParameter(vote_button_state, "vote_button_state");
        Intrinsics.checkNotNullParameter(event_section, "event_section");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ShareholderQAContext(event_slug, entry_point, event_state, is_shareholder, vote_button_state, event_section, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ShareholderQAContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ShareholderQAContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ShareholderQAContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ShareholderQAContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getEvent_slug(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getEvent_slug());
                }
                if (value.getEntry_point() != ShareholderQAContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    size += ShareholderQAContext.EntryPoint.ADAPTER.encodedSizeWithTag(2, value.getEntry_point());
                }
                if (value.getEvent_state() != ShareholderQAContext.EventState.EVENT_STATE_UNSPECIFIED) {
                    size += ShareholderQAContext.EventState.ADAPTER.encodedSizeWithTag(3, value.getEvent_state());
                }
                if (value.getIs_shareholder() != Boolean.BOOLEAN_UNSPECIFIED) {
                    size += Boolean.ADAPTER.encodedSizeWithTag(4, value.getIs_shareholder());
                }
                if (value.getVote_button_state() != ShareholderQAContext.VoteButtonState.VOTE_BUTTON_STATE_UNSPECIFIED) {
                    size += ShareholderQAContext.VoteButtonState.ADAPTER.encodedSizeWithTag(5, value.getVote_button_state());
                }
                return value.getEvent_section() != ShareholderQAContext.EventSection.EVENT_SECTION_UNSPECIFIED ? size + ShareholderQAContext.EventSection.ADAPTER.encodedSizeWithTag(6, value.getEvent_section()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ShareholderQAContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getEvent_slug(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEvent_slug());
                }
                if (value.getEntry_point() != ShareholderQAContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    ShareholderQAContext.EntryPoint.ADAPTER.encodeWithTag(writer, 2, (int) value.getEntry_point());
                }
                if (value.getEvent_state() != ShareholderQAContext.EventState.EVENT_STATE_UNSPECIFIED) {
                    ShareholderQAContext.EventState.ADAPTER.encodeWithTag(writer, 3, (int) value.getEvent_state());
                }
                if (value.getIs_shareholder() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 4, (int) value.getIs_shareholder());
                }
                if (value.getVote_button_state() != ShareholderQAContext.VoteButtonState.VOTE_BUTTON_STATE_UNSPECIFIED) {
                    ShareholderQAContext.VoteButtonState.ADAPTER.encodeWithTag(writer, 5, (int) value.getVote_button_state());
                }
                if (value.getEvent_section() != ShareholderQAContext.EventSection.EVENT_SECTION_UNSPECIFIED) {
                    ShareholderQAContext.EventSection.ADAPTER.encodeWithTag(writer, 6, (int) value.getEvent_section());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ShareholderQAContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getEvent_section() != ShareholderQAContext.EventSection.EVENT_SECTION_UNSPECIFIED) {
                    ShareholderQAContext.EventSection.ADAPTER.encodeWithTag(writer, 6, (int) value.getEvent_section());
                }
                if (value.getVote_button_state() != ShareholderQAContext.VoteButtonState.VOTE_BUTTON_STATE_UNSPECIFIED) {
                    ShareholderQAContext.VoteButtonState.ADAPTER.encodeWithTag(writer, 5, (int) value.getVote_button_state());
                }
                if (value.getIs_shareholder() != Boolean.BOOLEAN_UNSPECIFIED) {
                    Boolean.ADAPTER.encodeWithTag(writer, 4, (int) value.getIs_shareholder());
                }
                if (value.getEvent_state() != ShareholderQAContext.EventState.EVENT_STATE_UNSPECIFIED) {
                    ShareholderQAContext.EventState.ADAPTER.encodeWithTag(writer, 3, (int) value.getEvent_state());
                }
                if (value.getEntry_point() != ShareholderQAContext.EntryPoint.ENTRY_POINT_UNSPECIFIED) {
                    ShareholderQAContext.EntryPoint.ADAPTER.encodeWithTag(writer, 2, (int) value.getEntry_point());
                }
                if (Intrinsics.areEqual(value.getEvent_slug(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getEvent_slug());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ShareholderQAContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ShareholderQAContext.EntryPoint entryPointDecode = ShareholderQAContext.EntryPoint.ENTRY_POINT_UNSPECIFIED;
                ShareholderQAContext.EventState eventState = ShareholderQAContext.EventState.EVENT_STATE_UNSPECIFIED;
                Boolean r3 = Boolean.BOOLEAN_UNSPECIFIED;
                ShareholderQAContext.VoteButtonState voteButtonState = ShareholderQAContext.VoteButtonState.VOTE_BUTTON_STATE_UNSPECIFIED;
                ShareholderQAContext.EventSection eventSection = ShareholderQAContext.EventSection.EVENT_SECTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                ShareholderQAContext.EventSection eventSectionDecode = eventSection;
                ShareholderQAContext.VoteButtonState voteButtonStateDecode = voteButtonState;
                Boolean booleanDecode = r3;
                ShareholderQAContext.EventState eventStateDecode = eventState;
                while (true) {
                    ShareholderQAContext.EntryPoint entryPoint = entryPointDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    strDecode = ProtoAdapter.STRING.decode(reader);
                                    break;
                                case 2:
                                    try {
                                        entryPointDecode = ShareholderQAContext.EntryPoint.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 3:
                                    try {
                                        eventStateDecode = ShareholderQAContext.EventState.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 4:
                                    try {
                                        booleanDecode = Boolean.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                                        break;
                                    }
                                case 5:
                                    try {
                                        voteButtonStateDecode = ShareholderQAContext.VoteButtonState.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                                        break;
                                    }
                                case 6:
                                    try {
                                        eventSectionDecode = ShareholderQAContext.EventSection.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e5) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e5.value));
                                        break;
                                    }
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new ShareholderQAContext(strDecode, entryPoint, eventStateDecode, booleanDecode, voteButtonStateDecode, eventSectionDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ShareholderQAContext redact(ShareholderQAContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ShareholderQAContext.copy$default(value, null, null, null, null, null, null, ByteString.EMPTY, 63, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShareholderQAContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ENTRY_POINT_UNSPECIFIED", "STOCK_DETAIL_CARD", "STOCK_DETAIL_EARNINGS_ROW", "PUSH_NOTIFICATION", "INBOX_MESSAGE", "CARD", "SHARE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EntryPoint implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EntryPoint[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EntryPoint> ADAPTER;
        public static final EntryPoint CARD;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EntryPoint ENTRY_POINT_UNSPECIFIED;
        public static final EntryPoint INBOX_MESSAGE;
        public static final EntryPoint PUSH_NOTIFICATION;
        public static final EntryPoint SHARE;
        public static final EntryPoint STOCK_DETAIL_CARD;
        public static final EntryPoint STOCK_DETAIL_EARNINGS_ROW;
        private final int value;

        private static final /* synthetic */ EntryPoint[] $values() {
            return new EntryPoint[]{ENTRY_POINT_UNSPECIFIED, STOCK_DETAIL_CARD, STOCK_DETAIL_EARNINGS_ROW, PUSH_NOTIFICATION, INBOX_MESSAGE, CARD, SHARE};
        }

        @JvmStatic
        public static final EntryPoint fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EntryPoint> getEntries() {
            return $ENTRIES;
        }

        private EntryPoint(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EntryPoint entryPoint = new EntryPoint("ENTRY_POINT_UNSPECIFIED", 0, 0);
            ENTRY_POINT_UNSPECIFIED = entryPoint;
            STOCK_DETAIL_CARD = new EntryPoint("STOCK_DETAIL_CARD", 1, 1);
            STOCK_DETAIL_EARNINGS_ROW = new EntryPoint("STOCK_DETAIL_EARNINGS_ROW", 2, 2);
            PUSH_NOTIFICATION = new EntryPoint("PUSH_NOTIFICATION", 3, 3);
            INBOX_MESSAGE = new EntryPoint("INBOX_MESSAGE", 4, 4);
            CARD = new EntryPoint("CARD", 5, 5);
            SHARE = new EntryPoint("SHARE", 6, 6);
            EntryPoint[] entryPointArr$values = $values();
            $VALUES = entryPointArr$values;
            $ENTRIES = EnumEntries2.enumEntries(entryPointArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EntryPoint.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EntryPoint>(orCreateKotlinClass, syntax, entryPoint) { // from class: com.robinhood.rosetta.eventlogging.ShareholderQAContext$EntryPoint$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ShareholderQAContext.EntryPoint fromValue(int value) {
                    return ShareholderQAContext.EntryPoint.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ShareholderQAContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EntryPoint;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EntryPoint fromValue(int value) {
                switch (value) {
                    case 0:
                        return EntryPoint.ENTRY_POINT_UNSPECIFIED;
                    case 1:
                        return EntryPoint.STOCK_DETAIL_CARD;
                    case 2:
                        return EntryPoint.STOCK_DETAIL_EARNINGS_ROW;
                    case 3:
                        return EntryPoint.PUSH_NOTIFICATION;
                    case 4:
                        return EntryPoint.INBOX_MESSAGE;
                    case 5:
                        return EntryPoint.CARD;
                    case 6:
                        return EntryPoint.SHARE;
                    default:
                        return null;
                }
            }
        }

        public static EntryPoint valueOf(String str) {
            return (EntryPoint) Enum.valueOf(EntryPoint.class, str);
        }

        public static EntryPoint[] values() {
            return (EntryPoint[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShareholderQAContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \u00112\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0011B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_STATE_UNSPECIFIED", "EARLY", "QA_EVENT_OPEN", "QA_EVENT_CLOSED_CALL_COUNTDOWN", "QA_EVENT_CLOSED_DAY_OF_COUNTDOWN", "EARNINGS_CALL_LIVE", "EARNINGS_CALL_ENDED", "ANSWERS_POSTED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EventState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EventState> ADAPTER;
        public static final EventState ANSWERS_POSTED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EventState EARLY;
        public static final EventState EARNINGS_CALL_ENDED;
        public static final EventState EARNINGS_CALL_LIVE;
        public static final EventState EVENT_STATE_UNSPECIFIED;
        public static final EventState QA_EVENT_CLOSED_CALL_COUNTDOWN;
        public static final EventState QA_EVENT_CLOSED_DAY_OF_COUNTDOWN;
        public static final EventState QA_EVENT_OPEN;
        private final int value;

        private static final /* synthetic */ EventState[] $values() {
            return new EventState[]{EVENT_STATE_UNSPECIFIED, EARLY, QA_EVENT_OPEN, QA_EVENT_CLOSED_CALL_COUNTDOWN, QA_EVENT_CLOSED_DAY_OF_COUNTDOWN, EARNINGS_CALL_LIVE, EARNINGS_CALL_ENDED, ANSWERS_POSTED};
        }

        @JvmStatic
        public static final EventState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EventState> getEntries() {
            return $ENTRIES;
        }

        private EventState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EventState eventState = new EventState("EVENT_STATE_UNSPECIFIED", 0, 0);
            EVENT_STATE_UNSPECIFIED = eventState;
            EARLY = new EventState("EARLY", 1, 1);
            QA_EVENT_OPEN = new EventState("QA_EVENT_OPEN", 2, 2);
            QA_EVENT_CLOSED_CALL_COUNTDOWN = new EventState("QA_EVENT_CLOSED_CALL_COUNTDOWN", 3, 3);
            QA_EVENT_CLOSED_DAY_OF_COUNTDOWN = new EventState("QA_EVENT_CLOSED_DAY_OF_COUNTDOWN", 4, 4);
            EARNINGS_CALL_LIVE = new EventState("EARNINGS_CALL_LIVE", 5, 5);
            EARNINGS_CALL_ENDED = new EventState("EARNINGS_CALL_ENDED", 6, 6);
            ANSWERS_POSTED = new EventState("ANSWERS_POSTED", 7, 7);
            EventState[] eventStateArr$values = $values();
            $VALUES = eventStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EventState>(orCreateKotlinClass, syntax, eventState) { // from class: com.robinhood.rosetta.eventlogging.ShareholderQAContext$EventState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ShareholderQAContext.EventState fromValue(int value) {
                    return ShareholderQAContext.EventState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ShareholderQAContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventState;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EventState fromValue(int value) {
                switch (value) {
                    case 0:
                        return EventState.EVENT_STATE_UNSPECIFIED;
                    case 1:
                        return EventState.EARLY;
                    case 2:
                        return EventState.QA_EVENT_OPEN;
                    case 3:
                        return EventState.QA_EVENT_CLOSED_CALL_COUNTDOWN;
                    case 4:
                        return EventState.QA_EVENT_CLOSED_DAY_OF_COUNTDOWN;
                    case 5:
                        return EventState.EARNINGS_CALL_LIVE;
                    case 6:
                        return EventState.EARNINGS_CALL_ENDED;
                    case 7:
                        return EventState.ANSWERS_POSTED;
                    default:
                        return null;
                }
            }
        }

        public static EventState valueOf(String str) {
            return (EventState) Enum.valueOf(EventState.class, str);
        }

        public static EventState[] values() {
            return (EventState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShareholderQAContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$VoteButtonState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "VOTE_BUTTON_STATE_UNSPECIFIED", "UPVOTED", "DISABLED", "DEFAULT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class VoteButtonState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ VoteButtonState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<VoteButtonState> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final VoteButtonState DEFAULT;
        public static final VoteButtonState DISABLED;
        public static final VoteButtonState UPVOTED;
        public static final VoteButtonState VOTE_BUTTON_STATE_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ VoteButtonState[] $values() {
            return new VoteButtonState[]{VOTE_BUTTON_STATE_UNSPECIFIED, UPVOTED, DISABLED, DEFAULT};
        }

        @JvmStatic
        public static final VoteButtonState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<VoteButtonState> getEntries() {
            return $ENTRIES;
        }

        private VoteButtonState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final VoteButtonState voteButtonState = new VoteButtonState("VOTE_BUTTON_STATE_UNSPECIFIED", 0, 0);
            VOTE_BUTTON_STATE_UNSPECIFIED = voteButtonState;
            UPVOTED = new VoteButtonState("UPVOTED", 1, 1);
            DISABLED = new VoteButtonState("DISABLED", 2, 2);
            DEFAULT = new VoteButtonState("DEFAULT", 3, 3);
            VoteButtonState[] voteButtonStateArr$values = $values();
            $VALUES = voteButtonStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(voteButtonStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(VoteButtonState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<VoteButtonState>(orCreateKotlinClass, syntax, voteButtonState) { // from class: com.robinhood.rosetta.eventlogging.ShareholderQAContext$VoteButtonState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ShareholderQAContext.VoteButtonState fromValue(int value) {
                    return ShareholderQAContext.VoteButtonState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ShareholderQAContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$VoteButtonState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$VoteButtonState;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final VoteButtonState fromValue(int value) {
                if (value == 0) {
                    return VoteButtonState.VOTE_BUTTON_STATE_UNSPECIFIED;
                }
                if (value == 1) {
                    return VoteButtonState.UPVOTED;
                }
                if (value == 2) {
                    return VoteButtonState.DISABLED;
                }
                if (value != 3) {
                    return null;
                }
                return VoteButtonState.DEFAULT;
            }
        }

        public static VoteButtonState valueOf(String str) {
            return (VoteButtonState) Enum.valueOf(VoteButtonState.class, str);
        }

        public static VoteButtonState[] values() {
            return (VoteButtonState[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ShareholderQAContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventSection;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_SECTION_UNSPECIFIED", "EVENT_NEW", "EVENT_PAST", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EventSection implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventSection[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EventSection> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EventSection EVENT_NEW;
        public static final EventSection EVENT_PAST;
        public static final EventSection EVENT_SECTION_UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ EventSection[] $values() {
            return new EventSection[]{EVENT_SECTION_UNSPECIFIED, EVENT_NEW, EVENT_PAST};
        }

        @JvmStatic
        public static final EventSection fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EventSection> getEntries() {
            return $ENTRIES;
        }

        private EventSection(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EventSection eventSection = new EventSection("EVENT_SECTION_UNSPECIFIED", 0, 0);
            EVENT_SECTION_UNSPECIFIED = eventSection;
            EVENT_NEW = new EventSection("EVENT_NEW", 1, 1);
            EVENT_PAST = new EventSection("EVENT_PAST", 2, 2);
            EventSection[] eventSectionArr$values = $values();
            $VALUES = eventSectionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventSectionArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventSection.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EventSection>(orCreateKotlinClass, syntax, eventSection) { // from class: com.robinhood.rosetta.eventlogging.ShareholderQAContext$EventSection$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ShareholderQAContext.EventSection fromValue(int value) {
                    return ShareholderQAContext.EventSection.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ShareholderQAContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventSection$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventSection;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EventSection fromValue(int value) {
                if (value == 0) {
                    return EventSection.EVENT_SECTION_UNSPECIFIED;
                }
                if (value == 1) {
                    return EventSection.EVENT_NEW;
                }
                if (value != 2) {
                    return null;
                }
                return EventSection.EVENT_PAST;
            }
        }

        public static EventSection valueOf(String str) {
            return (EventSection) Enum.valueOf(EventSection.class, str);
        }

        public static EventSection[] values() {
            return (EventSection[]) $VALUES.clone();
        }
    }
}
