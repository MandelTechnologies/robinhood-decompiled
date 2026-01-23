package com.robinhood.rosetta.eventlogging;

import com.adjust.sdk.network.ErrorCodes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSection;
import com.robinhood.android.feature.margin.hub.sdui.SduiMarginBufferBarLarge;
import com.robinhood.android.gold.hub.CylinderBarConstants;
import com.robinhood.android.options.lib.simulatedreturn.OptionsSimulatedReturnUtils;
import com.robinhood.android.optionsupgrade.OptionOnboardingUpsellAnimationConstants;
import com.robinhood.android.recommendations.retirement.lib.p222ui.RecsRetirementLoadingConstants;
import com.robinhood.android.transfers.p271ui.p272v2.CreateTransferShimActivity;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.compose.bento.component.rows.Timeline;
import com.robinhood.models.dao.RhRoomDatabase;
import com.robinhood.rosetta.eventlogging.Screen;
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
import com.withpersona.sdk2.inquiry.network.core.HttpStatusCode;
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

/* compiled from: Screen.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001c\u001dB/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0006H\u0016J.\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Screen;", "Lcom/squareup/wire/Message;", "", "name", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "description", "", "identifier", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/Screen$Name;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getName", "()Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "getDescription$annotations", "()V", "getDescription", "()Ljava/lang/String;", "getIdentifier", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "Name", "data_platform.event_logging.screen_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class Screen extends Message {

    @JvmField
    public static final ProtoAdapter<Screen> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String description;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String identifier;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Screen$Name#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final Name name;

    public Screen() {
        this(null, null, null, null, 15, null);
    }

    @Deprecated
    public static /* synthetic */ void getDescription$annotations() {
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24558newBuilder();
    }

    public final Name getName() {
        return this.name;
    }

    public /* synthetic */ Screen(Name name, String str, String str2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Name.NAME_UNSPECIFIED : name, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? ByteString.EMPTY : byteString);
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Screen(Name name, String description, String identifier, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.name = name;
        this.description = description;
        this.identifier = identifier;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24558newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof Screen)) {
            return false;
        }
        Screen screen = (Screen) other;
        return Intrinsics.areEqual(unknownFields(), screen.unknownFields()) && this.name == screen.name && Intrinsics.areEqual(this.description, screen.description) && Intrinsics.areEqual(this.identifier, screen.identifier);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((unknownFields().hashCode() * 37) + this.name.hashCode()) * 37) + this.description.hashCode()) * 37) + this.identifier.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("name=" + this.name);
        arrayList.add("description=" + Internal.sanitize(this.description));
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        return CollectionsKt.joinToString$default(arrayList, ", ", "Screen{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ Screen copy$default(Screen screen, Name name, String str, String str2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            name = screen.name;
        }
        if ((i & 2) != 0) {
            str = screen.description;
        }
        if ((i & 4) != 0) {
            str2 = screen.identifier;
        }
        if ((i & 8) != 0) {
            byteString = screen.unknownFields();
        }
        return screen.copy(name, str, str2, byteString);
    }

    public final Screen copy(Name name, String description, String identifier, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new Screen(name, description, identifier, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Screen.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<Screen>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.Screen$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(Screen value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getName() != Screen.Name.NAME_UNSPECIFIED) {
                    size += Screen.Name.ADAPTER.encodedSizeWithTag(1, value.getName());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getDescription());
                }
                return !Intrinsics.areEqual(value.getIdentifier(), "") ? size + ProtoAdapter.STRING.encodedSizeWithTag(3, value.getIdentifier()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, Screen value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getName() != Screen.Name.NAME_UNSPECIFIED) {
                    Screen.Name.ADAPTER.encodeWithTag(writer, 1, (int) value.getName());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIdentifier());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, Screen value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getIdentifier());
                }
                if (!Intrinsics.areEqual(value.getDescription(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getDescription());
                }
                if (value.getName() != Screen.Name.NAME_UNSPECIFIED) {
                    Screen.Name.ADAPTER.encodeWithTag(writer, 1, (int) value.getName());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public Screen decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                Screen.Name nameDecode = Screen.Name.NAME_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new Screen(nameDecode, strDecode, strDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            nameDecode = Screen.Name.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public Screen redact(Screen value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return Screen.copy$default(value, null, null, null, ByteString.EMPTY, 7, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Screen.kt */
    @Metadata(m3635d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\bà\n\b\u0086\u0081\u0002\u0018\u0000 ã\n2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002ã\nB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002j\u0003\b\u008d\u0002j\u0003\b\u008e\u0002j\u0003\b\u008f\u0002j\u0003\b\u0090\u0002j\u0003\b\u0091\u0002j\u0003\b\u0092\u0002j\u0003\b\u0093\u0002j\u0003\b\u0094\u0002j\u0003\b\u0095\u0002j\u0003\b\u0096\u0002j\u0003\b\u0097\u0002j\u0003\b\u0098\u0002j\u0003\b\u0099\u0002j\u0003\b\u009a\u0002j\u0003\b\u009b\u0002j\u0003\b\u009c\u0002j\u0003\b\u009d\u0002j\u0003\b\u009e\u0002j\u0003\b\u009f\u0002j\u0003\b \u0002j\u0003\b¡\u0002j\u0003\b¢\u0002j\u0003\b£\u0002j\u0003\b¤\u0002j\u0003\b¥\u0002j\u0003\b¦\u0002j\u0003\b§\u0002j\u0003\b¨\u0002j\u0003\b©\u0002j\u0003\bª\u0002j\u0003\b«\u0002j\u0003\b¬\u0002j\u0003\b\u00ad\u0002j\u0003\b®\u0002j\u0003\b¯\u0002j\u0003\b°\u0002j\u0003\b±\u0002j\u0003\b²\u0002j\u0003\b³\u0002j\u0003\b´\u0002j\u0003\bµ\u0002j\u0003\b¶\u0002j\u0003\b·\u0002j\u0003\b¸\u0002j\u0003\b¹\u0002j\u0003\bº\u0002j\u0003\b»\u0002j\u0003\b¼\u0002j\u0003\b½\u0002j\u0003\b¾\u0002j\u0003\b¿\u0002j\u0003\bÀ\u0002j\u0003\bÁ\u0002j\u0003\bÂ\u0002j\u0003\bÃ\u0002j\u0003\bÄ\u0002j\u0003\bÅ\u0002j\u0003\bÆ\u0002j\u0003\bÇ\u0002j\u0003\bÈ\u0002j\u0003\bÉ\u0002j\u0003\bÊ\u0002j\u0003\bË\u0002j\u0003\bÌ\u0002j\u0003\bÍ\u0002j\u0003\bÎ\u0002j\u0003\bÏ\u0002j\u0003\bÐ\u0002j\u0003\bÑ\u0002j\u0003\bÒ\u0002j\u0003\bÓ\u0002j\u0003\bÔ\u0002j\u0003\bÕ\u0002j\u0003\bÖ\u0002j\u0003\b×\u0002j\u0003\bØ\u0002j\u0003\bÙ\u0002j\u0003\bÚ\u0002j\u0003\bÛ\u0002j\u0003\bÜ\u0002j\u0003\bÝ\u0002j\u0003\bÞ\u0002j\u0003\bß\u0002j\u0003\bà\u0002j\u0003\bá\u0002j\u0003\bâ\u0002j\u0003\bã\u0002j\u0003\bä\u0002j\u0003\bå\u0002j\u0003\bæ\u0002j\u0003\bç\u0002j\u0003\bè\u0002j\u0003\bé\u0002j\u0003\bê\u0002j\u0003\bë\u0002j\u0003\bì\u0002j\u0003\bí\u0002j\u0003\bî\u0002j\u0003\bï\u0002j\u0003\bð\u0002j\u0003\bñ\u0002j\u0003\bò\u0002j\u0003\bó\u0002j\u0003\bô\u0002j\u0003\bõ\u0002j\u0003\bö\u0002j\u0003\b÷\u0002j\u0003\bø\u0002j\u0003\bù\u0002j\u0003\bú\u0002j\u0003\bû\u0002j\u0003\bü\u0002j\u0003\bý\u0002j\u0003\bþ\u0002j\u0003\bÿ\u0002j\u0003\b\u0080\u0003j\u0003\b\u0081\u0003j\u0003\b\u0082\u0003j\u0003\b\u0083\u0003j\u0003\b\u0084\u0003j\u0003\b\u0085\u0003j\u0003\b\u0086\u0003j\u0003\b\u0087\u0003j\u0003\b\u0088\u0003j\u0003\b\u0089\u0003j\u0003\b\u008a\u0003j\u0003\b\u008b\u0003j\u0003\b\u008c\u0003j\u0003\b\u008d\u0003j\u0003\b\u008e\u0003j\u0003\b\u008f\u0003j\u0003\b\u0090\u0003j\u0003\b\u0091\u0003j\u0003\b\u0092\u0003j\u0003\b\u0093\u0003j\u0003\b\u0094\u0003j\u0003\b\u0095\u0003j\u0003\b\u0096\u0003j\u0003\b\u0097\u0003j\u0003\b\u0098\u0003j\u0003\b\u0099\u0003j\u0003\b\u009a\u0003j\u0003\b\u009b\u0003j\u0003\b\u009c\u0003j\u0003\b\u009d\u0003j\u0003\b\u009e\u0003j\u0003\b\u009f\u0003j\u0003\b \u0003j\u0003\b¡\u0003j\u0003\b¢\u0003j\u0003\b£\u0003j\u0003\b¤\u0003j\u0003\b¥\u0003j\u0003\b¦\u0003j\u0003\b§\u0003j\u0003\b¨\u0003j\u0003\b©\u0003j\u0003\bª\u0003j\u0003\b«\u0003j\u0003\b¬\u0003j\u0003\b\u00ad\u0003j\u0003\b®\u0003j\u0003\b¯\u0003j\u0003\b°\u0003j\u0003\b±\u0003j\u0003\b²\u0003j\u0003\b³\u0003j\u0003\b´\u0003j\u0003\bµ\u0003j\u0003\b¶\u0003j\u0003\b·\u0003j\u0003\b¸\u0003j\u0003\b¹\u0003j\u0003\bº\u0003j\u0003\b»\u0003j\u0003\b¼\u0003j\u0003\b½\u0003j\u0003\b¾\u0003j\u0003\b¿\u0003j\u0003\bÀ\u0003j\u0003\bÁ\u0003j\u0003\bÂ\u0003j\u0003\bÃ\u0003j\u0003\bÄ\u0003j\u0003\bÅ\u0003j\u0003\bÆ\u0003j\u0003\bÇ\u0003j\u0003\bÈ\u0003j\u0003\bÉ\u0003j\u0003\bÊ\u0003j\u0003\bË\u0003j\u0003\bÌ\u0003j\u0003\bÍ\u0003j\u0003\bÎ\u0003j\u0003\bÏ\u0003j\u0003\bÐ\u0003j\u0003\bÑ\u0003j\u0003\bÒ\u0003j\u0003\bÓ\u0003j\u0003\bÔ\u0003j\u0003\bÕ\u0003j\u0003\bÖ\u0003j\u0003\b×\u0003j\u0003\bØ\u0003j\u0003\bÙ\u0003j\u0003\bÚ\u0003j\u0003\bÛ\u0003j\u0003\bÜ\u0003j\u0003\bÝ\u0003j\u0003\bÞ\u0003j\u0003\bß\u0003j\u0003\bà\u0003j\u0003\bá\u0003j\u0003\bâ\u0003j\u0003\bã\u0003j\u0003\bä\u0003j\u0003\bå\u0003j\u0003\bæ\u0003j\u0003\bç\u0003j\u0003\bè\u0003j\u0003\bé\u0003j\u0003\bê\u0003j\u0003\bë\u0003j\u0003\bì\u0003j\u0003\bí\u0003j\u0003\bî\u0003j\u0003\bï\u0003j\u0003\bð\u0003j\u0003\bñ\u0003j\u0003\bò\u0003j\u0003\bó\u0003j\u0003\bô\u0003j\u0003\bõ\u0003j\u0003\bö\u0003j\u0003\b÷\u0003j\u0003\bø\u0003j\u0003\bù\u0003j\u0003\bú\u0003j\u0003\bû\u0003j\u0003\bü\u0003j\u0003\bý\u0003j\u0003\bþ\u0003j\u0003\bÿ\u0003j\u0003\b\u0080\u0004j\u0003\b\u0081\u0004j\u0003\b\u0082\u0004j\u0003\b\u0083\u0004j\u0003\b\u0084\u0004j\u0003\b\u0085\u0004j\u0003\b\u0086\u0004j\u0003\b\u0087\u0004j\u0003\b\u0088\u0004j\u0003\b\u0089\u0004j\u0003\b\u008a\u0004j\u0003\b\u008b\u0004j\u0003\b\u008c\u0004j\u0003\b\u008d\u0004j\u0003\b\u008e\u0004j\u0003\b\u008f\u0004j\u0003\b\u0090\u0004j\u0003\b\u0091\u0004j\u0003\b\u0092\u0004j\u0003\b\u0093\u0004j\u0003\b\u0094\u0004j\u0003\b\u0095\u0004j\u0003\b\u0096\u0004j\u0003\b\u0097\u0004j\u0003\b\u0098\u0004j\u0003\b\u0099\u0004j\u0003\b\u009a\u0004j\u0003\b\u009b\u0004j\u0003\b\u009c\u0004j\u0003\b\u009d\u0004j\u0003\b\u009e\u0004j\u0003\b\u009f\u0004j\u0003\b \u0004j\u0003\b¡\u0004j\u0003\b¢\u0004j\u0003\b£\u0004j\u0003\b¤\u0004j\u0003\b¥\u0004j\u0003\b¦\u0004j\u0003\b§\u0004j\u0003\b¨\u0004j\u0003\b©\u0004j\u0003\bª\u0004j\u0003\b«\u0004j\u0003\b¬\u0004j\u0003\b\u00ad\u0004j\u0003\b®\u0004j\u0003\b¯\u0004j\u0003\b°\u0004j\u0003\b±\u0004j\u0003\b²\u0004j\u0003\b³\u0004j\u0003\b´\u0004j\u0003\bµ\u0004j\u0003\b¶\u0004j\u0003\b·\u0004j\u0003\b¸\u0004j\u0003\b¹\u0004j\u0003\bº\u0004j\u0003\b»\u0004j\u0003\b¼\u0004j\u0003\b½\u0004j\u0003\b¾\u0004j\u0003\b¿\u0004j\u0003\bÀ\u0004j\u0003\bÁ\u0004j\u0003\bÂ\u0004j\u0003\bÃ\u0004j\u0003\bÄ\u0004j\u0003\bÅ\u0004j\u0003\bÆ\u0004j\u0003\bÇ\u0004j\u0003\bÈ\u0004j\u0003\bÉ\u0004j\u0003\bÊ\u0004j\u0003\bË\u0004j\u0003\bÌ\u0004j\u0003\bÍ\u0004j\u0003\bÎ\u0004j\u0003\bÏ\u0004j\u0003\bÐ\u0004j\u0003\bÑ\u0004j\u0003\bÒ\u0004j\u0003\bÓ\u0004j\u0003\bÔ\u0004j\u0003\bÕ\u0004j\u0003\bÖ\u0004j\u0003\b×\u0004j\u0003\bØ\u0004j\u0003\bÙ\u0004j\u0003\bÚ\u0004j\u0003\bÛ\u0004j\u0003\bÜ\u0004j\u0003\bÝ\u0004j\u0003\bÞ\u0004j\u0003\bß\u0004j\u0003\bà\u0004j\u0003\bá\u0004j\u0003\bâ\u0004j\u0003\bã\u0004j\u0003\bä\u0004j\u0003\bå\u0004j\u0003\bæ\u0004j\u0003\bç\u0004j\u0003\bè\u0004j\u0003\bé\u0004j\u0003\bê\u0004j\u0003\bë\u0004j\u0003\bì\u0004j\u0003\bí\u0004j\u0003\bî\u0004j\u0003\bï\u0004j\u0003\bð\u0004j\u0003\bñ\u0004j\u0003\bò\u0004j\u0003\bó\u0004j\u0003\bô\u0004j\u0003\bõ\u0004j\u0003\bö\u0004j\u0003\b÷\u0004j\u0003\bø\u0004j\u0003\bù\u0004j\u0003\bú\u0004j\u0003\bû\u0004j\u0003\bü\u0004j\u0003\bý\u0004j\u0003\bþ\u0004j\u0003\bÿ\u0004j\u0003\b\u0080\u0005j\u0003\b\u0081\u0005j\u0003\b\u0082\u0005j\u0003\b\u0083\u0005j\u0003\b\u0084\u0005j\u0003\b\u0085\u0005j\u0003\b\u0086\u0005j\u0003\b\u0087\u0005j\u0003\b\u0088\u0005j\u0003\b\u0089\u0005j\u0003\b\u008a\u0005j\u0003\b\u008b\u0005j\u0003\b\u008c\u0005j\u0003\b\u008d\u0005j\u0003\b\u008e\u0005j\u0003\b\u008f\u0005j\u0003\b\u0090\u0005j\u0003\b\u0091\u0005j\u0003\b\u0092\u0005j\u0003\b\u0093\u0005j\u0003\b\u0094\u0005j\u0003\b\u0095\u0005j\u0003\b\u0096\u0005j\u0003\b\u0097\u0005j\u0003\b\u0098\u0005j\u0003\b\u0099\u0005j\u0003\b\u009a\u0005j\u0003\b\u009b\u0005j\u0003\b\u009c\u0005j\u0003\b\u009d\u0005j\u0003\b\u009e\u0005j\u0003\b\u009f\u0005j\u0003\b \u0005j\u0003\b¡\u0005j\u0003\b¢\u0005j\u0003\b£\u0005j\u0003\b¤\u0005j\u0003\b¥\u0005j\u0003\b¦\u0005j\u0003\b§\u0005j\u0003\b¨\u0005j\u0003\b©\u0005j\u0003\bª\u0005j\u0003\b«\u0005j\u0003\b¬\u0005j\u0003\b\u00ad\u0005j\u0003\b®\u0005j\u0003\b¯\u0005j\u0003\b°\u0005j\u0003\b±\u0005j\u0003\b²\u0005j\u0003\b³\u0005j\u0003\b´\u0005j\u0003\bµ\u0005j\u0003\b¶\u0005j\u0003\b·\u0005j\u0003\b¸\u0005j\u0003\b¹\u0005j\u0003\bº\u0005j\u0003\b»\u0005j\u0003\b¼\u0005j\u0003\b½\u0005j\u0003\b¾\u0005j\u0003\b¿\u0005j\u0003\bÀ\u0005j\u0003\bÁ\u0005j\u0003\bÂ\u0005j\u0003\bÃ\u0005j\u0003\bÄ\u0005j\u0003\bÅ\u0005j\u0003\bÆ\u0005j\u0003\bÇ\u0005j\u0003\bÈ\u0005j\u0003\bÉ\u0005j\u0003\bÊ\u0005j\u0003\bË\u0005j\u0003\bÌ\u0005j\u0003\bÍ\u0005j\u0003\bÎ\u0005j\u0003\bÏ\u0005j\u0003\bÐ\u0005j\u0003\bÑ\u0005j\u0003\bÒ\u0005j\u0003\bÓ\u0005j\u0003\bÔ\u0005j\u0003\bÕ\u0005j\u0003\bÖ\u0005j\u0003\b×\u0005j\u0003\bØ\u0005j\u0003\bÙ\u0005j\u0003\bÚ\u0005j\u0003\bÛ\u0005j\u0003\bÜ\u0005j\u0003\bÝ\u0005j\u0003\bÞ\u0005j\u0003\bß\u0005j\u0003\bà\u0005j\u0003\bá\u0005j\u0003\bâ\u0005j\u0003\bã\u0005j\u0003\bä\u0005j\u0003\bå\u0005j\u0003\bæ\u0005j\u0003\bç\u0005j\u0003\bè\u0005j\u0003\bé\u0005j\u0003\bê\u0005j\u0003\bë\u0005j\u0003\bì\u0005j\u0003\bí\u0005j\u0003\bî\u0005j\u0003\bï\u0005j\u0003\bð\u0005j\u0003\bñ\u0005j\u0003\bò\u0005j\u0003\bó\u0005j\u0003\bô\u0005j\u0003\bõ\u0005j\u0003\bö\u0005j\u0003\b÷\u0005j\u0003\bø\u0005j\u0003\bù\u0005j\u0003\bú\u0005j\u0003\bû\u0005j\u0003\bü\u0005j\u0003\bý\u0005j\u0003\bþ\u0005j\u0003\bÿ\u0005j\u0003\b\u0080\u0006j\u0003\b\u0081\u0006j\u0003\b\u0082\u0006j\u0003\b\u0083\u0006j\u0003\b\u0084\u0006j\u0003\b\u0085\u0006j\u0003\b\u0086\u0006j\u0003\b\u0087\u0006j\u0003\b\u0088\u0006j\u0003\b\u0089\u0006j\u0003\b\u008a\u0006j\u0003\b\u008b\u0006j\u0003\b\u008c\u0006j\u0003\b\u008d\u0006j\u0003\b\u008e\u0006j\u0003\b\u008f\u0006j\u0003\b\u0090\u0006j\u0003\b\u0091\u0006j\u0003\b\u0092\u0006j\u0003\b\u0093\u0006j\u0003\b\u0094\u0006j\u0003\b\u0095\u0006j\u0003\b\u0096\u0006j\u0003\b\u0097\u0006j\u0003\b\u0098\u0006j\u0003\b\u0099\u0006j\u0003\b\u009a\u0006j\u0003\b\u009b\u0006j\u0003\b\u009c\u0006j\u0003\b\u009d\u0006j\u0003\b\u009e\u0006j\u0003\b\u009f\u0006j\u0003\b \u0006j\u0003\b¡\u0006j\u0003\b¢\u0006j\u0003\b£\u0006j\u0003\b¤\u0006j\u0003\b¥\u0006j\u0003\b¦\u0006j\u0003\b§\u0006j\u0003\b¨\u0006j\u0003\b©\u0006j\u0003\bª\u0006j\u0003\b«\u0006j\u0003\b¬\u0006j\u0003\b\u00ad\u0006j\u0003\b®\u0006j\u0003\b¯\u0006j\u0003\b°\u0006j\u0003\b±\u0006j\u0003\b²\u0006j\u0003\b³\u0006j\u0003\b´\u0006j\u0003\bµ\u0006j\u0003\b¶\u0006j\u0003\b·\u0006j\u0003\b¸\u0006j\u0003\b¹\u0006j\u0003\bº\u0006j\u0003\b»\u0006j\u0003\b¼\u0006j\u0003\b½\u0006j\u0003\b¾\u0006j\u0003\b¿\u0006j\u0003\bÀ\u0006j\u0003\bÁ\u0006j\u0003\bÂ\u0006j\u0003\bÃ\u0006j\u0003\bÄ\u0006j\u0003\bÅ\u0006j\u0003\bÆ\u0006j\u0003\bÇ\u0006j\u0003\bÈ\u0006j\u0003\bÉ\u0006j\u0003\bÊ\u0006j\u0003\bË\u0006j\u0003\bÌ\u0006j\u0003\bÍ\u0006j\u0003\bÎ\u0006j\u0003\bÏ\u0006j\u0003\bÐ\u0006j\u0003\bÑ\u0006j\u0003\bÒ\u0006j\u0003\bÓ\u0006j\u0003\bÔ\u0006j\u0003\bÕ\u0006j\u0003\bÖ\u0006j\u0003\b×\u0006j\u0003\bØ\u0006j\u0003\bÙ\u0006j\u0003\bÚ\u0006j\u0003\bÛ\u0006j\u0003\bÜ\u0006j\u0003\bÝ\u0006j\u0003\bÞ\u0006j\u0003\bß\u0006j\u0003\bà\u0006j\u0003\bá\u0006j\u0003\bâ\u0006j\u0003\bã\u0006j\u0003\bä\u0006j\u0003\bå\u0006j\u0003\bæ\u0006j\u0003\bç\u0006j\u0003\bè\u0006j\u0003\bé\u0006j\u0003\bê\u0006j\u0003\bë\u0006j\u0003\bì\u0006j\u0003\bí\u0006j\u0003\bî\u0006j\u0003\bï\u0006j\u0003\bð\u0006j\u0003\bñ\u0006j\u0003\bò\u0006j\u0003\bó\u0006j\u0003\bô\u0006j\u0003\bõ\u0006j\u0003\bö\u0006j\u0003\b÷\u0006j\u0003\bø\u0006j\u0003\bù\u0006j\u0003\bú\u0006j\u0003\bû\u0006j\u0003\bü\u0006j\u0003\bý\u0006j\u0003\bþ\u0006j\u0003\bÿ\u0006j\u0003\b\u0080\u0007j\u0003\b\u0081\u0007j\u0003\b\u0082\u0007j\u0003\b\u0083\u0007j\u0003\b\u0084\u0007j\u0003\b\u0085\u0007j\u0003\b\u0086\u0007j\u0003\b\u0087\u0007j\u0003\b\u0088\u0007j\u0003\b\u0089\u0007j\u0003\b\u008a\u0007j\u0003\b\u008b\u0007j\u0003\b\u008c\u0007j\u0003\b\u008d\u0007j\u0003\b\u008e\u0007j\u0003\b\u008f\u0007j\u0003\b\u0090\u0007j\u0003\b\u0091\u0007j\u0003\b\u0092\u0007j\u0003\b\u0093\u0007j\u0003\b\u0094\u0007j\u0003\b\u0095\u0007j\u0003\b\u0096\u0007j\u0003\b\u0097\u0007j\u0003\b\u0098\u0007j\u0003\b\u0099\u0007j\u0003\b\u009a\u0007j\u0003\b\u009b\u0007j\u0003\b\u009c\u0007j\u0003\b\u009d\u0007j\u0003\b\u009e\u0007j\u0003\b\u009f\u0007j\u0003\b \u0007j\u0003\b¡\u0007j\u0003\b¢\u0007j\u0003\b£\u0007j\u0003\b¤\u0007j\u0003\b¥\u0007j\u0003\b¦\u0007j\u0003\b§\u0007j\u0003\b¨\u0007j\u0003\b©\u0007j\u0003\bª\u0007j\u0003\b«\u0007j\u0003\b¬\u0007j\u0003\b\u00ad\u0007j\u0003\b®\u0007j\u0003\b¯\u0007j\u0003\b°\u0007j\u0003\b±\u0007j\u0003\b²\u0007j\u0003\b³\u0007j\u0003\b´\u0007j\u0003\bµ\u0007j\u0003\b¶\u0007j\u0003\b·\u0007j\u0003\b¸\u0007j\u0003\b¹\u0007j\u0003\bº\u0007j\u0003\b»\u0007j\u0003\b¼\u0007j\u0003\b½\u0007j\u0003\b¾\u0007j\u0003\b¿\u0007j\u0003\bÀ\u0007j\u0003\bÁ\u0007j\u0003\bÂ\u0007j\u0003\bÃ\u0007j\u0003\bÄ\u0007j\u0003\bÅ\u0007j\u0003\bÆ\u0007j\u0003\bÇ\u0007j\u0003\bÈ\u0007j\u0003\bÉ\u0007j\u0003\bÊ\u0007j\u0003\bË\u0007j\u0003\bÌ\u0007j\u0003\bÍ\u0007j\u0003\bÎ\u0007j\u0003\bÏ\u0007j\u0003\bÐ\u0007j\u0003\bÑ\u0007j\u0003\bÒ\u0007j\u0003\bÓ\u0007j\u0003\bÔ\u0007j\u0003\bÕ\u0007j\u0003\bÖ\u0007j\u0003\b×\u0007j\u0003\bØ\u0007j\u0003\bÙ\u0007j\u0003\bÚ\u0007j\u0003\bÛ\u0007j\u0003\bÜ\u0007j\u0003\bÝ\u0007j\u0003\bÞ\u0007j\u0003\bß\u0007j\u0003\bà\u0007j\u0003\bá\u0007j\u0003\bâ\u0007j\u0003\bã\u0007j\u0003\bä\u0007j\u0003\bå\u0007j\u0003\bæ\u0007j\u0003\bç\u0007j\u0003\bè\u0007j\u0003\bé\u0007j\u0003\bê\u0007j\u0003\bë\u0007j\u0003\bì\u0007j\u0003\bí\u0007j\u0003\bî\u0007j\u0003\bï\u0007j\u0003\bð\u0007j\u0003\bñ\u0007j\u0003\bò\u0007j\u0003\bó\u0007j\u0003\bô\u0007j\u0003\bõ\u0007j\u0003\bö\u0007j\u0003\b÷\u0007j\u0003\bø\u0007j\u0003\bù\u0007j\u0003\bú\u0007j\u0003\bû\u0007j\u0003\bü\u0007j\u0003\bý\u0007j\u0003\bþ\u0007j\u0003\bÿ\u0007j\u0003\b\u0080\bj\u0003\b\u0081\bj\u0003\b\u0082\bj\u0003\b\u0083\bj\u0003\b\u0084\bj\u0003\b\u0085\bj\u0003\b\u0086\bj\u0003\b\u0087\bj\u0003\b\u0088\bj\u0003\b\u0089\bj\u0003\b\u008a\bj\u0003\b\u008b\bj\u0003\b\u008c\bj\u0003\b\u008d\bj\u0003\b\u008e\bj\u0003\b\u008f\bj\u0003\b\u0090\bj\u0003\b\u0091\bj\u0003\b\u0092\bj\u0003\b\u0093\bj\u0003\b\u0094\bj\u0003\b\u0095\bj\u0003\b\u0096\bj\u0003\b\u0097\bj\u0003\b\u0098\bj\u0003\b\u0099\bj\u0003\b\u009a\bj\u0003\b\u009b\bj\u0003\b\u009c\bj\u0003\b\u009d\bj\u0003\b\u009e\bj\u0003\b\u009f\bj\u0003\b \bj\u0003\b¡\bj\u0003\b¢\bj\u0003\b£\bj\u0003\b¤\bj\u0003\b¥\bj\u0003\b¦\bj\u0003\b§\bj\u0003\b¨\bj\u0003\b©\bj\u0003\bª\bj\u0003\b«\bj\u0003\b¬\bj\u0003\b\u00ad\bj\u0003\b®\bj\u0003\b¯\bj\u0003\b°\bj\u0003\b±\bj\u0003\b²\bj\u0003\b³\bj\u0003\b´\bj\u0003\bµ\bj\u0003\b¶\bj\u0003\b·\bj\u0003\b¸\bj\u0003\b¹\bj\u0003\bº\bj\u0003\b»\bj\u0003\b¼\bj\u0003\b½\bj\u0003\b¾\bj\u0003\b¿\bj\u0003\bÀ\bj\u0003\bÁ\bj\u0003\bÂ\bj\u0003\bÃ\bj\u0003\bÄ\bj\u0003\bÅ\bj\u0003\bÆ\bj\u0003\bÇ\bj\u0003\bÈ\bj\u0003\bÉ\bj\u0003\bÊ\bj\u0003\bË\bj\u0003\bÌ\bj\u0003\bÍ\bj\u0003\bÎ\bj\u0003\bÏ\bj\u0003\bÐ\bj\u0003\bÑ\bj\u0003\bÒ\bj\u0003\bÓ\bj\u0003\bÔ\bj\u0003\bÕ\bj\u0003\bÖ\bj\u0003\b×\bj\u0003\bØ\bj\u0003\bÙ\bj\u0003\bÚ\bj\u0003\bÛ\bj\u0003\bÜ\bj\u0003\bÝ\bj\u0003\bÞ\bj\u0003\bß\bj\u0003\bà\bj\u0003\bá\bj\u0003\bâ\bj\u0003\bã\bj\u0003\bä\bj\u0003\bå\bj\u0003\bæ\bj\u0003\bç\bj\u0003\bè\bj\u0003\bé\bj\u0003\bê\bj\u0003\bë\bj\u0003\bì\bj\u0003\bí\bj\u0003\bî\bj\u0003\bï\bj\u0003\bð\bj\u0003\bñ\bj\u0003\bò\bj\u0003\bó\bj\u0003\bô\bj\u0003\bõ\bj\u0003\bö\bj\u0003\b÷\bj\u0003\bø\bj\u0003\bù\bj\u0003\bú\bj\u0003\bû\bj\u0003\bü\bj\u0003\bý\bj\u0003\bþ\bj\u0003\bÿ\bj\u0003\b\u0080\tj\u0003\b\u0081\tj\u0003\b\u0082\tj\u0003\b\u0083\tj\u0003\b\u0084\tj\u0003\b\u0085\tj\u0003\b\u0086\tj\u0003\b\u0087\tj\u0003\b\u0088\tj\u0003\b\u0089\tj\u0003\b\u008a\tj\u0003\b\u008b\tj\u0003\b\u008c\tj\u0003\b\u008d\tj\u0003\b\u008e\tj\u0003\b\u008f\tj\u0003\b\u0090\tj\u0003\b\u0091\tj\u0003\b\u0092\tj\u0003\b\u0093\tj\u0003\b\u0094\tj\u0003\b\u0095\tj\u0003\b\u0096\tj\u0003\b\u0097\tj\u0003\b\u0098\tj\u0003\b\u0099\tj\u0003\b\u009a\tj\u0003\b\u009b\tj\u0003\b\u009c\tj\u0003\b\u009d\tj\u0003\b\u009e\tj\u0003\b\u009f\tj\u0003\b \tj\u0003\b¡\tj\u0003\b¢\tj\u0003\b£\tj\u0003\b¤\tj\u0003\b¥\tj\u0003\b¦\tj\u0003\b§\tj\u0003\b¨\tj\u0003\b©\tj\u0003\bª\tj\u0003\b«\tj\u0003\b¬\tj\u0003\b\u00ad\tj\u0003\b®\tj\u0003\b¯\tj\u0003\b°\tj\u0003\b±\tj\u0003\b²\tj\u0003\b³\tj\u0003\b´\tj\u0003\bµ\tj\u0003\b¶\tj\u0003\b·\tj\u0003\b¸\tj\u0003\b¹\tj\u0003\bº\tj\u0003\b»\tj\u0003\b¼\tj\u0003\b½\tj\u0003\b¾\tj\u0003\b¿\tj\u0003\bÀ\tj\u0003\bÁ\tj\u0003\bÂ\tj\u0003\bÃ\tj\u0003\bÄ\tj\u0003\bÅ\tj\u0003\bÆ\tj\u0003\bÇ\tj\u0003\bÈ\tj\u0003\bÉ\tj\u0003\bÊ\tj\u0003\bË\tj\u0003\bÌ\tj\u0003\bÍ\tj\u0003\bÎ\tj\u0003\bÏ\tj\u0003\bÐ\tj\u0003\bÑ\tj\u0003\bÒ\tj\u0003\bÓ\tj\u0003\bÔ\tj\u0003\bÕ\tj\u0003\bÖ\tj\u0003\b×\tj\u0003\bØ\tj\u0003\bÙ\tj\u0003\bÚ\tj\u0003\bÛ\tj\u0003\bÜ\tj\u0003\bÝ\tj\u0003\bÞ\tj\u0003\bß\tj\u0003\bà\tj\u0003\bá\tj\u0003\bâ\tj\u0003\bã\tj\u0003\bä\tj\u0003\bå\tj\u0003\bæ\tj\u0003\bç\tj\u0003\bè\tj\u0003\bé\tj\u0003\bê\tj\u0003\bë\tj\u0003\bì\tj\u0003\bí\tj\u0003\bî\tj\u0003\bï\tj\u0003\bð\tj\u0003\bñ\tj\u0003\bò\tj\u0003\bó\tj\u0003\bô\tj\u0003\bõ\tj\u0003\bö\tj\u0003\b÷\tj\u0003\bø\tj\u0003\bù\tj\u0003\bú\tj\u0003\bû\tj\u0003\bü\tj\u0003\bý\tj\u0003\bþ\tj\u0003\bÿ\tj\u0003\b\u0080\nj\u0003\b\u0081\nj\u0003\b\u0082\nj\u0003\b\u0083\nj\u0003\b\u0084\nj\u0003\b\u0085\nj\u0003\b\u0086\nj\u0003\b\u0087\nj\u0003\b\u0088\nj\u0003\b\u0089\nj\u0003\b\u008a\nj\u0003\b\u008b\nj\u0003\b\u008c\nj\u0003\b\u008d\nj\u0003\b\u008e\nj\u0003\b\u008f\nj\u0003\b\u0090\nj\u0003\b\u0091\nj\u0003\b\u0092\nj\u0003\b\u0093\nj\u0003\b\u0094\nj\u0003\b\u0095\nj\u0003\b\u0096\nj\u0003\b\u0097\nj\u0003\b\u0098\nj\u0003\b\u0099\nj\u0003\b\u009a\nj\u0003\b\u009b\nj\u0003\b\u009c\nj\u0003\b\u009d\nj\u0003\b\u009e\nj\u0003\b\u009f\nj\u0003\b \nj\u0003\b¡\nj\u0003\b¢\nj\u0003\b£\nj\u0003\b¤\nj\u0003\b¥\nj\u0003\b¦\nj\u0003\b§\nj\u0003\b¨\nj\u0003\b©\nj\u0003\bª\nj\u0003\b«\nj\u0003\b¬\nj\u0003\b\u00ad\nj\u0003\b®\nj\u0003\b¯\nj\u0003\b°\nj\u0003\b±\nj\u0003\b²\nj\u0003\b³\nj\u0003\b´\nj\u0003\bµ\nj\u0003\b¶\nj\u0003\b·\nj\u0003\b¸\nj\u0003\b¹\nj\u0003\bº\nj\u0003\b»\nj\u0003\b¼\nj\u0003\b½\nj\u0003\b¾\nj\u0003\b¿\nj\u0003\bÀ\nj\u0003\bÁ\nj\u0003\bÂ\nj\u0003\bÃ\nj\u0003\bÄ\nj\u0003\bÅ\nj\u0003\bÆ\nj\u0003\bÇ\nj\u0003\bÈ\nj\u0003\bÉ\nj\u0003\bÊ\nj\u0003\bË\nj\u0003\bÌ\nj\u0003\bÍ\nj\u0003\bÎ\nj\u0003\bÏ\nj\u0003\bÐ\nj\u0003\bÑ\nj\u0003\bÒ\nj\u0003\bÓ\nj\u0003\bÔ\nj\u0003\bÕ\nj\u0003\bÖ\nj\u0003\b×\nj\u0003\bØ\nj\u0003\bÙ\nj\u0003\bÚ\nj\u0003\bÛ\nj\u0003\bÜ\nj\u0003\bÝ\nj\u0003\bÞ\nj\u0003\bß\nj\u0003\bà\nj\u0003\bá\nj\u0003\bâ\n¨\u0006ä\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "NAME_UNSPECIFIED", "CALENDAR_DATE_PICKER", "PHOTO_LIBRARY", "FILE_BROWSER", "MEDIA_UPLOAD_SELECTOR", "MEDIA_VIEWER", "DOWNLOAD_APPS", "ERROR_SCREEN", "DISCLOSURE", "EMBEDDED_WEBVIEW", "NEW_PRODUCTS_LANDING", "TAX_CENTER", "CUSTOM_ACCOUNT_ACTIVITY_EXPORTER_LIST", "GENERATE_CUSTOM_ACCOUNT_ACTIVITY_REPORT", "PRODUCT_UPSELL", "EMAIL_PREFERENCES_PAGE", "EMAIL_UNSUBSCRIBE_PAGE", "PIN_SETUP_SCREEN", "SCREEN_PROTECT", "OAUTH_WATING_SCREEN", "APP_PRIVACY_SETTINGS", "DEVICE_APPROVAL_WAITING", "DEVICE_APPROVAL_WAITING_BLOCKED", "IAC_BOTTOM_SHEET", "AGREEMENT", "INVESTMENTS_TRACKER_FTUX_TRACK_ALL_ASSETS", "INVESTMENTS_TRACKER_FTUX_ASSET_ALLOCATION", "INVESTMENTS_TRACKER_FTUX_ADDITIONAL_INFO", "INVESTMENTS_TRACKER_PERFORMANCE_VIEW", "INVESTMENTS_TRACKER_ACCOUNT_LINK_AGREEMENT", "INVESTMENTS_TRACKER_ACCOUNT_DETAILS", "INVESTMENTS_TRACKER_ALLOCATIONS_VIEW", "INVESTMENTS_TRACKER_TOOLTIP_SHEET_ADD_ACCOUNT", "INVESTMENTS_TRACKER_SETTINGS", "INVESTMENTS_TRACKER_ACCOUNT_REMOVAL_SHEET", "INVESTMENTS_TRACKER_REMOVAL_CONFIRMATION_SHEET", "BROWSE_NEWSFEED", "BROWSE_SEARCH", "BROWSE_NEWSFEED_THEATRE", "STOCK_NEWSFEED", "CRYPTO_NEWSFEED", "EMBEDDED_ARTICLE_PAGE", "NEWSFEED_DISCLOSURE", "CX_REVIEW_CALL_DETAILS", "CX_CALL_STATUS", "CX_CHANNEL_SELECTION", "CX_WEB_BACK_ERROR", "CX_CALL_SCHEDULE", "CX_EDIT_CALL_SCHEDULE", "CX_SURVEY_YES_NO_QUESTION", "CX_SURVEY_FREE_FORM_QUESTION", "CX_SURVEY_MULTIPLE_CHOICE_QUESTION", "CX_SURVEY_RATING_QUESTION", "CX_SURVEY_ERROR_TOAST", "CX_SURVEY_COMPLETE_PAGE", "CX_SURVEY_COMPLETE_TOAST", "CX_CALL_DESCRIPTION", "CX_ACCOUNT_DETAIL_PAGE", "CX_CONTACT_SECRET_CODE_PAGE", "CX_CONTACT_VOICE_VERIFICATION_CONSENT_PAGE", "CX_CONTACT_VOICE_VERIFICATION_PAGE", "CX_CONTACT_SELFIE_VERIFICATION_INITIATE_PAGE", "CX_CONTACT_SELFIE_VERIFICATION_WAIT_PAGE", "CX_CONTACT_VOICE_ENROLLMENT_CONSENT_PAGE", "CX_CONTACT_VOICE_ENROLLMENT_PAGE", "CX_CONTACT_EMAIL_PAGE", "CX_CONTACT_SELFIE_VERIFICATION_FAILURE_PAGE", "CX_CHAT_THREAD", "CX_SUPPORT_CASES", "CX_CHATBOT_PAGE", "CX_MULTIPLE_ACCOUNT_SUPPORT_PAGE", "CX_SUPPORT_CHAT_THREAD", "CX_SUPPORT_HUB", "CX_CHAT_ERROR_SCREEN", "CX_APPOINTMENT_TIME_SELECTION", "CX_APPOINTMENT_NOTES_ENTRY", "CX_APPOINTMENT_REVIEW_DETAILS", "CX_APPOINTMENT_CONFIRMATION", "CX_APPOINTMENT_DETAILS", "CX_CONCIERGE_ONBOARDING", "CX_APPOINTMENT_ALREADY_BOOKED", "CX_APPOINTMENT_CANCEL_CONFIRMATION", "CX_CONCIERGE_INFO", "CX_CONCIERGE_FAQ", "CX_CONCIERGE_PLUS_LANDING", "CX_CONCIERGE_PLUS_ONBOARDING", "CX_CONCIERGE_PLUS_HUB", "CX_CONCIERGE_PLUS_TAX_ONBOARDING", "CX_CONCIERGE_PLUS_ESTATE_ONBOARDING", "CX_CONCIERGE_PLUS_TAX", "CX_CONCIERGE_PLUS_ESTATE", "TRANSFERS", "CASH", "TRANSACTION_DETAIL_PAGE", "TRANSACTION_RECATEGORIZATION_PAGE", "DISPUTES_SPLASH_PAGE", "DISPUTES_REASON_SELECTION", "DISPUTES_TRANSACTION_SELECTION", "DISPUTES_TRANSACTION_REVIEW", "DISPUTES_MULTIPLE_CHOICE_QUESTION", "DISPUTES_AMOUNT_ENTRY_QUESTION", "DISPUTES_DATE_ENTRY_QUESTION", "DISPUTES_FREE_RESPONSE_QUESTION", "DISPUTES_MEDIA_UPLOAD_QUESTION", "DISPUTES_FREE_RESPONSE_WITH_MEDIA_UPLOAD", "DISPUTES_REVIEW", "DISPUTES_CONFIRMATION", "ROUNDUP_ENROLL_INTRO", "ROUNDUP_ASSET_SELECTION", "ROUNDUP_ENROLL_REVIEW", "ROUNDUP_ENROLL_COMPLETE", "ROUNDUP_HUB", "ROUNDUP_SETTINGS", "ROUNDUP_FIRST_SETTLEMENT", "ROUNDUP_END_OF_WEEK", "ROUNDUP_HISTORY_DETAIL", "BANK_TRANSFER", "MERCHANT_REWARDS_INTRO", "MERCHANT_REWARD_OFFER_PAGE", "MERCHANT_REWARD_REWARD_HISTORY", "MERCHANT_REWARD_REWARD_HISTORY_DETAILS", "PLUTO_ACTIVITY_UNSPECIFIED", "DD_INTRO", "DD_SETUP_CHOICE", "DD_ACCOUNT_INFO", "DD_PREFILLED_INTRO", "DD_CONFIRM_EMPLOYER", "DD_UPDATE_EMPLOYER", "DD_UNSIGNED_FORM", "DD_SIGNATURE", "DD_SIGNED_FORM", "DD_CONGRATULATIONS", "DD_SWITCHER_SEARCH_COMPANY", "DD_SWITCHER_SEARCH_PAYROLL", "DD_SWITCHER_AUTHENTICATION", "DD_SWITCHER_CONFIRMATION", "DD_SWITCHER_AUTHENTICATION_HELP", "DD_SWITCHER_OPTIONS", "DD_SWITCHER_OPTION_PERCENT", "DD_SWITCHER_OPTION_FIXED", "DD_PARTIAL_PAYCHECK", "DD_EDIT_DOLLAR_AMOUNT", "DD_EDIT_PERCENTAGE_AMOUNT", "DIRECT_DEPOSIT_UPSELL", "DIRECT_DEPOSIT_DISCLOSURES", "DIRECT_DEPOSIT_SETUP_INFO", "DIRECT_DEPOSIT_HISTORY", "DIRECT_DEPOSIT_POST_TRANSFER_UPSELL", "EARLY_PAY_LEARN_MORE", "EARLY_PAY_ENROLLMENT_SUCCESS", "EARLY_PAY_ONBOARDING_CONFIRMATION", "HOME", EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, "CRYPTO_DETAIL_PAGE", "TRADE_CELEBRATION", "PSP_DETAIL", "PSP_CELEBRATION", "PSP_HISTORY_DETAIL", "INVEST_FLOW_MOO", "INVEST_FLOW_SEARCH", "INVEST_FLOW_ORDER_ENTRY", "INVEST_FLOW_BUDGET_ALLOCATION", "INVEST_FLOW_ORDER_PREVIEW", "INVEST_FLOW_ORDER_REVIEW", "INVEST_FLOW_ORDER_RECEIPT", "INVEST_FLOW_DISCOVER", "INVEST_FLOW_FREQUENCY", "ADVANCED_CHARTS_ONBOARDING", "ADVANCED_CHARTS_EQUITY_SEARCH", "PSP_INTRO", "INVESTOR_PROFILE_COMPLETE", "INVESTOR_PROFILE_INTRO", "INVESTOR_PROFILE_QUESTION", "INVESTOR_PROFILE_REVIEW", "EQUITY_TRADING_SESSION_CHANGED_PAGE", "ASSET_HOME", "DISTRIBUTE_INVEST_FLOW", "SUGGESTION_SEARCH", "FX_SWITCHER_FTUX", "LADDER_MARKETING", "LADDER_MARKETING_SEARCH", "ROBINHOOD_LIST_DETAIL_PAGE", "LIST_DISCOVERY_HUB", "USER_LIST_DETAIL_PAGE", "EXPANDED_LIST_CAROUSEL", "ROBINHOOD_LIST_PICKER", "USER_LIST_DETAIL_SEARCH", "INVESTING_MONITOR", "WATCHLIST_REDESIGN", "OPTION_CHAIN_EXPIRATION_PAGE", "OPTION_STATISTICS_BOTTOM_SHEET", "OPTION_SHOPPING_CART", "OPTION_CHAIN", "OPTION_STRATEGY_DETAIL", "OPTION_AGGREGATE_DETAIL", "OPTION_INSTRUMENT_DETAIL", "OPTION_WATCHLIST_HUB", "OPTION_ORDER_FORM", "OPTION_ORDER_CONFIGURATION_SELECTION", "OPTION_ORDER_CONFIGURATION_BOTTOM_SHEET", "OPTION_WATCHLIST_ABOUT", "OPTION_ROLLING_CONTRACT_SELECTOR", "OPTIONS_STRATEGY_ROLL", "OPTIONS_ROLLING_NUX", "OPTION_UPGRADE_L0_WHAT_ARE_OPTIONS", "OPTION_UPGRADE_L0_STRATEGIES_PRICE_MOVEMENT", "OPTION_UPGRADE_L0_UNDERSTAND_OPTIONS", "OPTION_LEGO_CHAIN_PREMIUM", "OPTION_LEGO_CHAIN_TRADE_OPTION", "OPTION_CHAIN_SETTINGS", "OPTION_STRATEGY_BUILDER", "OPTION_STRATEGY_BUILDER_NUX", "OPTION_STRATEGY_CHAIN", "OPTION_STRATEGY_BUILDER_DEEP_LINK_INTRO", "OPTION_STRATEGY_BUILDER_DEEP_LINK_SEARCH", "OPTION_STRATEGY_BUILDER_AVAILABLE_NUX", "OPTION_STRATEGY_BUILDER_NOT_AVAILABLE_NUX", "OPTION_STRATEGY_BUILDER_NOT_ELIGIBLE_NUX", "OPTION_ORDER_DETAIL", "OPTION_CHAIN_CUSTOMIZATION_SETTINGS", "OPTION_ORDER_CONFIRMATION", "OPTION_SIMULATED_RETURNS", "OPTION_EDIT_LEG_RATIO", "OPTIONS_STOP_MARKET_NUX", "OPTION_EVENT_DETAIL", "OPTION_ONBOARDING_START", "OPTION_ONBOARDING_SPLASH_L0", "OPTION_ONBOARDING_SPLASH_L2", "OPTION_ONBOARDING_SPLASH_RETIREMENT", "OPTION_ONBOARDING_QUESTION_OPTION_EXPERIENCE", "OPTION_ONBOARDING_QUESTION_UNDERSTAND_SPREAD", "OPTION_ONBOARDING_QUESTION_INVESTMENT_ADVICE", "OPTION_ONBOARDING_QUESTION_FINANCIAL_REGULATOR", "OPTION_ONBOARDING_SUITABILITY", "OPTION_ONBOARDING_INVESTMENT_PROFILE", "OPTION_ONBOARDING_DISCLOSURE", "OPTION_ONBOARDING_APPROVED_TRADES", "OPTION_ONBOARDING_SUCCESS", "OPTION_ONBOARDING_FAILURE", "OPTION_ONBOARDING_EDUCATION_SPREAD", "OPTION_ONBOARDING_EDUCATION_L3_STRATEGIES", "OPTION_ONBOARDING_READY_L3_UPGRADE", "OPTION_ONBOARDING_UPSELL_ALERT", "OPTION_ONBOARDING_UPSELL_TRADE_ON_EXPIRATION", "OPTION_ONBOARDING_UPSELL_ALL_SET", "INDEX_DETAIL", "UK_OPTION_ONBOARDING_SPLASH_L0", "UK_OPTION_ONBOARDING_EDUCATION_BENEFITS", "UK_OPTION_ONBOARDING_EDUCATION_RISKS", "UK_OPTION_ONBOARDING_EXPERIENCE_QUESTIONNAIRE", "UK_OPTION_ONBOARDING_KNOWLEDGE_QUESTIONNAIRE", "UK_OPTION_ONBOARDING_INVESTOR_PROFILE", "UK_OPTION_ONBOARDING_REVIEW_INVESTOR_PROFILE", "UK_OPTION_ONBOARDING_PROFESSIONAL_TRADER", "UK_OPTION_ONBOARDING_SPLASH_L2", "UK_OPTION_ONBOARDING_EDUCATION_BENEFITS_L2", "OPTION_ONBOARDING_JOINT_PENDING", "SIDE_BY_SIDE_OPTION_CHAIN", "OPTIONS_SBS_CHAIN", "APAC_OPTION_ONBOARDING_SPLASH_L0", "APAC_OPTION_ONBOARDING_CAR_QUESTIONNAIRE", "SIDE_BY_SIDE_OPTION_CHAIN_ONBOARDING_SEARCH", "OPTION_ONBOARDING_JA_APPLICATION_PENDING", "COMBO_ORDER_DETAIL", "OPTION_L3_ENTRYPOINT_POST_TRADE_UPSELL", "OPTION_TRADING_SESSION", "OPTION_MANUAL_REVIEW_KNOWLEDGE_CHECK", "RECURRING_RECEIPT_UPSELL", "RECURRING_FREQUENCY", "RECURRING_PAYMENT_METHOD", "RECURRING_BACKUP_PAYMENT_METHOD", "RECURRING_AMOUNT", "RECURRING_HUB", "RECURRING_FIND_INVESTMENT_PAGE", "RECURRING_DETAIL", "RECURRING_INSIGHTS", "RECURRING_DIRECT_DEPOSIT_SOURCE", "SYP_LEARN_MORE", "RECURRING_AMOUNT_TYPE", "RECURRING_UNIFIED_CREATION", "SYP_ONBOARDING_DD_CONFIRMATION", "SYP_AGREEMENT", "SYP_DISCLOSURE_ALERT", "RECURRING_ORDER_RECEIPT", "RECURRING_ASSET_TYPE_SELECTION", "BROKERAGE_CASH_ORDER_ENTRY", "MESSAGES", "MESSAGES_THREAD", "ACCOUNT_DETAIL", "ACCOUNT_OVERVIEW", "BONFIRE_SETTINGS_PAGE", "PROFILE", "STATEMENTS_AND_HISTORY", "ACCOUNT_HISTORY", "ACCOUNT_CENTER", "BROKERAGE_STATEMENTS_LIST", "TAX_DOCUMENTS_LIST", "SPENDING_STATEMENTS_LIST", "BROKERAGE_STATEMENT_VIEWER", "TAX_DOCUMENT_VIEWER", "SPENDING_STATEMENT_VIEWER", "ADVANCED_ALERT_HUB", "INDICATOR_ALERT_EDITOR", "INDICATOR_SELECTOR", "ALERT_HUB_SETTING", "SIGNUP_FUND_ACCOUNT_INTRO", "GROWTH_DEPOSIT_MATCH_OFFER", "EQUITY_SELECT_ORDER_KIND_PAGE", "EQUITY_ORDER_ENTRY", "EQUITY_ORDER_REVIEW", "EQUITY_ORDER_RECEIPT", "DOLLAR_BASED_ORDER_ENTRY", "EQUITY_ORDER_CHECK_ALERT", "EQUITY_ADVANCED_CHARTS", "STOCK_DETAIL_PAGE_MINI", "EQUITY_ADVANCED_CHART_TECHNICAL_INDICATOR_MANAGER", "EQUITY_SET_TRADING_HOURS_PAGE", "SCREENER_DETAIL", "SCREENER_INDICATORS_LIST", "SCREENER_INDICATOR_DETAIL", "SCREENER_DATA_DISPLAY", "SCREENER_PRESET_LIST", "ADD_INDICATOR", "ADD_INDICATOR_FORM", "PRICE_ALERT_EDITOR", "EQUITY_ADVANCED_ALERTS_DISCLOSURE", "EQUITY_24H_MARKET_REMINDER", "SCREENER_LIST", "INVESTING_SETTINGS", "DAY_TRADE_SETTINGS", "EQUITY_ORDER_DETAIL", "EQUITY_ENTER_LIMIT_PRICE_PAGE", "POST_DAY_TRADE_SCREEN", "EQUITY_SET_TIME_IN_FORCE_PAGE", "EQUITY_ENTER_STOP_PRICE_PAGE", "EQUITY_ENTER_TRAIL_AMOUNT_PAGE", "PDT_RULES_UPDATES_INFO", "EQUITY_SELECT_ORDER_KIND_MINI_MENU_PAGE", "TRADING_TRENDS", "TRADING_TRENDS_ONBOARDING_SEARCH", "TRADING_TRENDS_ONBOARDING", "PROFIT_AND_LOSS_HUB", "LEVEL_TWO_MARKET_DATA", "ADR_FEE_DETAIL", "TAX_LOTS_SELECTION", "TAX_LOTS_HISTORY", "CUSTOMER_ACCOUNT_REVIEW_SPLASH", "MOBILE_ADVANCED_CHARTS", "CUSTOMER_ACCOUNT_REVIEW_RESULT_PASS", "CUSTOMER_ACCOUNT_REVIEW_RESULT_FAIL", "COMPANY_FINANCIALS_ONBOARDING", "COMPANY_FINANCIALS_ONBOARDING_SEARCH", "EQUITIES_TRADING_LADDER", "RESEARCH_REPORT", "EQUITIES_SUBZERO_ONBOARDING", "EQUITIES_SUBZERO_MARKETING", "CRYPTO_ORDER_RECEIPT", "CRYPTO_SELECT_ORDER_KIND_PAGE", "CRYPTO_ORDER_ENTRY", "CRYPTO_DETAIL_PAGE_MINI", "CRYPTO_STATEMENTS_LIST", "CRYPTO_STATEMENT_VIEWER", "CRYPTO_LEARN_AND_EARN", "CRYPTO_ORDER_SET_LIMIT_PRICE", "CRYPTO_ORDER_INFORMATION", "CRYPTO_ORDER_SET_TIME_IN_FORCE", "CRYPTO_ORDER_SET_STOP_PRICE", "CRYPTO_ORDER_HISTORY_DETAIL", "CRYPTO_HOME_TAB", "CRYPTO_VALUE_PAGE", "L2E_TRY_AGAIN", "CRYPTO_ADVANCED_CHARTS", "ADVANCED_CHARTS_CRYPTO_SEARCH", "ADVANCED_CHARTS_CRYPTO_ONBOARDING", "CRYPTO_ADVANCED_CHART_TECHNICAL_INDICATOR_MANAGER", "CRYPTO_TRANSFER_ENROLLMENT_FRAUD_INFO", "CRYPTO_TRANSFER_ENROLLMENT_PENDING", "CRYPTO_TRANSFER_ENROLLMENT_FAILED", "CRYPTO_TRANSFER_ENROLLMENT_ADDITIONAL_STEPS_REQUIRED", "CRYPTO_TRANSFER_ENROLLMENT_SECURITY_CHECK", "CRYPTO_TRANSFER_ENROLLMENT_COMPLETED", "CRYPTO_TRADING_COIN_LIST", "CRYPTO_SETTINGS", "CRYPTO_REFERRAL_DETAIL", "RHC_LOGIN_REFERRAL", "RHC_SIGNUP_REFERRAL_RH", "CRYPTO_STAKING_AMOUNT_ENTRY", "CRYPTO_STAKING_HISTORY_DETAIL", "CRYPTO_STAKING_HUB", "CRYPTO_STAKING_INTRO", "CRYPTO_STAKING_ORDER_CONFIRMATION", "CRYPTO_STAKING_ORDER_REVIEW", "CRYPTO_STAKING_SUMMARY", "CRYPTO_TRANSFER_SEND_MEMO", "STAKING_UPSELL", "CRYPTO_VOLUME_TIER_PRIMER", "CRYPTO_VOLUME_TIER_HUB", "CRYPTO_VOLUME_TIER_EXPLAINER", "CRYPTO_VOLUME_TIER_INELIGIBLE", "CRYPTO_TRANSFER_SEARCH", "CRYPTO_MAIN_NEWSFEED", "CRYPTO_TAX_LOTS_PRIMER", "EU_CRYPTO_COUNTDOWN_PAGE", "EU_CRYPTO_REWARD_GRANTED", "VOLUME_TIERS_DEPOSIT_PROMO_INFO", "CRYPTO_VOLUME_TIER_ENROLLMENT_CONFIRMATION", "CRYPTO_DEPOSIT_INCENTIVE_ERROR", "CRYPTO_ORDER_SELECT_PAYMENT_METHOD", "CRYPTO_TRADING_LADDER", "API_TRADING_TERMS", "CRYPTO_QUICK_TRADE_SHEET", "TRANSFER_DETAILS", "BANKING", "EARLY_PAY_TRANSFER_DETAILS", "INSTANT_DEPOSIT_OUTCOME", "INSTANT_DEPOSIT_EDUCATION", "PLAID_LINK_BANK_ACCOUNT", "LIST_DETAIL_PAGE", "CRYTPO_NEWSFEED", "ORDER_RECEIPT", "SELECT_ORDER_KIND_PAGE", "RECURRING_ORDER_REVIEW", "OPTIONS_STRATEGY_ROLL_NO_AVAILABLE_POSITIONS", "OPTIONS_STRATEGY_ROLL_STRATEGY_SUMMARY", "IAV_SELECT_BANK_ACCOUNT", "CREATE_QUEUED_DEPOSIT", "REVIEW_QUEUED_DEPOSIT", "GOLD_BILLING_PAYMENT_PREFERENCE", "CREATE_TRANSFER", "REVIEW_TRANSFER", "CREATE_MAX_TRANSFER", "VERIFY_DEBIT_CARD_SPLASH", "VERIFY_DEBIT_CARD_STEPS", "VERIFY_DEBIT_CARD_CODE_ENTRY", "ORDER_CONFIRMATION_FUNDING_UPSELL", "LIMIT_HUB", "WIRE_TRANSFER", "WIRE_VAN_DETAILS", "WIRE_INFO_SCREEN", "POST_TRANSFER_PAGE_RFP_PENDING", "RECURRING_DEPOSIT_UPSELL", "GOLD_DEPOSIT_UPSELL", "PLAID_BANK_LIST", "PLAID_AUTHENTICATION", "SEPA_INFO", "ACH_GRACE_PERIOD_CONFIRMATION", "MARGIN_CALL_WIRE_UPSELL", "POST_INCOMING_WIRE", "DIRECT_DEPOSIT_HUB", "OUTGOING_WIRE_DETAIL_INPUT", "OUTGOING_WIRE_LINK_ACCOUNT", "LINK_APPLE_PAY_INTRO", "LINK_APPLE_PAY_ERROR", "LINK_APPLE_PAY_CONFIRMATION", "POST_ONBOARDING_FUND_SPLASH", "POST_ONBOARDING_FUND_DETAIL", "QUEUED_DEPOSIT_LEARN_MORE", "POST_QUEUED_DEPOSIT_CONFIRMATION", "OUTGOING_WIRE_DETAIL_V2_INPUT", "OUTGOING_WIRE_DETAIL_CONFIRMATION", "OUTGOING_WIRE_FRAUD_ALERT", "CREATE_TRANSFER_V2", "WITHDRAW_INTERVENTION_UPSELL", "WITHDRAW_INTERVENTION_CONFIRMATION", "WIRE_TRANSFER_MEMO", "OUTGOING_WIRE_THIRD_PARTY_FRAUD_ALERT", "WIRE_TRANSFER_SUBMIT_TITLE_DOCUMENTS", "WIRE_TRANSFER_ENTER_BANK_DETAILS", "WIRE_TRANSFER_CONFIRM_BANK_DETAILS", "INTERNAL_TRANSFER_SELECTION", "I18N_CURRENCY_SELECTION", "I18N_METHOD_SELECTION", "I18N_ACCOUNT_INFO", "I18N_POST_DEPOSIT", "I18N_ACCOUNT_SELECTION", "I18N_TRANSFER_CREATE", "I18N_MEMO", "I18N_TRANSFER_REVIEW", "POST_TRANSFER_TIMELINE", "I18N_TRANSFER_ACCOUNT_INFO", "I18N_TRANSFER_ACCOUNT_SELECTION", "I18N_TRANSFER_CURRENCY_SELECTION", "I18N_TRANSFER_METHOD_SELECTION", "I18N_TRANSFER_MEMO", "RECURRING_EXTRA_CASH_SPLASH", "EXTRA_CASH_SETUP_ACCOUNT_SELECTION", "EXTRA_CASH_SETUP_SET_AMOUNT", "EXTRA_CASH_SETUP_REVIEW", "RECURRING_TRANSFERS_HUB", "ISA_CASH_TRANSFER_INTRO", "ISA_CASH_TRANSFER_SELECT_TYPE", "ISA_CASH_TRANSFER_SELECT_PROVIDER", "ISA_CASH_TRANSFER_MANUAL_PROVIDER", "ISA_CASH_TRANSFER_ACCOUNT_NUMBER", "ISA_CASH_TRANSFER_SORT_CODE", "ISA_CASH_TRANSFER_CONFIRM_DETAILS", "ISA_CASH_TRANSFER_UPDATE_YOUR_DETAILS", "ISA_CASH_TRANSFER_SELECT_AMOUNT", "ISA_CASH_TRANSFER_ONLY_CASH_INFO", "ISA_CASH_TRANSFER_ENTER_AMOUNT", "ISA_CASH_TRANSFER_CURRENT_TAX_YEAR", "ISA_CASH_TRANSFER_DECLARATION", "ISA_CASH_TRANSFER_REVIEW_AND_SUBMIT", "ISA_CASH_TRANSFER_REQUEST_RECEIVED", "EDUCATIONAL_PROPS_EXPLAIN", "PICK_STOCK_SCREEN", "SWIPE_TO_CLAIM_SCREEN", "CLAIMED_SCREEN", "CLAIM_REWARD", "REFERRAL_REWARD_OFFER_DETAIL", "CONTACTS_LIST", "PAST_REWARDS", "REWARD_OFFER_DETAIL", "SDP_REFERRAL", "REFERRAL_REWARD_OFFER_DETAIL_INFO", "REFERRAL_INVITE_SENT_CONFIRMATION_DIALOG", "C2C_REFERRAL_OFFER_SENDER_DETAILS_PAGE", "C2C_REFERRAL_OFFER_RECEIVER_DETAILS_PAGE", "C2C_REFERRAL_OFFER_SENDER_FRIENDS_LIST", "NCDI_DEPOSIT_PERIOD_PAGE", "NCDI_HOLD_PERIOD_PAGE", "NCDI_HOLD_PERIOD_WITHDREW_PAGE", "REWARD_OFFERS_LIST", "POST_REWARD_CLAIM_UPSELL_SCREEN", "FELIX_INTRODUCTION", "FELIX_USER_ARCHETYPE", "FELIX_TIMELINE", "FELIX_ASSET_BREAKDOWN", "FELIX_USERBASE_SIZE", "FELIX_INVESTING_CULTURE", "FELIX_OUTRO", "FELIX_OUTRO_ANIMATION", "FELIX_MANIFESTO", "IRR_REQUEST", "IRR_DELETE", "IRR_REQUEST_CONFIRMATION", "IRR_DELETE_CONFIRMATION", "IRR_REQUEST_IN_PROGRESS", "IRR_DELETE_IN_PROGRESS", "IRR_DOWNLOAD", "IPOA_ALLOCATED_RESULT", "IPOA_SUMMARY", "IPOA_ENROLLMENT", "IPOA_LIST", "IPOA_NOT_ALLOCATED_RESULT", "IPOA_ANNOUNCEMENT", "IPOA_LEARNING_HUB", "IPOA_COB_FOLLOW_UP", "IPOA_NOT_ALLOCATED", "PRE_IPO_BID", "LOGIN", "SECURITY_PRIVACY_CENTER", "IN_APP_VERIFICATION", "PASSWORD_UPDATE", "PASSWORD_UPDATE_SUCCESS", "EMAIL_UPDATE", "EMAIL_UPDATE_VERIFICATION", "EMAIL_UPDATE_SUCCESS", "PHONE_UPDATE", "PHONE_UPDATE_CONFIRMATION", "PHONE_UPDATE_VERIFICATION", "PHONE_UPDATE_SUCCESS", "TWO_FACTOR_AUTHENTICATION", "MFA_AUTH_APP_SELECTION", "MFA_BACKUP_CODE", "MFA_SMS_VERIFICATION", "VOICE_ENROLLMENT_INTRO", "VOICE_ENROLLMENT_CONSENT", "VOICE_RECORD", "VOICE_ENROLLMENT_COMPLETE", "VOICE_VERIFICATION_SETTINGS", "TRUSTED_DEVICES", "DEVICE_APPROVAL", "DEVICE_APPROVAL_BLOCKED", "DEVICE_APPROVAL_LOGIN_APPROVED", "DEVICE_APPROVAL_LOGIN", "DEVICE_APPROVAL_LOGIN_BLOCKED", "DEVICE_APPROVAL_ENROLL", "RESET_PASSWORD", "IAV_DEVICE_APPROVAL_SILENT_RESULT", "IAV_DEVICE_APPROVAL_SILENT_WAITING", "DEVICE_SECURITY_SETTINGS", "PASSKEY_LOGIN", "WEBAUTHN_ENROLLMENT_SUCCESS", "WEBAUTHN_ENROLLMENT_EDUCATION", "DEVICE_APPROVAL_HANDLING", "DEVICE_APPROVAL_HANDLING_BLOCKED", "KBA_VERIFICATION", "REVAMP_LOGIN_CONFIRM_EMAIL", "REVAMP_LOGIN_UPDATE_EMAIL", "REVAMP_LOGIN_VERIFY_EMAIL", "REVAMP_LOGIN_ASK_UPDATE_PASSWORD", "REVAMP_LOGIN_UPDATE_PASSWORD", "LOGGED_IN_IDENTITY_VERIFICATION_WAIT", "PRISM", "WORKFLOW_UPDATE_APP", "WORKFLOW_INFO", "WORKFLOW_SMS_CHALLENGE", "WORKFLOW_DEVICE_APPROVAL_CHALLENGE", "WORKFLOW_PLAID_BANK_LIST", "WORKFLOW_PLAID_AUTH", "WORKFLOW_GKBA", "WORKFLOW_EMAIL_CHALLENGE", "WORKFLOW_KYC_STATUS_CHECK", "WORKFLOW_REQUEST_PHONE_CALL", "WORKFLOW_KYC_AGREEMENT", "WORKFLOW_KYC_WAITING", "WORKFLOW_REQUEST_PHONE_CALL_SELECT_COUNTRY", "WORKFLOW_REQUEST_PHONE_CALL_EDIT", "WORKFLOW_CHECKLIST", "RHY_MIGRATION_FEATURE_REWARDS", "RHY_MIGRATION_FEATURE_DIRECT_DEPOSIT", "RHY_MIGRATION_CONTRAST_MULTIPLE_ACCOUNTS", "RHY_MIGRATION_AGREEMENT", "RHY_MIGRATION_CONFIRM_ADDRESS", "RHY_MIGRATION_OPEN_SPENDING_ACCOUNT", "RHY_MIGRATION_TIME_OUT_BOTTOM_SHEET", "RHY_MIGRATION_REVIEW_CHANGES", "RHY_MIGRATION_SELECT_CARD", "RHY_MIGRATION_CONFIRMATION", "RHY_MIGRATION_FEATURE_MERCHANT_REWARDS", "RHY_MIGRATION_INTRO_LONG", "RHY_MIGRATION_FUNDING", "RHY_MIGRATION_SETUP_CHECKLIST", "RHY_MIGRATION_OPT_OUT", "RHY_MIGRATION_SETUP_COMPLETE", "RHY_MIGRATION_DD_SETUP", "RHY_TURBOTAX_INTRO", "RHY_TURBOTAX_OFFER_SELECTION", "RHY_TURBOTAX_OPEN_ACCOUNT", "RHY_TURBOTAX_ACCOUNT_INFO", "RHY_TURBOTAX_ENABLE_EARLY_PAY", "RECS_FIRST_TRADE_INTRO", "RECS_INVESTOR_PROFILE_INTRO", "RECS_INVESTOR_PROFILE_QUESTION", "RECS_INVESTOR_PROFILE_SECTION_COVER", "RECS_RISK_LOADER", "RECS_RISK_PROFILE", "RECS_CONFIRM_QUESTIONNAIRE", "RECS_PORTFOLIO_INTRO", "RECS_PORTFOLIO_DIVERSIFICATION", "RECS_PORTFOLIO_WALKTHROUGH", "RECS_LEARN_MORE", "RECS_PORTFOLIO_ALLOCATION", "RECS_PORTFOLIO_SUMMARY", "RECS_ORDER_ENTRY", "RECS_ORDER_PREVIEW", "RECS_ORDER_REVIEW", "RECS_DISCLOSURE", "RECS_ORDER_SUMMARY", "RECS_ORDER_RECEIPT", "RECS_TRADE_CELEBRATION", "RECS_UNAVAILABLE", "RECS_PORTFOLIO_INCLUDES", "RECS_REENTRY_INTRO", "RECS_REENTRY_CONFIRMATION", "RECS_REENTRY_EDIT", "RECOMMENDATIONS_ONBOARDING_INTRO", "RECS_RET_INTRO", "RECS_RET_QUESTIONNAIRE_RESULTS", "RECS_RET_PORTFOLIO", "RECS_RET_TRADE_CELEBRATION", "RECS_RET_RECURRING_HOOK", "RECS_RET_RECURRING_DECISION", "RECS_RET_CONGRATS", "RECS_RET_QUESTIONNAIRE_RESULTS_INTRO", "RECS_RET_PROSPECTUS", "WAITLIST", "LEARNING_LESSON_SELECTOR", "LEARNING_LESSON", "LEARNING_LESSON_V2", "SAFETY_LABEL_LESSON", "EDUCATION_TOUR", "LEARNING_LESSON_V3", "EDUCATION_HOME", "SNACKS_ARTICLE_PAGE", "L2E_ONBOARDING", "ACATS_IN_ACCOUNT_ELIGIBLE", "ACATS_IN_ACCOUNT_MAY_BE_ELIGIBLE", "ACATS_IN_ACCOUNT_NOT_ELIGIBLE", "ACATS_IN_ACCOUNT_NUMBER_ENTRY", "ACATS_IN_CELEBRATION", "ACATS_IN_CONFIRMATION", "ACATS_IN_CONFIRM_NAME", "ACATS_IN_DTC_ENTRY", "ACATS_IN_ELIGIBILITY_QUESTION", "ACATS_IN_INTRO", "ACATS_IN_NAME_CHANGE", "ACATS_IN_SELECT_BROKERAGE", "ACATS_IN_SUBMIT", "ACATS_IN_TERMS_AND_CONDITIONS", "ACATS_IN_ACCOUNT_SELECTION", "ACATS_IN_TRANSFER_CONTENTS", "ACATS_IN_NON_GOLD_UPGRADE", "ACATS_IN_GOLD_USER_MARGIN_UPGRADE", "ACATS_IN_PARTIAL_TRANSFER", "ACATS_IN_MARGIN_ENABLEMENT", "ACATS_IN_IDENTIFY_PARTIAL_ASSETS", "ACATS_IN_PARTIAL_SEARCH_INSTRUMENT", "ACATS_IN_PARTIAL_ADD_INSTRUMENT", "ACATS_IN_BONUS_MATCH", "ACAT_HISTORY_DETAIL", "ACAT_RETRY", "ACATS_IN_PARTIAL_TRANSFER_ELIGIBLE", "ACATS_IN_EDIT_ASSET", "ACATS_IN_UNSUPPORTED_ASSETS", "ACATS_IN_TRANSFER_UNSUPPORTED", "ACATS_IN_OPTIONS_ENABLEMENT", "MARGIN_ACATS_LANDING", "INTERNAL_ASSET_TRANSFER_TRANSFER_TYPE", "INTERNAL_ASSET_TRANSFER_ASSET_SELECTION", "INTERNAL_ASSET_TRANSFER_EDIT_EQUITY", "INTERNAL_ASSET_TRANSFER_EDIT_CASH", "INTERNAL_ASSET_TRANSFER_EDIT_MARGIN", "CLAWBACK_GRACE_PERIOD_OPT_IN_SCREEN", "ACATS_CUSTODIALS_REVIEW", "TRANSFER_INFO", "ACATS_TRANSFER_INFO", "ACATS_IN_INFO_REVIEW", "ACATS_IN_TRANSFER_INFO", "ACATS_IN_CONFIRM_ACCOUNT_INFO", "ACATS_IN_ACCOUNT_INFO_MISMATCH", "RHY_SPENDING_HOME", "RHY_BACKUP_COVERAGE_BOTTOM_SHEET", "RHY_BACKUP_COVERAGE_DETAILS", "RHY_SPENDING_SETTINGS", "RHY_SPENDING_CARD_CONTROLS", "SPENDING_ACCOUNT_CREATED", "RHY_POST_SIGNUP", "CRYPTO_GIFT_EDIT", "CRYPTO_GIFT_ONBOARDING", "CRYPTO_GIFT_PURCHASE_CONFIRMATION", "CRYPTO_GIFT_RECEIVE_DETAILS", "CRYPTO_GIFT_RECEIVE_CONFIRMATION", "CREATE_GRYPTO_GIFT_ERROR_DIALOG", "RECEIVE_GRYPTO_GIFT_ERROR_DIALOG", "CRYPTO_GIFT_PURCHASE_DETAILS", "CREATE_CRYPTO_GIFT_LOADING", "RECEIVE_CRYPTO_GIFT_LOADING", "CRYPTO_GIFT_DASHBOARD", "CANCEL_CRYPTO_GIFT", "SHAREHOLDER_QA_INTRO", "SHAREHOLDER_QA_INTRO_DISCLOSURE", "SHAREHOLDER_ASK_A_QUESTION", "SHAREHOLDER_QUESTIONS_LIST", "SHAREHOLDER_EVENTS_LIST", "BENEFICIARY_LIST", "BENEFICIARY_VALUE_PROP", "BENEFICIARY_DISCLOSURE", "BENEFICIARY_NAME_INPUT", "BENEFICIARY_RELATIONSHIP_INPUT", "BENEFICIARY_SPOUSAL_AGREEMENT", "BENEFICIARY_DOB_INPUT", "BENEFICIARY_EMAIL_INPUT", "BENEFICIARY_DETAIL", "BENEFICIARY_ACCOUNT_SELECTION", "BENEFICIARY_TYPE", "BENEFICIARY_TRUST_DATE_INPUT", "BENEFICIARY_TRUST_NAME_INPUT", "BENEFICIARY_TRUST_TAX_ID_INPUT", "BENEFICIARY_TRUSTEE_EMAIL_INPUT", "BENEFICIARY_LEVEL", "BENEFICIARY_CHOOSE_EXISTING", "CRYPTO_TRANSFER_RECEIVE", "CRYPTO_TRANSFER_SEND_AMOUNT", "CRYPTO_TRANSFER_SEND_ADDRESS", "CRYPTO_TRANSFER_SEND_REVIEW", "CRYPTO_TRANSFER_SEND_CONFIRMATION", "CRYPTO_TRANSFER_SEND_QR_SCANNER", "CRYPTO_TRANSFER_ENROLLMENT_PRODUCT_INTRO", "CRYPTO_TRANSFER_ENROLLMENT_AGREEMENT", "CRYPTO_TRANSFER_ENROLLMENT_STEPS", "CRYPTO_TRANSFER_SEND_NETWORK", "CRYPTO_TRANSFER_LIMITS", "CRYPTO_TRANSFER_SEND_PARTY_SELECTION", "CRYPTO_TRANSFER_SEND_WALLET_SELECTION", "CRYPTO_TRANSFER_SEND_EXCHANGE", "CRYPTO_TRANSFER_SEND_EXCHANGE_SEARCH", "CRYPTO_TRANSFER_SEND_RECEIVER_NAME", "CRYPTO_TRANSFER_SEND_RECEIVER_DOB", "CRYPTO_TRANSFER_SEND_PENDING_REVIEW", "CRYPTO_TRANSFER_SEND_FAILED", "CRYPTO_TRANSFER_HISTORY_DETAIL", "CRYPTO_TRANSFER_RECEIVE_PARTY_SELECTION", "CRYPTO_TRANSFER_RECEIVE_WALLET_SELECTION", "CRYPTO_TRANSFER_RECEIVE_PENDING_REVIEW", "CRYPTO_TRANSFER_RECEIVE_FAILED", "CRYPTO_TRANSFER_RECEIVE_CONTACT_SUPPORT", "CRYPTO_TRANSFER_RECEIVE_EXCHANGE", "RHY_WAITLIST_SIGN_UP", "RHY_WAITLIST_MARKETING_SPLASH", "PAYCHECK_HUB", "PAYCHECK_INVESTMENT_HUB", "SLIP_ONBOARDING_INTRO", "SLIP_ONBOARDING_EDUCATION", "SLIP_ONBOARDING_CALCULATOR", "SLIP_ONBOARDING_RISKS", "SLIP_ONBOARDING_FAQS", "SLIP_ONBOARDING_AGREEMENTS", "SLIP_ONBOARDING_CONFIRMATION", "SLIP_HUB", "SLIP_HUB_SETTING", "SLIP_ONBOARDING_INTRO_ABBREVIATED", "SLIP_ONBOARDING_AGREEMENTS_ABBREVIATED", "SLIP_UPDATED_AGREEMENT", "SLIP_ONBOARDING_INTRO_V3", "SLIP_ONBOARDING_VALUE_PROPS", "SLIP_ONBOARDING_ELIGIBILITY_CHECKLIST", "SLIP_POST_TRADE_UPSELL", "SLIP_LEARN_AND_EARN_REWARD", "SLIP_ONE_CLICK_AGREEMENTS", "CREATE_ACCOUNT_CONGRATULATIONS", "CLAIM_FRACTIONAL_REWARD_GENERIC_INFO", "PROGRESSIVE_ONBOARDING_EXPECTATION", "PROGRESSIVE_ONBOARDING_RESUME_TRADE_SPLASH", "WELCOME_SAFETY_FIRST", "WELCOME_START_WITH_DOLLAR", "WELCOME_INVESTING", "WELCOME_MAIN", "USER_CREATION_SPLASH", "USER_CREATION_EMAIL", "USER_CREATION_PASSWORD", "USER_CREATION_LEGAL_NAME", "ONBOARDING_TAKEOVER", "WELCOME_GB_MAIN", "IDENTITY_VERIFICATION_SPLASH", "CONFIRM_REGION", "PERSONA_IDENTITY_VERIFICATION", "COUNTRY_UNAVAILABLE_ERROR", "RESUME_APPLICATION_V1_TAKEOVER", "RESUME_APPLICATION_V2_TAKEOVER", "ONBOARDING_DEPOSIT_PAGE", "RESURRECTION_SPLASH", "SELECT_RETIREMENT_CONTRIBUTION_TYPE", "SELECT_RETIREMENT_TAX_YEAR", "RETIREMENT_STATEMENTS_LIST", "RETIREMENT_STATEMENT_VIEWER", "IRA_DISTRIBUTION_FAQ", "SELECT_IRA_DISTRIBUTION_TYPE", "EDIT_IRA_TAX_WITHHOLDINGS", "RETIREMENT_DASHBOARD", "RETIREMENT_CONTRIBUTION_HUB", "RETIREMENT_ACCOUNT_SELECTION", "RETIREMENT_ACCOUNT_COMPARISON", "RETIREMENT_ACCOUNT_DESCRIPTION", "RETIREMENT_INSTANT", "RETIREMENT_REVIEW_AGREEMENTS", "RETIREMENT_SIGNUP_SUCCESS", "RETIREMENT_SIGNUP_ERROR", "ENOKI_CONTRIBUTION_CELEBRATION", "RETIREMENT_ONBOARDING_SWIPEY", "RETIREMENT_WAITLIST", "RETIREMENT_OPTIONS_OPT_IN", "CREATE_RETIREMENT_CONTRIBUTION", "RETIREMENT_OPTIONS_CONFIRM_ELIGIBILITY", "RETIREMENT_OPTIONS_CHECK_ELIGIBILITY", "RETIREMENT_401K_ROLLOVER_EDUCATION", "RETIREMENT_401K_ROLLOVER_OPTIONS", "RETIREMENT_401K_ROLLOVER_TERMS", "RETIREMENT_401K_ROLLOVER_CAPITALIZE", "RETIREMENT_401K_ROLLOVER_DIY", "RETIREMENT_401K_ROLLOVER_QUESTIONS", "RETIREMENT_SIGNUP_LOADING", "RECS_RET_BUY_AGAIN", "RETIREMENT_SIGNUP_WHICH_IRA", "RETIREMENT_INVEST", "RETIREMENT_TAX_BENEFITS", "IRA_SYP_INTRO", "ROTH_CONVERSION_INFO", "RETIREMENT_MULTIPLE_FUNDING_METHODS", "RETIREMENT_LEARN_AND_EARN_REWARD", "RETIREMENT_MATCH_RATE_SELECTION", "RETIREMENT_ENOKI_INFO", "RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_INTRO", "RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_QUESTION", "RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_RESULT", "RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION", "RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION_AGREEMENTS", "RETIREMENT_ONBOARDING_MANAGEMENT_TYPE_SELECTION", "RETIREMENT_SCROLLING_VALUE_PROP", "ADVISORY_PORTFOLIO_REVEAL_INTRO", "ADVISORY_PORTFOLIO_REVEAL_BREAKDOWN", "ADVISORY_PORTFOLIO_REVEAL_PROJECTION", "RETIREMENT_1099_PARTNERSHIP_DETAIL", "RETIREMENT_MATCH_HUB", "RETIREMENT_ONBOARDING_FUNDING_METHODS", "TAX_SEASON_PROMO_2024_PROMO", "TAX_SEASON_PROMO_2024_MATCH_SELECTOR", "TAX_SEASON_PROMO_2024_TIMELINE", "RETIREMENT_401K_ROLLOVER_METHOD_SELECTION", "RETIREMENT_401K_ROLLOVER_VERIFY_INFO", "RETIREMENT_401K_ROLLOVER_INTERSTITIAL", "RETIREMENT_401K_ROLLOVER_CAPITALIZE_EMBED", "TAX_SEASON_PROMO_2024_MATCH_AGREEMENTS", "IRA_MANAGEMENT_STYLE_SELECTION", "RETIREMENT_401K_FINDER_INTERSTITIAL", "RETIREMENT_401K_FINDER_RESULTS", "RETIREMENT_401K_FINDER_ACCOUNT_DETAILS", "RETIREMENT_401K_FINDER_NO_RESULTS", "RETIREMENT_401K_FINDER_NOT_SUPPORTED", "SWEEP_ONBOARDING", "SWEEP_ONBOARDING_VALUE_PROPS", "SWEEP_ONBOARDING_CONFIRMATION", "SWEEP_ONBOARDING_AGREEMENT", "GOLD_VALUE_PROPS", "GOLD_AGREEMENT", "SWEEP_ONBOARDING_CONFIRMATION_WITH_GOLD", "SWEEP_ONBOARDING_AGREEMENTS_LIST", "SWEEP_ONBOARDING_SELECT_RATE", "SWEEP_ONBOARDING_ERROR", "GOLD_UPGRADE_SUCCESS", "SWEEP_ONBOARDING_HOW_IT_WORKS", "CHOOSE_LINKING_PAYMENT_METHOD", "DEBIT_CARD_NUMBERS_INPUT", "DEBIT_CARD_NAME_INPUT", "DEBIT_CARD_LINKING_LOADING", "DEBIT_CARD_LINKING_CONFIRMATION", "POST_TRANSFER_CONFIRMATION", "TRANSFER_ACCOUNT_SELECTION", "DEBIT_CARD_LINKING_SPLASH_SCREEN", "MARGIN_UPGRADE_SPLASH", "MARGIN_UPGRADE_EDUCATION", "MARGIN_UPGRADE_VALUE_PROPS", "MARGIN_UPGRADE_ELIGIBILITY", "MARGIN_UPGRADE_MARGIN_LIMIT_SET", "MARGIN_UPGRADE_MARGIN_WITHDRAWAL_SET", "MARGIN_UPGRADE_INTEREST_RATE_SELECTION", "GOLD_AND_MARGIN_VALUE_PROPS", "MARGIN_UPGRADE_AGREEMENT", "MARGIN_UPGRADE_REVIEW", "MARGIN_UPGRADE_ERROR", "MARGIN_UPGRADE_GOLD_AGREEMENT", "MARGIN_UPGRADE_CONFIRMATION", "MARGIN_UPGRADE_GOLD_ONLY_CONFIRMATION", "MARGIN_UPGRADE_NOT_ELIGIBLE", "MARGIN_UPGRADE_GOLD_CONFIRMATION", "MARGIN_LIMIT_EDIT", "MARGIN_UPGRADE_REVIEW_INVESTMENT_PROFILE", "MARGIN_CALL_MAINTENANCE", "MARGIN_CALL_MAINTENANCE_RESOLVED", "NEAR_MARGIN_CALL", "BUYING_POWER", "MARGIN_CALL_WARN", "DAY_TRADE_CALL_RESOLVED", "MARGIN_BATCH_SELL_STOCK", "BUYING_POWER_HUB", "MARGIN_STATUS_DETAIL", "MARGIN_REQUIREMENT_TABLE", "RISKY_DEPOSIT_INSTANT_UPSELL", "MARGIN_UPGRADE_TIERED_RATES", "MARGIN_UPGRADE_GOLD_UPSELL", "UK_MARGIN_ONBOARDING_LOSSES", "UK_MARGIN_ONBOARDING_GAINS", "UK_MARGIN_ONBOARDING_POTENTIAL_RISKS", "UK_MARGIN_ONBOARDING_MANAGE_RISKS", "UK_MARGIN_ONBOARDING_INVESTOR_PROFILE_SPLASH", "UK_MARGIN_ONBOARDING_EXPERIENCE_TEST_SPLASH", "UK_MARGIN_ONBOARDING_KNOWLEDGE_TEST_SPLASH", "MARGIN_MAINTENANCE_TABLE", "MARGIN_MAINTENANCE_TABLE_ON_MARGIN_CALL", "MARGIN_CALL_V2_CLOSE_POSITIONS_SUMMARY", "MARGIN_CALL_V2_MARKET_ORDER", "APP_MFA_ENROLLMENT_INTRODUCTION", "APP_MFA_ENROLLMENT_DOWNLOAD", "V1_TWO_FACTOR_TOTP_TOKEN", "MANUAL_APP_MFA_ENROLLMENT_KEY", "MANUAL_APP_MFA_ENROLLMENT_INTRODUCTION", "V1_TWO_FACTOR_CONFIRM_TOTP_TOKEN", "APP_MFA_ENROLLMENT_CODE", "APP_MFA_ENROLLMENT_CONFIRMATION", "APP_MFA_ENROLLMENT_BACKUP_CODE", "V1_TWO_FACTOR_BACKUP_CODE", "PROMPT_MFA_ENROLLMENT_INTRODUCTION", "PROMPT_MFA_ENROLLMENT_CONFIRMATION", "SMS_MFA_ENROLLMENT_INTRODUCTION", "V1_TWO_FACTOR_CONFIRM_PHONE_NUMBER", "SMS_MFA_ENROLLMENT_CODE", "SMS_MFA_ENROLLMENT_BACKUP_CODE", "SMS_MFA_ENROLLMENT_CONFIRMATION", "V1_TWO_FACTOR_TOTP_BACKUP_CODE", "V1_TWO_FACTOR_SMS_BACKUP_CODE", "NCW_HOME", "NCW_ONBOARDING_PRODUCT_INTRO", "NCW_ONBOARDING_CREATE_IMPORT", "NCW_CREATE_PIN", "NCW_BACKUPS_SECURITY", "NCW_IMPORTING_WALLET_RECOVERY_PHRASE", "NCW_CREATING_WALLET_PROGRESS", "NCW_CREATING_WALLET_CREATED", "NCW_BACKUP_WALLET", "NCW_SEARCH", "NCW_CRYPTO_DETAIL_PAGE", "NCW_OMNISCAN", "NCW_WALLET_HUB", "NCW_CRYPTO_TRANSFER_SEND_ADDRESS", "NCW_CRYPTO_TRANSFER_SEND_CONFIRMATION", "NCW_CRYPTO_TRANSFER_AMOUNT", "NCW_CRYPTO_TRANSFER_SEND_REVIEW", "NCW_CRYPTO_TRANSFER_SELECT_TOKEN", "NCW_CRYPTO_TRANSFER_RECEIVE", "NCW_FUND_WALLET", "NCW_TRUSTED_DAPPS", "NCW_CRYPTO_SWAP_AMOUNT_ENTRY", "NCW_CRYPTO_SWAP_ORDER_REVIEW", "NCW_CRYPTO_SWAP_ORDER_CONFIRMATION", "NCW_CRYPTO_TOKEN_LIST", "NCW_ONBOARDING_SECURITY", "NCW_ONBOARDING_CLAIM_COIN", "NCW_ONBOARDING_SUCCESS", "NCW_FUNDING_SELECT_TOKEN", "NCW_LEARN_AND_EARN_LESSON", "NCW_LEARN_AND_EARN_LESSON_COMPLETED", "NCW_WEB3_MAIN", "NCW_WEB3_BROWSER", "NCW_WEB3_INFO", "NCW_REWARD", "NCW_DISCOVER_CRYPTO_NEWS", "NCW_DISCOVER_TOP_LIST", "NCW_TOKEN_VISIBILITY", "NCW_CLAIM_REWARD", "NCW_CONFIRM_REWARD", "NCW_APP_REDIRECT", "NCW_WALLET_BACKUP_TYPE", "NCW_WEB3_LAUNCHPAD", "NCW_BUY_CHOOSE_PROVIDER", "NCW_BUY_RH_SPLASH_CONNECT", "NCW_BUY_SPLASH_SARDINE", "NCW_LAUNCH_SPLASH", "NCW_GOLD_PROMO_PRIMER", "NCW_GOLD_PROMO_PRIMER_CONNECTED", "GOLD_STATUS_NCW_AUTH", "NCW_ONBOARDING_STARTER", "NCW_ONBOARDING_BACKUP", "NCW_ONBOARDING_NOTIFICATION_PROMPT", "NCW_IMPORTING_WALLET_CLOUD", "NCW_IMPORTING_WALLET_REVIEW", "NCW_OFFRAMP_SPLASH", "NCW_OFFRAMP_TOKEN_SELECTION", "NCW_OFFRAMP_NETWORK_SELECTION", "NCW_OFFRAMP_AMOUNT_INPUT", "HOME_QUICK_NAV", "HOME_PORTFOLIO_TABLE", "RECURRING_DEPOSITS_HUB", "CHOOSE_TRANSFER_FREQUENCY", "RECURRING_DEPOSIT_DETAIL", "GOLD_REFERRAL_PROGRAM", "GOLD_AGREEMENTS_LIST", "GOLD_ONBOARDING_LANDING", "GOLD_ONBOARDING_SWEEP_AGREEMENTS", "GOLD_ONBOARDING_AGREEMENTS", "GOLD_ONBOARDING_MARGIN_AGREEMENTS", "GOLD_ONBOARDING_MARGIN_AVAILABLE_MARGIN", "GOLD_ONBOARDING_MARGIN_CHECK", "GOLD_ONBOARDING_MARGIN_INFO", "GOLD_ONBOARDING_SUCCESS", "GOLD_ONBOARDING_ERROR", "GOLD_ONBOARDING_OLD_LANDING", "GOLD_ONBOARDING_OLD_SUCCESS", "RETIREMENT_GOLD_MATCH_VALUE_PROPS", "GOLD_HUB", "GOLD_SUGGESTED_ACTION", "GOLD_CELEBRATION", "GOLD_PLAN_SELECTION", "GOLD_DOWNGRADE_CONFIRMATION", "APY_BOOST_CELEBRATION", "GOLD_TAB", "GOLD_DEPOSIT_BONUS_CELEBRATION", "FUNCTIONAL_DEPOSIT_UPSELL", "GOLD_DEPOSIT_BONUS_UPCOMING_PAYOUTS", "GOLD_DEPOSIT_BONUS_CELEBRATION_TIMELINE", "GOLD_DEPOSIT_BOOST_HUB", "GOLD_DEPOSIT_BONUS_PAYOUT_DETAIL", "GOLD_DEPOSIT_BONUS_ADJUSTMENT_DETAIL", "GOLD_SWITCH_PLANS_CONFIRMATION", "GOLD_PRIMARY_PAYMENT_METHOD", "GOLD_BACKUP_PAYMENT_METHOD", "GOLD_EXTRA_AGREEMENTS", "LIVE_TRIVIA", "GOLD_EVENT_LIVE_2025", "GOLD_SAGE_SPLASH", "GOLD_SAGE_TIMELINE", "GOLD_SAGE_RATE", "GOLD_SAGE_START_APPLICATION", "GOLD_SAGE_APPLICATION", "GOLD_YG_BACKUP_BILLING_SURFACE", "CATPAY_ORDER_AMOUNT_INPUT", "CATPAY_ORDER_REVIEW", "CATPAY_LOGIN", "P2P_CREATE_TRANSACTION", "P2P_SEARCH", "P2P_REVIEW_TRANSACTION", "P2P_CONFIRMATION", "P2P_PROFILE", "P2P_VIEW_QR_CODE", "P2P_SCAN_QR_CODE", "P2P_INTRO", "PROFILE_VISIBILITY", "P2P_PENDING_TRANSACTIONS", "P2P_CLAIM_TRANSFER", "P2P_PAY_REQUEST", "P2P_ONBOARDING_ATTRIBUTION", "P2P_REVIEW_MULTIUSER_TRANSACTION", "RETURNS_COMPARISON_INTRO", "RETURNS_COMPARISON_SEARCH", "SHARE_PORTFOLIO_PAGE", "SHARE_PORTFOLIO_LEARN_MORE_ABOUT_REFERRALS", "RHY_REFERRALS_TRACKING", "RHY_REFERRALS_REFERRER_LANDING_PAGE", "RHY_REFERRALS_REFEREE_LANDING_PAGE", "RHY_REFERRALS_CONTACT_LIST", "RHY_REFERALS_STATUS", "RHY_REFERRAL_REWARD_DETAILS", "RHY_REFERRALS_WELCOME", "RHY_REFERRALS_FUND_LANDING", "RHY_REFERRALS_FUND_SUCCESS", "RHY_REFERRALS_FUND_PILL", "ENABLE_NOTIFICATIONS_PROMPT", "START_DEPOSIT", "DEPOSIT_IN_PROGRESS", "WITHDRAWAL_INPUT", "CHOOSE_WITHDRAWAL_ACCOUNT", "WITHDRAWAL_REVIEW", "WITHDRAWAL_CONFIRMATION", "CRYPTO_ORDER_REVIEW", "SIGNUP_REWARD_GRANTED", "REFERRAL_REWARD_GRANTED", "REFERRAL_REWARD_DETAIL", "RH_SUPPORT", "CONTACT_SUPPORT", "TOKENIZED_STOCK_ORDER_ENTRY", "TOKENIZED_STOCK_ORDER_TYPE", "TOKENIZED_STOCK_ORDER_REVIEW", "TOKENIZED_STOCK_ORDER_RECEIPT", "TOKENIZED_STOCK_ORDER_HISTORY_DETAIL", "IDENTITY", "INVESTOR_PROFILE", "STOCK_TOKEN_TAX_INFO", "STOCK_TOKEN_ASSESSMENT", "STOCK_TOKEN_KNOWLEDGE_TEST", "TOKENIZED_STOCK_PRIMER", "TOKENIZED_STOCK_FAQ", "TOKENIZED_STOCK_DETAIL_PAGE", "TOKENIZED_STOCK_DETAIL_POSITION_ABOUT", "TOKENIZED_STOCK_DETAIL_DISCLOSURE", "PERPETUALS_PRIMER", "PERPETUALS_ASSESSMENT", "PERPETUALS_KNOWLEDGE_TEST", "PERPETUALS_ONBOARDING_STATUS", "PERPETUALS_AGREEMENT", "PERPETUALS_TPSL_ENTRY", "PERPETUALS_TPSL_ERROR", "PERPETUALS_TPSL_HUB", "PERPETUALS_TPSL_CANCELLATIONS", EducationTourScreenNames.PERPETUALS_ORDER_ENTRY, "PERPETUALS_MANUAL_CONTRACT_DETAILS", "PERPETUALS_ORDER_TYPE", "PERPETUALS_ORDER_REVIEW", "PERPETUALS_ORDER_RECEIPT", "PERPETUALS_ORDER_HISTORY_DETAIL", "PERPETUALS_LIMIT_BUY_INTRO", "PERPETUALS_LIMIT_SELL_INTRO", "PERPETUALS_STOP_SELL_INTRO", "PERPETUALS_STOP_BUY_INTRO", "PERPETUALS_LIMIT_ORDER_PRICE", "PERPETUALS_LIMIT_ORDER_TIF", "PERPETUALS_STOP_ORDER_PRICE", "PERPETUALS_STOP_ORDER_TIF", "PERPETUALS_POSITION_HUB", "PERPETUALS_EXPLORE", "PERPETUALS_PNL_BALANCE_DETAIL", "PERPETUALS_DETAIL_PAGE", "PERPETUALS_LIQUIDATION_DETAILS", "PERPETUALS_MARGIN_EDIT", "PERPETUALS_MARGIN_EDIT_REVIEW", "PERPETUALS_CLOSE_POSITION", "PERPETUALS_ORDER_FLOW_NUX", "TOKENIZED_LIMIT_BUY_INTRO", "TOKENIZED_LIMIT_SELL_INTRO", "INTEREST_ENROLLMENT", "INTEREST_SETTINGS", "CC_APPLICATION_LANDING", "CC_APPLICATION_PROFILE_INFO_REVIEW", "CC_APPLICATION_PROFILE_INFO_EDIT", "CC_APPLICATION_SSN", "CC_APPLICATION_RESIDENTIAL_ADDRESS", "CC_APPLICATION_ADDRESS_SEARCH", "CC_APPLICATION_ADDRESS_MANUAL", "CC_APPLICATION_ADDRESS_ERROR", "CC_APPLICATION_ADDRESS_SUGGESTION", "CC_APPLICATION_INCOME", "CC_APPLICATION_TERMS", "CC_APPLICATION_LOADING", "CC_APPLICATION_FRAUD_ALERT", "CC_APPLICATION_FRAUD_ALERT_VERIFICATION_CODE", "CC_APPLICATION_FRAUD_ALERT_VERIFIED", "CC_APPLICATION_CREDIT_FROZEN", "CC_APPLICATION_REVIEW_NEEDED", "CC_APPLICATION_ADDRESS_CHALLENGE", "CC_APPLICATION_IDV_FAIL", "CC_APPLICATION_REJECTED", "CC_APPLICATION_LIMIT_REVEAL", "CC_APPLICATION_ACCOUNT_TERMS", "CC_APPLICATION_SHIPPING_ADDRESS", "CC_APPLICATION_SHIPPING_ETA", "CC_APPLICATION_DOWNLOAD_APP", "CC_WAITLIST_INTRO", "CC_WAITLIST_JOINED", "CC_WAITLIST_CONFIRMATION", "CC_WAITLIST_GOLD_UPSELL", "CC_ONBOARDING_LANDING", "CC_POST_ONBOARDING", "CC_APPLICATION_SOLID_GOLD_DELAY", "CC_APPLICATION_SSN_VERIFICATION", "CC_APPLICATION_SSN_VERIFIED", "CC_APPLICATION_PREMIUM_LIMITS", "CC_WAITLIST_POST_SIGNUP_INTRO", "CC_WAITLIST_POST_SIGNUP_JOINED", "CC_CHOOSE_BANK_ACCOUNT", "CC_ADDITIONAL_INFORMATION", "JOINT_ACCOUNT_PRIMARY_INTRO", "JOINT_ACCOUNT_SEND_INVITE", "JOINT_ACCOUNT_INVITE_SENT_CELEBRATION", "JOINT_ACCOUNT_CONFIRM_SECONDARY", "JOINT_ACCOUNT_PRIMARY_CELEBRATION", "JOINT_ACCOUNT_SECONDARY_INTRO", "JOINT_ACCOUNT_SECONDARY_CELEBRATION", "JOINT_ACCOUNT_HOME", "JOINT_ACCOUNT_HELP_CO_OWNER", "JOINT_POST_CREATION", "JOINT_ACCOUNT_FUNDING_METHODS", "INTERNAL_ASSET_TRANSFER_INTRO", "INTERNAL_ASSET_TRANSFER_ACCOUNT_SELECTION", "INTERNAL_ASSET_TRANSFER_ACCOUNT_SELECTION_LIST", "INTERNAL_ASSET_TRANSFER_TAX_IMPLICATIONS", "INTERNAL_ASSET_TRANSFER_AGREEMENT", "INTERNAL_ASSET_TRANSFER_REVIEW", "INTERNAL_ASSET_TRANSFER_ASSET_LIST", "INTERNAL_ASSET_TRANSFER_CONFIRMATION", "INTERNAL_ASSET_TRANSFER_DETAILS", "FUTURES_DETAIL_SCREEN", "FUTURES_LADDER_SCREEN", "FUTURES_ORDER_FORM_SCREEN", "FUTURES_ORDER_FORM_REVIEW_SCREEN", "FUTURES_ORDER_CONFIRMATION_SCREEN", "FUTURES_ORDER_PLACEMENT_LOADING_SCREEN", "FUTURES_VALUE_PROPS_SCREEN", "FUTURES_ONBOARDING_REVIEW_INVESTOR_PROFILE_SCREEN", "FUTURES_ONBOARDING_AGREEMENTS_AND_DISCLOSURES_SCREEN", "FUTURES_LADDER_FUTX", "FUTURES_ORDER_HISTORY_DETAIL_SCREEN", "FUTURES_LADDER_FTUX", "FUTURES_APPLICATION_ACCOUNT_APPROVED", "FUTURES_APPLICATION_ACCOUNT_REVIEW_REQUIRED", "FUTURES_APPLICATION_ACCOUNT_REJECTED", "FUTURES_ONBOARDING_ARBITRATION_AGREEMENT", "FUTURES_ONBOARDING_ELIGIBILITY_CHECK", "ACATS_IN_PLAID_INTRO", "FUTURES_CASH_CORRECTION_HISTORY_DETAIL_SCREEN", "FUTURES_EXECUTION_HISTORY_DETAIL_SCREEN", "EVENT_CONTRACT_ORDER_HISTORY_DETAIL_SCREEN", "FUTURES_ASSET_HOME", "BLACK_WIDOW_SPLASH_UPSELL", "WEB_CLIENT_PREFERENCE", "EOY_GIVEAWAY_2024", "PROMOTION_EDUCATION", "PROMOTION_CONFIRMATION", "EOY_GIVEAWAY_2025", "ACCOUNT_TYPE_SELECTION", "STRATEGIES_VALUE_PROPS", "MANAGEMENT_TYPE_SELECTION", "PORTFOLIO_QUESTIONNAIRE_INTRO", "ADVISORY_PORTFOLIO_REVEAL_INFO_PAGE", "ADVISORY_PORTFOLIO_REVEAL_REGION_DETAILS", "ADVISORY_ONBOARDING_FUNDING_METHODS", "ADVISORY_ONBOARDING_FEES_PROMO", "ADVISORY_ONBOARDING_TRANSFER_NEXT_STEPS", "ADVISORY_ONBOARDING_FETCH_ACCOUNT", "ADVISORY_ONBOARDING_SUBMIT_DEPOSIT", "ADVISORY_ONBOARDING_FIRST_DEPOSIT_CELEBRATION", "PORTFOLIO_DRILLDOWN", "ADVISORY_FUTURE_RETURNS", "ADVISORY_DASHBOARD", "ADVISORY_INSIGHT", "ADVISORY_INSIGHTS_HUB", "ADVISORY_WITHDRAW_AND_CLOSE_ACCOUNT", "ADVISORY_GOLD_PERKS", "ADVISORY_ACATS_PROMO", "RESTRICT_SECURITIES", "UPDATE_MANAGED_INVESTOR_PROFILE", "UPDATE_MANAGED_INVESTOR_PROFILE_RESULTS", "ADVISORY_PORTFOLIO_COMPUTE", "STRATEGIES_RETURNS_HUB", "ADVISORY_ONBOARDING_QUESTIONNAIRE_REVIEW", "ADVISORY_ONBOARDING_QUESTIONNAIRE_INTRO", "ADVISORY_ONBOARDING_AGREEMENTS", "ADVISORY_RETURNS_HUB", "SETTINGS_INVESTING_INVESTOR_PROFILE_GRAPH_TAKEOVER_REVIEW", "TAX_LOSS_HARVEST_DASHBOARD", "TAX_LOSS_HARVEST_NUX", "TAX_LOSS_HARVEST_CUSTOMIZE_INTRO", "TAX_LOSS_HARVEST_CHOOSE_ACCOUNTS", "TAX_LOSS_HARVEST_LOADING_OPTIONS", "TAX_LOSS_HARVEST_OPTIONS_INTRO", "TAX_LOSS_HARVEST_CHOOSE_OPTION", "TAX_LOSS_HARVEST_CUSTOMIZE_REVIEW", "TAX_LOSS_HARVEST_CUSTOMIZE_CELEBRATION", "GAINS_AND_LOSSES", "EVENT_CONTRACT_DETAIL_PAGE", "EVENT_CONTRACT_ORDER_FORM", "EVENT_CONTRACT_HUB", "EVENT_CONTRACTS_BRACKET_PAGE", "EVENT_CONTRACT_ATTESTATION", "EVENT_CONTRACT_HUB_V2", "EVENT_CONTRACT_ORDER_FORM_RECEIPT", "EVENT_CONTRACT_ORDER_FORM_REVIEW", "EVENT_CONTRACT_SELECTOR_SCREEN", "GAME_DETAIL_PAGE", "CASH_BALANCES_DETAILS_PAGE", "CORTEX_SDP_DIGEST", "CORTEX_SDP_DIGEST_FEEDBACK", "SDP_DIGEST_BREAKING", "CORTEX_SDP_DIGEST_SOURCE_OVERFLOW", "CORTEX_DIGEST_ONBOARDING_SPLASH", "CORTEX_DIGEST_ONBOARDING_AGREEMENT", "CORTEX_DIGEST_ONBOARDING_SEARCH", "CORTEX_CDP_DIGEST", "CORTEX_CDP_DIGEST_BREAKING", "CORTEX_CDP_DIGEST_FEEDBACK", "CORTEX_CDP_DIGEST_SOURCE_OVERFLOW", "PORTFOLIO_DIGEST_DETAIL", "PORTFOLIO_DIGEST_SPLASH", "PORTFOLIO_DIGEST_AGREEMENT", "CORTEX_DIGEST_SOURCE_LIST", "FEE_TIER_PUSH_NOTIF_UPSELL", "SELF_DIRECTED_ACCOUNT_CONFIRMATION", "EDIT_ACCOUNT_NICKNAME", "ACCOUNT_FUNDING_OPTIONS", "MCW_CURRENY_CONVERSION_PAGE", "MCW_CONVERSION_SUCCESS_PAGE", "NCW_FUNDING_NETWORK_SELECTION", "EDIT_ACCOUNT_NICKNAME_LIST", "CRYPTO_TRANSFER_MANAGE_SAVED_ADDRESSES", "CRYPTO_EXPLORE_LEAF", "CRYPTO_TRANSFER_SEND_ADDRESS_ALLOWLIST", "CRYPTO_TRANSFER_ALLOWLIST_ENABLED_PRIMER", "CRYPTO_TRANSFER_ADD_SAVED_ADDRESS", "CRYPTO_TRANSFER_ADD_SAVED_ADDRESS_QR_SCANNER", "CRYPTO_TRANSFER_COST_BASIS_HUB", "CRYPTO_TRANSFER_COST_BASIS_DETAIL", "CRYPTO_TRANSFER_COST_BASIS_INPUT", "SOCIAL_HOME", "POST_DETAIL", "TRADE_HISTORY", "USER_PROFILE", "QUICK_TRADE_ACTION_SHEET", "ACTIVITY_FEED", "SOCIAL_SEARCH_SCREEN", "SOCIAL_POST_COMPOSER", "SOCIAL_ONBOARDING_PAGE", "SOCIAL_PROFILE_SETTINGS", "PERPETUALS_ORDER_EDIT_LEVERAGE", "PERPETUALS_POSITION_EDIT_LEVERAGE", "ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TRANSFER_INTRO", "ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TRANSFER_DETAIL", "ACATS_CRYPTO_MIGRATION_FLOW_ASSET_REVIEW", "ACATS_CRYPTO_MIGRATION_FLOW_ASSET_SUBMIT", "ACATS_CRYPTO_MIGRATION_FLOW_ASSET_CONFIRMATION", "ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TXN_DETAIL", "ACATS_CRYPTO_MIGRATION_FLOW_ERROR_WITH_CX", "ACATS_CRYPTO_MIGRATION_FLOW_ERROR", "Companion", "data_platform.event_logging.screen_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Name implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Name[] $VALUES;
        public static final Name ACATS_CRYPTO_MIGRATION_FLOW_ASSET_CONFIRMATION;
        public static final Name ACATS_CRYPTO_MIGRATION_FLOW_ASSET_REVIEW;
        public static final Name ACATS_CRYPTO_MIGRATION_FLOW_ASSET_SUBMIT;
        public static final Name ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TRANSFER_DETAIL;
        public static final Name ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TRANSFER_INTRO;
        public static final Name ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TXN_DETAIL;
        public static final Name ACATS_CRYPTO_MIGRATION_FLOW_ERROR;
        public static final Name ACATS_CRYPTO_MIGRATION_FLOW_ERROR_WITH_CX;
        public static final Name ACATS_CUSTODIALS_REVIEW;
        public static final Name ACATS_IN_ACCOUNT_ELIGIBLE;
        public static final Name ACATS_IN_ACCOUNT_INFO_MISMATCH;
        public static final Name ACATS_IN_ACCOUNT_MAY_BE_ELIGIBLE;
        public static final Name ACATS_IN_ACCOUNT_NOT_ELIGIBLE;
        public static final Name ACATS_IN_ACCOUNT_NUMBER_ENTRY;
        public static final Name ACATS_IN_ACCOUNT_SELECTION;
        public static final Name ACATS_IN_BONUS_MATCH;
        public static final Name ACATS_IN_CELEBRATION;
        public static final Name ACATS_IN_CONFIRMATION;
        public static final Name ACATS_IN_CONFIRM_ACCOUNT_INFO;
        public static final Name ACATS_IN_CONFIRM_NAME;
        public static final Name ACATS_IN_DTC_ENTRY;
        public static final Name ACATS_IN_EDIT_ASSET;
        public static final Name ACATS_IN_ELIGIBILITY_QUESTION;
        public static final Name ACATS_IN_GOLD_USER_MARGIN_UPGRADE;
        public static final Name ACATS_IN_IDENTIFY_PARTIAL_ASSETS;
        public static final Name ACATS_IN_INFO_REVIEW;
        public static final Name ACATS_IN_INTRO;
        public static final Name ACATS_IN_MARGIN_ENABLEMENT;
        public static final Name ACATS_IN_NAME_CHANGE;
        public static final Name ACATS_IN_NON_GOLD_UPGRADE;
        public static final Name ACATS_IN_OPTIONS_ENABLEMENT;
        public static final Name ACATS_IN_PARTIAL_ADD_INSTRUMENT;
        public static final Name ACATS_IN_PARTIAL_SEARCH_INSTRUMENT;
        public static final Name ACATS_IN_PARTIAL_TRANSFER;
        public static final Name ACATS_IN_PARTIAL_TRANSFER_ELIGIBLE;
        public static final Name ACATS_IN_PLAID_INTRO;
        public static final Name ACATS_IN_SELECT_BROKERAGE;
        public static final Name ACATS_IN_SUBMIT;
        public static final Name ACATS_IN_TERMS_AND_CONDITIONS;
        public static final Name ACATS_IN_TRANSFER_CONTENTS;
        public static final Name ACATS_IN_TRANSFER_INFO;
        public static final Name ACATS_IN_TRANSFER_UNSUPPORTED;
        public static final Name ACATS_IN_UNSUPPORTED_ASSETS;
        public static final Name ACATS_TRANSFER_INFO;
        public static final Name ACAT_HISTORY_DETAIL;
        public static final Name ACAT_RETRY;
        public static final Name ACCOUNT_CENTER;
        public static final Name ACCOUNT_DETAIL;
        public static final Name ACCOUNT_FUNDING_OPTIONS;
        public static final Name ACCOUNT_HISTORY;
        public static final Name ACCOUNT_OVERVIEW;
        public static final Name ACCOUNT_TYPE_SELECTION;
        public static final Name ACH_GRACE_PERIOD_CONFIRMATION;
        public static final Name ACTIVITY_FEED;

        @JvmField
        public static final ProtoAdapter<Name> ADAPTER;
        public static final Name ADD_INDICATOR;
        public static final Name ADD_INDICATOR_FORM;
        public static final Name ADR_FEE_DETAIL;
        public static final Name ADVANCED_ALERT_HUB;
        public static final Name ADVANCED_CHARTS_CRYPTO_ONBOARDING;
        public static final Name ADVANCED_CHARTS_CRYPTO_SEARCH;
        public static final Name ADVANCED_CHARTS_EQUITY_SEARCH;
        public static final Name ADVANCED_CHARTS_ONBOARDING;
        public static final Name ADVISORY_ACATS_PROMO;
        public static final Name ADVISORY_DASHBOARD;
        public static final Name ADVISORY_FUTURE_RETURNS;
        public static final Name ADVISORY_GOLD_PERKS;
        public static final Name ADVISORY_INSIGHT;
        public static final Name ADVISORY_INSIGHTS_HUB;
        public static final Name ADVISORY_ONBOARDING_AGREEMENTS;
        public static final Name ADVISORY_ONBOARDING_FEES_PROMO;
        public static final Name ADVISORY_ONBOARDING_FETCH_ACCOUNT;
        public static final Name ADVISORY_ONBOARDING_FIRST_DEPOSIT_CELEBRATION;
        public static final Name ADVISORY_ONBOARDING_FUNDING_METHODS;
        public static final Name ADVISORY_ONBOARDING_QUESTIONNAIRE_INTRO;
        public static final Name ADVISORY_ONBOARDING_QUESTIONNAIRE_REVIEW;
        public static final Name ADVISORY_ONBOARDING_SUBMIT_DEPOSIT;
        public static final Name ADVISORY_ONBOARDING_TRANSFER_NEXT_STEPS;
        public static final Name ADVISORY_PORTFOLIO_COMPUTE;
        public static final Name ADVISORY_PORTFOLIO_REVEAL_BREAKDOWN;
        public static final Name ADVISORY_PORTFOLIO_REVEAL_INFO_PAGE;
        public static final Name ADVISORY_PORTFOLIO_REVEAL_INTRO;
        public static final Name ADVISORY_PORTFOLIO_REVEAL_PROJECTION;
        public static final Name ADVISORY_PORTFOLIO_REVEAL_REGION_DETAILS;
        public static final Name ADVISORY_RETURNS_HUB;
        public static final Name ADVISORY_WITHDRAW_AND_CLOSE_ACCOUNT;
        public static final Name AGREEMENT;
        public static final Name ALERT_HUB_SETTING;
        public static final Name APAC_OPTION_ONBOARDING_CAR_QUESTIONNAIRE;
        public static final Name APAC_OPTION_ONBOARDING_SPLASH_L0;
        public static final Name API_TRADING_TERMS;
        public static final Name APP_MFA_ENROLLMENT_BACKUP_CODE;
        public static final Name APP_MFA_ENROLLMENT_CODE;
        public static final Name APP_MFA_ENROLLMENT_CONFIRMATION;
        public static final Name APP_MFA_ENROLLMENT_DOWNLOAD;
        public static final Name APP_MFA_ENROLLMENT_INTRODUCTION;
        public static final Name APP_PRIVACY_SETTINGS;
        public static final Name APY_BOOST_CELEBRATION;
        public static final Name ASSET_HOME;
        public static final Name BANKING;
        public static final Name BANK_TRANSFER;
        public static final Name BENEFICIARY_ACCOUNT_SELECTION;
        public static final Name BENEFICIARY_CHOOSE_EXISTING;
        public static final Name BENEFICIARY_DETAIL;
        public static final Name BENEFICIARY_DISCLOSURE;
        public static final Name BENEFICIARY_DOB_INPUT;
        public static final Name BENEFICIARY_EMAIL_INPUT;
        public static final Name BENEFICIARY_LEVEL;
        public static final Name BENEFICIARY_LIST;
        public static final Name BENEFICIARY_NAME_INPUT;
        public static final Name BENEFICIARY_RELATIONSHIP_INPUT;
        public static final Name BENEFICIARY_SPOUSAL_AGREEMENT;
        public static final Name BENEFICIARY_TRUSTEE_EMAIL_INPUT;
        public static final Name BENEFICIARY_TRUST_DATE_INPUT;
        public static final Name BENEFICIARY_TRUST_NAME_INPUT;
        public static final Name BENEFICIARY_TRUST_TAX_ID_INPUT;
        public static final Name BENEFICIARY_TYPE;
        public static final Name BENEFICIARY_VALUE_PROP;
        public static final Name BLACK_WIDOW_SPLASH_UPSELL;
        public static final Name BONFIRE_SETTINGS_PAGE;
        public static final Name BROKERAGE_CASH_ORDER_ENTRY;
        public static final Name BROKERAGE_STATEMENTS_LIST;
        public static final Name BROKERAGE_STATEMENT_VIEWER;
        public static final Name BROWSE_NEWSFEED;
        public static final Name BROWSE_NEWSFEED_THEATRE;
        public static final Name BROWSE_SEARCH;
        public static final Name BUYING_POWER;
        public static final Name BUYING_POWER_HUB;
        public static final Name C2C_REFERRAL_OFFER_RECEIVER_DETAILS_PAGE;
        public static final Name C2C_REFERRAL_OFFER_SENDER_DETAILS_PAGE;
        public static final Name C2C_REFERRAL_OFFER_SENDER_FRIENDS_LIST;
        public static final Name CALENDAR_DATE_PICKER;
        public static final Name CANCEL_CRYPTO_GIFT;
        public static final Name CASH;
        public static final Name CASH_BALANCES_DETAILS_PAGE;
        public static final Name CATPAY_LOGIN;
        public static final Name CATPAY_ORDER_AMOUNT_INPUT;
        public static final Name CATPAY_ORDER_REVIEW;
        public static final Name CC_ADDITIONAL_INFORMATION;
        public static final Name CC_APPLICATION_ACCOUNT_TERMS;
        public static final Name CC_APPLICATION_ADDRESS_CHALLENGE;
        public static final Name CC_APPLICATION_ADDRESS_ERROR;
        public static final Name CC_APPLICATION_ADDRESS_MANUAL;
        public static final Name CC_APPLICATION_ADDRESS_SEARCH;
        public static final Name CC_APPLICATION_ADDRESS_SUGGESTION;
        public static final Name CC_APPLICATION_CREDIT_FROZEN;
        public static final Name CC_APPLICATION_DOWNLOAD_APP;
        public static final Name CC_APPLICATION_FRAUD_ALERT;
        public static final Name CC_APPLICATION_FRAUD_ALERT_VERIFICATION_CODE;
        public static final Name CC_APPLICATION_FRAUD_ALERT_VERIFIED;
        public static final Name CC_APPLICATION_IDV_FAIL;
        public static final Name CC_APPLICATION_INCOME;
        public static final Name CC_APPLICATION_LANDING;
        public static final Name CC_APPLICATION_LIMIT_REVEAL;
        public static final Name CC_APPLICATION_LOADING;
        public static final Name CC_APPLICATION_PREMIUM_LIMITS;
        public static final Name CC_APPLICATION_PROFILE_INFO_EDIT;
        public static final Name CC_APPLICATION_PROFILE_INFO_REVIEW;
        public static final Name CC_APPLICATION_REJECTED;
        public static final Name CC_APPLICATION_RESIDENTIAL_ADDRESS;
        public static final Name CC_APPLICATION_REVIEW_NEEDED;
        public static final Name CC_APPLICATION_SHIPPING_ADDRESS;
        public static final Name CC_APPLICATION_SHIPPING_ETA;
        public static final Name CC_APPLICATION_SOLID_GOLD_DELAY;
        public static final Name CC_APPLICATION_SSN;
        public static final Name CC_APPLICATION_SSN_VERIFICATION;
        public static final Name CC_APPLICATION_SSN_VERIFIED;
        public static final Name CC_APPLICATION_TERMS;
        public static final Name CC_CHOOSE_BANK_ACCOUNT;
        public static final Name CC_ONBOARDING_LANDING;
        public static final Name CC_POST_ONBOARDING;
        public static final Name CC_WAITLIST_CONFIRMATION;
        public static final Name CC_WAITLIST_GOLD_UPSELL;
        public static final Name CC_WAITLIST_INTRO;
        public static final Name CC_WAITLIST_JOINED;
        public static final Name CC_WAITLIST_POST_SIGNUP_INTRO;
        public static final Name CC_WAITLIST_POST_SIGNUP_JOINED;
        public static final Name CHOOSE_LINKING_PAYMENT_METHOD;
        public static final Name CHOOSE_TRANSFER_FREQUENCY;
        public static final Name CHOOSE_WITHDRAWAL_ACCOUNT;
        public static final Name CLAIMED_SCREEN;
        public static final Name CLAIM_FRACTIONAL_REWARD_GENERIC_INFO;
        public static final Name CLAIM_REWARD;
        public static final Name CLAWBACK_GRACE_PERIOD_OPT_IN_SCREEN;
        public static final Name COMBO_ORDER_DETAIL;
        public static final Name COMPANY_FINANCIALS_ONBOARDING;
        public static final Name COMPANY_FINANCIALS_ONBOARDING_SEARCH;
        public static final Name CONFIRM_REGION;
        public static final Name CONTACTS_LIST;
        public static final Name CONTACT_SUPPORT;
        public static final Name CORTEX_CDP_DIGEST;
        public static final Name CORTEX_CDP_DIGEST_BREAKING;
        public static final Name CORTEX_CDP_DIGEST_FEEDBACK;
        public static final Name CORTEX_CDP_DIGEST_SOURCE_OVERFLOW;
        public static final Name CORTEX_DIGEST_ONBOARDING_AGREEMENT;
        public static final Name CORTEX_DIGEST_ONBOARDING_SEARCH;
        public static final Name CORTEX_DIGEST_ONBOARDING_SPLASH;
        public static final Name CORTEX_DIGEST_SOURCE_LIST;
        public static final Name CORTEX_SDP_DIGEST;
        public static final Name CORTEX_SDP_DIGEST_FEEDBACK;
        public static final Name CORTEX_SDP_DIGEST_SOURCE_OVERFLOW;
        public static final Name COUNTRY_UNAVAILABLE_ERROR;
        public static final Name CREATE_ACCOUNT_CONGRATULATIONS;
        public static final Name CREATE_CRYPTO_GIFT_LOADING;
        public static final Name CREATE_GRYPTO_GIFT_ERROR_DIALOG;
        public static final Name CREATE_MAX_TRANSFER;
        public static final Name CREATE_QUEUED_DEPOSIT;
        public static final Name CREATE_RETIREMENT_CONTRIBUTION;
        public static final Name CREATE_TRANSFER;
        public static final Name CREATE_TRANSFER_V2;
        public static final Name CRYPTO_ADVANCED_CHARTS;
        public static final Name CRYPTO_ADVANCED_CHART_TECHNICAL_INDICATOR_MANAGER;
        public static final Name CRYPTO_DEPOSIT_INCENTIVE_ERROR;
        public static final Name CRYPTO_DETAIL_PAGE;
        public static final Name CRYPTO_DETAIL_PAGE_MINI;
        public static final Name CRYPTO_EXPLORE_LEAF;
        public static final Name CRYPTO_GIFT_DASHBOARD;
        public static final Name CRYPTO_GIFT_EDIT;
        public static final Name CRYPTO_GIFT_ONBOARDING;
        public static final Name CRYPTO_GIFT_PURCHASE_CONFIRMATION;
        public static final Name CRYPTO_GIFT_PURCHASE_DETAILS;
        public static final Name CRYPTO_GIFT_RECEIVE_CONFIRMATION;
        public static final Name CRYPTO_GIFT_RECEIVE_DETAILS;
        public static final Name CRYPTO_HOME_TAB;
        public static final Name CRYPTO_LEARN_AND_EARN;
        public static final Name CRYPTO_MAIN_NEWSFEED;
        public static final Name CRYPTO_NEWSFEED;
        public static final Name CRYPTO_ORDER_ENTRY;
        public static final Name CRYPTO_ORDER_HISTORY_DETAIL;
        public static final Name CRYPTO_ORDER_INFORMATION;
        public static final Name CRYPTO_ORDER_RECEIPT;
        public static final Name CRYPTO_ORDER_REVIEW;
        public static final Name CRYPTO_ORDER_SELECT_PAYMENT_METHOD;
        public static final Name CRYPTO_ORDER_SET_LIMIT_PRICE;
        public static final Name CRYPTO_ORDER_SET_STOP_PRICE;
        public static final Name CRYPTO_ORDER_SET_TIME_IN_FORCE;
        public static final Name CRYPTO_QUICK_TRADE_SHEET;
        public static final Name CRYPTO_REFERRAL_DETAIL;
        public static final Name CRYPTO_SELECT_ORDER_KIND_PAGE;
        public static final Name CRYPTO_SETTINGS;
        public static final Name CRYPTO_STAKING_AMOUNT_ENTRY;
        public static final Name CRYPTO_STAKING_HISTORY_DETAIL;
        public static final Name CRYPTO_STAKING_HUB;
        public static final Name CRYPTO_STAKING_INTRO;
        public static final Name CRYPTO_STAKING_ORDER_CONFIRMATION;
        public static final Name CRYPTO_STAKING_ORDER_REVIEW;
        public static final Name CRYPTO_STAKING_SUMMARY;
        public static final Name CRYPTO_STATEMENTS_LIST;
        public static final Name CRYPTO_STATEMENT_VIEWER;
        public static final Name CRYPTO_TAX_LOTS_PRIMER;
        public static final Name CRYPTO_TRADING_COIN_LIST;
        public static final Name CRYPTO_TRADING_LADDER;
        public static final Name CRYPTO_TRANSFER_ADD_SAVED_ADDRESS;
        public static final Name CRYPTO_TRANSFER_ADD_SAVED_ADDRESS_QR_SCANNER;
        public static final Name CRYPTO_TRANSFER_ALLOWLIST_ENABLED_PRIMER;
        public static final Name CRYPTO_TRANSFER_COST_BASIS_DETAIL;
        public static final Name CRYPTO_TRANSFER_COST_BASIS_HUB;
        public static final Name CRYPTO_TRANSFER_COST_BASIS_INPUT;
        public static final Name CRYPTO_TRANSFER_ENROLLMENT_ADDITIONAL_STEPS_REQUIRED;
        public static final Name CRYPTO_TRANSFER_ENROLLMENT_AGREEMENT;
        public static final Name CRYPTO_TRANSFER_ENROLLMENT_COMPLETED;
        public static final Name CRYPTO_TRANSFER_ENROLLMENT_FAILED;
        public static final Name CRYPTO_TRANSFER_ENROLLMENT_FRAUD_INFO;
        public static final Name CRYPTO_TRANSFER_ENROLLMENT_PENDING;
        public static final Name CRYPTO_TRANSFER_ENROLLMENT_PRODUCT_INTRO;
        public static final Name CRYPTO_TRANSFER_ENROLLMENT_SECURITY_CHECK;
        public static final Name CRYPTO_TRANSFER_ENROLLMENT_STEPS;
        public static final Name CRYPTO_TRANSFER_HISTORY_DETAIL;
        public static final Name CRYPTO_TRANSFER_LIMITS;
        public static final Name CRYPTO_TRANSFER_MANAGE_SAVED_ADDRESSES;
        public static final Name CRYPTO_TRANSFER_RECEIVE;
        public static final Name CRYPTO_TRANSFER_RECEIVE_CONTACT_SUPPORT;
        public static final Name CRYPTO_TRANSFER_RECEIVE_EXCHANGE;
        public static final Name CRYPTO_TRANSFER_RECEIVE_FAILED;
        public static final Name CRYPTO_TRANSFER_RECEIVE_PARTY_SELECTION;
        public static final Name CRYPTO_TRANSFER_RECEIVE_PENDING_REVIEW;
        public static final Name CRYPTO_TRANSFER_RECEIVE_WALLET_SELECTION;
        public static final Name CRYPTO_TRANSFER_SEARCH;
        public static final Name CRYPTO_TRANSFER_SEND_ADDRESS;
        public static final Name CRYPTO_TRANSFER_SEND_ADDRESS_ALLOWLIST;
        public static final Name CRYPTO_TRANSFER_SEND_AMOUNT;
        public static final Name CRYPTO_TRANSFER_SEND_CONFIRMATION;
        public static final Name CRYPTO_TRANSFER_SEND_EXCHANGE;
        public static final Name CRYPTO_TRANSFER_SEND_EXCHANGE_SEARCH;
        public static final Name CRYPTO_TRANSFER_SEND_FAILED;
        public static final Name CRYPTO_TRANSFER_SEND_MEMO;
        public static final Name CRYPTO_TRANSFER_SEND_NETWORK;
        public static final Name CRYPTO_TRANSFER_SEND_PARTY_SELECTION;
        public static final Name CRYPTO_TRANSFER_SEND_PENDING_REVIEW;
        public static final Name CRYPTO_TRANSFER_SEND_QR_SCANNER;
        public static final Name CRYPTO_TRANSFER_SEND_RECEIVER_DOB;
        public static final Name CRYPTO_TRANSFER_SEND_RECEIVER_NAME;
        public static final Name CRYPTO_TRANSFER_SEND_REVIEW;
        public static final Name CRYPTO_TRANSFER_SEND_WALLET_SELECTION;
        public static final Name CRYPTO_VALUE_PAGE;
        public static final Name CRYPTO_VOLUME_TIER_ENROLLMENT_CONFIRMATION;
        public static final Name CRYPTO_VOLUME_TIER_EXPLAINER;
        public static final Name CRYPTO_VOLUME_TIER_HUB;
        public static final Name CRYPTO_VOLUME_TIER_INELIGIBLE;
        public static final Name CRYPTO_VOLUME_TIER_PRIMER;

        @Deprecated
        public static final Name CRYTPO_NEWSFEED;
        public static final Name CUSTOMER_ACCOUNT_REVIEW_RESULT_FAIL;
        public static final Name CUSTOMER_ACCOUNT_REVIEW_RESULT_PASS;
        public static final Name CUSTOMER_ACCOUNT_REVIEW_SPLASH;
        public static final Name CUSTOM_ACCOUNT_ACTIVITY_EXPORTER_LIST;
        public static final Name CX_ACCOUNT_DETAIL_PAGE;
        public static final Name CX_APPOINTMENT_ALREADY_BOOKED;
        public static final Name CX_APPOINTMENT_CANCEL_CONFIRMATION;
        public static final Name CX_APPOINTMENT_CONFIRMATION;
        public static final Name CX_APPOINTMENT_DETAILS;
        public static final Name CX_APPOINTMENT_NOTES_ENTRY;
        public static final Name CX_APPOINTMENT_REVIEW_DETAILS;
        public static final Name CX_APPOINTMENT_TIME_SELECTION;
        public static final Name CX_CALL_DESCRIPTION;
        public static final Name CX_CALL_SCHEDULE;
        public static final Name CX_CALL_STATUS;
        public static final Name CX_CHANNEL_SELECTION;
        public static final Name CX_CHATBOT_PAGE;
        public static final Name CX_CHAT_ERROR_SCREEN;
        public static final Name CX_CHAT_THREAD;
        public static final Name CX_CONCIERGE_FAQ;
        public static final Name CX_CONCIERGE_INFO;
        public static final Name CX_CONCIERGE_ONBOARDING;
        public static final Name CX_CONCIERGE_PLUS_ESTATE;
        public static final Name CX_CONCIERGE_PLUS_ESTATE_ONBOARDING;
        public static final Name CX_CONCIERGE_PLUS_HUB;
        public static final Name CX_CONCIERGE_PLUS_LANDING;
        public static final Name CX_CONCIERGE_PLUS_ONBOARDING;
        public static final Name CX_CONCIERGE_PLUS_TAX;
        public static final Name CX_CONCIERGE_PLUS_TAX_ONBOARDING;
        public static final Name CX_CONTACT_EMAIL_PAGE;
        public static final Name CX_CONTACT_SECRET_CODE_PAGE;
        public static final Name CX_CONTACT_SELFIE_VERIFICATION_FAILURE_PAGE;
        public static final Name CX_CONTACT_SELFIE_VERIFICATION_INITIATE_PAGE;
        public static final Name CX_CONTACT_SELFIE_VERIFICATION_WAIT_PAGE;
        public static final Name CX_CONTACT_VOICE_ENROLLMENT_CONSENT_PAGE;
        public static final Name CX_CONTACT_VOICE_ENROLLMENT_PAGE;
        public static final Name CX_CONTACT_VOICE_VERIFICATION_CONSENT_PAGE;
        public static final Name CX_CONTACT_VOICE_VERIFICATION_PAGE;
        public static final Name CX_EDIT_CALL_SCHEDULE;
        public static final Name CX_MULTIPLE_ACCOUNT_SUPPORT_PAGE;
        public static final Name CX_REVIEW_CALL_DETAILS;
        public static final Name CX_SUPPORT_CASES;
        public static final Name CX_SUPPORT_CHAT_THREAD;
        public static final Name CX_SUPPORT_HUB;
        public static final Name CX_SURVEY_COMPLETE_PAGE;
        public static final Name CX_SURVEY_COMPLETE_TOAST;
        public static final Name CX_SURVEY_ERROR_TOAST;
        public static final Name CX_SURVEY_FREE_FORM_QUESTION;
        public static final Name CX_SURVEY_MULTIPLE_CHOICE_QUESTION;
        public static final Name CX_SURVEY_RATING_QUESTION;
        public static final Name CX_SURVEY_YES_NO_QUESTION;
        public static final Name CX_WEB_BACK_ERROR;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Name DAY_TRADE_CALL_RESOLVED;
        public static final Name DAY_TRADE_SETTINGS;
        public static final Name DD_ACCOUNT_INFO;
        public static final Name DD_CONFIRM_EMPLOYER;
        public static final Name DD_CONGRATULATIONS;
        public static final Name DD_EDIT_DOLLAR_AMOUNT;
        public static final Name DD_EDIT_PERCENTAGE_AMOUNT;
        public static final Name DD_INTRO;
        public static final Name DD_PARTIAL_PAYCHECK;
        public static final Name DD_PREFILLED_INTRO;
        public static final Name DD_SETUP_CHOICE;
        public static final Name DD_SIGNATURE;
        public static final Name DD_SIGNED_FORM;
        public static final Name DD_SWITCHER_AUTHENTICATION;
        public static final Name DD_SWITCHER_AUTHENTICATION_HELP;
        public static final Name DD_SWITCHER_CONFIRMATION;
        public static final Name DD_SWITCHER_OPTIONS;
        public static final Name DD_SWITCHER_OPTION_FIXED;
        public static final Name DD_SWITCHER_OPTION_PERCENT;
        public static final Name DD_SWITCHER_SEARCH_COMPANY;
        public static final Name DD_SWITCHER_SEARCH_PAYROLL;
        public static final Name DD_UNSIGNED_FORM;
        public static final Name DD_UPDATE_EMPLOYER;
        public static final Name DEBIT_CARD_LINKING_CONFIRMATION;
        public static final Name DEBIT_CARD_LINKING_LOADING;
        public static final Name DEBIT_CARD_LINKING_SPLASH_SCREEN;
        public static final Name DEBIT_CARD_NAME_INPUT;
        public static final Name DEBIT_CARD_NUMBERS_INPUT;
        public static final Name DEPOSIT_IN_PROGRESS;
        public static final Name DEVICE_APPROVAL;
        public static final Name DEVICE_APPROVAL_BLOCKED;
        public static final Name DEVICE_APPROVAL_ENROLL;
        public static final Name DEVICE_APPROVAL_HANDLING;
        public static final Name DEVICE_APPROVAL_HANDLING_BLOCKED;
        public static final Name DEVICE_APPROVAL_LOGIN;
        public static final Name DEVICE_APPROVAL_LOGIN_APPROVED;
        public static final Name DEVICE_APPROVAL_LOGIN_BLOCKED;
        public static final Name DEVICE_APPROVAL_WAITING;
        public static final Name DEVICE_APPROVAL_WAITING_BLOCKED;
        public static final Name DEVICE_SECURITY_SETTINGS;
        public static final Name DIRECT_DEPOSIT_DISCLOSURES;
        public static final Name DIRECT_DEPOSIT_HISTORY;
        public static final Name DIRECT_DEPOSIT_HUB;
        public static final Name DIRECT_DEPOSIT_POST_TRANSFER_UPSELL;
        public static final Name DIRECT_DEPOSIT_SETUP_INFO;
        public static final Name DIRECT_DEPOSIT_UPSELL;
        public static final Name DISCLOSURE;
        public static final Name DISPUTES_AMOUNT_ENTRY_QUESTION;
        public static final Name DISPUTES_CONFIRMATION;
        public static final Name DISPUTES_DATE_ENTRY_QUESTION;
        public static final Name DISPUTES_FREE_RESPONSE_QUESTION;
        public static final Name DISPUTES_FREE_RESPONSE_WITH_MEDIA_UPLOAD;
        public static final Name DISPUTES_MEDIA_UPLOAD_QUESTION;
        public static final Name DISPUTES_MULTIPLE_CHOICE_QUESTION;
        public static final Name DISPUTES_REASON_SELECTION;
        public static final Name DISPUTES_REVIEW;
        public static final Name DISPUTES_SPLASH_PAGE;
        public static final Name DISPUTES_TRANSACTION_REVIEW;
        public static final Name DISPUTES_TRANSACTION_SELECTION;
        public static final Name DISTRIBUTE_INVEST_FLOW;
        public static final Name DOLLAR_BASED_ORDER_ENTRY;
        public static final Name DOWNLOAD_APPS;
        public static final Name EARLY_PAY_ENROLLMENT_SUCCESS;
        public static final Name EARLY_PAY_LEARN_MORE;
        public static final Name EARLY_PAY_ONBOARDING_CONFIRMATION;
        public static final Name EARLY_PAY_TRANSFER_DETAILS;
        public static final Name EDIT_ACCOUNT_NICKNAME;
        public static final Name EDIT_ACCOUNT_NICKNAME_LIST;
        public static final Name EDIT_IRA_TAX_WITHHOLDINGS;
        public static final Name EDUCATIONAL_PROPS_EXPLAIN;
        public static final Name EDUCATION_HOME;
        public static final Name EDUCATION_TOUR;
        public static final Name EMAIL_PREFERENCES_PAGE;
        public static final Name EMAIL_UNSUBSCRIBE_PAGE;
        public static final Name EMAIL_UPDATE;
        public static final Name EMAIL_UPDATE_SUCCESS;
        public static final Name EMAIL_UPDATE_VERIFICATION;
        public static final Name EMBEDDED_ARTICLE_PAGE;
        public static final Name EMBEDDED_WEBVIEW;
        public static final Name ENABLE_NOTIFICATIONS_PROMPT;
        public static final Name ENOKI_CONTRIBUTION_CELEBRATION;
        public static final Name EOY_GIVEAWAY_2024;
        public static final Name EOY_GIVEAWAY_2025;
        public static final Name EQUITIES_SUBZERO_MARKETING;
        public static final Name EQUITIES_SUBZERO_ONBOARDING;
        public static final Name EQUITIES_TRADING_LADDER;
        public static final Name EQUITY_24H_MARKET_REMINDER;
        public static final Name EQUITY_ADVANCED_ALERTS_DISCLOSURE;
        public static final Name EQUITY_ADVANCED_CHARTS;
        public static final Name EQUITY_ADVANCED_CHART_TECHNICAL_INDICATOR_MANAGER;
        public static final Name EQUITY_ENTER_LIMIT_PRICE_PAGE;
        public static final Name EQUITY_ENTER_STOP_PRICE_PAGE;
        public static final Name EQUITY_ENTER_TRAIL_AMOUNT_PAGE;
        public static final Name EQUITY_ORDER_CHECK_ALERT;
        public static final Name EQUITY_ORDER_DETAIL;
        public static final Name EQUITY_ORDER_ENTRY;
        public static final Name EQUITY_ORDER_RECEIPT;
        public static final Name EQUITY_ORDER_REVIEW;
        public static final Name EQUITY_SELECT_ORDER_KIND_MINI_MENU_PAGE;
        public static final Name EQUITY_SELECT_ORDER_KIND_PAGE;
        public static final Name EQUITY_SET_TIME_IN_FORCE_PAGE;
        public static final Name EQUITY_SET_TRADING_HOURS_PAGE;
        public static final Name EQUITY_TRADING_SESSION_CHANGED_PAGE;
        public static final Name ERROR_SCREEN;
        public static final Name EU_CRYPTO_COUNTDOWN_PAGE;
        public static final Name EU_CRYPTO_REWARD_GRANTED;
        public static final Name EVENT_CONTRACTS_BRACKET_PAGE;
        public static final Name EVENT_CONTRACT_ATTESTATION;
        public static final Name EVENT_CONTRACT_DETAIL_PAGE;
        public static final Name EVENT_CONTRACT_HUB;
        public static final Name EVENT_CONTRACT_HUB_V2;
        public static final Name EVENT_CONTRACT_ORDER_FORM;
        public static final Name EVENT_CONTRACT_ORDER_FORM_RECEIPT;
        public static final Name EVENT_CONTRACT_ORDER_FORM_REVIEW;
        public static final Name EVENT_CONTRACT_ORDER_HISTORY_DETAIL_SCREEN;
        public static final Name EVENT_CONTRACT_SELECTOR_SCREEN;
        public static final Name EXPANDED_LIST_CAROUSEL;
        public static final Name EXTRA_CASH_SETUP_ACCOUNT_SELECTION;
        public static final Name EXTRA_CASH_SETUP_REVIEW;
        public static final Name EXTRA_CASH_SETUP_SET_AMOUNT;
        public static final Name FEE_TIER_PUSH_NOTIF_UPSELL;
        public static final Name FELIX_ASSET_BREAKDOWN;
        public static final Name FELIX_INTRODUCTION;
        public static final Name FELIX_INVESTING_CULTURE;
        public static final Name FELIX_MANIFESTO;
        public static final Name FELIX_OUTRO;

        @Deprecated
        public static final Name FELIX_OUTRO_ANIMATION;
        public static final Name FELIX_TIMELINE;
        public static final Name FELIX_USERBASE_SIZE;
        public static final Name FELIX_USER_ARCHETYPE;
        public static final Name FILE_BROWSER;
        public static final Name FUNCTIONAL_DEPOSIT_UPSELL;
        public static final Name FUTURES_APPLICATION_ACCOUNT_APPROVED;
        public static final Name FUTURES_APPLICATION_ACCOUNT_REJECTED;
        public static final Name FUTURES_APPLICATION_ACCOUNT_REVIEW_REQUIRED;
        public static final Name FUTURES_ASSET_HOME;
        public static final Name FUTURES_CASH_CORRECTION_HISTORY_DETAIL_SCREEN;
        public static final Name FUTURES_DETAIL_SCREEN;
        public static final Name FUTURES_EXECUTION_HISTORY_DETAIL_SCREEN;
        public static final Name FUTURES_LADDER_FTUX;
        public static final Name FUTURES_LADDER_FUTX;
        public static final Name FUTURES_LADDER_SCREEN;
        public static final Name FUTURES_ONBOARDING_AGREEMENTS_AND_DISCLOSURES_SCREEN;
        public static final Name FUTURES_ONBOARDING_ARBITRATION_AGREEMENT;
        public static final Name FUTURES_ONBOARDING_ELIGIBILITY_CHECK;
        public static final Name FUTURES_ONBOARDING_REVIEW_INVESTOR_PROFILE_SCREEN;
        public static final Name FUTURES_ORDER_CONFIRMATION_SCREEN;
        public static final Name FUTURES_ORDER_FORM_REVIEW_SCREEN;
        public static final Name FUTURES_ORDER_FORM_SCREEN;
        public static final Name FUTURES_ORDER_HISTORY_DETAIL_SCREEN;
        public static final Name FUTURES_ORDER_PLACEMENT_LOADING_SCREEN;
        public static final Name FUTURES_VALUE_PROPS_SCREEN;
        public static final Name FX_SWITCHER_FTUX;
        public static final Name GAINS_AND_LOSSES;
        public static final Name GAME_DETAIL_PAGE;
        public static final Name GENERATE_CUSTOM_ACCOUNT_ACTIVITY_REPORT;
        public static final Name GOLD_AGREEMENT;
        public static final Name GOLD_AGREEMENTS_LIST;
        public static final Name GOLD_AND_MARGIN_VALUE_PROPS;
        public static final Name GOLD_BACKUP_PAYMENT_METHOD;
        public static final Name GOLD_BILLING_PAYMENT_PREFERENCE;
        public static final Name GOLD_CELEBRATION;
        public static final Name GOLD_DEPOSIT_BONUS_ADJUSTMENT_DETAIL;
        public static final Name GOLD_DEPOSIT_BONUS_CELEBRATION;
        public static final Name GOLD_DEPOSIT_BONUS_CELEBRATION_TIMELINE;
        public static final Name GOLD_DEPOSIT_BONUS_PAYOUT_DETAIL;
        public static final Name GOLD_DEPOSIT_BONUS_UPCOMING_PAYOUTS;
        public static final Name GOLD_DEPOSIT_BOOST_HUB;
        public static final Name GOLD_DEPOSIT_UPSELL;
        public static final Name GOLD_DOWNGRADE_CONFIRMATION;
        public static final Name GOLD_EVENT_LIVE_2025;
        public static final Name GOLD_EXTRA_AGREEMENTS;
        public static final Name GOLD_HUB;
        public static final Name GOLD_ONBOARDING_AGREEMENTS;
        public static final Name GOLD_ONBOARDING_ERROR;
        public static final Name GOLD_ONBOARDING_LANDING;
        public static final Name GOLD_ONBOARDING_MARGIN_AGREEMENTS;
        public static final Name GOLD_ONBOARDING_MARGIN_AVAILABLE_MARGIN;
        public static final Name GOLD_ONBOARDING_MARGIN_CHECK;
        public static final Name GOLD_ONBOARDING_MARGIN_INFO;
        public static final Name GOLD_ONBOARDING_OLD_LANDING;
        public static final Name GOLD_ONBOARDING_OLD_SUCCESS;
        public static final Name GOLD_ONBOARDING_SUCCESS;
        public static final Name GOLD_ONBOARDING_SWEEP_AGREEMENTS;
        public static final Name GOLD_PLAN_SELECTION;
        public static final Name GOLD_PRIMARY_PAYMENT_METHOD;
        public static final Name GOLD_REFERRAL_PROGRAM;
        public static final Name GOLD_SAGE_APPLICATION;
        public static final Name GOLD_SAGE_RATE;
        public static final Name GOLD_SAGE_SPLASH;
        public static final Name GOLD_SAGE_START_APPLICATION;
        public static final Name GOLD_SAGE_TIMELINE;
        public static final Name GOLD_STATUS_NCW_AUTH;
        public static final Name GOLD_SUGGESTED_ACTION;
        public static final Name GOLD_SWITCH_PLANS_CONFIRMATION;
        public static final Name GOLD_TAB;
        public static final Name GOLD_UPGRADE_SUCCESS;
        public static final Name GOLD_VALUE_PROPS;
        public static final Name GOLD_YG_BACKUP_BILLING_SURFACE;
        public static final Name GROWTH_DEPOSIT_MATCH_OFFER;
        public static final Name HOME;
        public static final Name HOME_PORTFOLIO_TABLE;
        public static final Name HOME_QUICK_NAV;
        public static final Name I18N_ACCOUNT_INFO;
        public static final Name I18N_ACCOUNT_SELECTION;
        public static final Name I18N_CURRENCY_SELECTION;
        public static final Name I18N_MEMO;
        public static final Name I18N_METHOD_SELECTION;
        public static final Name I18N_POST_DEPOSIT;
        public static final Name I18N_TRANSFER_ACCOUNT_INFO;
        public static final Name I18N_TRANSFER_ACCOUNT_SELECTION;
        public static final Name I18N_TRANSFER_CREATE;
        public static final Name I18N_TRANSFER_CURRENCY_SELECTION;
        public static final Name I18N_TRANSFER_MEMO;
        public static final Name I18N_TRANSFER_METHOD_SELECTION;
        public static final Name I18N_TRANSFER_REVIEW;
        public static final Name IAC_BOTTOM_SHEET;
        public static final Name IAV_DEVICE_APPROVAL_SILENT_RESULT;
        public static final Name IAV_DEVICE_APPROVAL_SILENT_WAITING;
        public static final Name IAV_SELECT_BANK_ACCOUNT;
        public static final Name IDENTITY;
        public static final Name IDENTITY_VERIFICATION_SPLASH;
        public static final Name INDEX_DETAIL;
        public static final Name INDICATOR_ALERT_EDITOR;
        public static final Name INDICATOR_SELECTOR;
        public static final Name INSTANT_DEPOSIT_EDUCATION;
        public static final Name INSTANT_DEPOSIT_OUTCOME;
        public static final Name INTEREST_ENROLLMENT;
        public static final Name INTEREST_SETTINGS;
        public static final Name INTERNAL_ASSET_TRANSFER_ACCOUNT_SELECTION;
        public static final Name INTERNAL_ASSET_TRANSFER_ACCOUNT_SELECTION_LIST;
        public static final Name INTERNAL_ASSET_TRANSFER_AGREEMENT;
        public static final Name INTERNAL_ASSET_TRANSFER_ASSET_LIST;
        public static final Name INTERNAL_ASSET_TRANSFER_ASSET_SELECTION;
        public static final Name INTERNAL_ASSET_TRANSFER_CONFIRMATION;
        public static final Name INTERNAL_ASSET_TRANSFER_DETAILS;
        public static final Name INTERNAL_ASSET_TRANSFER_EDIT_CASH;
        public static final Name INTERNAL_ASSET_TRANSFER_EDIT_EQUITY;
        public static final Name INTERNAL_ASSET_TRANSFER_EDIT_MARGIN;
        public static final Name INTERNAL_ASSET_TRANSFER_INTRO;
        public static final Name INTERNAL_ASSET_TRANSFER_REVIEW;
        public static final Name INTERNAL_ASSET_TRANSFER_TAX_IMPLICATIONS;
        public static final Name INTERNAL_ASSET_TRANSFER_TRANSFER_TYPE;
        public static final Name INTERNAL_TRANSFER_SELECTION;
        public static final Name INVESTING_MONITOR;
        public static final Name INVESTING_SETTINGS;
        public static final Name INVESTMENTS_TRACKER_ACCOUNT_DETAILS;
        public static final Name INVESTMENTS_TRACKER_ACCOUNT_LINK_AGREEMENT;
        public static final Name INVESTMENTS_TRACKER_ACCOUNT_REMOVAL_SHEET;
        public static final Name INVESTMENTS_TRACKER_ALLOCATIONS_VIEW;
        public static final Name INVESTMENTS_TRACKER_FTUX_ADDITIONAL_INFO;
        public static final Name INVESTMENTS_TRACKER_FTUX_ASSET_ALLOCATION;
        public static final Name INVESTMENTS_TRACKER_FTUX_TRACK_ALL_ASSETS;
        public static final Name INVESTMENTS_TRACKER_PERFORMANCE_VIEW;
        public static final Name INVESTMENTS_TRACKER_REMOVAL_CONFIRMATION_SHEET;
        public static final Name INVESTMENTS_TRACKER_SETTINGS;
        public static final Name INVESTMENTS_TRACKER_TOOLTIP_SHEET_ADD_ACCOUNT;
        public static final Name INVESTOR_PROFILE;
        public static final Name INVESTOR_PROFILE_COMPLETE;
        public static final Name INVESTOR_PROFILE_INTRO;
        public static final Name INVESTOR_PROFILE_QUESTION;
        public static final Name INVESTOR_PROFILE_REVIEW;
        public static final Name INVEST_FLOW_BUDGET_ALLOCATION;
        public static final Name INVEST_FLOW_DISCOVER;
        public static final Name INVEST_FLOW_FREQUENCY;
        public static final Name INVEST_FLOW_MOO;
        public static final Name INVEST_FLOW_ORDER_ENTRY;
        public static final Name INVEST_FLOW_ORDER_PREVIEW;
        public static final Name INVEST_FLOW_ORDER_RECEIPT;
        public static final Name INVEST_FLOW_ORDER_REVIEW;
        public static final Name INVEST_FLOW_SEARCH;
        public static final Name IN_APP_VERIFICATION;
        public static final Name IPOA_ALLOCATED_RESULT;
        public static final Name IPOA_ANNOUNCEMENT;
        public static final Name IPOA_COB_FOLLOW_UP;
        public static final Name IPOA_ENROLLMENT;
        public static final Name IPOA_LEARNING_HUB;
        public static final Name IPOA_LIST;
        public static final Name IPOA_NOT_ALLOCATED;
        public static final Name IPOA_NOT_ALLOCATED_RESULT;
        public static final Name IPOA_SUMMARY;
        public static final Name IRA_DISTRIBUTION_FAQ;
        public static final Name IRA_MANAGEMENT_STYLE_SELECTION;
        public static final Name IRA_SYP_INTRO;
        public static final Name IRR_DELETE;
        public static final Name IRR_DELETE_CONFIRMATION;
        public static final Name IRR_DELETE_IN_PROGRESS;
        public static final Name IRR_DOWNLOAD;
        public static final Name IRR_REQUEST;
        public static final Name IRR_REQUEST_CONFIRMATION;
        public static final Name IRR_REQUEST_IN_PROGRESS;
        public static final Name ISA_CASH_TRANSFER_ACCOUNT_NUMBER;
        public static final Name ISA_CASH_TRANSFER_CONFIRM_DETAILS;
        public static final Name ISA_CASH_TRANSFER_CURRENT_TAX_YEAR;
        public static final Name ISA_CASH_TRANSFER_DECLARATION;
        public static final Name ISA_CASH_TRANSFER_ENTER_AMOUNT;
        public static final Name ISA_CASH_TRANSFER_INTRO;
        public static final Name ISA_CASH_TRANSFER_MANUAL_PROVIDER;
        public static final Name ISA_CASH_TRANSFER_ONLY_CASH_INFO;
        public static final Name ISA_CASH_TRANSFER_REQUEST_RECEIVED;
        public static final Name ISA_CASH_TRANSFER_REVIEW_AND_SUBMIT;
        public static final Name ISA_CASH_TRANSFER_SELECT_AMOUNT;
        public static final Name ISA_CASH_TRANSFER_SELECT_PROVIDER;
        public static final Name ISA_CASH_TRANSFER_SELECT_TYPE;
        public static final Name ISA_CASH_TRANSFER_SORT_CODE;
        public static final Name ISA_CASH_TRANSFER_UPDATE_YOUR_DETAILS;
        public static final Name JOINT_ACCOUNT_CONFIRM_SECONDARY;
        public static final Name JOINT_ACCOUNT_FUNDING_METHODS;
        public static final Name JOINT_ACCOUNT_HELP_CO_OWNER;
        public static final Name JOINT_ACCOUNT_HOME;
        public static final Name JOINT_ACCOUNT_INVITE_SENT_CELEBRATION;
        public static final Name JOINT_ACCOUNT_PRIMARY_CELEBRATION;
        public static final Name JOINT_ACCOUNT_PRIMARY_INTRO;
        public static final Name JOINT_ACCOUNT_SECONDARY_CELEBRATION;
        public static final Name JOINT_ACCOUNT_SECONDARY_INTRO;
        public static final Name JOINT_ACCOUNT_SEND_INVITE;
        public static final Name JOINT_POST_CREATION;
        public static final Name KBA_VERIFICATION;
        public static final Name L2E_ONBOARDING;
        public static final Name L2E_TRY_AGAIN;
        public static final Name LADDER_MARKETING;
        public static final Name LADDER_MARKETING_SEARCH;
        public static final Name LEARNING_LESSON;
        public static final Name LEARNING_LESSON_SELECTOR;
        public static final Name LEARNING_LESSON_V2;
        public static final Name LEARNING_LESSON_V3;
        public static final Name LEVEL_TWO_MARKET_DATA;
        public static final Name LIMIT_HUB;
        public static final Name LINK_APPLE_PAY_CONFIRMATION;
        public static final Name LINK_APPLE_PAY_ERROR;
        public static final Name LINK_APPLE_PAY_INTRO;

        @Deprecated
        public static final Name LIST_DETAIL_PAGE;
        public static final Name LIST_DISCOVERY_HUB;
        public static final Name LIVE_TRIVIA;
        public static final Name LOGGED_IN_IDENTITY_VERIFICATION_WAIT;
        public static final Name LOGIN;
        public static final Name MANAGEMENT_TYPE_SELECTION;
        public static final Name MANUAL_APP_MFA_ENROLLMENT_INTRODUCTION;
        public static final Name MANUAL_APP_MFA_ENROLLMENT_KEY;
        public static final Name MARGIN_ACATS_LANDING;
        public static final Name MARGIN_BATCH_SELL_STOCK;
        public static final Name MARGIN_CALL_MAINTENANCE;
        public static final Name MARGIN_CALL_MAINTENANCE_RESOLVED;
        public static final Name MARGIN_CALL_V2_CLOSE_POSITIONS_SUMMARY;
        public static final Name MARGIN_CALL_V2_MARKET_ORDER;
        public static final Name MARGIN_CALL_WARN;
        public static final Name MARGIN_CALL_WIRE_UPSELL;
        public static final Name MARGIN_LIMIT_EDIT;
        public static final Name MARGIN_MAINTENANCE_TABLE;
        public static final Name MARGIN_MAINTENANCE_TABLE_ON_MARGIN_CALL;
        public static final Name MARGIN_REQUIREMENT_TABLE;
        public static final Name MARGIN_STATUS_DETAIL;
        public static final Name MARGIN_UPGRADE_AGREEMENT;
        public static final Name MARGIN_UPGRADE_CONFIRMATION;
        public static final Name MARGIN_UPGRADE_EDUCATION;
        public static final Name MARGIN_UPGRADE_ELIGIBILITY;
        public static final Name MARGIN_UPGRADE_ERROR;
        public static final Name MARGIN_UPGRADE_GOLD_AGREEMENT;
        public static final Name MARGIN_UPGRADE_GOLD_CONFIRMATION;
        public static final Name MARGIN_UPGRADE_GOLD_ONLY_CONFIRMATION;
        public static final Name MARGIN_UPGRADE_GOLD_UPSELL;
        public static final Name MARGIN_UPGRADE_INTEREST_RATE_SELECTION;
        public static final Name MARGIN_UPGRADE_MARGIN_LIMIT_SET;
        public static final Name MARGIN_UPGRADE_MARGIN_WITHDRAWAL_SET;
        public static final Name MARGIN_UPGRADE_NOT_ELIGIBLE;
        public static final Name MARGIN_UPGRADE_REVIEW;
        public static final Name MARGIN_UPGRADE_REVIEW_INVESTMENT_PROFILE;
        public static final Name MARGIN_UPGRADE_SPLASH;
        public static final Name MARGIN_UPGRADE_TIERED_RATES;
        public static final Name MARGIN_UPGRADE_VALUE_PROPS;
        public static final Name MCW_CONVERSION_SUCCESS_PAGE;
        public static final Name MCW_CURRENY_CONVERSION_PAGE;
        public static final Name MEDIA_UPLOAD_SELECTOR;
        public static final Name MEDIA_VIEWER;
        public static final Name MERCHANT_REWARDS_INTRO;
        public static final Name MERCHANT_REWARD_OFFER_PAGE;
        public static final Name MERCHANT_REWARD_REWARD_HISTORY;
        public static final Name MERCHANT_REWARD_REWARD_HISTORY_DETAILS;
        public static final Name MESSAGES;
        public static final Name MESSAGES_THREAD;
        public static final Name MFA_AUTH_APP_SELECTION;
        public static final Name MFA_BACKUP_CODE;
        public static final Name MFA_SMS_VERIFICATION;
        public static final Name MOBILE_ADVANCED_CHARTS;
        public static final Name NAME_UNSPECIFIED;
        public static final Name NCDI_DEPOSIT_PERIOD_PAGE;
        public static final Name NCDI_HOLD_PERIOD_PAGE;
        public static final Name NCDI_HOLD_PERIOD_WITHDREW_PAGE;
        public static final Name NCW_APP_REDIRECT;
        public static final Name NCW_BACKUPS_SECURITY;
        public static final Name NCW_BACKUP_WALLET;
        public static final Name NCW_BUY_CHOOSE_PROVIDER;
        public static final Name NCW_BUY_RH_SPLASH_CONNECT;
        public static final Name NCW_BUY_SPLASH_SARDINE;
        public static final Name NCW_CLAIM_REWARD;
        public static final Name NCW_CONFIRM_REWARD;
        public static final Name NCW_CREATE_PIN;
        public static final Name NCW_CREATING_WALLET_CREATED;
        public static final Name NCW_CREATING_WALLET_PROGRESS;
        public static final Name NCW_CRYPTO_DETAIL_PAGE;
        public static final Name NCW_CRYPTO_SWAP_AMOUNT_ENTRY;
        public static final Name NCW_CRYPTO_SWAP_ORDER_CONFIRMATION;
        public static final Name NCW_CRYPTO_SWAP_ORDER_REVIEW;
        public static final Name NCW_CRYPTO_TOKEN_LIST;
        public static final Name NCW_CRYPTO_TRANSFER_AMOUNT;
        public static final Name NCW_CRYPTO_TRANSFER_RECEIVE;
        public static final Name NCW_CRYPTO_TRANSFER_SELECT_TOKEN;
        public static final Name NCW_CRYPTO_TRANSFER_SEND_ADDRESS;
        public static final Name NCW_CRYPTO_TRANSFER_SEND_CONFIRMATION;
        public static final Name NCW_CRYPTO_TRANSFER_SEND_REVIEW;
        public static final Name NCW_DISCOVER_CRYPTO_NEWS;
        public static final Name NCW_DISCOVER_TOP_LIST;
        public static final Name NCW_FUNDING_NETWORK_SELECTION;
        public static final Name NCW_FUNDING_SELECT_TOKEN;
        public static final Name NCW_FUND_WALLET;
        public static final Name NCW_GOLD_PROMO_PRIMER;
        public static final Name NCW_GOLD_PROMO_PRIMER_CONNECTED;
        public static final Name NCW_HOME;
        public static final Name NCW_IMPORTING_WALLET_CLOUD;
        public static final Name NCW_IMPORTING_WALLET_RECOVERY_PHRASE;
        public static final Name NCW_IMPORTING_WALLET_REVIEW;
        public static final Name NCW_LAUNCH_SPLASH;
        public static final Name NCW_LEARN_AND_EARN_LESSON;
        public static final Name NCW_LEARN_AND_EARN_LESSON_COMPLETED;
        public static final Name NCW_OFFRAMP_AMOUNT_INPUT;
        public static final Name NCW_OFFRAMP_NETWORK_SELECTION;
        public static final Name NCW_OFFRAMP_SPLASH;
        public static final Name NCW_OFFRAMP_TOKEN_SELECTION;
        public static final Name NCW_OMNISCAN;
        public static final Name NCW_ONBOARDING_BACKUP;
        public static final Name NCW_ONBOARDING_CLAIM_COIN;
        public static final Name NCW_ONBOARDING_CREATE_IMPORT;
        public static final Name NCW_ONBOARDING_NOTIFICATION_PROMPT;
        public static final Name NCW_ONBOARDING_PRODUCT_INTRO;
        public static final Name NCW_ONBOARDING_SECURITY;
        public static final Name NCW_ONBOARDING_STARTER;
        public static final Name NCW_ONBOARDING_SUCCESS;
        public static final Name NCW_REWARD;
        public static final Name NCW_SEARCH;
        public static final Name NCW_TOKEN_VISIBILITY;
        public static final Name NCW_TRUSTED_DAPPS;
        public static final Name NCW_WALLET_BACKUP_TYPE;
        public static final Name NCW_WALLET_HUB;
        public static final Name NCW_WEB3_BROWSER;
        public static final Name NCW_WEB3_INFO;
        public static final Name NCW_WEB3_LAUNCHPAD;
        public static final Name NCW_WEB3_MAIN;
        public static final Name NEAR_MARGIN_CALL;
        public static final Name NEWSFEED_DISCLOSURE;
        public static final Name NEW_PRODUCTS_LANDING;
        public static final Name OAUTH_WATING_SCREEN;
        public static final Name ONBOARDING_DEPOSIT_PAGE;
        public static final Name ONBOARDING_TAKEOVER;
        public static final Name OPTIONS_ROLLING_NUX;
        public static final Name OPTIONS_SBS_CHAIN;
        public static final Name OPTIONS_STOP_MARKET_NUX;
        public static final Name OPTIONS_STRATEGY_ROLL;

        @Deprecated
        public static final Name OPTIONS_STRATEGY_ROLL_NO_AVAILABLE_POSITIONS;

        @Deprecated
        public static final Name OPTIONS_STRATEGY_ROLL_STRATEGY_SUMMARY;
        public static final Name OPTION_AGGREGATE_DETAIL;
        public static final Name OPTION_CHAIN;
        public static final Name OPTION_CHAIN_CUSTOMIZATION_SETTINGS;
        public static final Name OPTION_CHAIN_EXPIRATION_PAGE;
        public static final Name OPTION_CHAIN_SETTINGS;
        public static final Name OPTION_EDIT_LEG_RATIO;
        public static final Name OPTION_EVENT_DETAIL;
        public static final Name OPTION_INSTRUMENT_DETAIL;
        public static final Name OPTION_L3_ENTRYPOINT_POST_TRADE_UPSELL;
        public static final Name OPTION_LEGO_CHAIN_PREMIUM;
        public static final Name OPTION_LEGO_CHAIN_TRADE_OPTION;
        public static final Name OPTION_MANUAL_REVIEW_KNOWLEDGE_CHECK;
        public static final Name OPTION_ONBOARDING_APPROVED_TRADES;
        public static final Name OPTION_ONBOARDING_DISCLOSURE;
        public static final Name OPTION_ONBOARDING_EDUCATION_L3_STRATEGIES;
        public static final Name OPTION_ONBOARDING_EDUCATION_SPREAD;
        public static final Name OPTION_ONBOARDING_FAILURE;
        public static final Name OPTION_ONBOARDING_INVESTMENT_PROFILE;
        public static final Name OPTION_ONBOARDING_JA_APPLICATION_PENDING;
        public static final Name OPTION_ONBOARDING_JOINT_PENDING;
        public static final Name OPTION_ONBOARDING_QUESTION_FINANCIAL_REGULATOR;
        public static final Name OPTION_ONBOARDING_QUESTION_INVESTMENT_ADVICE;
        public static final Name OPTION_ONBOARDING_QUESTION_OPTION_EXPERIENCE;
        public static final Name OPTION_ONBOARDING_QUESTION_UNDERSTAND_SPREAD;
        public static final Name OPTION_ONBOARDING_READY_L3_UPGRADE;
        public static final Name OPTION_ONBOARDING_SPLASH_L0;
        public static final Name OPTION_ONBOARDING_SPLASH_L2;
        public static final Name OPTION_ONBOARDING_SPLASH_RETIREMENT;
        public static final Name OPTION_ONBOARDING_START;
        public static final Name OPTION_ONBOARDING_SUCCESS;
        public static final Name OPTION_ONBOARDING_SUITABILITY;
        public static final Name OPTION_ONBOARDING_UPSELL_ALERT;
        public static final Name OPTION_ONBOARDING_UPSELL_ALL_SET;
        public static final Name OPTION_ONBOARDING_UPSELL_TRADE_ON_EXPIRATION;

        @Deprecated
        public static final Name OPTION_ORDER_CONFIGURATION_BOTTOM_SHEET;
        public static final Name OPTION_ORDER_CONFIGURATION_SELECTION;
        public static final Name OPTION_ORDER_CONFIRMATION;
        public static final Name OPTION_ORDER_DETAIL;
        public static final Name OPTION_ORDER_FORM;
        public static final Name OPTION_ROLLING_CONTRACT_SELECTOR;
        public static final Name OPTION_SHOPPING_CART;
        public static final Name OPTION_SIMULATED_RETURNS;
        public static final Name OPTION_STATISTICS_BOTTOM_SHEET;
        public static final Name OPTION_STRATEGY_BUILDER;
        public static final Name OPTION_STRATEGY_BUILDER_AVAILABLE_NUX;
        public static final Name OPTION_STRATEGY_BUILDER_DEEP_LINK_INTRO;
        public static final Name OPTION_STRATEGY_BUILDER_DEEP_LINK_SEARCH;
        public static final Name OPTION_STRATEGY_BUILDER_NOT_AVAILABLE_NUX;
        public static final Name OPTION_STRATEGY_BUILDER_NOT_ELIGIBLE_NUX;
        public static final Name OPTION_STRATEGY_BUILDER_NUX;
        public static final Name OPTION_STRATEGY_CHAIN;
        public static final Name OPTION_STRATEGY_DETAIL;
        public static final Name OPTION_TRADING_SESSION;
        public static final Name OPTION_UPGRADE_L0_STRATEGIES_PRICE_MOVEMENT;
        public static final Name OPTION_UPGRADE_L0_UNDERSTAND_OPTIONS;
        public static final Name OPTION_UPGRADE_L0_WHAT_ARE_OPTIONS;
        public static final Name OPTION_WATCHLIST_ABOUT;
        public static final Name OPTION_WATCHLIST_HUB;
        public static final Name ORDER_CONFIRMATION_FUNDING_UPSELL;

        @Deprecated
        public static final Name ORDER_RECEIPT;
        public static final Name OUTGOING_WIRE_DETAIL_CONFIRMATION;
        public static final Name OUTGOING_WIRE_DETAIL_INPUT;
        public static final Name OUTGOING_WIRE_DETAIL_V2_INPUT;
        public static final Name OUTGOING_WIRE_FRAUD_ALERT;
        public static final Name OUTGOING_WIRE_LINK_ACCOUNT;
        public static final Name OUTGOING_WIRE_THIRD_PARTY_FRAUD_ALERT;
        public static final Name P2P_CLAIM_TRANSFER;
        public static final Name P2P_CONFIRMATION;
        public static final Name P2P_CREATE_TRANSACTION;
        public static final Name P2P_INTRO;
        public static final Name P2P_ONBOARDING_ATTRIBUTION;
        public static final Name P2P_PAY_REQUEST;
        public static final Name P2P_PENDING_TRANSACTIONS;
        public static final Name P2P_PROFILE;
        public static final Name P2P_REVIEW_MULTIUSER_TRANSACTION;
        public static final Name P2P_REVIEW_TRANSACTION;
        public static final Name P2P_SCAN_QR_CODE;
        public static final Name P2P_SEARCH;
        public static final Name P2P_VIEW_QR_CODE;
        public static final Name PASSKEY_LOGIN;
        public static final Name PASSWORD_UPDATE;
        public static final Name PASSWORD_UPDATE_SUCCESS;
        public static final Name PAST_REWARDS;
        public static final Name PAYCHECK_HUB;
        public static final Name PAYCHECK_INVESTMENT_HUB;
        public static final Name PDT_RULES_UPDATES_INFO;
        public static final Name PERPETUALS_AGREEMENT;
        public static final Name PERPETUALS_ASSESSMENT;
        public static final Name PERPETUALS_CLOSE_POSITION;
        public static final Name PERPETUALS_DETAIL_PAGE;
        public static final Name PERPETUALS_EXPLORE;
        public static final Name PERPETUALS_KNOWLEDGE_TEST;
        public static final Name PERPETUALS_LIMIT_BUY_INTRO;
        public static final Name PERPETUALS_LIMIT_ORDER_PRICE;
        public static final Name PERPETUALS_LIMIT_ORDER_TIF;
        public static final Name PERPETUALS_LIMIT_SELL_INTRO;
        public static final Name PERPETUALS_LIQUIDATION_DETAILS;
        public static final Name PERPETUALS_MANUAL_CONTRACT_DETAILS;
        public static final Name PERPETUALS_MARGIN_EDIT;
        public static final Name PERPETUALS_MARGIN_EDIT_REVIEW;
        public static final Name PERPETUALS_ONBOARDING_STATUS;
        public static final Name PERPETUALS_ORDER_EDIT_LEVERAGE;
        public static final Name PERPETUALS_ORDER_ENTRY;
        public static final Name PERPETUALS_ORDER_FLOW_NUX;
        public static final Name PERPETUALS_ORDER_HISTORY_DETAIL;
        public static final Name PERPETUALS_ORDER_RECEIPT;
        public static final Name PERPETUALS_ORDER_REVIEW;
        public static final Name PERPETUALS_ORDER_TYPE;
        public static final Name PERPETUALS_PNL_BALANCE_DETAIL;
        public static final Name PERPETUALS_POSITION_EDIT_LEVERAGE;
        public static final Name PERPETUALS_POSITION_HUB;
        public static final Name PERPETUALS_PRIMER;
        public static final Name PERPETUALS_STOP_BUY_INTRO;
        public static final Name PERPETUALS_STOP_ORDER_PRICE;
        public static final Name PERPETUALS_STOP_ORDER_TIF;
        public static final Name PERPETUALS_STOP_SELL_INTRO;
        public static final Name PERPETUALS_TPSL_CANCELLATIONS;
        public static final Name PERPETUALS_TPSL_ENTRY;
        public static final Name PERPETUALS_TPSL_ERROR;
        public static final Name PERPETUALS_TPSL_HUB;
        public static final Name PERSONA_IDENTITY_VERIFICATION;
        public static final Name PHONE_UPDATE;
        public static final Name PHONE_UPDATE_CONFIRMATION;
        public static final Name PHONE_UPDATE_SUCCESS;
        public static final Name PHONE_UPDATE_VERIFICATION;
        public static final Name PHOTO_LIBRARY;
        public static final Name PICK_STOCK_SCREEN;
        public static final Name PIN_SETUP_SCREEN;
        public static final Name PLAID_AUTHENTICATION;
        public static final Name PLAID_BANK_LIST;
        public static final Name PLAID_LINK_BANK_ACCOUNT;
        public static final Name PLUTO_ACTIVITY_UNSPECIFIED;
        public static final Name PORTFOLIO_DIGEST_AGREEMENT;
        public static final Name PORTFOLIO_DIGEST_DETAIL;
        public static final Name PORTFOLIO_DIGEST_SPLASH;
        public static final Name PORTFOLIO_DRILLDOWN;
        public static final Name PORTFOLIO_QUESTIONNAIRE_INTRO;
        public static final Name POST_DAY_TRADE_SCREEN;
        public static final Name POST_DETAIL;
        public static final Name POST_INCOMING_WIRE;
        public static final Name POST_ONBOARDING_FUND_DETAIL;
        public static final Name POST_ONBOARDING_FUND_SPLASH;
        public static final Name POST_QUEUED_DEPOSIT_CONFIRMATION;
        public static final Name POST_REWARD_CLAIM_UPSELL_SCREEN;
        public static final Name POST_TRANSFER_CONFIRMATION;
        public static final Name POST_TRANSFER_PAGE_RFP_PENDING;
        public static final Name POST_TRANSFER_TIMELINE;
        public static final Name PRE_IPO_BID;
        public static final Name PRICE_ALERT_EDITOR;
        public static final Name PRISM;
        public static final Name PRODUCT_UPSELL;
        public static final Name PROFILE;
        public static final Name PROFILE_VISIBILITY;
        public static final Name PROFIT_AND_LOSS_HUB;
        public static final Name PROGRESSIVE_ONBOARDING_EXPECTATION;
        public static final Name PROGRESSIVE_ONBOARDING_RESUME_TRADE_SPLASH;
        public static final Name PROMOTION_CONFIRMATION;
        public static final Name PROMOTION_EDUCATION;
        public static final Name PROMPT_MFA_ENROLLMENT_CONFIRMATION;
        public static final Name PROMPT_MFA_ENROLLMENT_INTRODUCTION;
        public static final Name PSP_CELEBRATION;
        public static final Name PSP_DETAIL;
        public static final Name PSP_HISTORY_DETAIL;
        public static final Name PSP_INTRO;
        public static final Name QUEUED_DEPOSIT_LEARN_MORE;
        public static final Name QUICK_TRADE_ACTION_SHEET;
        public static final Name RECEIVE_CRYPTO_GIFT_LOADING;
        public static final Name RECEIVE_GRYPTO_GIFT_ERROR_DIALOG;
        public static final Name RECOMMENDATIONS_ONBOARDING_INTRO;
        public static final Name RECS_CONFIRM_QUESTIONNAIRE;
        public static final Name RECS_DISCLOSURE;
        public static final Name RECS_FIRST_TRADE_INTRO;
        public static final Name RECS_INVESTOR_PROFILE_INTRO;
        public static final Name RECS_INVESTOR_PROFILE_QUESTION;
        public static final Name RECS_INVESTOR_PROFILE_SECTION_COVER;
        public static final Name RECS_LEARN_MORE;
        public static final Name RECS_ORDER_ENTRY;
        public static final Name RECS_ORDER_PREVIEW;
        public static final Name RECS_ORDER_RECEIPT;
        public static final Name RECS_ORDER_REVIEW;
        public static final Name RECS_ORDER_SUMMARY;
        public static final Name RECS_PORTFOLIO_ALLOCATION;
        public static final Name RECS_PORTFOLIO_DIVERSIFICATION;
        public static final Name RECS_PORTFOLIO_INCLUDES;

        @Deprecated
        public static final Name RECS_PORTFOLIO_INTRO;
        public static final Name RECS_PORTFOLIO_SUMMARY;
        public static final Name RECS_PORTFOLIO_WALKTHROUGH;
        public static final Name RECS_REENTRY_CONFIRMATION;
        public static final Name RECS_REENTRY_EDIT;
        public static final Name RECS_REENTRY_INTRO;
        public static final Name RECS_RET_BUY_AGAIN;
        public static final Name RECS_RET_CONGRATS;
        public static final Name RECS_RET_INTRO;
        public static final Name RECS_RET_PORTFOLIO;
        public static final Name RECS_RET_PROSPECTUS;
        public static final Name RECS_RET_QUESTIONNAIRE_RESULTS;
        public static final Name RECS_RET_QUESTIONNAIRE_RESULTS_INTRO;
        public static final Name RECS_RET_RECURRING_DECISION;
        public static final Name RECS_RET_RECURRING_HOOK;
        public static final Name RECS_RET_TRADE_CELEBRATION;
        public static final Name RECS_RISK_LOADER;
        public static final Name RECS_RISK_PROFILE;
        public static final Name RECS_TRADE_CELEBRATION;
        public static final Name RECS_UNAVAILABLE;
        public static final Name RECURRING_AMOUNT;
        public static final Name RECURRING_AMOUNT_TYPE;
        public static final Name RECURRING_ASSET_TYPE_SELECTION;
        public static final Name RECURRING_BACKUP_PAYMENT_METHOD;
        public static final Name RECURRING_DEPOSITS_HUB;
        public static final Name RECURRING_DEPOSIT_DETAIL;
        public static final Name RECURRING_DEPOSIT_UPSELL;
        public static final Name RECURRING_DETAIL;
        public static final Name RECURRING_DIRECT_DEPOSIT_SOURCE;
        public static final Name RECURRING_EXTRA_CASH_SPLASH;
        public static final Name RECURRING_FIND_INVESTMENT_PAGE;
        public static final Name RECURRING_FREQUENCY;
        public static final Name RECURRING_HUB;
        public static final Name RECURRING_INSIGHTS;
        public static final Name RECURRING_ORDER_RECEIPT;

        @Deprecated
        public static final Name RECURRING_ORDER_REVIEW;
        public static final Name RECURRING_PAYMENT_METHOD;
        public static final Name RECURRING_RECEIPT_UPSELL;
        public static final Name RECURRING_TRANSFERS_HUB;
        public static final Name RECURRING_UNIFIED_CREATION;
        public static final Name REFERRAL_INVITE_SENT_CONFIRMATION_DIALOG;
        public static final Name REFERRAL_REWARD_DETAIL;
        public static final Name REFERRAL_REWARD_GRANTED;
        public static final Name REFERRAL_REWARD_OFFER_DETAIL;
        public static final Name REFERRAL_REWARD_OFFER_DETAIL_INFO;
        public static final Name RESEARCH_REPORT;
        public static final Name RESET_PASSWORD;
        public static final Name RESTRICT_SECURITIES;
        public static final Name RESUME_APPLICATION_V1_TAKEOVER;
        public static final Name RESUME_APPLICATION_V2_TAKEOVER;
        public static final Name RESURRECTION_SPLASH;
        public static final Name RETIREMENT_1099_PARTNERSHIP_DETAIL;
        public static final Name RETIREMENT_401K_FINDER_ACCOUNT_DETAILS;
        public static final Name RETIREMENT_401K_FINDER_INTERSTITIAL;
        public static final Name RETIREMENT_401K_FINDER_NOT_SUPPORTED;
        public static final Name RETIREMENT_401K_FINDER_NO_RESULTS;
        public static final Name RETIREMENT_401K_FINDER_RESULTS;
        public static final Name RETIREMENT_401K_ROLLOVER_CAPITALIZE;
        public static final Name RETIREMENT_401K_ROLLOVER_CAPITALIZE_EMBED;
        public static final Name RETIREMENT_401K_ROLLOVER_DIY;
        public static final Name RETIREMENT_401K_ROLLOVER_EDUCATION;
        public static final Name RETIREMENT_401K_ROLLOVER_INTERSTITIAL;
        public static final Name RETIREMENT_401K_ROLLOVER_METHOD_SELECTION;
        public static final Name RETIREMENT_401K_ROLLOVER_OPTIONS;
        public static final Name RETIREMENT_401K_ROLLOVER_QUESTIONS;
        public static final Name RETIREMENT_401K_ROLLOVER_TERMS;
        public static final Name RETIREMENT_401K_ROLLOVER_VERIFY_INFO;
        public static final Name RETIREMENT_ACCOUNT_COMPARISON;
        public static final Name RETIREMENT_ACCOUNT_DESCRIPTION;
        public static final Name RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_INTRO;
        public static final Name RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_QUESTION;
        public static final Name RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_RESULT;
        public static final Name RETIREMENT_ACCOUNT_SELECTION;
        public static final Name RETIREMENT_CONTRIBUTION_HUB;
        public static final Name RETIREMENT_DASHBOARD;
        public static final Name RETIREMENT_ENOKI_INFO;
        public static final Name RETIREMENT_GOLD_MATCH_VALUE_PROPS;
        public static final Name RETIREMENT_INSTANT;
        public static final Name RETIREMENT_INVEST;
        public static final Name RETIREMENT_LEARN_AND_EARN_REWARD;
        public static final Name RETIREMENT_MATCH_HUB;
        public static final Name RETIREMENT_MATCH_RATE_SELECTION;
        public static final Name RETIREMENT_MULTIPLE_FUNDING_METHODS;
        public static final Name RETIREMENT_ONBOARDING_FUNDING_METHODS;
        public static final Name RETIREMENT_ONBOARDING_MANAGEMENT_TYPE_SELECTION;
        public static final Name RETIREMENT_ONBOARDING_SWIPEY;
        public static final Name RETIREMENT_OPTIONS_CHECK_ELIGIBILITY;
        public static final Name RETIREMENT_OPTIONS_CONFIRM_ELIGIBILITY;
        public static final Name RETIREMENT_OPTIONS_OPT_IN;
        public static final Name RETIREMENT_REVIEW_AGREEMENTS;
        public static final Name RETIREMENT_SCROLLING_VALUE_PROP;
        public static final Name RETIREMENT_SIGNUP_ERROR;
        public static final Name RETIREMENT_SIGNUP_LOADING;
        public static final Name RETIREMENT_SIGNUP_SUCCESS;
        public static final Name RETIREMENT_SIGNUP_WHICH_IRA;
        public static final Name RETIREMENT_STATEMENTS_LIST;
        public static final Name RETIREMENT_STATEMENT_VIEWER;
        public static final Name RETIREMENT_TAX_BENEFITS;
        public static final Name RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION;
        public static final Name RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION_AGREEMENTS;
        public static final Name RETIREMENT_WAITLIST;
        public static final Name RETURNS_COMPARISON_INTRO;
        public static final Name RETURNS_COMPARISON_SEARCH;
        public static final Name REVAMP_LOGIN_ASK_UPDATE_PASSWORD;
        public static final Name REVAMP_LOGIN_CONFIRM_EMAIL;
        public static final Name REVAMP_LOGIN_UPDATE_EMAIL;
        public static final Name REVAMP_LOGIN_UPDATE_PASSWORD;
        public static final Name REVAMP_LOGIN_VERIFY_EMAIL;
        public static final Name REVIEW_QUEUED_DEPOSIT;
        public static final Name REVIEW_TRANSFER;
        public static final Name REWARD_OFFERS_LIST;
        public static final Name REWARD_OFFER_DETAIL;
        public static final Name RHC_LOGIN_REFERRAL;
        public static final Name RHC_SIGNUP_REFERRAL_RH;
        public static final Name RHY_BACKUP_COVERAGE_BOTTOM_SHEET;
        public static final Name RHY_BACKUP_COVERAGE_DETAILS;
        public static final Name RHY_MIGRATION_AGREEMENT;
        public static final Name RHY_MIGRATION_CONFIRMATION;
        public static final Name RHY_MIGRATION_CONFIRM_ADDRESS;
        public static final Name RHY_MIGRATION_CONTRAST_MULTIPLE_ACCOUNTS;
        public static final Name RHY_MIGRATION_DD_SETUP;
        public static final Name RHY_MIGRATION_FEATURE_DIRECT_DEPOSIT;
        public static final Name RHY_MIGRATION_FEATURE_MERCHANT_REWARDS;
        public static final Name RHY_MIGRATION_FEATURE_REWARDS;
        public static final Name RHY_MIGRATION_FUNDING;
        public static final Name RHY_MIGRATION_INTRO_LONG;
        public static final Name RHY_MIGRATION_OPEN_SPENDING_ACCOUNT;
        public static final Name RHY_MIGRATION_OPT_OUT;
        public static final Name RHY_MIGRATION_REVIEW_CHANGES;
        public static final Name RHY_MIGRATION_SELECT_CARD;
        public static final Name RHY_MIGRATION_SETUP_CHECKLIST;
        public static final Name RHY_MIGRATION_SETUP_COMPLETE;
        public static final Name RHY_MIGRATION_TIME_OUT_BOTTOM_SHEET;
        public static final Name RHY_POST_SIGNUP;
        public static final Name RHY_REFERALS_STATUS;
        public static final Name RHY_REFERRALS_CONTACT_LIST;
        public static final Name RHY_REFERRALS_FUND_LANDING;
        public static final Name RHY_REFERRALS_FUND_PILL;
        public static final Name RHY_REFERRALS_FUND_SUCCESS;
        public static final Name RHY_REFERRALS_REFEREE_LANDING_PAGE;
        public static final Name RHY_REFERRALS_REFERRER_LANDING_PAGE;
        public static final Name RHY_REFERRALS_TRACKING;
        public static final Name RHY_REFERRALS_WELCOME;
        public static final Name RHY_REFERRAL_REWARD_DETAILS;
        public static final Name RHY_SPENDING_CARD_CONTROLS;
        public static final Name RHY_SPENDING_HOME;
        public static final Name RHY_SPENDING_SETTINGS;
        public static final Name RHY_TURBOTAX_ACCOUNT_INFO;
        public static final Name RHY_TURBOTAX_ENABLE_EARLY_PAY;
        public static final Name RHY_TURBOTAX_INTRO;
        public static final Name RHY_TURBOTAX_OFFER_SELECTION;
        public static final Name RHY_TURBOTAX_OPEN_ACCOUNT;
        public static final Name RHY_WAITLIST_MARKETING_SPLASH;
        public static final Name RHY_WAITLIST_SIGN_UP;
        public static final Name RH_SUPPORT;
        public static final Name RISKY_DEPOSIT_INSTANT_UPSELL;
        public static final Name ROBINHOOD_LIST_DETAIL_PAGE;
        public static final Name ROBINHOOD_LIST_PICKER;
        public static final Name ROTH_CONVERSION_INFO;
        public static final Name ROUNDUP_ASSET_SELECTION;
        public static final Name ROUNDUP_END_OF_WEEK;
        public static final Name ROUNDUP_ENROLL_COMPLETE;
        public static final Name ROUNDUP_ENROLL_INTRO;
        public static final Name ROUNDUP_ENROLL_REVIEW;
        public static final Name ROUNDUP_FIRST_SETTLEMENT;
        public static final Name ROUNDUP_HISTORY_DETAIL;
        public static final Name ROUNDUP_HUB;
        public static final Name ROUNDUP_SETTINGS;
        public static final Name SAFETY_LABEL_LESSON;
        public static final Name SCREENER_DATA_DISPLAY;
        public static final Name SCREENER_DETAIL;
        public static final Name SCREENER_INDICATORS_LIST;
        public static final Name SCREENER_INDICATOR_DETAIL;
        public static final Name SCREENER_LIST;
        public static final Name SCREENER_PRESET_LIST;
        public static final Name SCREEN_PROTECT;
        public static final Name SDP_DIGEST_BREAKING;
        public static final Name SDP_REFERRAL;
        public static final Name SECURITY_PRIVACY_CENTER;
        public static final Name SELECT_IRA_DISTRIBUTION_TYPE;

        @Deprecated
        public static final Name SELECT_ORDER_KIND_PAGE;
        public static final Name SELECT_RETIREMENT_CONTRIBUTION_TYPE;
        public static final Name SELECT_RETIREMENT_TAX_YEAR;
        public static final Name SELF_DIRECTED_ACCOUNT_CONFIRMATION;
        public static final Name SEPA_INFO;
        public static final Name SETTINGS_INVESTING_INVESTOR_PROFILE_GRAPH_TAKEOVER_REVIEW;
        public static final Name SHAREHOLDER_ASK_A_QUESTION;
        public static final Name SHAREHOLDER_EVENTS_LIST;
        public static final Name SHAREHOLDER_QA_INTRO;
        public static final Name SHAREHOLDER_QA_INTRO_DISCLOSURE;
        public static final Name SHAREHOLDER_QUESTIONS_LIST;
        public static final Name SHARE_PORTFOLIO_LEARN_MORE_ABOUT_REFERRALS;
        public static final Name SHARE_PORTFOLIO_PAGE;
        public static final Name SIDE_BY_SIDE_OPTION_CHAIN;
        public static final Name SIDE_BY_SIDE_OPTION_CHAIN_ONBOARDING_SEARCH;
        public static final Name SIGNUP_FUND_ACCOUNT_INTRO;
        public static final Name SIGNUP_REWARD_GRANTED;
        public static final Name SLIP_HUB;
        public static final Name SLIP_HUB_SETTING;
        public static final Name SLIP_LEARN_AND_EARN_REWARD;
        public static final Name SLIP_ONBOARDING_AGREEMENTS;
        public static final Name SLIP_ONBOARDING_AGREEMENTS_ABBREVIATED;
        public static final Name SLIP_ONBOARDING_CALCULATOR;
        public static final Name SLIP_ONBOARDING_CONFIRMATION;
        public static final Name SLIP_ONBOARDING_EDUCATION;
        public static final Name SLIP_ONBOARDING_ELIGIBILITY_CHECKLIST;
        public static final Name SLIP_ONBOARDING_FAQS;
        public static final Name SLIP_ONBOARDING_INTRO;
        public static final Name SLIP_ONBOARDING_INTRO_ABBREVIATED;
        public static final Name SLIP_ONBOARDING_INTRO_V3;
        public static final Name SLIP_ONBOARDING_RISKS;
        public static final Name SLIP_ONBOARDING_VALUE_PROPS;
        public static final Name SLIP_ONE_CLICK_AGREEMENTS;
        public static final Name SLIP_POST_TRADE_UPSELL;
        public static final Name SLIP_UPDATED_AGREEMENT;
        public static final Name SMS_MFA_ENROLLMENT_BACKUP_CODE;
        public static final Name SMS_MFA_ENROLLMENT_CODE;
        public static final Name SMS_MFA_ENROLLMENT_CONFIRMATION;
        public static final Name SMS_MFA_ENROLLMENT_INTRODUCTION;
        public static final Name SNACKS_ARTICLE_PAGE;
        public static final Name SOCIAL_HOME;
        public static final Name SOCIAL_ONBOARDING_PAGE;
        public static final Name SOCIAL_POST_COMPOSER;
        public static final Name SOCIAL_PROFILE_SETTINGS;
        public static final Name SOCIAL_SEARCH_SCREEN;
        public static final Name SPENDING_ACCOUNT_CREATED;
        public static final Name SPENDING_STATEMENTS_LIST;
        public static final Name SPENDING_STATEMENT_VIEWER;
        public static final Name STAKING_UPSELL;
        public static final Name START_DEPOSIT;
        public static final Name STATEMENTS_AND_HISTORY;
        public static final Name STOCK_DETAIL_PAGE;
        public static final Name STOCK_DETAIL_PAGE_MINI;
        public static final Name STOCK_NEWSFEED;
        public static final Name STOCK_TOKEN_ASSESSMENT;
        public static final Name STOCK_TOKEN_KNOWLEDGE_TEST;
        public static final Name STOCK_TOKEN_TAX_INFO;
        public static final Name STRATEGIES_RETURNS_HUB;
        public static final Name STRATEGIES_VALUE_PROPS;
        public static final Name SUGGESTION_SEARCH;
        public static final Name SWEEP_ONBOARDING;
        public static final Name SWEEP_ONBOARDING_AGREEMENT;
        public static final Name SWEEP_ONBOARDING_AGREEMENTS_LIST;
        public static final Name SWEEP_ONBOARDING_CONFIRMATION;
        public static final Name SWEEP_ONBOARDING_CONFIRMATION_WITH_GOLD;
        public static final Name SWEEP_ONBOARDING_ERROR;
        public static final Name SWEEP_ONBOARDING_HOW_IT_WORKS;
        public static final Name SWEEP_ONBOARDING_SELECT_RATE;
        public static final Name SWEEP_ONBOARDING_VALUE_PROPS;
        public static final Name SWIPE_TO_CLAIM_SCREEN;
        public static final Name SYP_AGREEMENT;
        public static final Name SYP_DISCLOSURE_ALERT;
        public static final Name SYP_LEARN_MORE;
        public static final Name SYP_ONBOARDING_DD_CONFIRMATION;
        public static final Name TAX_CENTER;
        public static final Name TAX_DOCUMENTS_LIST;
        public static final Name TAX_DOCUMENT_VIEWER;
        public static final Name TAX_LOSS_HARVEST_CHOOSE_ACCOUNTS;
        public static final Name TAX_LOSS_HARVEST_CHOOSE_OPTION;
        public static final Name TAX_LOSS_HARVEST_CUSTOMIZE_CELEBRATION;
        public static final Name TAX_LOSS_HARVEST_CUSTOMIZE_INTRO;
        public static final Name TAX_LOSS_HARVEST_CUSTOMIZE_REVIEW;
        public static final Name TAX_LOSS_HARVEST_DASHBOARD;
        public static final Name TAX_LOSS_HARVEST_LOADING_OPTIONS;
        public static final Name TAX_LOSS_HARVEST_NUX;
        public static final Name TAX_LOSS_HARVEST_OPTIONS_INTRO;
        public static final Name TAX_LOTS_HISTORY;
        public static final Name TAX_LOTS_SELECTION;
        public static final Name TAX_SEASON_PROMO_2024_MATCH_AGREEMENTS;
        public static final Name TAX_SEASON_PROMO_2024_MATCH_SELECTOR;
        public static final Name TAX_SEASON_PROMO_2024_PROMO;
        public static final Name TAX_SEASON_PROMO_2024_TIMELINE;
        public static final Name TOKENIZED_LIMIT_BUY_INTRO;
        public static final Name TOKENIZED_LIMIT_SELL_INTRO;
        public static final Name TOKENIZED_STOCK_DETAIL_DISCLOSURE;
        public static final Name TOKENIZED_STOCK_DETAIL_PAGE;
        public static final Name TOKENIZED_STOCK_DETAIL_POSITION_ABOUT;
        public static final Name TOKENIZED_STOCK_FAQ;
        public static final Name TOKENIZED_STOCK_ORDER_ENTRY;
        public static final Name TOKENIZED_STOCK_ORDER_HISTORY_DETAIL;
        public static final Name TOKENIZED_STOCK_ORDER_RECEIPT;
        public static final Name TOKENIZED_STOCK_ORDER_REVIEW;
        public static final Name TOKENIZED_STOCK_ORDER_TYPE;
        public static final Name TOKENIZED_STOCK_PRIMER;
        public static final Name TRADE_CELEBRATION;
        public static final Name TRADE_HISTORY;
        public static final Name TRADING_TRENDS;
        public static final Name TRADING_TRENDS_ONBOARDING;
        public static final Name TRADING_TRENDS_ONBOARDING_SEARCH;
        public static final Name TRANSACTION_DETAIL_PAGE;
        public static final Name TRANSACTION_RECATEGORIZATION_PAGE;
        public static final Name TRANSFERS;
        public static final Name TRANSFER_ACCOUNT_SELECTION;
        public static final Name TRANSFER_DETAILS;
        public static final Name TRANSFER_INFO;
        public static final Name TRUSTED_DEVICES;
        public static final Name TWO_FACTOR_AUTHENTICATION;
        public static final Name UK_MARGIN_ONBOARDING_EXPERIENCE_TEST_SPLASH;
        public static final Name UK_MARGIN_ONBOARDING_GAINS;
        public static final Name UK_MARGIN_ONBOARDING_INVESTOR_PROFILE_SPLASH;
        public static final Name UK_MARGIN_ONBOARDING_KNOWLEDGE_TEST_SPLASH;
        public static final Name UK_MARGIN_ONBOARDING_LOSSES;
        public static final Name UK_MARGIN_ONBOARDING_MANAGE_RISKS;
        public static final Name UK_MARGIN_ONBOARDING_POTENTIAL_RISKS;
        public static final Name UK_OPTION_ONBOARDING_EDUCATION_BENEFITS;
        public static final Name UK_OPTION_ONBOARDING_EDUCATION_BENEFITS_L2;
        public static final Name UK_OPTION_ONBOARDING_EDUCATION_RISKS;
        public static final Name UK_OPTION_ONBOARDING_EXPERIENCE_QUESTIONNAIRE;
        public static final Name UK_OPTION_ONBOARDING_INVESTOR_PROFILE;
        public static final Name UK_OPTION_ONBOARDING_KNOWLEDGE_QUESTIONNAIRE;
        public static final Name UK_OPTION_ONBOARDING_PROFESSIONAL_TRADER;
        public static final Name UK_OPTION_ONBOARDING_REVIEW_INVESTOR_PROFILE;
        public static final Name UK_OPTION_ONBOARDING_SPLASH_L0;
        public static final Name UK_OPTION_ONBOARDING_SPLASH_L2;
        public static final Name UPDATE_MANAGED_INVESTOR_PROFILE;
        public static final Name UPDATE_MANAGED_INVESTOR_PROFILE_RESULTS;
        public static final Name USER_CREATION_EMAIL;
        public static final Name USER_CREATION_LEGAL_NAME;
        public static final Name USER_CREATION_PASSWORD;
        public static final Name USER_CREATION_SPLASH;
        public static final Name USER_LIST_DETAIL_PAGE;
        public static final Name USER_LIST_DETAIL_SEARCH;
        public static final Name USER_PROFILE;
        public static final Name V1_TWO_FACTOR_BACKUP_CODE;
        public static final Name V1_TWO_FACTOR_CONFIRM_PHONE_NUMBER;
        public static final Name V1_TWO_FACTOR_CONFIRM_TOTP_TOKEN;
        public static final Name V1_TWO_FACTOR_SMS_BACKUP_CODE;
        public static final Name V1_TWO_FACTOR_TOTP_BACKUP_CODE;
        public static final Name V1_TWO_FACTOR_TOTP_TOKEN;
        public static final Name VERIFY_DEBIT_CARD_CODE_ENTRY;
        public static final Name VERIFY_DEBIT_CARD_SPLASH;
        public static final Name VERIFY_DEBIT_CARD_STEPS;
        public static final Name VOICE_ENROLLMENT_COMPLETE;
        public static final Name VOICE_ENROLLMENT_CONSENT;
        public static final Name VOICE_ENROLLMENT_INTRO;
        public static final Name VOICE_RECORD;
        public static final Name VOICE_VERIFICATION_SETTINGS;
        public static final Name VOLUME_TIERS_DEPOSIT_PROMO_INFO;
        public static final Name WAITLIST;
        public static final Name WATCHLIST_REDESIGN;
        public static final Name WEBAUTHN_ENROLLMENT_EDUCATION;
        public static final Name WEBAUTHN_ENROLLMENT_SUCCESS;
        public static final Name WEB_CLIENT_PREFERENCE;
        public static final Name WELCOME_GB_MAIN;
        public static final Name WELCOME_INVESTING;
        public static final Name WELCOME_MAIN;
        public static final Name WELCOME_SAFETY_FIRST;
        public static final Name WELCOME_START_WITH_DOLLAR;
        public static final Name WIRE_INFO_SCREEN;
        public static final Name WIRE_TRANSFER;
        public static final Name WIRE_TRANSFER_CONFIRM_BANK_DETAILS;
        public static final Name WIRE_TRANSFER_ENTER_BANK_DETAILS;
        public static final Name WIRE_TRANSFER_MEMO;
        public static final Name WIRE_TRANSFER_SUBMIT_TITLE_DOCUMENTS;
        public static final Name WIRE_VAN_DETAILS;
        public static final Name WITHDRAWAL_CONFIRMATION;
        public static final Name WITHDRAWAL_INPUT;
        public static final Name WITHDRAWAL_REVIEW;
        public static final Name WITHDRAW_INTERVENTION_CONFIRMATION;
        public static final Name WITHDRAW_INTERVENTION_UPSELL;
        public static final Name WORKFLOW_CHECKLIST;
        public static final Name WORKFLOW_DEVICE_APPROVAL_CHALLENGE;
        public static final Name WORKFLOW_EMAIL_CHALLENGE;
        public static final Name WORKFLOW_GKBA;
        public static final Name WORKFLOW_INFO;
        public static final Name WORKFLOW_KYC_AGREEMENT;
        public static final Name WORKFLOW_KYC_STATUS_CHECK;
        public static final Name WORKFLOW_KYC_WAITING;
        public static final Name WORKFLOW_PLAID_AUTH;
        public static final Name WORKFLOW_PLAID_BANK_LIST;
        public static final Name WORKFLOW_REQUEST_PHONE_CALL;
        public static final Name WORKFLOW_REQUEST_PHONE_CALL_EDIT;
        public static final Name WORKFLOW_REQUEST_PHONE_CALL_SELECT_COUNTRY;
        public static final Name WORKFLOW_SMS_CHALLENGE;
        public static final Name WORKFLOW_UPDATE_APP;
        private final int value;

        private static final /* synthetic */ Name[] $values() {
            return new Name[]{NAME_UNSPECIFIED, CALENDAR_DATE_PICKER, PHOTO_LIBRARY, FILE_BROWSER, MEDIA_UPLOAD_SELECTOR, MEDIA_VIEWER, DOWNLOAD_APPS, ERROR_SCREEN, DISCLOSURE, EMBEDDED_WEBVIEW, NEW_PRODUCTS_LANDING, TAX_CENTER, CUSTOM_ACCOUNT_ACTIVITY_EXPORTER_LIST, GENERATE_CUSTOM_ACCOUNT_ACTIVITY_REPORT, PRODUCT_UPSELL, EMAIL_PREFERENCES_PAGE, EMAIL_UNSUBSCRIBE_PAGE, PIN_SETUP_SCREEN, SCREEN_PROTECT, OAUTH_WATING_SCREEN, APP_PRIVACY_SETTINGS, DEVICE_APPROVAL_WAITING, DEVICE_APPROVAL_WAITING_BLOCKED, IAC_BOTTOM_SHEET, AGREEMENT, INVESTMENTS_TRACKER_FTUX_TRACK_ALL_ASSETS, INVESTMENTS_TRACKER_FTUX_ASSET_ALLOCATION, INVESTMENTS_TRACKER_FTUX_ADDITIONAL_INFO, INVESTMENTS_TRACKER_PERFORMANCE_VIEW, INVESTMENTS_TRACKER_ACCOUNT_LINK_AGREEMENT, INVESTMENTS_TRACKER_ACCOUNT_DETAILS, INVESTMENTS_TRACKER_ALLOCATIONS_VIEW, INVESTMENTS_TRACKER_TOOLTIP_SHEET_ADD_ACCOUNT, INVESTMENTS_TRACKER_SETTINGS, INVESTMENTS_TRACKER_ACCOUNT_REMOVAL_SHEET, INVESTMENTS_TRACKER_REMOVAL_CONFIRMATION_SHEET, BROWSE_NEWSFEED, BROWSE_SEARCH, BROWSE_NEWSFEED_THEATRE, STOCK_NEWSFEED, CRYPTO_NEWSFEED, EMBEDDED_ARTICLE_PAGE, NEWSFEED_DISCLOSURE, CX_REVIEW_CALL_DETAILS, CX_CALL_STATUS, CX_CHANNEL_SELECTION, CX_WEB_BACK_ERROR, CX_CALL_SCHEDULE, CX_EDIT_CALL_SCHEDULE, CX_SURVEY_YES_NO_QUESTION, CX_SURVEY_FREE_FORM_QUESTION, CX_SURVEY_MULTIPLE_CHOICE_QUESTION, CX_SURVEY_RATING_QUESTION, CX_SURVEY_ERROR_TOAST, CX_SURVEY_COMPLETE_PAGE, CX_SURVEY_COMPLETE_TOAST, CX_CALL_DESCRIPTION, CX_ACCOUNT_DETAIL_PAGE, CX_CONTACT_SECRET_CODE_PAGE, CX_CONTACT_VOICE_VERIFICATION_CONSENT_PAGE, CX_CONTACT_VOICE_VERIFICATION_PAGE, CX_CONTACT_SELFIE_VERIFICATION_INITIATE_PAGE, CX_CONTACT_SELFIE_VERIFICATION_WAIT_PAGE, CX_CONTACT_VOICE_ENROLLMENT_CONSENT_PAGE, CX_CONTACT_VOICE_ENROLLMENT_PAGE, CX_CONTACT_EMAIL_PAGE, CX_CONTACT_SELFIE_VERIFICATION_FAILURE_PAGE, CX_CHAT_THREAD, CX_SUPPORT_CASES, CX_CHATBOT_PAGE, CX_MULTIPLE_ACCOUNT_SUPPORT_PAGE, CX_SUPPORT_CHAT_THREAD, CX_SUPPORT_HUB, CX_CHAT_ERROR_SCREEN, CX_APPOINTMENT_TIME_SELECTION, CX_APPOINTMENT_NOTES_ENTRY, CX_APPOINTMENT_REVIEW_DETAILS, CX_APPOINTMENT_CONFIRMATION, CX_APPOINTMENT_DETAILS, CX_CONCIERGE_ONBOARDING, CX_APPOINTMENT_ALREADY_BOOKED, CX_APPOINTMENT_CANCEL_CONFIRMATION, CX_CONCIERGE_INFO, CX_CONCIERGE_FAQ, CX_CONCIERGE_PLUS_LANDING, CX_CONCIERGE_PLUS_ONBOARDING, CX_CONCIERGE_PLUS_HUB, CX_CONCIERGE_PLUS_TAX_ONBOARDING, CX_CONCIERGE_PLUS_ESTATE_ONBOARDING, CX_CONCIERGE_PLUS_TAX, CX_CONCIERGE_PLUS_ESTATE, TRANSFERS, CASH, TRANSACTION_DETAIL_PAGE, TRANSACTION_RECATEGORIZATION_PAGE, DISPUTES_SPLASH_PAGE, DISPUTES_REASON_SELECTION, DISPUTES_TRANSACTION_SELECTION, DISPUTES_TRANSACTION_REVIEW, DISPUTES_MULTIPLE_CHOICE_QUESTION, DISPUTES_AMOUNT_ENTRY_QUESTION, DISPUTES_DATE_ENTRY_QUESTION, DISPUTES_FREE_RESPONSE_QUESTION, DISPUTES_MEDIA_UPLOAD_QUESTION, DISPUTES_FREE_RESPONSE_WITH_MEDIA_UPLOAD, DISPUTES_REVIEW, DISPUTES_CONFIRMATION, ROUNDUP_ENROLL_INTRO, ROUNDUP_ASSET_SELECTION, ROUNDUP_ENROLL_REVIEW, ROUNDUP_ENROLL_COMPLETE, ROUNDUP_HUB, ROUNDUP_SETTINGS, ROUNDUP_FIRST_SETTLEMENT, ROUNDUP_END_OF_WEEK, ROUNDUP_HISTORY_DETAIL, BANK_TRANSFER, MERCHANT_REWARDS_INTRO, MERCHANT_REWARD_OFFER_PAGE, MERCHANT_REWARD_REWARD_HISTORY, MERCHANT_REWARD_REWARD_HISTORY_DETAILS, PLUTO_ACTIVITY_UNSPECIFIED, DD_INTRO, DD_SETUP_CHOICE, DD_ACCOUNT_INFO, DD_PREFILLED_INTRO, DD_CONFIRM_EMPLOYER, DD_UPDATE_EMPLOYER, DD_UNSIGNED_FORM, DD_SIGNATURE, DD_SIGNED_FORM, DD_CONGRATULATIONS, DD_SWITCHER_SEARCH_COMPANY, DD_SWITCHER_SEARCH_PAYROLL, DD_SWITCHER_AUTHENTICATION, DD_SWITCHER_CONFIRMATION, DD_SWITCHER_AUTHENTICATION_HELP, DD_SWITCHER_OPTIONS, DD_SWITCHER_OPTION_PERCENT, DD_SWITCHER_OPTION_FIXED, DD_PARTIAL_PAYCHECK, DD_EDIT_DOLLAR_AMOUNT, DD_EDIT_PERCENTAGE_AMOUNT, DIRECT_DEPOSIT_UPSELL, DIRECT_DEPOSIT_DISCLOSURES, DIRECT_DEPOSIT_SETUP_INFO, DIRECT_DEPOSIT_HISTORY, DIRECT_DEPOSIT_POST_TRANSFER_UPSELL, EARLY_PAY_LEARN_MORE, EARLY_PAY_ENROLLMENT_SUCCESS, EARLY_PAY_ONBOARDING_CONFIRMATION, HOME, STOCK_DETAIL_PAGE, CRYPTO_DETAIL_PAGE, TRADE_CELEBRATION, PSP_DETAIL, PSP_CELEBRATION, PSP_HISTORY_DETAIL, INVEST_FLOW_MOO, INVEST_FLOW_SEARCH, INVEST_FLOW_ORDER_ENTRY, INVEST_FLOW_BUDGET_ALLOCATION, INVEST_FLOW_ORDER_PREVIEW, INVEST_FLOW_ORDER_REVIEW, INVEST_FLOW_ORDER_RECEIPT, INVEST_FLOW_DISCOVER, INVEST_FLOW_FREQUENCY, ADVANCED_CHARTS_ONBOARDING, ADVANCED_CHARTS_EQUITY_SEARCH, PSP_INTRO, INVESTOR_PROFILE_COMPLETE, INVESTOR_PROFILE_INTRO, INVESTOR_PROFILE_QUESTION, INVESTOR_PROFILE_REVIEW, EQUITY_TRADING_SESSION_CHANGED_PAGE, ASSET_HOME, DISTRIBUTE_INVEST_FLOW, SUGGESTION_SEARCH, FX_SWITCHER_FTUX, LADDER_MARKETING, LADDER_MARKETING_SEARCH, ROBINHOOD_LIST_DETAIL_PAGE, LIST_DISCOVERY_HUB, USER_LIST_DETAIL_PAGE, EXPANDED_LIST_CAROUSEL, ROBINHOOD_LIST_PICKER, USER_LIST_DETAIL_SEARCH, INVESTING_MONITOR, WATCHLIST_REDESIGN, OPTION_CHAIN_EXPIRATION_PAGE, OPTION_STATISTICS_BOTTOM_SHEET, OPTION_SHOPPING_CART, OPTION_CHAIN, OPTION_STRATEGY_DETAIL, OPTION_AGGREGATE_DETAIL, OPTION_INSTRUMENT_DETAIL, OPTION_WATCHLIST_HUB, OPTION_ORDER_FORM, OPTION_ORDER_CONFIGURATION_SELECTION, OPTION_ORDER_CONFIGURATION_BOTTOM_SHEET, OPTION_WATCHLIST_ABOUT, OPTION_ROLLING_CONTRACT_SELECTOR, OPTIONS_STRATEGY_ROLL, OPTIONS_ROLLING_NUX, OPTION_UPGRADE_L0_WHAT_ARE_OPTIONS, OPTION_UPGRADE_L0_STRATEGIES_PRICE_MOVEMENT, OPTION_UPGRADE_L0_UNDERSTAND_OPTIONS, OPTION_LEGO_CHAIN_PREMIUM, OPTION_LEGO_CHAIN_TRADE_OPTION, OPTION_CHAIN_SETTINGS, OPTION_STRATEGY_BUILDER, OPTION_STRATEGY_BUILDER_NUX, OPTION_STRATEGY_CHAIN, OPTION_STRATEGY_BUILDER_DEEP_LINK_INTRO, OPTION_STRATEGY_BUILDER_DEEP_LINK_SEARCH, OPTION_STRATEGY_BUILDER_AVAILABLE_NUX, OPTION_STRATEGY_BUILDER_NOT_AVAILABLE_NUX, OPTION_STRATEGY_BUILDER_NOT_ELIGIBLE_NUX, OPTION_ORDER_DETAIL, OPTION_CHAIN_CUSTOMIZATION_SETTINGS, OPTION_ORDER_CONFIRMATION, OPTION_SIMULATED_RETURNS, OPTION_EDIT_LEG_RATIO, OPTIONS_STOP_MARKET_NUX, OPTION_EVENT_DETAIL, OPTION_ONBOARDING_START, OPTION_ONBOARDING_SPLASH_L0, OPTION_ONBOARDING_SPLASH_L2, OPTION_ONBOARDING_SPLASH_RETIREMENT, OPTION_ONBOARDING_QUESTION_OPTION_EXPERIENCE, OPTION_ONBOARDING_QUESTION_UNDERSTAND_SPREAD, OPTION_ONBOARDING_QUESTION_INVESTMENT_ADVICE, OPTION_ONBOARDING_QUESTION_FINANCIAL_REGULATOR, OPTION_ONBOARDING_SUITABILITY, OPTION_ONBOARDING_INVESTMENT_PROFILE, OPTION_ONBOARDING_DISCLOSURE, OPTION_ONBOARDING_APPROVED_TRADES, OPTION_ONBOARDING_SUCCESS, OPTION_ONBOARDING_FAILURE, OPTION_ONBOARDING_EDUCATION_SPREAD, OPTION_ONBOARDING_EDUCATION_L3_STRATEGIES, OPTION_ONBOARDING_READY_L3_UPGRADE, OPTION_ONBOARDING_UPSELL_ALERT, OPTION_ONBOARDING_UPSELL_TRADE_ON_EXPIRATION, OPTION_ONBOARDING_UPSELL_ALL_SET, INDEX_DETAIL, UK_OPTION_ONBOARDING_SPLASH_L0, UK_OPTION_ONBOARDING_EDUCATION_BENEFITS, UK_OPTION_ONBOARDING_EDUCATION_RISKS, UK_OPTION_ONBOARDING_EXPERIENCE_QUESTIONNAIRE, UK_OPTION_ONBOARDING_KNOWLEDGE_QUESTIONNAIRE, UK_OPTION_ONBOARDING_INVESTOR_PROFILE, UK_OPTION_ONBOARDING_REVIEW_INVESTOR_PROFILE, UK_OPTION_ONBOARDING_PROFESSIONAL_TRADER, UK_OPTION_ONBOARDING_SPLASH_L2, UK_OPTION_ONBOARDING_EDUCATION_BENEFITS_L2, OPTION_ONBOARDING_JOINT_PENDING, SIDE_BY_SIDE_OPTION_CHAIN, OPTIONS_SBS_CHAIN, APAC_OPTION_ONBOARDING_SPLASH_L0, APAC_OPTION_ONBOARDING_CAR_QUESTIONNAIRE, SIDE_BY_SIDE_OPTION_CHAIN_ONBOARDING_SEARCH, OPTION_ONBOARDING_JA_APPLICATION_PENDING, COMBO_ORDER_DETAIL, OPTION_L3_ENTRYPOINT_POST_TRADE_UPSELL, OPTION_TRADING_SESSION, OPTION_MANUAL_REVIEW_KNOWLEDGE_CHECK, RECURRING_RECEIPT_UPSELL, RECURRING_FREQUENCY, RECURRING_PAYMENT_METHOD, RECURRING_BACKUP_PAYMENT_METHOD, RECURRING_AMOUNT, RECURRING_HUB, RECURRING_FIND_INVESTMENT_PAGE, RECURRING_DETAIL, RECURRING_INSIGHTS, RECURRING_DIRECT_DEPOSIT_SOURCE, SYP_LEARN_MORE, RECURRING_AMOUNT_TYPE, RECURRING_UNIFIED_CREATION, SYP_ONBOARDING_DD_CONFIRMATION, SYP_AGREEMENT, SYP_DISCLOSURE_ALERT, RECURRING_ORDER_RECEIPT, RECURRING_ASSET_TYPE_SELECTION, BROKERAGE_CASH_ORDER_ENTRY, MESSAGES, MESSAGES_THREAD, ACCOUNT_DETAIL, ACCOUNT_OVERVIEW, BONFIRE_SETTINGS_PAGE, PROFILE, STATEMENTS_AND_HISTORY, ACCOUNT_HISTORY, ACCOUNT_CENTER, BROKERAGE_STATEMENTS_LIST, TAX_DOCUMENTS_LIST, SPENDING_STATEMENTS_LIST, BROKERAGE_STATEMENT_VIEWER, TAX_DOCUMENT_VIEWER, SPENDING_STATEMENT_VIEWER, ADVANCED_ALERT_HUB, INDICATOR_ALERT_EDITOR, INDICATOR_SELECTOR, ALERT_HUB_SETTING, SIGNUP_FUND_ACCOUNT_INTRO, GROWTH_DEPOSIT_MATCH_OFFER, EQUITY_SELECT_ORDER_KIND_PAGE, EQUITY_ORDER_ENTRY, EQUITY_ORDER_REVIEW, EQUITY_ORDER_RECEIPT, DOLLAR_BASED_ORDER_ENTRY, EQUITY_ORDER_CHECK_ALERT, EQUITY_ADVANCED_CHARTS, STOCK_DETAIL_PAGE_MINI, EQUITY_ADVANCED_CHART_TECHNICAL_INDICATOR_MANAGER, EQUITY_SET_TRADING_HOURS_PAGE, SCREENER_DETAIL, SCREENER_INDICATORS_LIST, SCREENER_INDICATOR_DETAIL, SCREENER_DATA_DISPLAY, SCREENER_PRESET_LIST, ADD_INDICATOR, ADD_INDICATOR_FORM, PRICE_ALERT_EDITOR, EQUITY_ADVANCED_ALERTS_DISCLOSURE, EQUITY_24H_MARKET_REMINDER, SCREENER_LIST, INVESTING_SETTINGS, DAY_TRADE_SETTINGS, EQUITY_ORDER_DETAIL, EQUITY_ENTER_LIMIT_PRICE_PAGE, POST_DAY_TRADE_SCREEN, EQUITY_SET_TIME_IN_FORCE_PAGE, EQUITY_ENTER_STOP_PRICE_PAGE, EQUITY_ENTER_TRAIL_AMOUNT_PAGE, PDT_RULES_UPDATES_INFO, EQUITY_SELECT_ORDER_KIND_MINI_MENU_PAGE, TRADING_TRENDS, TRADING_TRENDS_ONBOARDING_SEARCH, TRADING_TRENDS_ONBOARDING, PROFIT_AND_LOSS_HUB, LEVEL_TWO_MARKET_DATA, ADR_FEE_DETAIL, TAX_LOTS_SELECTION, TAX_LOTS_HISTORY, CUSTOMER_ACCOUNT_REVIEW_SPLASH, MOBILE_ADVANCED_CHARTS, CUSTOMER_ACCOUNT_REVIEW_RESULT_PASS, CUSTOMER_ACCOUNT_REVIEW_RESULT_FAIL, COMPANY_FINANCIALS_ONBOARDING, COMPANY_FINANCIALS_ONBOARDING_SEARCH, EQUITIES_TRADING_LADDER, RESEARCH_REPORT, EQUITIES_SUBZERO_ONBOARDING, EQUITIES_SUBZERO_MARKETING, CRYPTO_ORDER_RECEIPT, CRYPTO_SELECT_ORDER_KIND_PAGE, CRYPTO_ORDER_ENTRY, CRYPTO_DETAIL_PAGE_MINI, CRYPTO_STATEMENTS_LIST, CRYPTO_STATEMENT_VIEWER, CRYPTO_LEARN_AND_EARN, CRYPTO_ORDER_SET_LIMIT_PRICE, CRYPTO_ORDER_INFORMATION, CRYPTO_ORDER_SET_TIME_IN_FORCE, CRYPTO_ORDER_SET_STOP_PRICE, CRYPTO_ORDER_HISTORY_DETAIL, CRYPTO_HOME_TAB, CRYPTO_VALUE_PAGE, L2E_TRY_AGAIN, CRYPTO_ADVANCED_CHARTS, ADVANCED_CHARTS_CRYPTO_SEARCH, ADVANCED_CHARTS_CRYPTO_ONBOARDING, CRYPTO_ADVANCED_CHART_TECHNICAL_INDICATOR_MANAGER, CRYPTO_TRANSFER_ENROLLMENT_FRAUD_INFO, CRYPTO_TRANSFER_ENROLLMENT_PENDING, CRYPTO_TRANSFER_ENROLLMENT_FAILED, CRYPTO_TRANSFER_ENROLLMENT_ADDITIONAL_STEPS_REQUIRED, CRYPTO_TRANSFER_ENROLLMENT_SECURITY_CHECK, CRYPTO_TRANSFER_ENROLLMENT_COMPLETED, CRYPTO_TRADING_COIN_LIST, CRYPTO_SETTINGS, CRYPTO_REFERRAL_DETAIL, RHC_LOGIN_REFERRAL, RHC_SIGNUP_REFERRAL_RH, CRYPTO_STAKING_AMOUNT_ENTRY, CRYPTO_STAKING_HISTORY_DETAIL, CRYPTO_STAKING_HUB, CRYPTO_STAKING_INTRO, CRYPTO_STAKING_ORDER_CONFIRMATION, CRYPTO_STAKING_ORDER_REVIEW, CRYPTO_STAKING_SUMMARY, CRYPTO_TRANSFER_SEND_MEMO, STAKING_UPSELL, CRYPTO_VOLUME_TIER_PRIMER, CRYPTO_VOLUME_TIER_HUB, CRYPTO_VOLUME_TIER_EXPLAINER, CRYPTO_VOLUME_TIER_INELIGIBLE, CRYPTO_TRANSFER_SEARCH, CRYPTO_MAIN_NEWSFEED, CRYPTO_TAX_LOTS_PRIMER, EU_CRYPTO_COUNTDOWN_PAGE, EU_CRYPTO_REWARD_GRANTED, VOLUME_TIERS_DEPOSIT_PROMO_INFO, CRYPTO_VOLUME_TIER_ENROLLMENT_CONFIRMATION, CRYPTO_DEPOSIT_INCENTIVE_ERROR, CRYPTO_ORDER_SELECT_PAYMENT_METHOD, CRYPTO_TRADING_LADDER, API_TRADING_TERMS, CRYPTO_QUICK_TRADE_SHEET, TRANSFER_DETAILS, BANKING, EARLY_PAY_TRANSFER_DETAILS, INSTANT_DEPOSIT_OUTCOME, INSTANT_DEPOSIT_EDUCATION, PLAID_LINK_BANK_ACCOUNT, LIST_DETAIL_PAGE, CRYTPO_NEWSFEED, ORDER_RECEIPT, SELECT_ORDER_KIND_PAGE, RECURRING_ORDER_REVIEW, OPTIONS_STRATEGY_ROLL_NO_AVAILABLE_POSITIONS, OPTIONS_STRATEGY_ROLL_STRATEGY_SUMMARY, IAV_SELECT_BANK_ACCOUNT, CREATE_QUEUED_DEPOSIT, REVIEW_QUEUED_DEPOSIT, GOLD_BILLING_PAYMENT_PREFERENCE, CREATE_TRANSFER, REVIEW_TRANSFER, CREATE_MAX_TRANSFER, VERIFY_DEBIT_CARD_SPLASH, VERIFY_DEBIT_CARD_STEPS, VERIFY_DEBIT_CARD_CODE_ENTRY, ORDER_CONFIRMATION_FUNDING_UPSELL, LIMIT_HUB, WIRE_TRANSFER, WIRE_VAN_DETAILS, WIRE_INFO_SCREEN, POST_TRANSFER_PAGE_RFP_PENDING, RECURRING_DEPOSIT_UPSELL, GOLD_DEPOSIT_UPSELL, PLAID_BANK_LIST, PLAID_AUTHENTICATION, SEPA_INFO, ACH_GRACE_PERIOD_CONFIRMATION, MARGIN_CALL_WIRE_UPSELL, POST_INCOMING_WIRE, DIRECT_DEPOSIT_HUB, OUTGOING_WIRE_DETAIL_INPUT, OUTGOING_WIRE_LINK_ACCOUNT, LINK_APPLE_PAY_INTRO, LINK_APPLE_PAY_ERROR, LINK_APPLE_PAY_CONFIRMATION, POST_ONBOARDING_FUND_SPLASH, POST_ONBOARDING_FUND_DETAIL, QUEUED_DEPOSIT_LEARN_MORE, POST_QUEUED_DEPOSIT_CONFIRMATION, OUTGOING_WIRE_DETAIL_V2_INPUT, OUTGOING_WIRE_DETAIL_CONFIRMATION, OUTGOING_WIRE_FRAUD_ALERT, CREATE_TRANSFER_V2, WITHDRAW_INTERVENTION_UPSELL, WITHDRAW_INTERVENTION_CONFIRMATION, WIRE_TRANSFER_MEMO, OUTGOING_WIRE_THIRD_PARTY_FRAUD_ALERT, WIRE_TRANSFER_SUBMIT_TITLE_DOCUMENTS, WIRE_TRANSFER_ENTER_BANK_DETAILS, WIRE_TRANSFER_CONFIRM_BANK_DETAILS, INTERNAL_TRANSFER_SELECTION, I18N_CURRENCY_SELECTION, I18N_METHOD_SELECTION, I18N_ACCOUNT_INFO, I18N_POST_DEPOSIT, I18N_ACCOUNT_SELECTION, I18N_TRANSFER_CREATE, I18N_MEMO, I18N_TRANSFER_REVIEW, POST_TRANSFER_TIMELINE, I18N_TRANSFER_ACCOUNT_INFO, I18N_TRANSFER_ACCOUNT_SELECTION, I18N_TRANSFER_CURRENCY_SELECTION, I18N_TRANSFER_METHOD_SELECTION, I18N_TRANSFER_MEMO, RECURRING_EXTRA_CASH_SPLASH, EXTRA_CASH_SETUP_ACCOUNT_SELECTION, EXTRA_CASH_SETUP_SET_AMOUNT, EXTRA_CASH_SETUP_REVIEW, RECURRING_TRANSFERS_HUB, ISA_CASH_TRANSFER_INTRO, ISA_CASH_TRANSFER_SELECT_TYPE, ISA_CASH_TRANSFER_SELECT_PROVIDER, ISA_CASH_TRANSFER_MANUAL_PROVIDER, ISA_CASH_TRANSFER_ACCOUNT_NUMBER, ISA_CASH_TRANSFER_SORT_CODE, ISA_CASH_TRANSFER_CONFIRM_DETAILS, ISA_CASH_TRANSFER_UPDATE_YOUR_DETAILS, ISA_CASH_TRANSFER_SELECT_AMOUNT, ISA_CASH_TRANSFER_ONLY_CASH_INFO, ISA_CASH_TRANSFER_ENTER_AMOUNT, ISA_CASH_TRANSFER_CURRENT_TAX_YEAR, ISA_CASH_TRANSFER_DECLARATION, ISA_CASH_TRANSFER_REVIEW_AND_SUBMIT, ISA_CASH_TRANSFER_REQUEST_RECEIVED, EDUCATIONAL_PROPS_EXPLAIN, PICK_STOCK_SCREEN, SWIPE_TO_CLAIM_SCREEN, CLAIMED_SCREEN, CLAIM_REWARD, REFERRAL_REWARD_OFFER_DETAIL, CONTACTS_LIST, PAST_REWARDS, REWARD_OFFER_DETAIL, SDP_REFERRAL, REFERRAL_REWARD_OFFER_DETAIL_INFO, REFERRAL_INVITE_SENT_CONFIRMATION_DIALOG, C2C_REFERRAL_OFFER_SENDER_DETAILS_PAGE, C2C_REFERRAL_OFFER_RECEIVER_DETAILS_PAGE, C2C_REFERRAL_OFFER_SENDER_FRIENDS_LIST, NCDI_DEPOSIT_PERIOD_PAGE, NCDI_HOLD_PERIOD_PAGE, NCDI_HOLD_PERIOD_WITHDREW_PAGE, REWARD_OFFERS_LIST, POST_REWARD_CLAIM_UPSELL_SCREEN, FELIX_INTRODUCTION, FELIX_USER_ARCHETYPE, FELIX_TIMELINE, FELIX_ASSET_BREAKDOWN, FELIX_USERBASE_SIZE, FELIX_INVESTING_CULTURE, FELIX_OUTRO, FELIX_OUTRO_ANIMATION, FELIX_MANIFESTO, IRR_REQUEST, IRR_DELETE, IRR_REQUEST_CONFIRMATION, IRR_DELETE_CONFIRMATION, IRR_REQUEST_IN_PROGRESS, IRR_DELETE_IN_PROGRESS, IRR_DOWNLOAD, IPOA_ALLOCATED_RESULT, IPOA_SUMMARY, IPOA_ENROLLMENT, IPOA_LIST, IPOA_NOT_ALLOCATED_RESULT, IPOA_ANNOUNCEMENT, IPOA_LEARNING_HUB, IPOA_COB_FOLLOW_UP, IPOA_NOT_ALLOCATED, PRE_IPO_BID, LOGIN, SECURITY_PRIVACY_CENTER, IN_APP_VERIFICATION, PASSWORD_UPDATE, PASSWORD_UPDATE_SUCCESS, EMAIL_UPDATE, EMAIL_UPDATE_VERIFICATION, EMAIL_UPDATE_SUCCESS, PHONE_UPDATE, PHONE_UPDATE_CONFIRMATION, PHONE_UPDATE_VERIFICATION, PHONE_UPDATE_SUCCESS, TWO_FACTOR_AUTHENTICATION, MFA_AUTH_APP_SELECTION, MFA_BACKUP_CODE, MFA_SMS_VERIFICATION, VOICE_ENROLLMENT_INTRO, VOICE_ENROLLMENT_CONSENT, VOICE_RECORD, VOICE_ENROLLMENT_COMPLETE, VOICE_VERIFICATION_SETTINGS, TRUSTED_DEVICES, DEVICE_APPROVAL, DEVICE_APPROVAL_BLOCKED, DEVICE_APPROVAL_LOGIN_APPROVED, DEVICE_APPROVAL_LOGIN, DEVICE_APPROVAL_LOGIN_BLOCKED, DEVICE_APPROVAL_ENROLL, RESET_PASSWORD, IAV_DEVICE_APPROVAL_SILENT_RESULT, IAV_DEVICE_APPROVAL_SILENT_WAITING, DEVICE_SECURITY_SETTINGS, PASSKEY_LOGIN, WEBAUTHN_ENROLLMENT_SUCCESS, WEBAUTHN_ENROLLMENT_EDUCATION, DEVICE_APPROVAL_HANDLING, DEVICE_APPROVAL_HANDLING_BLOCKED, KBA_VERIFICATION, REVAMP_LOGIN_CONFIRM_EMAIL, REVAMP_LOGIN_UPDATE_EMAIL, REVAMP_LOGIN_VERIFY_EMAIL, REVAMP_LOGIN_ASK_UPDATE_PASSWORD, REVAMP_LOGIN_UPDATE_PASSWORD, LOGGED_IN_IDENTITY_VERIFICATION_WAIT, PRISM, WORKFLOW_UPDATE_APP, WORKFLOW_INFO, WORKFLOW_SMS_CHALLENGE, WORKFLOW_DEVICE_APPROVAL_CHALLENGE, WORKFLOW_PLAID_BANK_LIST, WORKFLOW_PLAID_AUTH, WORKFLOW_GKBA, WORKFLOW_EMAIL_CHALLENGE, WORKFLOW_KYC_STATUS_CHECK, WORKFLOW_REQUEST_PHONE_CALL, WORKFLOW_KYC_AGREEMENT, WORKFLOW_KYC_WAITING, WORKFLOW_REQUEST_PHONE_CALL_SELECT_COUNTRY, WORKFLOW_REQUEST_PHONE_CALL_EDIT, WORKFLOW_CHECKLIST, RHY_MIGRATION_FEATURE_REWARDS, RHY_MIGRATION_FEATURE_DIRECT_DEPOSIT, RHY_MIGRATION_CONTRAST_MULTIPLE_ACCOUNTS, RHY_MIGRATION_AGREEMENT, RHY_MIGRATION_CONFIRM_ADDRESS, RHY_MIGRATION_OPEN_SPENDING_ACCOUNT, RHY_MIGRATION_TIME_OUT_BOTTOM_SHEET, RHY_MIGRATION_REVIEW_CHANGES, RHY_MIGRATION_SELECT_CARD, RHY_MIGRATION_CONFIRMATION, RHY_MIGRATION_FEATURE_MERCHANT_REWARDS, RHY_MIGRATION_INTRO_LONG, RHY_MIGRATION_FUNDING, RHY_MIGRATION_SETUP_CHECKLIST, RHY_MIGRATION_OPT_OUT, RHY_MIGRATION_SETUP_COMPLETE, RHY_MIGRATION_DD_SETUP, RHY_TURBOTAX_INTRO, RHY_TURBOTAX_OFFER_SELECTION, RHY_TURBOTAX_OPEN_ACCOUNT, RHY_TURBOTAX_ACCOUNT_INFO, RHY_TURBOTAX_ENABLE_EARLY_PAY, RECS_FIRST_TRADE_INTRO, RECS_INVESTOR_PROFILE_INTRO, RECS_INVESTOR_PROFILE_QUESTION, RECS_INVESTOR_PROFILE_SECTION_COVER, RECS_RISK_LOADER, RECS_RISK_PROFILE, RECS_CONFIRM_QUESTIONNAIRE, RECS_PORTFOLIO_INTRO, RECS_PORTFOLIO_DIVERSIFICATION, RECS_PORTFOLIO_WALKTHROUGH, RECS_LEARN_MORE, RECS_PORTFOLIO_ALLOCATION, RECS_PORTFOLIO_SUMMARY, RECS_ORDER_ENTRY, RECS_ORDER_PREVIEW, RECS_ORDER_REVIEW, RECS_DISCLOSURE, RECS_ORDER_SUMMARY, RECS_ORDER_RECEIPT, RECS_TRADE_CELEBRATION, RECS_UNAVAILABLE, RECS_PORTFOLIO_INCLUDES, RECS_REENTRY_INTRO, RECS_REENTRY_CONFIRMATION, RECS_REENTRY_EDIT, RECOMMENDATIONS_ONBOARDING_INTRO, RECS_RET_INTRO, RECS_RET_QUESTIONNAIRE_RESULTS, RECS_RET_PORTFOLIO, RECS_RET_TRADE_CELEBRATION, RECS_RET_RECURRING_HOOK, RECS_RET_RECURRING_DECISION, RECS_RET_CONGRATS, RECS_RET_QUESTIONNAIRE_RESULTS_INTRO, RECS_RET_PROSPECTUS, WAITLIST, LEARNING_LESSON_SELECTOR, LEARNING_LESSON, LEARNING_LESSON_V2, SAFETY_LABEL_LESSON, EDUCATION_TOUR, LEARNING_LESSON_V3, EDUCATION_HOME, SNACKS_ARTICLE_PAGE, L2E_ONBOARDING, ACATS_IN_ACCOUNT_ELIGIBLE, ACATS_IN_ACCOUNT_MAY_BE_ELIGIBLE, ACATS_IN_ACCOUNT_NOT_ELIGIBLE, ACATS_IN_ACCOUNT_NUMBER_ENTRY, ACATS_IN_CELEBRATION, ACATS_IN_CONFIRMATION, ACATS_IN_CONFIRM_NAME, ACATS_IN_DTC_ENTRY, ACATS_IN_ELIGIBILITY_QUESTION, ACATS_IN_INTRO, ACATS_IN_NAME_CHANGE, ACATS_IN_SELECT_BROKERAGE, ACATS_IN_SUBMIT, ACATS_IN_TERMS_AND_CONDITIONS, ACATS_IN_ACCOUNT_SELECTION, ACATS_IN_TRANSFER_CONTENTS, ACATS_IN_NON_GOLD_UPGRADE, ACATS_IN_GOLD_USER_MARGIN_UPGRADE, ACATS_IN_PARTIAL_TRANSFER, ACATS_IN_MARGIN_ENABLEMENT, ACATS_IN_IDENTIFY_PARTIAL_ASSETS, ACATS_IN_PARTIAL_SEARCH_INSTRUMENT, ACATS_IN_PARTIAL_ADD_INSTRUMENT, ACATS_IN_BONUS_MATCH, ACAT_HISTORY_DETAIL, ACAT_RETRY, ACATS_IN_PARTIAL_TRANSFER_ELIGIBLE, ACATS_IN_EDIT_ASSET, ACATS_IN_UNSUPPORTED_ASSETS, ACATS_IN_TRANSFER_UNSUPPORTED, ACATS_IN_OPTIONS_ENABLEMENT, MARGIN_ACATS_LANDING, INTERNAL_ASSET_TRANSFER_TRANSFER_TYPE, INTERNAL_ASSET_TRANSFER_ASSET_SELECTION, INTERNAL_ASSET_TRANSFER_EDIT_EQUITY, INTERNAL_ASSET_TRANSFER_EDIT_CASH, INTERNAL_ASSET_TRANSFER_EDIT_MARGIN, CLAWBACK_GRACE_PERIOD_OPT_IN_SCREEN, ACATS_CUSTODIALS_REVIEW, TRANSFER_INFO, ACATS_TRANSFER_INFO, ACATS_IN_INFO_REVIEW, ACATS_IN_TRANSFER_INFO, ACATS_IN_CONFIRM_ACCOUNT_INFO, ACATS_IN_ACCOUNT_INFO_MISMATCH, RHY_SPENDING_HOME, RHY_BACKUP_COVERAGE_BOTTOM_SHEET, RHY_BACKUP_COVERAGE_DETAILS, RHY_SPENDING_SETTINGS, RHY_SPENDING_CARD_CONTROLS, SPENDING_ACCOUNT_CREATED, RHY_POST_SIGNUP, CRYPTO_GIFT_EDIT, CRYPTO_GIFT_ONBOARDING, CRYPTO_GIFT_PURCHASE_CONFIRMATION, CRYPTO_GIFT_RECEIVE_DETAILS, CRYPTO_GIFT_RECEIVE_CONFIRMATION, CREATE_GRYPTO_GIFT_ERROR_DIALOG, RECEIVE_GRYPTO_GIFT_ERROR_DIALOG, CRYPTO_GIFT_PURCHASE_DETAILS, CREATE_CRYPTO_GIFT_LOADING, RECEIVE_CRYPTO_GIFT_LOADING, CRYPTO_GIFT_DASHBOARD, CANCEL_CRYPTO_GIFT, SHAREHOLDER_QA_INTRO, SHAREHOLDER_QA_INTRO_DISCLOSURE, SHAREHOLDER_ASK_A_QUESTION, SHAREHOLDER_QUESTIONS_LIST, SHAREHOLDER_EVENTS_LIST, BENEFICIARY_LIST, BENEFICIARY_VALUE_PROP, BENEFICIARY_DISCLOSURE, BENEFICIARY_NAME_INPUT, BENEFICIARY_RELATIONSHIP_INPUT, BENEFICIARY_SPOUSAL_AGREEMENT, BENEFICIARY_DOB_INPUT, BENEFICIARY_EMAIL_INPUT, BENEFICIARY_DETAIL, BENEFICIARY_ACCOUNT_SELECTION, BENEFICIARY_TYPE, BENEFICIARY_TRUST_DATE_INPUT, BENEFICIARY_TRUST_NAME_INPUT, BENEFICIARY_TRUST_TAX_ID_INPUT, BENEFICIARY_TRUSTEE_EMAIL_INPUT, BENEFICIARY_LEVEL, BENEFICIARY_CHOOSE_EXISTING, CRYPTO_TRANSFER_RECEIVE, CRYPTO_TRANSFER_SEND_AMOUNT, CRYPTO_TRANSFER_SEND_ADDRESS, CRYPTO_TRANSFER_SEND_REVIEW, CRYPTO_TRANSFER_SEND_CONFIRMATION, CRYPTO_TRANSFER_SEND_QR_SCANNER, CRYPTO_TRANSFER_ENROLLMENT_PRODUCT_INTRO, CRYPTO_TRANSFER_ENROLLMENT_AGREEMENT, CRYPTO_TRANSFER_ENROLLMENT_STEPS, CRYPTO_TRANSFER_SEND_NETWORK, CRYPTO_TRANSFER_LIMITS, CRYPTO_TRANSFER_SEND_PARTY_SELECTION, CRYPTO_TRANSFER_SEND_WALLET_SELECTION, CRYPTO_TRANSFER_SEND_EXCHANGE, CRYPTO_TRANSFER_SEND_EXCHANGE_SEARCH, CRYPTO_TRANSFER_SEND_RECEIVER_NAME, CRYPTO_TRANSFER_SEND_RECEIVER_DOB, CRYPTO_TRANSFER_SEND_PENDING_REVIEW, CRYPTO_TRANSFER_SEND_FAILED, CRYPTO_TRANSFER_HISTORY_DETAIL, CRYPTO_TRANSFER_RECEIVE_PARTY_SELECTION, CRYPTO_TRANSFER_RECEIVE_WALLET_SELECTION, CRYPTO_TRANSFER_RECEIVE_PENDING_REVIEW, CRYPTO_TRANSFER_RECEIVE_FAILED, CRYPTO_TRANSFER_RECEIVE_CONTACT_SUPPORT, CRYPTO_TRANSFER_RECEIVE_EXCHANGE, RHY_WAITLIST_SIGN_UP, RHY_WAITLIST_MARKETING_SPLASH, PAYCHECK_HUB, PAYCHECK_INVESTMENT_HUB, SLIP_ONBOARDING_INTRO, SLIP_ONBOARDING_EDUCATION, SLIP_ONBOARDING_CALCULATOR, SLIP_ONBOARDING_RISKS, SLIP_ONBOARDING_FAQS, SLIP_ONBOARDING_AGREEMENTS, SLIP_ONBOARDING_CONFIRMATION, SLIP_HUB, SLIP_HUB_SETTING, SLIP_ONBOARDING_INTRO_ABBREVIATED, SLIP_ONBOARDING_AGREEMENTS_ABBREVIATED, SLIP_UPDATED_AGREEMENT, SLIP_ONBOARDING_INTRO_V3, SLIP_ONBOARDING_VALUE_PROPS, SLIP_ONBOARDING_ELIGIBILITY_CHECKLIST, SLIP_POST_TRADE_UPSELL, SLIP_LEARN_AND_EARN_REWARD, SLIP_ONE_CLICK_AGREEMENTS, CREATE_ACCOUNT_CONGRATULATIONS, CLAIM_FRACTIONAL_REWARD_GENERIC_INFO, PROGRESSIVE_ONBOARDING_EXPECTATION, PROGRESSIVE_ONBOARDING_RESUME_TRADE_SPLASH, WELCOME_SAFETY_FIRST, WELCOME_START_WITH_DOLLAR, WELCOME_INVESTING, WELCOME_MAIN, USER_CREATION_SPLASH, USER_CREATION_EMAIL, USER_CREATION_PASSWORD, USER_CREATION_LEGAL_NAME, ONBOARDING_TAKEOVER, WELCOME_GB_MAIN, IDENTITY_VERIFICATION_SPLASH, CONFIRM_REGION, PERSONA_IDENTITY_VERIFICATION, COUNTRY_UNAVAILABLE_ERROR, RESUME_APPLICATION_V1_TAKEOVER, RESUME_APPLICATION_V2_TAKEOVER, ONBOARDING_DEPOSIT_PAGE, RESURRECTION_SPLASH, SELECT_RETIREMENT_CONTRIBUTION_TYPE, SELECT_RETIREMENT_TAX_YEAR, RETIREMENT_STATEMENTS_LIST, RETIREMENT_STATEMENT_VIEWER, IRA_DISTRIBUTION_FAQ, SELECT_IRA_DISTRIBUTION_TYPE, EDIT_IRA_TAX_WITHHOLDINGS, RETIREMENT_DASHBOARD, RETIREMENT_CONTRIBUTION_HUB, RETIREMENT_ACCOUNT_SELECTION, RETIREMENT_ACCOUNT_COMPARISON, RETIREMENT_ACCOUNT_DESCRIPTION, RETIREMENT_INSTANT, RETIREMENT_REVIEW_AGREEMENTS, RETIREMENT_SIGNUP_SUCCESS, RETIREMENT_SIGNUP_ERROR, ENOKI_CONTRIBUTION_CELEBRATION, RETIREMENT_ONBOARDING_SWIPEY, RETIREMENT_WAITLIST, RETIREMENT_OPTIONS_OPT_IN, CREATE_RETIREMENT_CONTRIBUTION, RETIREMENT_OPTIONS_CONFIRM_ELIGIBILITY, RETIREMENT_OPTIONS_CHECK_ELIGIBILITY, RETIREMENT_401K_ROLLOVER_EDUCATION, RETIREMENT_401K_ROLLOVER_OPTIONS, RETIREMENT_401K_ROLLOVER_TERMS, RETIREMENT_401K_ROLLOVER_CAPITALIZE, RETIREMENT_401K_ROLLOVER_DIY, RETIREMENT_401K_ROLLOVER_QUESTIONS, RETIREMENT_SIGNUP_LOADING, RECS_RET_BUY_AGAIN, RETIREMENT_SIGNUP_WHICH_IRA, RETIREMENT_INVEST, RETIREMENT_TAX_BENEFITS, IRA_SYP_INTRO, ROTH_CONVERSION_INFO, RETIREMENT_MULTIPLE_FUNDING_METHODS, RETIREMENT_LEARN_AND_EARN_REWARD, RETIREMENT_MATCH_RATE_SELECTION, RETIREMENT_ENOKI_INFO, RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_INTRO, RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_QUESTION, RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_RESULT, RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION, RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION_AGREEMENTS, RETIREMENT_ONBOARDING_MANAGEMENT_TYPE_SELECTION, RETIREMENT_SCROLLING_VALUE_PROP, ADVISORY_PORTFOLIO_REVEAL_INTRO, ADVISORY_PORTFOLIO_REVEAL_BREAKDOWN, ADVISORY_PORTFOLIO_REVEAL_PROJECTION, RETIREMENT_1099_PARTNERSHIP_DETAIL, RETIREMENT_MATCH_HUB, RETIREMENT_ONBOARDING_FUNDING_METHODS, TAX_SEASON_PROMO_2024_PROMO, TAX_SEASON_PROMO_2024_MATCH_SELECTOR, TAX_SEASON_PROMO_2024_TIMELINE, RETIREMENT_401K_ROLLOVER_METHOD_SELECTION, RETIREMENT_401K_ROLLOVER_VERIFY_INFO, RETIREMENT_401K_ROLLOVER_INTERSTITIAL, RETIREMENT_401K_ROLLOVER_CAPITALIZE_EMBED, TAX_SEASON_PROMO_2024_MATCH_AGREEMENTS, IRA_MANAGEMENT_STYLE_SELECTION, RETIREMENT_401K_FINDER_INTERSTITIAL, RETIREMENT_401K_FINDER_RESULTS, RETIREMENT_401K_FINDER_ACCOUNT_DETAILS, RETIREMENT_401K_FINDER_NO_RESULTS, RETIREMENT_401K_FINDER_NOT_SUPPORTED, SWEEP_ONBOARDING, SWEEP_ONBOARDING_VALUE_PROPS, SWEEP_ONBOARDING_CONFIRMATION, SWEEP_ONBOARDING_AGREEMENT, GOLD_VALUE_PROPS, GOLD_AGREEMENT, SWEEP_ONBOARDING_CONFIRMATION_WITH_GOLD, SWEEP_ONBOARDING_AGREEMENTS_LIST, SWEEP_ONBOARDING_SELECT_RATE, SWEEP_ONBOARDING_ERROR, GOLD_UPGRADE_SUCCESS, SWEEP_ONBOARDING_HOW_IT_WORKS, CHOOSE_LINKING_PAYMENT_METHOD, DEBIT_CARD_NUMBERS_INPUT, DEBIT_CARD_NAME_INPUT, DEBIT_CARD_LINKING_LOADING, DEBIT_CARD_LINKING_CONFIRMATION, POST_TRANSFER_CONFIRMATION, TRANSFER_ACCOUNT_SELECTION, DEBIT_CARD_LINKING_SPLASH_SCREEN, MARGIN_UPGRADE_SPLASH, MARGIN_UPGRADE_EDUCATION, MARGIN_UPGRADE_VALUE_PROPS, MARGIN_UPGRADE_ELIGIBILITY, MARGIN_UPGRADE_MARGIN_LIMIT_SET, MARGIN_UPGRADE_MARGIN_WITHDRAWAL_SET, MARGIN_UPGRADE_INTEREST_RATE_SELECTION, GOLD_AND_MARGIN_VALUE_PROPS, MARGIN_UPGRADE_AGREEMENT, MARGIN_UPGRADE_REVIEW, MARGIN_UPGRADE_ERROR, MARGIN_UPGRADE_GOLD_AGREEMENT, MARGIN_UPGRADE_CONFIRMATION, MARGIN_UPGRADE_GOLD_ONLY_CONFIRMATION, MARGIN_UPGRADE_NOT_ELIGIBLE, MARGIN_UPGRADE_GOLD_CONFIRMATION, MARGIN_LIMIT_EDIT, MARGIN_UPGRADE_REVIEW_INVESTMENT_PROFILE, MARGIN_CALL_MAINTENANCE, MARGIN_CALL_MAINTENANCE_RESOLVED, NEAR_MARGIN_CALL, BUYING_POWER, MARGIN_CALL_WARN, DAY_TRADE_CALL_RESOLVED, MARGIN_BATCH_SELL_STOCK, BUYING_POWER_HUB, MARGIN_STATUS_DETAIL, MARGIN_REQUIREMENT_TABLE, RISKY_DEPOSIT_INSTANT_UPSELL, MARGIN_UPGRADE_TIERED_RATES, MARGIN_UPGRADE_GOLD_UPSELL, UK_MARGIN_ONBOARDING_LOSSES, UK_MARGIN_ONBOARDING_GAINS, UK_MARGIN_ONBOARDING_POTENTIAL_RISKS, UK_MARGIN_ONBOARDING_MANAGE_RISKS, UK_MARGIN_ONBOARDING_INVESTOR_PROFILE_SPLASH, UK_MARGIN_ONBOARDING_EXPERIENCE_TEST_SPLASH, UK_MARGIN_ONBOARDING_KNOWLEDGE_TEST_SPLASH, MARGIN_MAINTENANCE_TABLE, MARGIN_MAINTENANCE_TABLE_ON_MARGIN_CALL, MARGIN_CALL_V2_CLOSE_POSITIONS_SUMMARY, MARGIN_CALL_V2_MARKET_ORDER, APP_MFA_ENROLLMENT_INTRODUCTION, APP_MFA_ENROLLMENT_DOWNLOAD, V1_TWO_FACTOR_TOTP_TOKEN, MANUAL_APP_MFA_ENROLLMENT_KEY, MANUAL_APP_MFA_ENROLLMENT_INTRODUCTION, V1_TWO_FACTOR_CONFIRM_TOTP_TOKEN, APP_MFA_ENROLLMENT_CODE, APP_MFA_ENROLLMENT_CONFIRMATION, APP_MFA_ENROLLMENT_BACKUP_CODE, V1_TWO_FACTOR_BACKUP_CODE, PROMPT_MFA_ENROLLMENT_INTRODUCTION, PROMPT_MFA_ENROLLMENT_CONFIRMATION, SMS_MFA_ENROLLMENT_INTRODUCTION, V1_TWO_FACTOR_CONFIRM_PHONE_NUMBER, SMS_MFA_ENROLLMENT_CODE, SMS_MFA_ENROLLMENT_BACKUP_CODE, SMS_MFA_ENROLLMENT_CONFIRMATION, V1_TWO_FACTOR_TOTP_BACKUP_CODE, V1_TWO_FACTOR_SMS_BACKUP_CODE, NCW_HOME, NCW_ONBOARDING_PRODUCT_INTRO, NCW_ONBOARDING_CREATE_IMPORT, NCW_CREATE_PIN, NCW_BACKUPS_SECURITY, NCW_IMPORTING_WALLET_RECOVERY_PHRASE, NCW_CREATING_WALLET_PROGRESS, NCW_CREATING_WALLET_CREATED, NCW_BACKUP_WALLET, NCW_SEARCH, NCW_CRYPTO_DETAIL_PAGE, NCW_OMNISCAN, NCW_WALLET_HUB, NCW_CRYPTO_TRANSFER_SEND_ADDRESS, NCW_CRYPTO_TRANSFER_SEND_CONFIRMATION, NCW_CRYPTO_TRANSFER_AMOUNT, NCW_CRYPTO_TRANSFER_SEND_REVIEW, NCW_CRYPTO_TRANSFER_SELECT_TOKEN, NCW_CRYPTO_TRANSFER_RECEIVE, 
            NCW_FUND_WALLET, NCW_TRUSTED_DAPPS, NCW_CRYPTO_SWAP_AMOUNT_ENTRY, NCW_CRYPTO_SWAP_ORDER_REVIEW, NCW_CRYPTO_SWAP_ORDER_CONFIRMATION, NCW_CRYPTO_TOKEN_LIST, NCW_ONBOARDING_SECURITY, NCW_ONBOARDING_CLAIM_COIN, NCW_ONBOARDING_SUCCESS, NCW_FUNDING_SELECT_TOKEN, NCW_LEARN_AND_EARN_LESSON, NCW_LEARN_AND_EARN_LESSON_COMPLETED, NCW_WEB3_MAIN, NCW_WEB3_BROWSER, NCW_WEB3_INFO, NCW_REWARD, NCW_DISCOVER_CRYPTO_NEWS, NCW_DISCOVER_TOP_LIST, NCW_TOKEN_VISIBILITY, NCW_CLAIM_REWARD, NCW_CONFIRM_REWARD, NCW_APP_REDIRECT, NCW_WALLET_BACKUP_TYPE, NCW_WEB3_LAUNCHPAD, NCW_BUY_CHOOSE_PROVIDER, NCW_BUY_RH_SPLASH_CONNECT, NCW_BUY_SPLASH_SARDINE, NCW_LAUNCH_SPLASH, NCW_GOLD_PROMO_PRIMER, NCW_GOLD_PROMO_PRIMER_CONNECTED, GOLD_STATUS_NCW_AUTH, NCW_ONBOARDING_STARTER, NCW_ONBOARDING_BACKUP, NCW_ONBOARDING_NOTIFICATION_PROMPT, NCW_IMPORTING_WALLET_CLOUD, NCW_IMPORTING_WALLET_REVIEW, NCW_OFFRAMP_SPLASH, NCW_OFFRAMP_TOKEN_SELECTION, NCW_OFFRAMP_NETWORK_SELECTION, NCW_OFFRAMP_AMOUNT_INPUT, HOME_QUICK_NAV, HOME_PORTFOLIO_TABLE, RECURRING_DEPOSITS_HUB, CHOOSE_TRANSFER_FREQUENCY, RECURRING_DEPOSIT_DETAIL, GOLD_REFERRAL_PROGRAM, GOLD_AGREEMENTS_LIST, GOLD_ONBOARDING_LANDING, GOLD_ONBOARDING_SWEEP_AGREEMENTS, GOLD_ONBOARDING_AGREEMENTS, GOLD_ONBOARDING_MARGIN_AGREEMENTS, GOLD_ONBOARDING_MARGIN_AVAILABLE_MARGIN, GOLD_ONBOARDING_MARGIN_CHECK, GOLD_ONBOARDING_MARGIN_INFO, GOLD_ONBOARDING_SUCCESS, GOLD_ONBOARDING_ERROR, GOLD_ONBOARDING_OLD_LANDING, GOLD_ONBOARDING_OLD_SUCCESS, RETIREMENT_GOLD_MATCH_VALUE_PROPS, GOLD_HUB, GOLD_SUGGESTED_ACTION, GOLD_CELEBRATION, GOLD_PLAN_SELECTION, GOLD_DOWNGRADE_CONFIRMATION, APY_BOOST_CELEBRATION, GOLD_TAB, GOLD_DEPOSIT_BONUS_CELEBRATION, FUNCTIONAL_DEPOSIT_UPSELL, GOLD_DEPOSIT_BONUS_UPCOMING_PAYOUTS, GOLD_DEPOSIT_BONUS_CELEBRATION_TIMELINE, GOLD_DEPOSIT_BOOST_HUB, GOLD_DEPOSIT_BONUS_PAYOUT_DETAIL, GOLD_DEPOSIT_BONUS_ADJUSTMENT_DETAIL, GOLD_SWITCH_PLANS_CONFIRMATION, GOLD_PRIMARY_PAYMENT_METHOD, GOLD_BACKUP_PAYMENT_METHOD, GOLD_EXTRA_AGREEMENTS, LIVE_TRIVIA, GOLD_EVENT_LIVE_2025, GOLD_SAGE_SPLASH, GOLD_SAGE_TIMELINE, GOLD_SAGE_RATE, GOLD_SAGE_START_APPLICATION, GOLD_SAGE_APPLICATION, GOLD_YG_BACKUP_BILLING_SURFACE, CATPAY_ORDER_AMOUNT_INPUT, CATPAY_ORDER_REVIEW, CATPAY_LOGIN, P2P_CREATE_TRANSACTION, P2P_SEARCH, P2P_REVIEW_TRANSACTION, P2P_CONFIRMATION, P2P_PROFILE, P2P_VIEW_QR_CODE, P2P_SCAN_QR_CODE, P2P_INTRO, PROFILE_VISIBILITY, P2P_PENDING_TRANSACTIONS, P2P_CLAIM_TRANSFER, P2P_PAY_REQUEST, P2P_ONBOARDING_ATTRIBUTION, P2P_REVIEW_MULTIUSER_TRANSACTION, RETURNS_COMPARISON_INTRO, RETURNS_COMPARISON_SEARCH, SHARE_PORTFOLIO_PAGE, SHARE_PORTFOLIO_LEARN_MORE_ABOUT_REFERRALS, RHY_REFERRALS_TRACKING, RHY_REFERRALS_REFERRER_LANDING_PAGE, RHY_REFERRALS_REFEREE_LANDING_PAGE, RHY_REFERRALS_CONTACT_LIST, RHY_REFERALS_STATUS, RHY_REFERRAL_REWARD_DETAILS, RHY_REFERRALS_WELCOME, RHY_REFERRALS_FUND_LANDING, RHY_REFERRALS_FUND_SUCCESS, RHY_REFERRALS_FUND_PILL, ENABLE_NOTIFICATIONS_PROMPT, START_DEPOSIT, DEPOSIT_IN_PROGRESS, WITHDRAWAL_INPUT, CHOOSE_WITHDRAWAL_ACCOUNT, WITHDRAWAL_REVIEW, WITHDRAWAL_CONFIRMATION, CRYPTO_ORDER_REVIEW, SIGNUP_REWARD_GRANTED, REFERRAL_REWARD_GRANTED, REFERRAL_REWARD_DETAIL, RH_SUPPORT, CONTACT_SUPPORT, TOKENIZED_STOCK_ORDER_ENTRY, TOKENIZED_STOCK_ORDER_TYPE, TOKENIZED_STOCK_ORDER_REVIEW, TOKENIZED_STOCK_ORDER_RECEIPT, TOKENIZED_STOCK_ORDER_HISTORY_DETAIL, IDENTITY, INVESTOR_PROFILE, STOCK_TOKEN_TAX_INFO, STOCK_TOKEN_ASSESSMENT, STOCK_TOKEN_KNOWLEDGE_TEST, TOKENIZED_STOCK_PRIMER, TOKENIZED_STOCK_FAQ, TOKENIZED_STOCK_DETAIL_PAGE, TOKENIZED_STOCK_DETAIL_POSITION_ABOUT, TOKENIZED_STOCK_DETAIL_DISCLOSURE, PERPETUALS_PRIMER, PERPETUALS_ASSESSMENT, PERPETUALS_KNOWLEDGE_TEST, PERPETUALS_ONBOARDING_STATUS, PERPETUALS_AGREEMENT, PERPETUALS_TPSL_ENTRY, PERPETUALS_TPSL_ERROR, PERPETUALS_TPSL_HUB, PERPETUALS_TPSL_CANCELLATIONS, PERPETUALS_ORDER_ENTRY, PERPETUALS_MANUAL_CONTRACT_DETAILS, PERPETUALS_ORDER_TYPE, PERPETUALS_ORDER_REVIEW, PERPETUALS_ORDER_RECEIPT, PERPETUALS_ORDER_HISTORY_DETAIL, PERPETUALS_LIMIT_BUY_INTRO, PERPETUALS_LIMIT_SELL_INTRO, PERPETUALS_STOP_SELL_INTRO, PERPETUALS_STOP_BUY_INTRO, PERPETUALS_LIMIT_ORDER_PRICE, PERPETUALS_LIMIT_ORDER_TIF, PERPETUALS_STOP_ORDER_PRICE, PERPETUALS_STOP_ORDER_TIF, PERPETUALS_POSITION_HUB, PERPETUALS_EXPLORE, PERPETUALS_PNL_BALANCE_DETAIL, PERPETUALS_DETAIL_PAGE, PERPETUALS_LIQUIDATION_DETAILS, PERPETUALS_MARGIN_EDIT, PERPETUALS_MARGIN_EDIT_REVIEW, PERPETUALS_CLOSE_POSITION, PERPETUALS_ORDER_FLOW_NUX, TOKENIZED_LIMIT_BUY_INTRO, TOKENIZED_LIMIT_SELL_INTRO, INTEREST_ENROLLMENT, INTEREST_SETTINGS, CC_APPLICATION_LANDING, CC_APPLICATION_PROFILE_INFO_REVIEW, CC_APPLICATION_PROFILE_INFO_EDIT, CC_APPLICATION_SSN, CC_APPLICATION_RESIDENTIAL_ADDRESS, CC_APPLICATION_ADDRESS_SEARCH, CC_APPLICATION_ADDRESS_MANUAL, CC_APPLICATION_ADDRESS_ERROR, CC_APPLICATION_ADDRESS_SUGGESTION, CC_APPLICATION_INCOME, CC_APPLICATION_TERMS, CC_APPLICATION_LOADING, CC_APPLICATION_FRAUD_ALERT, CC_APPLICATION_FRAUD_ALERT_VERIFICATION_CODE, CC_APPLICATION_FRAUD_ALERT_VERIFIED, CC_APPLICATION_CREDIT_FROZEN, CC_APPLICATION_REVIEW_NEEDED, CC_APPLICATION_ADDRESS_CHALLENGE, CC_APPLICATION_IDV_FAIL, CC_APPLICATION_REJECTED, CC_APPLICATION_LIMIT_REVEAL, CC_APPLICATION_ACCOUNT_TERMS, CC_APPLICATION_SHIPPING_ADDRESS, CC_APPLICATION_SHIPPING_ETA, CC_APPLICATION_DOWNLOAD_APP, CC_WAITLIST_INTRO, CC_WAITLIST_JOINED, CC_WAITLIST_CONFIRMATION, CC_WAITLIST_GOLD_UPSELL, CC_ONBOARDING_LANDING, CC_POST_ONBOARDING, CC_APPLICATION_SOLID_GOLD_DELAY, CC_APPLICATION_SSN_VERIFICATION, CC_APPLICATION_SSN_VERIFIED, CC_APPLICATION_PREMIUM_LIMITS, CC_WAITLIST_POST_SIGNUP_INTRO, CC_WAITLIST_POST_SIGNUP_JOINED, CC_CHOOSE_BANK_ACCOUNT, CC_ADDITIONAL_INFORMATION, JOINT_ACCOUNT_PRIMARY_INTRO, JOINT_ACCOUNT_SEND_INVITE, JOINT_ACCOUNT_INVITE_SENT_CELEBRATION, JOINT_ACCOUNT_CONFIRM_SECONDARY, JOINT_ACCOUNT_PRIMARY_CELEBRATION, JOINT_ACCOUNT_SECONDARY_INTRO, JOINT_ACCOUNT_SECONDARY_CELEBRATION, JOINT_ACCOUNT_HOME, JOINT_ACCOUNT_HELP_CO_OWNER, JOINT_POST_CREATION, JOINT_ACCOUNT_FUNDING_METHODS, INTERNAL_ASSET_TRANSFER_INTRO, INTERNAL_ASSET_TRANSFER_ACCOUNT_SELECTION, INTERNAL_ASSET_TRANSFER_ACCOUNT_SELECTION_LIST, INTERNAL_ASSET_TRANSFER_TAX_IMPLICATIONS, INTERNAL_ASSET_TRANSFER_AGREEMENT, INTERNAL_ASSET_TRANSFER_REVIEW, INTERNAL_ASSET_TRANSFER_ASSET_LIST, INTERNAL_ASSET_TRANSFER_CONFIRMATION, INTERNAL_ASSET_TRANSFER_DETAILS, FUTURES_DETAIL_SCREEN, FUTURES_LADDER_SCREEN, FUTURES_ORDER_FORM_SCREEN, FUTURES_ORDER_FORM_REVIEW_SCREEN, FUTURES_ORDER_CONFIRMATION_SCREEN, FUTURES_ORDER_PLACEMENT_LOADING_SCREEN, FUTURES_VALUE_PROPS_SCREEN, FUTURES_ONBOARDING_REVIEW_INVESTOR_PROFILE_SCREEN, FUTURES_ONBOARDING_AGREEMENTS_AND_DISCLOSURES_SCREEN, FUTURES_LADDER_FUTX, FUTURES_ORDER_HISTORY_DETAIL_SCREEN, FUTURES_LADDER_FTUX, FUTURES_APPLICATION_ACCOUNT_APPROVED, FUTURES_APPLICATION_ACCOUNT_REVIEW_REQUIRED, FUTURES_APPLICATION_ACCOUNT_REJECTED, FUTURES_ONBOARDING_ARBITRATION_AGREEMENT, FUTURES_ONBOARDING_ELIGIBILITY_CHECK, ACATS_IN_PLAID_INTRO, FUTURES_CASH_CORRECTION_HISTORY_DETAIL_SCREEN, FUTURES_EXECUTION_HISTORY_DETAIL_SCREEN, EVENT_CONTRACT_ORDER_HISTORY_DETAIL_SCREEN, FUTURES_ASSET_HOME, BLACK_WIDOW_SPLASH_UPSELL, WEB_CLIENT_PREFERENCE, EOY_GIVEAWAY_2024, PROMOTION_EDUCATION, PROMOTION_CONFIRMATION, EOY_GIVEAWAY_2025, ACCOUNT_TYPE_SELECTION, STRATEGIES_VALUE_PROPS, MANAGEMENT_TYPE_SELECTION, PORTFOLIO_QUESTIONNAIRE_INTRO, ADVISORY_PORTFOLIO_REVEAL_INFO_PAGE, ADVISORY_PORTFOLIO_REVEAL_REGION_DETAILS, ADVISORY_ONBOARDING_FUNDING_METHODS, ADVISORY_ONBOARDING_FEES_PROMO, ADVISORY_ONBOARDING_TRANSFER_NEXT_STEPS, ADVISORY_ONBOARDING_FETCH_ACCOUNT, ADVISORY_ONBOARDING_SUBMIT_DEPOSIT, ADVISORY_ONBOARDING_FIRST_DEPOSIT_CELEBRATION, PORTFOLIO_DRILLDOWN, ADVISORY_FUTURE_RETURNS, ADVISORY_DASHBOARD, ADVISORY_INSIGHT, ADVISORY_INSIGHTS_HUB, ADVISORY_WITHDRAW_AND_CLOSE_ACCOUNT, ADVISORY_GOLD_PERKS, ADVISORY_ACATS_PROMO, RESTRICT_SECURITIES, UPDATE_MANAGED_INVESTOR_PROFILE, UPDATE_MANAGED_INVESTOR_PROFILE_RESULTS, ADVISORY_PORTFOLIO_COMPUTE, STRATEGIES_RETURNS_HUB, ADVISORY_ONBOARDING_QUESTIONNAIRE_REVIEW, ADVISORY_ONBOARDING_QUESTIONNAIRE_INTRO, ADVISORY_ONBOARDING_AGREEMENTS, ADVISORY_RETURNS_HUB, SETTINGS_INVESTING_INVESTOR_PROFILE_GRAPH_TAKEOVER_REVIEW, TAX_LOSS_HARVEST_DASHBOARD, TAX_LOSS_HARVEST_NUX, TAX_LOSS_HARVEST_CUSTOMIZE_INTRO, TAX_LOSS_HARVEST_CHOOSE_ACCOUNTS, TAX_LOSS_HARVEST_LOADING_OPTIONS, TAX_LOSS_HARVEST_OPTIONS_INTRO, TAX_LOSS_HARVEST_CHOOSE_OPTION, TAX_LOSS_HARVEST_CUSTOMIZE_REVIEW, TAX_LOSS_HARVEST_CUSTOMIZE_CELEBRATION, GAINS_AND_LOSSES, EVENT_CONTRACT_DETAIL_PAGE, EVENT_CONTRACT_ORDER_FORM, EVENT_CONTRACT_HUB, EVENT_CONTRACTS_BRACKET_PAGE, EVENT_CONTRACT_ATTESTATION, EVENT_CONTRACT_HUB_V2, EVENT_CONTRACT_ORDER_FORM_RECEIPT, EVENT_CONTRACT_ORDER_FORM_REVIEW, EVENT_CONTRACT_SELECTOR_SCREEN, GAME_DETAIL_PAGE, CASH_BALANCES_DETAILS_PAGE, CORTEX_SDP_DIGEST, CORTEX_SDP_DIGEST_FEEDBACK, SDP_DIGEST_BREAKING, CORTEX_SDP_DIGEST_SOURCE_OVERFLOW, CORTEX_DIGEST_ONBOARDING_SPLASH, CORTEX_DIGEST_ONBOARDING_AGREEMENT, CORTEX_DIGEST_ONBOARDING_SEARCH, CORTEX_CDP_DIGEST, CORTEX_CDP_DIGEST_BREAKING, CORTEX_CDP_DIGEST_FEEDBACK, CORTEX_CDP_DIGEST_SOURCE_OVERFLOW, PORTFOLIO_DIGEST_DETAIL, PORTFOLIO_DIGEST_SPLASH, PORTFOLIO_DIGEST_AGREEMENT, CORTEX_DIGEST_SOURCE_LIST, FEE_TIER_PUSH_NOTIF_UPSELL, SELF_DIRECTED_ACCOUNT_CONFIRMATION, EDIT_ACCOUNT_NICKNAME, ACCOUNT_FUNDING_OPTIONS, MCW_CURRENY_CONVERSION_PAGE, MCW_CONVERSION_SUCCESS_PAGE, NCW_FUNDING_NETWORK_SELECTION, EDIT_ACCOUNT_NICKNAME_LIST, CRYPTO_TRANSFER_MANAGE_SAVED_ADDRESSES, CRYPTO_EXPLORE_LEAF, CRYPTO_TRANSFER_SEND_ADDRESS_ALLOWLIST, CRYPTO_TRANSFER_ALLOWLIST_ENABLED_PRIMER, CRYPTO_TRANSFER_ADD_SAVED_ADDRESS, CRYPTO_TRANSFER_ADD_SAVED_ADDRESS_QR_SCANNER, CRYPTO_TRANSFER_COST_BASIS_HUB, CRYPTO_TRANSFER_COST_BASIS_DETAIL, CRYPTO_TRANSFER_COST_BASIS_INPUT, SOCIAL_HOME, POST_DETAIL, TRADE_HISTORY, USER_PROFILE, QUICK_TRADE_ACTION_SHEET, ACTIVITY_FEED, SOCIAL_SEARCH_SCREEN, SOCIAL_POST_COMPOSER, SOCIAL_ONBOARDING_PAGE, SOCIAL_PROFILE_SETTINGS, PERPETUALS_ORDER_EDIT_LEVERAGE, PERPETUALS_POSITION_EDIT_LEVERAGE, ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TRANSFER_INTRO, ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TRANSFER_DETAIL, ACATS_CRYPTO_MIGRATION_FLOW_ASSET_REVIEW, ACATS_CRYPTO_MIGRATION_FLOW_ASSET_SUBMIT, ACATS_CRYPTO_MIGRATION_FLOW_ASSET_CONFIRMATION, ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TXN_DETAIL, ACATS_CRYPTO_MIGRATION_FLOW_ERROR_WITH_CX, ACATS_CRYPTO_MIGRATION_FLOW_ERROR};
        }

        @JvmStatic
        public static final Name fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Name> getEntries() {
            return $ENTRIES;
        }

        private Name(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Name name = new Name("NAME_UNSPECIFIED", 0, 0);
            NAME_UNSPECIFIED = name;
            CALENDAR_DATE_PICKER = new Name("CALENDAR_DATE_PICKER", 1, 75);
            PHOTO_LIBRARY = new Name("PHOTO_LIBRARY", 2, 82);
            FILE_BROWSER = new Name("FILE_BROWSER", 3, 83);
            MEDIA_UPLOAD_SELECTOR = new Name("MEDIA_UPLOAD_SELECTOR", 4, 84);
            MEDIA_VIEWER = new Name("MEDIA_VIEWER", 5, 85);
            DOWNLOAD_APPS = new Name("DOWNLOAD_APPS", 6, EnumC7081g.f2776x87e624cb);
            ERROR_SCREEN = new Name("ERROR_SCREEN", 7, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE);
            DISCLOSURE = new Name("DISCLOSURE", 8, EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE);
            EMBEDDED_WEBVIEW = new Name("EMBEDDED_WEBVIEW", 9, 457);
            NEW_PRODUCTS_LANDING = new Name("NEW_PRODUCTS_LANDING", 10, 513);
            TAX_CENTER = new Name("TAX_CENTER", 11, 603);
            CUSTOM_ACCOUNT_ACTIVITY_EXPORTER_LIST = new Name("CUSTOM_ACCOUNT_ACTIVITY_EXPORTER_LIST", 12, 622);
            GENERATE_CUSTOM_ACCOUNT_ACTIVITY_REPORT = new Name("GENERATE_CUSTOM_ACCOUNT_ACTIVITY_REPORT", 13, 623);
            PRODUCT_UPSELL = new Name("PRODUCT_UPSELL", 14, 673);
            EMAIL_PREFERENCES_PAGE = new Name("EMAIL_PREFERENCES_PAGE", 15, 723);
            EMAIL_UNSUBSCRIBE_PAGE = new Name("EMAIL_UNSUBSCRIBE_PAGE", 16, 724);
            PIN_SETUP_SCREEN = new Name("PIN_SETUP_SCREEN", 17, 733);
            SCREEN_PROTECT = new Name("SCREEN_PROTECT", 18, 736);
            OAUTH_WATING_SCREEN = new Name("OAUTH_WATING_SCREEN", 19, 741);
            APP_PRIVACY_SETTINGS = new Name("APP_PRIVACY_SETTINGS", 20, 753);
            DEVICE_APPROVAL_WAITING = new Name("DEVICE_APPROVAL_WAITING", 21, 754);
            DEVICE_APPROVAL_WAITING_BLOCKED = new Name("DEVICE_APPROVAL_WAITING_BLOCKED", 22, 755);
            IAC_BOTTOM_SHEET = new Name("IAC_BOTTOM_SHEET", 23, 890);
            AGREEMENT = new Name("AGREEMENT", 24, 969);
            INVESTMENTS_TRACKER_FTUX_TRACK_ALL_ASSETS = new Name("INVESTMENTS_TRACKER_FTUX_TRACK_ALL_ASSETS", 25, 1338);
            INVESTMENTS_TRACKER_FTUX_ASSET_ALLOCATION = new Name("INVESTMENTS_TRACKER_FTUX_ASSET_ALLOCATION", 26, 1339);
            INVESTMENTS_TRACKER_FTUX_ADDITIONAL_INFO = new Name("INVESTMENTS_TRACKER_FTUX_ADDITIONAL_INFO", 27, 1340);
            INVESTMENTS_TRACKER_PERFORMANCE_VIEW = new Name("INVESTMENTS_TRACKER_PERFORMANCE_VIEW", 28, 1341);
            INVESTMENTS_TRACKER_ACCOUNT_LINK_AGREEMENT = new Name("INVESTMENTS_TRACKER_ACCOUNT_LINK_AGREEMENT", 29, 1342);
            INVESTMENTS_TRACKER_ACCOUNT_DETAILS = new Name("INVESTMENTS_TRACKER_ACCOUNT_DETAILS", 30, 1343);
            INVESTMENTS_TRACKER_ALLOCATIONS_VIEW = new Name("INVESTMENTS_TRACKER_ALLOCATIONS_VIEW", 31, 1344);
            INVESTMENTS_TRACKER_TOOLTIP_SHEET_ADD_ACCOUNT = new Name("INVESTMENTS_TRACKER_TOOLTIP_SHEET_ADD_ACCOUNT", 32, 1345);
            INVESTMENTS_TRACKER_SETTINGS = new Name("INVESTMENTS_TRACKER_SETTINGS", 33, 1346);
            INVESTMENTS_TRACKER_ACCOUNT_REMOVAL_SHEET = new Name("INVESTMENTS_TRACKER_ACCOUNT_REMOVAL_SHEET", 34, 1347);
            INVESTMENTS_TRACKER_REMOVAL_CONFIRMATION_SHEET = new Name("INVESTMENTS_TRACKER_REMOVAL_CONFIRMATION_SHEET", 35, 1348);
            BROWSE_NEWSFEED = new Name("BROWSE_NEWSFEED", 36, 4);
            BROWSE_SEARCH = new Name("BROWSE_SEARCH", 37, 5);
            BROWSE_NEWSFEED_THEATRE = new Name("BROWSE_NEWSFEED_THEATRE", 38, 28);
            STOCK_NEWSFEED = new Name("STOCK_NEWSFEED", 39, 29);
            CRYPTO_NEWSFEED = new Name("CRYPTO_NEWSFEED", 40, 31);
            EMBEDDED_ARTICLE_PAGE = new Name("EMBEDDED_ARTICLE_PAGE", 41, 32);
            NEWSFEED_DISCLOSURE = new Name("NEWSFEED_DISCLOSURE", 42, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
            CX_REVIEW_CALL_DETAILS = new Name("CX_REVIEW_CALL_DETAILS", 43, 10);
            CX_CALL_STATUS = new Name("CX_CALL_STATUS", 44, 11);
            CX_CHANNEL_SELECTION = new Name("CX_CHANNEL_SELECTION", 45, 12);
            CX_WEB_BACK_ERROR = new Name("CX_WEB_BACK_ERROR", 46, 13);
            CX_CALL_SCHEDULE = new Name("CX_CALL_SCHEDULE", 47, 104);
            CX_EDIT_CALL_SCHEDULE = new Name("CX_EDIT_CALL_SCHEDULE", 48, 105);
            CX_SURVEY_YES_NO_QUESTION = new Name("CX_SURVEY_YES_NO_QUESTION", 49, EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE);
            CX_SURVEY_FREE_FORM_QUESTION = new Name("CX_SURVEY_FREE_FORM_QUESTION", 50, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);
            CX_SURVEY_MULTIPLE_CHOICE_QUESTION = new Name("CX_SURVEY_MULTIPLE_CHOICE_QUESTION", 51, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
            CX_SURVEY_RATING_QUESTION = new Name("CX_SURVEY_RATING_QUESTION", 52, EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE);
            CX_SURVEY_ERROR_TOAST = new Name("CX_SURVEY_ERROR_TOAST", 53, EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE);
            CX_SURVEY_COMPLETE_PAGE = new Name("CX_SURVEY_COMPLETE_PAGE", 54, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE);
            CX_SURVEY_COMPLETE_TOAST = new Name("CX_SURVEY_COMPLETE_TOAST", 55, 144);
            CX_CALL_DESCRIPTION = new Name("CX_CALL_DESCRIPTION", 56, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE);
            CX_ACCOUNT_DETAIL_PAGE = new Name("CX_ACCOUNT_DETAIL_PAGE", 57, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
            CX_CONTACT_SECRET_CODE_PAGE = new Name("CX_CONTACT_SECRET_CODE_PAGE", 58, EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE);
            CX_CONTACT_VOICE_VERIFICATION_CONSENT_PAGE = new Name("CX_CONTACT_VOICE_VERIFICATION_CONSENT_PAGE", 59, EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE);
            CX_CONTACT_VOICE_VERIFICATION_PAGE = new Name("CX_CONTACT_VOICE_VERIFICATION_PAGE", 60, EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE);
            CX_CONTACT_SELFIE_VERIFICATION_INITIATE_PAGE = new Name("CX_CONTACT_SELFIE_VERIFICATION_INITIATE_PAGE", 61, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
            CX_CONTACT_SELFIE_VERIFICATION_WAIT_PAGE = new Name("CX_CONTACT_SELFIE_VERIFICATION_WAIT_PAGE", 62, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE);
            CX_CONTACT_VOICE_ENROLLMENT_CONSENT_PAGE = new Name("CX_CONTACT_VOICE_ENROLLMENT_CONSENT_PAGE", 63, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            CX_CONTACT_VOICE_ENROLLMENT_PAGE = new Name("CX_CONTACT_VOICE_ENROLLMENT_PAGE", 64, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            CX_CONTACT_EMAIL_PAGE = new Name("CX_CONTACT_EMAIL_PAGE", 65, 224);
            CX_CONTACT_SELFIE_VERIFICATION_FAILURE_PAGE = new Name("CX_CONTACT_SELFIE_VERIFICATION_FAILURE_PAGE", 66, 225);
            CX_CHAT_THREAD = new Name("CX_CHAT_THREAD", 67, 373);
            CX_SUPPORT_CASES = new Name("CX_SUPPORT_CASES", 68, 374);
            CX_CHATBOT_PAGE = new Name("CX_CHATBOT_PAGE", 69, 621);
            CX_MULTIPLE_ACCOUNT_SUPPORT_PAGE = new Name("CX_MULTIPLE_ACCOUNT_SUPPORT_PAGE", 70, 726);
            CX_SUPPORT_CHAT_THREAD = new Name("CX_SUPPORT_CHAT_THREAD", 71, 797);
            CX_SUPPORT_HUB = new Name("CX_SUPPORT_HUB", 72, 871);
            CX_CHAT_ERROR_SCREEN = new Name("CX_CHAT_ERROR_SCREEN", 73, 964);
            CX_APPOINTMENT_TIME_SELECTION = new Name("CX_APPOINTMENT_TIME_SELECTION", 74, 1099);
            CX_APPOINTMENT_NOTES_ENTRY = new Name("CX_APPOINTMENT_NOTES_ENTRY", 75, ErrorCodes.THROWABLE);
            CX_APPOINTMENT_REVIEW_DETAILS = new Name("CX_APPOINTMENT_REVIEW_DETAILS", 76, 1101);
            CX_APPOINTMENT_CONFIRMATION = new Name("CX_APPOINTMENT_CONFIRMATION", 77, 1102);
            CX_APPOINTMENT_DETAILS = new Name("CX_APPOINTMENT_DETAILS", 78, 1103);
            CX_CONCIERGE_ONBOARDING = new Name("CX_CONCIERGE_ONBOARDING", 79, 1121);
            CX_APPOINTMENT_ALREADY_BOOKED = new Name("CX_APPOINTMENT_ALREADY_BOOKED", 80, 1127);
            CX_APPOINTMENT_CANCEL_CONFIRMATION = new Name("CX_APPOINTMENT_CANCEL_CONFIRMATION", 81, 1128);
            CX_CONCIERGE_INFO = new Name("CX_CONCIERGE_INFO", 82, 1135);
            CX_CONCIERGE_FAQ = new Name("CX_CONCIERGE_FAQ", 83, 1136);
            CX_CONCIERGE_PLUS_LANDING = new Name("CX_CONCIERGE_PLUS_LANDING", 84, 1320);
            CX_CONCIERGE_PLUS_ONBOARDING = new Name("CX_CONCIERGE_PLUS_ONBOARDING", 85, 1321);
            CX_CONCIERGE_PLUS_HUB = new Name("CX_CONCIERGE_PLUS_HUB", 86, 1322);
            CX_CONCIERGE_PLUS_TAX_ONBOARDING = new Name("CX_CONCIERGE_PLUS_TAX_ONBOARDING", 87, 1323);
            CX_CONCIERGE_PLUS_ESTATE_ONBOARDING = new Name("CX_CONCIERGE_PLUS_ESTATE_ONBOARDING", 88, 1324);
            CX_CONCIERGE_PLUS_TAX = new Name("CX_CONCIERGE_PLUS_TAX", 89, 1325);
            CX_CONCIERGE_PLUS_ESTATE = new Name("CX_CONCIERGE_PLUS_ESTATE", 90, 1326);
            TRANSFERS = new Name("TRANSFERS", 91, 15);
            CASH = new Name("CASH", 92, 33);
            TRANSACTION_DETAIL_PAGE = new Name("TRANSACTION_DETAIL_PAGE", 93, 65);
            TRANSACTION_RECATEGORIZATION_PAGE = new Name("TRANSACTION_RECATEGORIZATION_PAGE", 94, 66);
            DISPUTES_SPLASH_PAGE = new Name("DISPUTES_SPLASH_PAGE", 95, 71);
            DISPUTES_REASON_SELECTION = new Name("DISPUTES_REASON_SELECTION", 96, 72);
            DISPUTES_TRANSACTION_SELECTION = new Name("DISPUTES_TRANSACTION_SELECTION", 97, 73);
            DISPUTES_TRANSACTION_REVIEW = new Name("DISPUTES_TRANSACTION_REVIEW", 98, 74);
            DISPUTES_MULTIPLE_CHOICE_QUESTION = new Name("DISPUTES_MULTIPLE_CHOICE_QUESTION", 99, 76);
            DISPUTES_AMOUNT_ENTRY_QUESTION = new Name("DISPUTES_AMOUNT_ENTRY_QUESTION", 100, 77);
            DISPUTES_DATE_ENTRY_QUESTION = new Name("DISPUTES_DATE_ENTRY_QUESTION", 101, 78);
            DISPUTES_FREE_RESPONSE_QUESTION = new Name("DISPUTES_FREE_RESPONSE_QUESTION", 102, 79);
            DISPUTES_MEDIA_UPLOAD_QUESTION = new Name("DISPUTES_MEDIA_UPLOAD_QUESTION", 103, 80);
            DISPUTES_FREE_RESPONSE_WITH_MEDIA_UPLOAD = new Name("DISPUTES_FREE_RESPONSE_WITH_MEDIA_UPLOAD", 104, 81);
            DISPUTES_REVIEW = new Name("DISPUTES_REVIEW", 105, 86);
            DISPUTES_CONFIRMATION = new Name("DISPUTES_CONFIRMATION", 106, 87);
            ROUNDUP_ENROLL_INTRO = new Name("ROUNDUP_ENROLL_INTRO", 107, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE);
            ROUNDUP_ASSET_SELECTION = new Name("ROUNDUP_ASSET_SELECTION", 108, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE);
            ROUNDUP_ENROLL_REVIEW = new Name("ROUNDUP_ENROLL_REVIEW", 109, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE);
            ROUNDUP_ENROLL_COMPLETE = new Name("ROUNDUP_ENROLL_COMPLETE", 110, 316);
            ROUNDUP_HUB = new Name("ROUNDUP_HUB", 111, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
            ROUNDUP_SETTINGS = new Name("ROUNDUP_SETTINGS", 112, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE);
            ROUNDUP_FIRST_SETTLEMENT = new Name("ROUNDUP_FIRST_SETTLEMENT", 113, EnumC7081g.f2781x2ba65ba3);
            ROUNDUP_END_OF_WEEK = new Name("ROUNDUP_END_OF_WEEK", 114, EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE);
            ROUNDUP_HISTORY_DETAIL = new Name("ROUNDUP_HISTORY_DETAIL", 115, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE);
            BANK_TRANSFER = new Name("BANK_TRANSFER", 116, 354);
            MERCHANT_REWARDS_INTRO = new Name("MERCHANT_REWARDS_INTRO", 117, 437);
            MERCHANT_REWARD_OFFER_PAGE = new Name("MERCHANT_REWARD_OFFER_PAGE", 118, 438);
            MERCHANT_REWARD_REWARD_HISTORY = new Name("MERCHANT_REWARD_REWARD_HISTORY", 119, 439);
            MERCHANT_REWARD_REWARD_HISTORY_DETAILS = new Name("MERCHANT_REWARD_REWARD_HISTORY_DETAILS", 120, 440);
            PLUTO_ACTIVITY_UNSPECIFIED = new Name("PLUTO_ACTIVITY_UNSPECIFIED", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, 443);
            DD_INTRO = new Name("DD_INTRO", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, 16);
            DD_SETUP_CHOICE = new Name("DD_SETUP_CHOICE", 123, 17);
            DD_ACCOUNT_INFO = new Name("DD_ACCOUNT_INFO", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 18);
            DD_PREFILLED_INTRO = new Name("DD_PREFILLED_INTRO", 125, 19);
            DD_CONFIRM_EMPLOYER = new Name("DD_CONFIRM_EMPLOYER", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 20);
            DD_UPDATE_EMPLOYER = new Name("DD_UPDATE_EMPLOYER", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, 21);
            DD_UNSIGNED_FORM = new Name("DD_UNSIGNED_FORM", 128, 22);
            DD_SIGNATURE = new Name("DD_SIGNATURE", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 23);
            DD_SIGNED_FORM = new Name("DD_SIGNED_FORM", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 24);
            DD_CONGRATULATIONS = new Name("DD_CONGRATULATIONS", 131, 25);
            DD_SWITCHER_SEARCH_COMPANY = new Name("DD_SWITCHER_SEARCH_COMPANY", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, 34);
            DD_SWITCHER_SEARCH_PAYROLL = new Name("DD_SWITCHER_SEARCH_PAYROLL", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 35);
            DD_SWITCHER_AUTHENTICATION = new Name("DD_SWITCHER_AUTHENTICATION", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, 36);
            DD_SWITCHER_CONFIRMATION = new Name("DD_SWITCHER_CONFIRMATION", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, 37);
            DD_SWITCHER_AUTHENTICATION_HELP = new Name("DD_SWITCHER_AUTHENTICATION_HELP", 136, 38);
            DD_SWITCHER_OPTIONS = new Name("DD_SWITCHER_OPTIONS", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, 50);
            DD_SWITCHER_OPTION_PERCENT = new Name("DD_SWITCHER_OPTION_PERCENT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, 51);
            DD_SWITCHER_OPTION_FIXED = new Name("DD_SWITCHER_OPTION_FIXED", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 52);
            DD_PARTIAL_PAYCHECK = new Name("DD_PARTIAL_PAYCHECK", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 116);
            DD_EDIT_DOLLAR_AMOUNT = new Name("DD_EDIT_DOLLAR_AMOUNT", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, 117);
            DD_EDIT_PERCENTAGE_AMOUNT = new Name("DD_EDIT_PERCENTAGE_AMOUNT", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, 118);
            DIRECT_DEPOSIT_UPSELL = new Name("DIRECT_DEPOSIT_UPSELL", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, 918);
            DIRECT_DEPOSIT_DISCLOSURES = new Name("DIRECT_DEPOSIT_DISCLOSURES", 144, 919);
            DIRECT_DEPOSIT_SETUP_INFO = new Name("DIRECT_DEPOSIT_SETUP_INFO", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, 920);
            DIRECT_DEPOSIT_HISTORY = new Name("DIRECT_DEPOSIT_HISTORY", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, 921);
            DIRECT_DEPOSIT_POST_TRANSFER_UPSELL = new Name("DIRECT_DEPOSIT_POST_TRANSFER_UPSELL", 147, 922);
            EARLY_PAY_LEARN_MORE = new Name("EARLY_PAY_LEARN_MORE", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, 67);
            EARLY_PAY_ENROLLMENT_SUCCESS = new Name("EARLY_PAY_ENROLLMENT_SUCCESS", EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 68);
            EARLY_PAY_ONBOARDING_CONFIRMATION = new Name("EARLY_PAY_ONBOARDING_CONFIRMATION", 150, EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE);
            HOME = new Name("HOME", 151, 1);
            STOCK_DETAIL_PAGE = new Name(EducationTourScreenNames.STOCK_DETAIL_PAGE_SCREEN, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, 3);
            CRYPTO_DETAIL_PAGE = new Name("CRYPTO_DETAIL_PAGE", EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, 14);
            TRADE_CELEBRATION = new Name("TRADE_CELEBRATION", EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, 70);
            PSP_DETAIL = new Name("PSP_DETAIL", 155, 355);
            PSP_CELEBRATION = new Name("PSP_CELEBRATION", 156, 356);
            PSP_HISTORY_DETAIL = new Name("PSP_HISTORY_DETAIL", EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, 362);
            INVEST_FLOW_MOO = new Name("INVEST_FLOW_MOO", EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 371);
            INVEST_FLOW_SEARCH = new Name("INVEST_FLOW_SEARCH", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, 382);
            INVEST_FLOW_ORDER_ENTRY = new Name("INVEST_FLOW_ORDER_ENTRY", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, 383);
            INVEST_FLOW_BUDGET_ALLOCATION = new Name("INVEST_FLOW_BUDGET_ALLOCATION", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, 384);
            INVEST_FLOW_ORDER_PREVIEW = new Name("INVEST_FLOW_ORDER_PREVIEW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, 385);
            INVEST_FLOW_ORDER_REVIEW = new Name("INVEST_FLOW_ORDER_REVIEW", EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, 386);
            INVEST_FLOW_ORDER_RECEIPT = new Name("INVEST_FLOW_ORDER_RECEIPT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 387);
            INVEST_FLOW_DISCOVER = new Name("INVEST_FLOW_DISCOVER", 165, 388);
            INVEST_FLOW_FREQUENCY = new Name("INVEST_FLOW_FREQUENCY", EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, 389);
            ADVANCED_CHARTS_ONBOARDING = new Name("ADVANCED_CHARTS_ONBOARDING", 167, 433);
            ADVANCED_CHARTS_EQUITY_SEARCH = new Name("ADVANCED_CHARTS_EQUITY_SEARCH", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, 434);
            PSP_INTRO = new Name("PSP_INTRO", EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 445);
            INVESTOR_PROFILE_COMPLETE = new Name("INVESTOR_PROFILE_COMPLETE", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 467);
            INVESTOR_PROFILE_INTRO = new Name("INVESTOR_PROFILE_INTRO", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, 468);
            INVESTOR_PROFILE_QUESTION = new Name("INVESTOR_PROFILE_QUESTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, 469);
            INVESTOR_PROFILE_REVIEW = new Name("INVESTOR_PROFILE_REVIEW", EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, 470);
            EQUITY_TRADING_SESSION_CHANGED_PAGE = new Name("EQUITY_TRADING_SESSION_CHANGED_PAGE", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, 601);
            ASSET_HOME = new Name("ASSET_HOME", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, 735);
            DISTRIBUTE_INVEST_FLOW = new Name("DISTRIBUTE_INVEST_FLOW", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, 737);
            SUGGESTION_SEARCH = new Name("SUGGESTION_SEARCH", EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, 745);
            FX_SWITCHER_FTUX = new Name("FX_SWITCHER_FTUX", EnumC7081g.f2773x8d9721ad, 1262);
            LADDER_MARKETING = new Name("LADDER_MARKETING", EnumC7081g.f2780x600b66fe, 1304);
            LADDER_MARKETING_SEARCH = new Name("LADDER_MARKETING_SEARCH", EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, 1305);
            ROBINHOOD_LIST_DETAIL_PAGE = new Name("ROBINHOOD_LIST_DETAIL_PAGE", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, 6);
            LIST_DISCOVERY_HUB = new Name("LIST_DISCOVERY_HUB", 182, 7);
            USER_LIST_DETAIL_PAGE = new Name("USER_LIST_DETAIL_PAGE", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, 8);
            EXPANDED_LIST_CAROUSEL = new Name("EXPANDED_LIST_CAROUSEL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 9);
            ROBINHOOD_LIST_PICKER = new Name("ROBINHOOD_LIST_PICKER", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, 53);
            USER_LIST_DETAIL_SEARCH = new Name("USER_LIST_DETAIL_SEARCH", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, 106);
            INVESTING_MONITOR = new Name("INVESTING_MONITOR", EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, 1155);
            WATCHLIST_REDESIGN = new Name("WATCHLIST_REDESIGN", 188, 1253);
            OPTION_CHAIN_EXPIRATION_PAGE = new Name("OPTION_CHAIN_EXPIRATION_PAGE", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 90);
            OPTION_STATISTICS_BOTTOM_SHEET = new Name("OPTION_STATISTICS_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 91);
            OPTION_SHOPPING_CART = new Name("OPTION_SHOPPING_CART", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 92);
            OPTION_CHAIN = new Name("OPTION_CHAIN", 192, 99);
            OPTION_STRATEGY_DETAIL = new Name("OPTION_STRATEGY_DETAIL", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
            OPTION_AGGREGATE_DETAIL = new Name("OPTION_AGGREGATE_DETAIL", EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, 131);
            OPTION_INSTRUMENT_DETAIL = new Name("OPTION_INSTRUMENT_DETAIL", EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
            OPTION_WATCHLIST_HUB = new Name("OPTION_WATCHLIST_HUB", EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE);
            OPTION_ORDER_FORM = new Name("OPTION_ORDER_FORM", EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE);
            OPTION_ORDER_CONFIGURATION_SELECTION = new Name("OPTION_ORDER_CONFIGURATION_SELECTION", EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE);
            OPTION_ORDER_CONFIGURATION_BOTTOM_SHEET = new Name("OPTION_ORDER_CONFIGURATION_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE);
            OPTION_WATCHLIST_ABOUT = new Name("OPTION_WATCHLIST_ABOUT", 200, EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE);
            OPTION_ROLLING_CONTRACT_SELECTOR = new Name("OPTION_ROLLING_CONTRACT_SELECTOR", 201, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE);
            OPTIONS_STRATEGY_ROLL = new Name("OPTIONS_STRATEGY_ROLL", 202, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE);
            OPTIONS_ROLLING_NUX = new Name("OPTIONS_ROLLING_NUX", EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE);
            OPTION_UPGRADE_L0_WHAT_ARE_OPTIONS = new Name("OPTION_UPGRADE_L0_WHAT_ARE_OPTIONS", 204, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE);
            OPTION_UPGRADE_L0_STRATEGIES_PRICE_MOVEMENT = new Name("OPTION_UPGRADE_L0_STRATEGIES_PRICE_MOVEMENT", EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE);
            OPTION_UPGRADE_L0_UNDERSTAND_OPTIONS = new Name("OPTION_UPGRADE_L0_UNDERSTAND_OPTIONS", EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC7081g.f2774x74902ae0);
            OPTION_LEGO_CHAIN_PREMIUM = new Name("OPTION_LEGO_CHAIN_PREMIUM", EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, 345);
            OPTION_LEGO_CHAIN_TRADE_OPTION = new Name("OPTION_LEGO_CHAIN_TRADE_OPTION", EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, 346);
            OPTION_CHAIN_SETTINGS = new Name("OPTION_CHAIN_SETTINGS", EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, 361);
            OPTION_STRATEGY_BUILDER = new Name("OPTION_STRATEGY_BUILDER", EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 458);
            OPTION_STRATEGY_BUILDER_NUX = new Name("OPTION_STRATEGY_BUILDER_NUX", 211, 459);
            OPTION_STRATEGY_CHAIN = new Name("OPTION_STRATEGY_CHAIN", EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE, 460);
            OPTION_STRATEGY_BUILDER_DEEP_LINK_INTRO = new Name("OPTION_STRATEGY_BUILDER_DEEP_LINK_INTRO", EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, 461);
            OPTION_STRATEGY_BUILDER_DEEP_LINK_SEARCH = new Name("OPTION_STRATEGY_BUILDER_DEEP_LINK_SEARCH", EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, 462);
            OPTION_STRATEGY_BUILDER_AVAILABLE_NUX = new Name("OPTION_STRATEGY_BUILDER_AVAILABLE_NUX", EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, 463);
            OPTION_STRATEGY_BUILDER_NOT_AVAILABLE_NUX = new Name("OPTION_STRATEGY_BUILDER_NOT_AVAILABLE_NUX", EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 464);
            OPTION_STRATEGY_BUILDER_NOT_ELIGIBLE_NUX = new Name("OPTION_STRATEGY_BUILDER_NOT_ELIGIBLE_NUX", EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE, 465);
            OPTION_ORDER_DETAIL = new Name("OPTION_ORDER_DETAIL", EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE, 610);
            OPTION_CHAIN_CUSTOMIZATION_SETTINGS = new Name("OPTION_CHAIN_CUSTOMIZATION_SETTINGS", EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE, 716);
            OPTION_ORDER_CONFIRMATION = new Name("OPTION_ORDER_CONFIRMATION", EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, 730);
            OPTION_SIMULATED_RETURNS = new Name("OPTION_SIMULATED_RETURNS", EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE, 744);
            OPTION_EDIT_LEG_RATIO = new Name("OPTION_EDIT_LEG_RATIO", EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, 767);
            OPTIONS_STOP_MARKET_NUX = new Name("OPTIONS_STOP_MARKET_NUX", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 810);
            OPTION_EVENT_DETAIL = new Name("OPTION_EVENT_DETAIL", 224, 892);
            OPTION_ONBOARDING_START = new Name("OPTION_ONBOARDING_START", 225, 943);
            OPTION_ONBOARDING_SPLASH_L0 = new Name("OPTION_ONBOARDING_SPLASH_L0", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, 944);
            OPTION_ONBOARDING_SPLASH_L2 = new Name("OPTION_ONBOARDING_SPLASH_L2", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, 945);
            OPTION_ONBOARDING_SPLASH_RETIREMENT = new Name("OPTION_ONBOARDING_SPLASH_RETIREMENT", EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, 946);
            OPTION_ONBOARDING_QUESTION_OPTION_EXPERIENCE = new Name("OPTION_ONBOARDING_QUESTION_OPTION_EXPERIENCE", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, 947);
            OPTION_ONBOARDING_QUESTION_UNDERSTAND_SPREAD = new Name("OPTION_ONBOARDING_QUESTION_UNDERSTAND_SPREAD", EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 948);
            OPTION_ONBOARDING_QUESTION_INVESTMENT_ADVICE = new Name("OPTION_ONBOARDING_QUESTION_INVESTMENT_ADVICE", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, 949);
            OPTION_ONBOARDING_QUESTION_FINANCIAL_REGULATOR = new Name("OPTION_ONBOARDING_QUESTION_FINANCIAL_REGULATOR", EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 950);
            OPTION_ONBOARDING_SUITABILITY = new Name("OPTION_ONBOARDING_SUITABILITY", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 951);
            OPTION_ONBOARDING_INVESTMENT_PROFILE = new Name("OPTION_ONBOARDING_INVESTMENT_PROFILE", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 952);
            OPTION_ONBOARDING_DISCLOSURE = new Name("OPTION_ONBOARDING_DISCLOSURE", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, 953);
            OPTION_ONBOARDING_APPROVED_TRADES = new Name("OPTION_ONBOARDING_APPROVED_TRADES", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, 954);
            OPTION_ONBOARDING_SUCCESS = new Name("OPTION_ONBOARDING_SUCCESS", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, 955);
            OPTION_ONBOARDING_FAILURE = new Name("OPTION_ONBOARDING_FAILURE", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, 956);
            OPTION_ONBOARDING_EDUCATION_SPREAD = new Name("OPTION_ONBOARDING_EDUCATION_SPREAD", 239, 957);
            OPTION_ONBOARDING_EDUCATION_L3_STRATEGIES = new Name("OPTION_ONBOARDING_EDUCATION_L3_STRATEGIES", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 958);
            OPTION_ONBOARDING_READY_L3_UPGRADE = new Name("OPTION_ONBOARDING_READY_L3_UPGRADE", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 959);
            OPTION_ONBOARDING_UPSELL_ALERT = new Name("OPTION_ONBOARDING_UPSELL_ALERT", EnumC7081g.f2778x3356acf6, 960);
            OPTION_ONBOARDING_UPSELL_TRADE_ON_EXPIRATION = new Name("OPTION_ONBOARDING_UPSELL_TRADE_ON_EXPIRATION", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, 961);
            OPTION_ONBOARDING_UPSELL_ALL_SET = new Name("OPTION_ONBOARDING_UPSELL_ALL_SET", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, 962);
            INDEX_DETAIL = new Name("INDEX_DETAIL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 991);
            UK_OPTION_ONBOARDING_SPLASH_L0 = new Name("UK_OPTION_ONBOARDING_SPLASH_L0", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 1008);
            UK_OPTION_ONBOARDING_EDUCATION_BENEFITS = new Name("UK_OPTION_ONBOARDING_EDUCATION_BENEFITS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, 1010);
            UK_OPTION_ONBOARDING_EDUCATION_RISKS = new Name("UK_OPTION_ONBOARDING_EDUCATION_RISKS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 1011);
            UK_OPTION_ONBOARDING_EXPERIENCE_QUESTIONNAIRE = new Name("UK_OPTION_ONBOARDING_EXPERIENCE_QUESTIONNAIRE", EnumC7081g.f2779x59907a3d, 1012);
            UK_OPTION_ONBOARDING_KNOWLEDGE_QUESTIONNAIRE = new Name("UK_OPTION_ONBOARDING_KNOWLEDGE_QUESTIONNAIRE", 250, 1013);
            UK_OPTION_ONBOARDING_INVESTOR_PROFILE = new Name("UK_OPTION_ONBOARDING_INVESTOR_PROFILE", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, 1014);
            UK_OPTION_ONBOARDING_REVIEW_INVESTOR_PROFILE = new Name("UK_OPTION_ONBOARDING_REVIEW_INVESTOR_PROFILE", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 1015);
            UK_OPTION_ONBOARDING_PROFESSIONAL_TRADER = new Name("UK_OPTION_ONBOARDING_PROFESSIONAL_TRADER", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 1016);
            UK_OPTION_ONBOARDING_SPLASH_L2 = new Name("UK_OPTION_ONBOARDING_SPLASH_L2", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 1025);
            UK_OPTION_ONBOARDING_EDUCATION_BENEFITS_L2 = new Name("UK_OPTION_ONBOARDING_EDUCATION_BENEFITS_L2", 255, 1026);
            OPTION_ONBOARDING_JOINT_PENDING = new Name("OPTION_ONBOARDING_JOINT_PENDING", 256, 1041);
            SIDE_BY_SIDE_OPTION_CHAIN = new Name("SIDE_BY_SIDE_OPTION_CHAIN", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, 1067);
            OPTIONS_SBS_CHAIN = new Name("OPTIONS_SBS_CHAIN", EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE, 1080);
            APAC_OPTION_ONBOARDING_SPLASH_L0 = new Name("APAC_OPTION_ONBOARDING_SPLASH_L0", EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, 1111);
            APAC_OPTION_ONBOARDING_CAR_QUESTIONNAIRE = new Name("APAC_OPTION_ONBOARDING_CAR_QUESTIONNAIRE", EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, 1112);
            SIDE_BY_SIDE_OPTION_CHAIN_ONBOARDING_SEARCH = new Name("SIDE_BY_SIDE_OPTION_CHAIN_ONBOARDING_SEARCH", EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, 1119);
            OPTION_ONBOARDING_JA_APPLICATION_PENDING = new Name("OPTION_ONBOARDING_JA_APPLICATION_PENDING", EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 1208);
            COMBO_ORDER_DETAIL = new Name("COMBO_ORDER_DETAIL", EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, 1242);
            OPTION_L3_ENTRYPOINT_POST_TRADE_UPSELL = new Name("OPTION_L3_ENTRYPOINT_POST_TRADE_UPSELL", EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, 1279);
            OPTION_TRADING_SESSION = new Name("OPTION_TRADING_SESSION", EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE, 1281);
            OPTION_MANUAL_REVIEW_KNOWLEDGE_CHECK = new Name("OPTION_MANUAL_REVIEW_KNOWLEDGE_CHECK", EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, 1309);
            RECURRING_RECEIPT_UPSELL = new Name("RECURRING_RECEIPT_UPSELL", EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, 39);
            RECURRING_FREQUENCY = new Name("RECURRING_FREQUENCY", EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, 42);
            RECURRING_PAYMENT_METHOD = new Name("RECURRING_PAYMENT_METHOD", EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, 43);
            RECURRING_BACKUP_PAYMENT_METHOD = new Name("RECURRING_BACKUP_PAYMENT_METHOD", EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, 44);
            RECURRING_AMOUNT = new Name("RECURRING_AMOUNT", 271, 45);
            RECURRING_HUB = new Name("RECURRING_HUB", EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 48);
            RECURRING_FIND_INVESTMENT_PAGE = new Name("RECURRING_FIND_INVESTMENT_PAGE", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 49);
            RECURRING_DETAIL = new Name("RECURRING_DETAIL", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, 88);
            RECURRING_INSIGHTS = new Name("RECURRING_INSIGHTS", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE);
            RECURRING_DIRECT_DEPOSIT_SOURCE = new Name("RECURRING_DIRECT_DEPOSIT_SOURCE", EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE);
            SYP_LEARN_MORE = new Name("SYP_LEARN_MORE", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE);
            RECURRING_AMOUNT_TYPE = new Name("RECURRING_AMOUNT_TYPE", EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE);
            RECURRING_UNIFIED_CREATION = new Name("RECURRING_UNIFIED_CREATION", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE);
            SYP_ONBOARDING_DD_CONFIRMATION = new Name("SYP_ONBOARDING_DD_CONFIRMATION", 280, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE);
            SYP_AGREEMENT = new Name("SYP_AGREEMENT", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, 330);
            SYP_DISCLOSURE_ALERT = new Name("SYP_DISCLOSURE_ALERT", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, 331);
            RECURRING_ORDER_RECEIPT = new Name("RECURRING_ORDER_RECEIPT", 283, WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END);
            RECURRING_ASSET_TYPE_SELECTION = new Name("RECURRING_ASSET_TYPE_SELECTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 501);
            BROKERAGE_CASH_ORDER_ENTRY = new Name("BROKERAGE_CASH_ORDER_ENTRY", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, HttpStatusCode.BAD_GATEWAY_502);
            MESSAGES = new Name("MESSAGES", EnumC7081g.f2777x89a9e432, 64);
            MESSAGES_THREAD = new Name("MESSAGES_THREAD", EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, 119);
            ACCOUNT_DETAIL = new Name("ACCOUNT_DETAIL", 288, 47);
            ACCOUNT_OVERVIEW = new Name("ACCOUNT_OVERVIEW", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, 63);
            BONFIRE_SETTINGS_PAGE = new Name("BONFIRE_SETTINGS_PAGE", EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, 120);
            PROFILE = new Name("PROFILE", EnumC7081g.f2776x87e624cb, EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE);
            STATEMENTS_AND_HISTORY = new Name("STATEMENTS_AND_HISTORY", EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, 204);
            ACCOUNT_HISTORY = new Name("ACCOUNT_HISTORY", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE);
            ACCOUNT_CENTER = new Name("ACCOUNT_CENTER", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE);
            BROKERAGE_STATEMENTS_LIST = new Name("BROKERAGE_STATEMENTS_LIST", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            TAX_DOCUMENTS_LIST = new Name("TAX_DOCUMENTS_LIST", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE, EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE);
            SPENDING_STATEMENTS_LIST = new Name("SPENDING_STATEMENTS_LIST", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE);
            BROKERAGE_STATEMENT_VIEWER = new Name("BROKERAGE_STATEMENT_VIEWER", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
            TAX_DOCUMENT_VIEWER = new Name("TAX_DOCUMENT_VIEWER", EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE);
            SPENDING_STATEMENT_VIEWER = new Name("SPENDING_STATEMENT_VIEWER", 300, EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
            ADVANCED_ALERT_HUB = new Name("ADVANCED_ALERT_HUB", EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, 586);
            INDICATOR_ALERT_EDITOR = new Name("INDICATOR_ALERT_EDITOR", 302, 587);
            INDICATOR_SELECTOR = new Name("INDICATOR_SELECTOR", EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, 588);
            ALERT_HUB_SETTING = new Name("ALERT_HUB_SETTING", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, 695);
            SIGNUP_FUND_ACCOUNT_INTRO = new Name("SIGNUP_FUND_ACCOUNT_INTRO", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, 26);
            GROWTH_DEPOSIT_MATCH_OFFER = new Name("GROWTH_DEPOSIT_MATCH_OFFER", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, 27);
            EQUITY_SELECT_ORDER_KIND_PAGE = new Name("EQUITY_SELECT_ORDER_KIND_PAGE", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE, 54);
            EQUITY_ORDER_ENTRY = new Name("EQUITY_ORDER_ENTRY", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE, 55);
            EQUITY_ORDER_REVIEW = new Name("EQUITY_ORDER_REVIEW", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE, 56);
            EQUITY_ORDER_RECEIPT = new Name("EQUITY_ORDER_RECEIPT", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE, 57);
            DOLLAR_BASED_ORDER_ENTRY = new Name("DOLLAR_BASED_ORDER_ENTRY", EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE, 89);
            EQUITY_ORDER_CHECK_ALERT = new Name("EQUITY_ORDER_CHECK_ALERT", EnumC7081g.f2774x74902ae0, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE);
            EQUITY_ADVANCED_CHARTS = new Name("EQUITY_ADVANCED_CHARTS", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, 377);
            STOCK_DETAIL_PAGE_MINI = new Name("STOCK_DETAIL_PAGE_MINI", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE, 380);
            EQUITY_ADVANCED_CHART_TECHNICAL_INDICATOR_MANAGER = new Name("EQUITY_ADVANCED_CHART_TECHNICAL_INDICATOR_MANAGER", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, 609);
            EQUITY_SET_TRADING_HOURS_PAGE = new Name("EQUITY_SET_TRADING_HOURS_PAGE", 316, 620);
            SCREENER_DETAIL = new Name("SCREENER_DETAIL", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE, 625);
            SCREENER_INDICATORS_LIST = new Name("SCREENER_INDICATORS_LIST", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, 626);
            SCREENER_INDICATOR_DETAIL = new Name("SCREENER_INDICATOR_DETAIL", EnumC7081g.f2781x2ba65ba3, 627);
            SCREENER_DATA_DISPLAY = new Name("SCREENER_DATA_DISPLAY", EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE, 628);
            SCREENER_PRESET_LIST = new Name("SCREENER_PRESET_LIST", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE, 629);
            ADD_INDICATOR = new Name("ADD_INDICATOR", EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE, 630);
            ADD_INDICATOR_FORM = new Name("ADD_INDICATOR_FORM", EnumC7081g.f2775xbcb7e6f3, 631);
            PRICE_ALERT_EDITOR = new Name("PRICE_ALERT_EDITOR", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE, 632);
            EQUITY_ADVANCED_ALERTS_DISCLOSURE = new Name("EQUITY_ADVANCED_ALERTS_DISCLOSURE", EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE, 634);
            EQUITY_24H_MARKET_REMINDER = new Name("EQUITY_24H_MARKET_REMINDER", EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE, 635);
            SCREENER_LIST = new Name("SCREENER_LIST", EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE, 641);
            INVESTING_SETTINGS = new Name("INVESTING_SETTINGS", EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, 674);
            DAY_TRADE_SETTINGS = new Name("DAY_TRADE_SETTINGS", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE, 675);
            EQUITY_ORDER_DETAIL = new Name("EQUITY_ORDER_DETAIL", 330, 687);
            EQUITY_ENTER_LIMIT_PRICE_PAGE = new Name("EQUITY_ENTER_LIMIT_PRICE_PAGE", 331, Timeline.MIDDLE_META_OFFSET_ANIMATION_DURATION);
            POST_DAY_TRADE_SCREEN = new Name("POST_DAY_TRADE_SCREEN", 332, 701);
            EQUITY_SET_TIME_IN_FORCE_PAGE = new Name("EQUITY_SET_TIME_IN_FORCE_PAGE", 333, 715);
            EQUITY_ENTER_STOP_PRICE_PAGE = new Name("EQUITY_ENTER_STOP_PRICE_PAGE", 334, 717);
            EQUITY_ENTER_TRAIL_AMOUNT_PAGE = new Name("EQUITY_ENTER_TRAIL_AMOUNT_PAGE", 335, 718);
            PDT_RULES_UPDATES_INFO = new Name("PDT_RULES_UPDATES_INFO", WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END, 732);
            EQUITY_SELECT_ORDER_KIND_MINI_MENU_PAGE = new Name("EQUITY_SELECT_ORDER_KIND_MINI_MENU_PAGE", 337, 773);
            TRADING_TRENDS = new Name("TRADING_TRENDS", 338, 790);
            TRADING_TRENDS_ONBOARDING_SEARCH = new Name("TRADING_TRENDS_ONBOARDING_SEARCH", 339, 794);
            TRADING_TRENDS_ONBOARDING = new Name("TRADING_TRENDS_ONBOARDING", 340, 795);
            PROFIT_AND_LOSS_HUB = new Name("PROFIT_AND_LOSS_HUB", 341, 872);
            LEVEL_TWO_MARKET_DATA = new Name("LEVEL_TWO_MARKET_DATA", 342, 891);
            ADR_FEE_DETAIL = new Name("ADR_FEE_DETAIL", 343, 912);
            TAX_LOTS_SELECTION = new Name("TAX_LOTS_SELECTION", 344, 1000);
            TAX_LOTS_HISTORY = new Name("TAX_LOTS_HISTORY", 345, 1023);
            CUSTOMER_ACCOUNT_REVIEW_SPLASH = new Name("CUSTOMER_ACCOUNT_REVIEW_SPLASH", 346, 1098);
            MOBILE_ADVANCED_CHARTS = new Name("MOBILE_ADVANCED_CHARTS", 347, 1120);
            CUSTOMER_ACCOUNT_REVIEW_RESULT_PASS = new Name("CUSTOMER_ACCOUNT_REVIEW_RESULT_PASS", 348, 1122);
            CUSTOMER_ACCOUNT_REVIEW_RESULT_FAIL = new Name("CUSTOMER_ACCOUNT_REVIEW_RESULT_FAIL", 349, 1123);
            COMPANY_FINANCIALS_ONBOARDING = new Name("COMPANY_FINANCIALS_ONBOARDING", 350, 1222);
            COMPANY_FINANCIALS_ONBOARDING_SEARCH = new Name("COMPANY_FINANCIALS_ONBOARDING_SEARCH", 351, 1223);
            EQUITIES_TRADING_LADDER = new Name("EQUITIES_TRADING_LADDER", 352, 1225);
            RESEARCH_REPORT = new Name("RESEARCH_REPORT", 353, 1261);
            EQUITIES_SUBZERO_ONBOARDING = new Name("EQUITIES_SUBZERO_ONBOARDING", 354, 1301);
            EQUITIES_SUBZERO_MARKETING = new Name("EQUITIES_SUBZERO_MARKETING", 355, 1302);
            CRYPTO_ORDER_RECEIPT = new Name("CRYPTO_ORDER_RECEIPT", 356, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE);
            CRYPTO_SELECT_ORDER_KIND_PAGE = new Name("CRYPTO_SELECT_ORDER_KIND_PAGE", 357, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE);
            CRYPTO_ORDER_ENTRY = new Name("CRYPTO_ORDER_ENTRY", 358, EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
            CRYPTO_DETAIL_PAGE_MINI = new Name("CRYPTO_DETAIL_PAGE_MINI", 359, 381);
            CRYPTO_STATEMENTS_LIST = new Name("CRYPTO_STATEMENTS_LIST", 360, 499);
            CRYPTO_STATEMENT_VIEWER = new Name("CRYPTO_STATEMENT_VIEWER", 361, 500);
            CRYPTO_LEARN_AND_EARN = new Name("CRYPTO_LEARN_AND_EARN", 362, 545);
            CRYPTO_ORDER_SET_LIMIT_PRICE = new Name("CRYPTO_ORDER_SET_LIMIT_PRICE", 363, 558);
            CRYPTO_ORDER_INFORMATION = new Name("CRYPTO_ORDER_INFORMATION", 364, 559);
            CRYPTO_ORDER_SET_TIME_IN_FORCE = new Name("CRYPTO_ORDER_SET_TIME_IN_FORCE", 365, 560);
            CRYPTO_ORDER_SET_STOP_PRICE = new Name("CRYPTO_ORDER_SET_STOP_PRICE", 366, 561);
            CRYPTO_ORDER_HISTORY_DETAIL = new Name("CRYPTO_ORDER_HISTORY_DETAIL", 367, 562);
            CRYPTO_HOME_TAB = new Name("CRYPTO_HOME_TAB", 368, 570);
            CRYPTO_VALUE_PAGE = new Name("CRYPTO_VALUE_PAGE", 369, 571);
            L2E_TRY_AGAIN = new Name("L2E_TRY_AGAIN", 370, 590);
            CRYPTO_ADVANCED_CHARTS = new Name("CRYPTO_ADVANCED_CHARTS", 371, 604);
            ADVANCED_CHARTS_CRYPTO_SEARCH = new Name("ADVANCED_CHARTS_CRYPTO_SEARCH", 372, 605);
            ADVANCED_CHARTS_CRYPTO_ONBOARDING = new Name("ADVANCED_CHARTS_CRYPTO_ONBOARDING", 373, 606);
            CRYPTO_ADVANCED_CHART_TECHNICAL_INDICATOR_MANAGER = new Name("CRYPTO_ADVANCED_CHART_TECHNICAL_INDICATOR_MANAGER", 374, 608);
            CRYPTO_TRANSFER_ENROLLMENT_FRAUD_INFO = new Name("CRYPTO_TRANSFER_ENROLLMENT_FRAUD_INFO", 375, 614);
            CRYPTO_TRANSFER_ENROLLMENT_PENDING = new Name("CRYPTO_TRANSFER_ENROLLMENT_PENDING", 376, 642);
            CRYPTO_TRANSFER_ENROLLMENT_FAILED = new Name("CRYPTO_TRANSFER_ENROLLMENT_FAILED", 377, 643);
            CRYPTO_TRANSFER_ENROLLMENT_ADDITIONAL_STEPS_REQUIRED = new Name("CRYPTO_TRANSFER_ENROLLMENT_ADDITIONAL_STEPS_REQUIRED", 378, 644);
            CRYPTO_TRANSFER_ENROLLMENT_SECURITY_CHECK = new Name("CRYPTO_TRANSFER_ENROLLMENT_SECURITY_CHECK", 379, 645);
            CRYPTO_TRANSFER_ENROLLMENT_COMPLETED = new Name("CRYPTO_TRANSFER_ENROLLMENT_COMPLETED", 380, 646);
            CRYPTO_TRADING_COIN_LIST = new Name("CRYPTO_TRADING_COIN_LIST", 381, 696);
            CRYPTO_SETTINGS = new Name("CRYPTO_SETTINGS", 382, 840);
            CRYPTO_REFERRAL_DETAIL = new Name("CRYPTO_REFERRAL_DETAIL", 383, 868);
            RHC_LOGIN_REFERRAL = new Name("RHC_LOGIN_REFERRAL", 384, 869);
            RHC_SIGNUP_REFERRAL_RH = new Name("RHC_SIGNUP_REFERRAL_RH", 385, 870);
            CRYPTO_STAKING_AMOUNT_ENTRY = new Name("CRYPTO_STAKING_AMOUNT_ENTRY", 386, 877);
            CRYPTO_STAKING_HISTORY_DETAIL = new Name("CRYPTO_STAKING_HISTORY_DETAIL", 387, 878);
            CRYPTO_STAKING_HUB = new Name("CRYPTO_STAKING_HUB", 388, 879);
            CRYPTO_STAKING_INTRO = new Name("CRYPTO_STAKING_INTRO", 389, 880);
            CRYPTO_STAKING_ORDER_CONFIRMATION = new Name("CRYPTO_STAKING_ORDER_CONFIRMATION", 390, 881);
            CRYPTO_STAKING_ORDER_REVIEW = new Name("CRYPTO_STAKING_ORDER_REVIEW", 391, 882);
            CRYPTO_STAKING_SUMMARY = new Name("CRYPTO_STAKING_SUMMARY", 392, 883);
            CRYPTO_TRANSFER_SEND_MEMO = new Name("CRYPTO_TRANSFER_SEND_MEMO", 393, 938);
            STAKING_UPSELL = new Name("STAKING_UPSELL", 394, 1024);
            CRYPTO_VOLUME_TIER_PRIMER = new Name("CRYPTO_VOLUME_TIER_PRIMER", 395, 1063);
            CRYPTO_VOLUME_TIER_HUB = new Name("CRYPTO_VOLUME_TIER_HUB", WaitlistAnimationConstants.LEFT_YAW_START, 1064);
            CRYPTO_VOLUME_TIER_EXPLAINER = new Name("CRYPTO_VOLUME_TIER_EXPLAINER", 397, 1065);
            CRYPTO_VOLUME_TIER_INELIGIBLE = new Name("CRYPTO_VOLUME_TIER_INELIGIBLE", 398, 1066);
            CRYPTO_TRANSFER_SEARCH = new Name("CRYPTO_TRANSFER_SEARCH", 399, 1068);
            CRYPTO_MAIN_NEWSFEED = new Name("CRYPTO_MAIN_NEWSFEED", 400, 1082);
            CRYPTO_TAX_LOTS_PRIMER = new Name("CRYPTO_TAX_LOTS_PRIMER", 401, 1085);
            EU_CRYPTO_COUNTDOWN_PAGE = new Name("EU_CRYPTO_COUNTDOWN_PAGE", 402, 1086);
            EU_CRYPTO_REWARD_GRANTED = new Name("EU_CRYPTO_REWARD_GRANTED", com.robinhood.utils.http.HttpStatusCode.FORBIDDEN, 1087);
            VOLUME_TIERS_DEPOSIT_PROMO_INFO = new Name("VOLUME_TIERS_DEPOSIT_PROMO_INFO", 404, 1115);
            CRYPTO_VOLUME_TIER_ENROLLMENT_CONFIRMATION = new Name("CRYPTO_VOLUME_TIER_ENROLLMENT_CONFIRMATION", 405, 1116);
            CRYPTO_DEPOSIT_INCENTIVE_ERROR = new Name("CRYPTO_DEPOSIT_INCENTIVE_ERROR", 406, 1117);
            CRYPTO_ORDER_SELECT_PAYMENT_METHOD = new Name("CRYPTO_ORDER_SELECT_PAYMENT_METHOD", 407, 1209);
            CRYPTO_TRADING_LADDER = new Name("CRYPTO_TRADING_LADDER", 408, 1224);
            API_TRADING_TERMS = new Name("API_TRADING_TERMS", 409, 1310);
            CRYPTO_QUICK_TRADE_SHEET = new Name("CRYPTO_QUICK_TRADE_SHEET", com.robinhood.utils.http.HttpStatusCode.GONE, 1372);
            TRANSFER_DETAILS = new Name("TRANSFER_DETAILS", 411, 60);
            BANKING = new Name("BANKING", 412, 61);
            EARLY_PAY_TRANSFER_DETAILS = new Name("EARLY_PAY_TRANSFER_DETAILS", 413, 69);
            INSTANT_DEPOSIT_OUTCOME = new Name("INSTANT_DEPOSIT_OUTCOME", 414, EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE);
            INSTANT_DEPOSIT_EDUCATION = new Name("INSTANT_DEPOSIT_EDUCATION", 415, EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE);
            PLAID_LINK_BANK_ACCOUNT = new Name("PLAID_LINK_BANK_ACCOUNT", 416, 913);
            LIST_DETAIL_PAGE = new Name("LIST_DETAIL_PAGE", 417, 2);
            CRYTPO_NEWSFEED = new Name("CRYTPO_NEWSFEED", 418, 30);
            ORDER_RECEIPT = new Name("ORDER_RECEIPT", 419, 40);
            SELECT_ORDER_KIND_PAGE = new Name("SELECT_ORDER_KIND_PAGE", 420, 41);
            RECURRING_ORDER_REVIEW = new Name("RECURRING_ORDER_REVIEW", 421, 46);
            OPTIONS_STRATEGY_ROLL_NO_AVAILABLE_POSITIONS = new Name("OPTIONS_STRATEGY_ROLL_NO_AVAILABLE_POSITIONS", 422, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
            OPTIONS_STRATEGY_ROLL_STRATEGY_SUMMARY = new Name("OPTIONS_STRATEGY_ROLL_STRATEGY_SUMMARY", 423, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            IAV_SELECT_BANK_ACCOUNT = new Name("IAV_SELECT_BANK_ACCOUNT", 424, 93);
            CREATE_QUEUED_DEPOSIT = new Name("CREATE_QUEUED_DEPOSIT", CompanyFinancialsSection.BAR_ANIMATION_DURATION, 94);
            REVIEW_QUEUED_DEPOSIT = new Name("REVIEW_QUEUED_DEPOSIT", 426, 95);
            GOLD_BILLING_PAYMENT_PREFERENCE = new Name("GOLD_BILLING_PAYMENT_PREFERENCE", 427, 934);
            CREATE_TRANSFER = new Name("CREATE_TRANSFER", 428, 96);
            REVIEW_TRANSFER = new Name("REVIEW_TRANSFER", 429, 97);
            CREATE_MAX_TRANSFER = new Name("CREATE_MAX_TRANSFER", 430, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE);
            VERIFY_DEBIT_CARD_SPLASH = new Name("VERIFY_DEBIT_CARD_SPLASH", 431, 546);
            VERIFY_DEBIT_CARD_STEPS = new Name("VERIFY_DEBIT_CARD_STEPS", 432, 547);
            VERIFY_DEBIT_CARD_CODE_ENTRY = new Name("VERIFY_DEBIT_CARD_CODE_ENTRY", 433, 548);
            ORDER_CONFIRMATION_FUNDING_UPSELL = new Name("ORDER_CONFIRMATION_FUNDING_UPSELL", 434, 658);
            LIMIT_HUB = new Name("LIMIT_HUB", 435, 676);
            WIRE_TRANSFER = new Name("WIRE_TRANSFER", 436, 688);
            WIRE_VAN_DETAILS = new Name("WIRE_VAN_DETAILS", 437, 689);
            WIRE_INFO_SCREEN = new Name("WIRE_INFO_SCREEN", 438, 690);
            POST_TRANSFER_PAGE_RFP_PENDING = new Name("POST_TRANSFER_PAGE_RFP_PENDING", 439, 734);
            RECURRING_DEPOSIT_UPSELL = new Name("RECURRING_DEPOSIT_UPSELL", 440, 749);
            GOLD_DEPOSIT_UPSELL = new Name("GOLD_DEPOSIT_UPSELL", 441, OptionOnboardingUpsellAnimationConstants.UPSELL_ANIMATION_DURATION);
            PLAID_BANK_LIST = new Name("PLAID_BANK_LIST", 442, 765);
            PLAID_AUTHENTICATION = new Name("PLAID_AUTHENTICATION", 443, 766);
            SEPA_INFO = new Name("SEPA_INFO", 444, 774);
            ACH_GRACE_PERIOD_CONFIRMATION = new Name("ACH_GRACE_PERIOD_CONFIRMATION", 445, 776);
            MARGIN_CALL_WIRE_UPSELL = new Name("MARGIN_CALL_WIRE_UPSELL", 446, 801);
            POST_INCOMING_WIRE = new Name("POST_INCOMING_WIRE", 447, 802);
            DIRECT_DEPOSIT_HUB = new Name("DIRECT_DEPOSIT_HUB", 448, 804);
            OUTGOING_WIRE_DETAIL_INPUT = new Name("OUTGOING_WIRE_DETAIL_INPUT", 449, 811);
            OUTGOING_WIRE_LINK_ACCOUNT = new Name("OUTGOING_WIRE_LINK_ACCOUNT", 450, 812);
            LINK_APPLE_PAY_INTRO = new Name("LINK_APPLE_PAY_INTRO", 451, 841);
            LINK_APPLE_PAY_ERROR = new Name("LINK_APPLE_PAY_ERROR", 452, 842);
            LINK_APPLE_PAY_CONFIRMATION = new Name("LINK_APPLE_PAY_CONFIRMATION", 453, 843);
            POST_ONBOARDING_FUND_SPLASH = new Name("POST_ONBOARDING_FUND_SPLASH", 454, 845);
            POST_ONBOARDING_FUND_DETAIL = new Name("POST_ONBOARDING_FUND_DETAIL", 455, 846);
            QUEUED_DEPOSIT_LEARN_MORE = new Name("QUEUED_DEPOSIT_LEARN_MORE", WaitlistAnimationConstants.MIDDLE_YAW_FRAME, 847);
            POST_QUEUED_DEPOSIT_CONFIRMATION = new Name("POST_QUEUED_DEPOSIT_CONFIRMATION", 457, 848);
            OUTGOING_WIRE_DETAIL_V2_INPUT = new Name("OUTGOING_WIRE_DETAIL_V2_INPUT", 458, 909);
            OUTGOING_WIRE_DETAIL_CONFIRMATION = new Name("OUTGOING_WIRE_DETAIL_CONFIRMATION", 459, 910);
            OUTGOING_WIRE_FRAUD_ALERT = new Name("OUTGOING_WIRE_FRAUD_ALERT", 460, 911);
            CREATE_TRANSFER_V2 = new Name("CREATE_TRANSFER_V2", 461, 916);
            WITHDRAW_INTERVENTION_UPSELL = new Name("WITHDRAW_INTERVENTION_UPSELL", 462, 979);
            WITHDRAW_INTERVENTION_CONFIRMATION = new Name("WITHDRAW_INTERVENTION_CONFIRMATION", 463, 980);
            WIRE_TRANSFER_MEMO = new Name("WIRE_TRANSFER_MEMO", 464, 1150);
            OUTGOING_WIRE_THIRD_PARTY_FRAUD_ALERT = new Name("OUTGOING_WIRE_THIRD_PARTY_FRAUD_ALERT", 465, 1151);
            WIRE_TRANSFER_SUBMIT_TITLE_DOCUMENTS = new Name("WIRE_TRANSFER_SUBMIT_TITLE_DOCUMENTS", 466, 1152);
            WIRE_TRANSFER_ENTER_BANK_DETAILS = new Name("WIRE_TRANSFER_ENTER_BANK_DETAILS", 467, 1153);
            WIRE_TRANSFER_CONFIRM_BANK_DETAILS = new Name("WIRE_TRANSFER_CONFIRM_BANK_DETAILS", 468, 1154);
            INTERNAL_TRANSFER_SELECTION = new Name("INTERNAL_TRANSFER_SELECTION", 469, 1210);
            I18N_CURRENCY_SELECTION = new Name("I18N_CURRENCY_SELECTION", 470, 1231);
            I18N_METHOD_SELECTION = new Name("I18N_METHOD_SELECTION", 471, 1232);
            I18N_ACCOUNT_INFO = new Name("I18N_ACCOUNT_INFO", 472, 1233);
            I18N_POST_DEPOSIT = new Name("I18N_POST_DEPOSIT", 473, 1234);
            I18N_ACCOUNT_SELECTION = new Name("I18N_ACCOUNT_SELECTION", 474, 1235);
            I18N_TRANSFER_CREATE = new Name("I18N_TRANSFER_CREATE", 475, 1236);
            I18N_MEMO = new Name("I18N_MEMO", 476, 1237);
            I18N_TRANSFER_REVIEW = new Name("I18N_TRANSFER_REVIEW", 477, 1238);
            POST_TRANSFER_TIMELINE = new Name("POST_TRANSFER_TIMELINE", 478, 1247);
            I18N_TRANSFER_ACCOUNT_INFO = new Name("I18N_TRANSFER_ACCOUNT_INFO", 479, 1248);
            I18N_TRANSFER_ACCOUNT_SELECTION = new Name("I18N_TRANSFER_ACCOUNT_SELECTION", 480, 1249);
            I18N_TRANSFER_CURRENCY_SELECTION = new Name("I18N_TRANSFER_CURRENCY_SELECTION", 481, 1250);
            I18N_TRANSFER_METHOD_SELECTION = new Name("I18N_TRANSFER_METHOD_SELECTION", 482, 1251);
            I18N_TRANSFER_MEMO = new Name("I18N_TRANSFER_MEMO", 483, 1252);
            RECURRING_EXTRA_CASH_SPLASH = new Name("RECURRING_EXTRA_CASH_SPLASH", 484, 1254);
            EXTRA_CASH_SETUP_ACCOUNT_SELECTION = new Name("EXTRA_CASH_SETUP_ACCOUNT_SELECTION", 485, 1255);
            EXTRA_CASH_SETUP_SET_AMOUNT = new Name("EXTRA_CASH_SETUP_SET_AMOUNT", 486, 1256);
            EXTRA_CASH_SETUP_REVIEW = new Name("EXTRA_CASH_SETUP_REVIEW", 487, 1257);
            RECURRING_TRANSFERS_HUB = new Name("RECURRING_TRANSFERS_HUB", 488, 1258);
            ISA_CASH_TRANSFER_INTRO = new Name("ISA_CASH_TRANSFER_INTRO", 489, 1282);
            ISA_CASH_TRANSFER_SELECT_TYPE = new Name("ISA_CASH_TRANSFER_SELECT_TYPE", 490, 1283);
            ISA_CASH_TRANSFER_SELECT_PROVIDER = new Name("ISA_CASH_TRANSFER_SELECT_PROVIDER", 491, 1284);
            ISA_CASH_TRANSFER_MANUAL_PROVIDER = new Name("ISA_CASH_TRANSFER_MANUAL_PROVIDER", 492, 1285);
            ISA_CASH_TRANSFER_ACCOUNT_NUMBER = new Name("ISA_CASH_TRANSFER_ACCOUNT_NUMBER", 493, 1286);
            ISA_CASH_TRANSFER_SORT_CODE = new Name("ISA_CASH_TRANSFER_SORT_CODE", 494, 1287);
            ISA_CASH_TRANSFER_CONFIRM_DETAILS = new Name("ISA_CASH_TRANSFER_CONFIRM_DETAILS", 495, 1288);
            ISA_CASH_TRANSFER_UPDATE_YOUR_DETAILS = new Name("ISA_CASH_TRANSFER_UPDATE_YOUR_DETAILS", 496, 1289);
            ISA_CASH_TRANSFER_SELECT_AMOUNT = new Name("ISA_CASH_TRANSFER_SELECT_AMOUNT", 497, 1290);
            ISA_CASH_TRANSFER_ONLY_CASH_INFO = new Name("ISA_CASH_TRANSFER_ONLY_CASH_INFO", 498, 1291);
            ISA_CASH_TRANSFER_ENTER_AMOUNT = new Name("ISA_CASH_TRANSFER_ENTER_AMOUNT", 499, 1292);
            ISA_CASH_TRANSFER_CURRENT_TAX_YEAR = new Name("ISA_CASH_TRANSFER_CURRENT_TAX_YEAR", 500, 1293);
            ISA_CASH_TRANSFER_DECLARATION = new Name("ISA_CASH_TRANSFER_DECLARATION", 501, 1294);
            ISA_CASH_TRANSFER_REVIEW_AND_SUBMIT = new Name("ISA_CASH_TRANSFER_REVIEW_AND_SUBMIT", HttpStatusCode.BAD_GATEWAY_502, 1295);
            ISA_CASH_TRANSFER_REQUEST_RECEIVED = new Name("ISA_CASH_TRANSFER_REQUEST_RECEIVED", 503, 1296);
            EDUCATIONAL_PROPS_EXPLAIN = new Name("EDUCATIONAL_PROPS_EXPLAIN", 504, 100);
            PICK_STOCK_SCREEN = new Name("PICK_STOCK_SCREEN", 505, 101);
            SWIPE_TO_CLAIM_SCREEN = new Name("SWIPE_TO_CLAIM_SCREEN", 506, 102);
            CLAIMED_SCREEN = new Name("CLAIMED_SCREEN", 507, 103);
            CLAIM_REWARD = new Name("CLAIM_REWARD", 508, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
            REFERRAL_REWARD_OFFER_DETAIL = new Name("REFERRAL_REWARD_OFFER_DETAIL", 509, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE);
            CONTACTS_LIST = new Name("CONTACTS_LIST", 510, EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE);
            PAST_REWARDS = new Name("PAST_REWARDS", 511, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE);
            REWARD_OFFER_DETAIL = new Name("REWARD_OFFER_DETAIL", 512, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
            SDP_REFERRAL = new Name("SDP_REFERRAL", 513, 347);
            REFERRAL_REWARD_OFFER_DETAIL_INFO = new Name("REFERRAL_REWARD_OFFER_DETAIL_INFO", 514, 441);
            REFERRAL_INVITE_SENT_CONFIRMATION_DIALOG = new Name("REFERRAL_INVITE_SENT_CONFIRMATION_DIALOG", 515, 444);
            C2C_REFERRAL_OFFER_SENDER_DETAILS_PAGE = new Name("C2C_REFERRAL_OFFER_SENDER_DETAILS_PAGE", WaitlistAnimationConstants.RIGHT_YAW_END, 555);
            C2C_REFERRAL_OFFER_RECEIVER_DETAILS_PAGE = new Name("C2C_REFERRAL_OFFER_RECEIVER_DETAILS_PAGE", 517, 556);
            C2C_REFERRAL_OFFER_SENDER_FRIENDS_LIST = new Name("C2C_REFERRAL_OFFER_SENDER_FRIENDS_LIST", 518, 557);
            NCDI_DEPOSIT_PERIOD_PAGE = new Name("NCDI_DEPOSIT_PERIOD_PAGE", 519, 636);
            NCDI_HOLD_PERIOD_PAGE = new Name("NCDI_HOLD_PERIOD_PAGE", 520, 637);
            NCDI_HOLD_PERIOD_WITHDREW_PAGE = new Name("NCDI_HOLD_PERIOD_WITHDREW_PAGE", com.robinhood.utils.http.HttpStatusCode.DOWNTIME_ERROR, 638);
            REWARD_OFFERS_LIST = new Name("REWARD_OFFERS_LIST", 522, 970);
            POST_REWARD_CLAIM_UPSELL_SCREEN = new Name("POST_REWARD_CLAIM_UPSELL_SCREEN", 523, 971);
            FELIX_INTRODUCTION = new Name("FELIX_INTRODUCTION", 524, 107);
            FELIX_USER_ARCHETYPE = new Name("FELIX_USER_ARCHETYPE", 525, 108);
            FELIX_TIMELINE = new Name("FELIX_TIMELINE", 526, 109);
            FELIX_ASSET_BREAKDOWN = new Name("FELIX_ASSET_BREAKDOWN", 527, 110);
            FELIX_USERBASE_SIZE = new Name("FELIX_USERBASE_SIZE", 528, 111);
            FELIX_INVESTING_CULTURE = new Name("FELIX_INVESTING_CULTURE", 529, 112);
            FELIX_OUTRO = new Name("FELIX_OUTRO", 530, 113);
            FELIX_OUTRO_ANIMATION = new Name("FELIX_OUTRO_ANIMATION", 531, 114);
            FELIX_MANIFESTO = new Name("FELIX_MANIFESTO", 532, 115);
            IRR_REQUEST = new Name("IRR_REQUEST", 533, 123);
            IRR_DELETE = new Name("IRR_DELETE", 534, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            IRR_REQUEST_CONFIRMATION = new Name("IRR_REQUEST_CONFIRMATION", 535, 125);
            IRR_DELETE_CONFIRMATION = new Name("IRR_DELETE_CONFIRMATION", 536, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            IRR_REQUEST_IN_PROGRESS = new Name("IRR_REQUEST_IN_PROGRESS", 537, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
            IRR_DELETE_IN_PROGRESS = new Name("IRR_DELETE_IN_PROGRESS", 538, 128);
            IRR_DOWNLOAD = new Name("IRR_DOWNLOAD", 539, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
            IPOA_ALLOCATED_RESULT = new Name("IPOA_ALLOCATED_RESULT", 540, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE);
            IPOA_SUMMARY = new Name("IPOA_SUMMARY", 541, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE);
            IPOA_ENROLLMENT = new Name("IPOA_ENROLLMENT", 542, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE);
            IPOA_LIST = new Name("IPOA_LIST", 543, 147);
            IPOA_NOT_ALLOCATED_RESULT = new Name("IPOA_NOT_ALLOCATED_RESULT", 544, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
            IPOA_ANNOUNCEMENT = new Name("IPOA_ANNOUNCEMENT", 545, 200);
            IPOA_LEARNING_HUB = new Name("IPOA_LEARNING_HUB", 546, 201);
            IPOA_COB_FOLLOW_UP = new Name("IPOA_COB_FOLLOW_UP", 547, 202);
            IPOA_NOT_ALLOCATED = new Name("IPOA_NOT_ALLOCATED", 548, EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE);
            PRE_IPO_BID = new Name("PRE_IPO_BID", 549, 852);
            LOGIN = new Name("LOGIN", 550, 136);
            SECURITY_PRIVACY_CENTER = new Name("SECURITY_PRIVACY_CENTER", 551, EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE);
            IN_APP_VERIFICATION = new Name("IN_APP_VERIFICATION", RhRoomDatabase.MIGRATION_START_VER, EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
            PASSWORD_UPDATE = new Name("PASSWORD_UPDATE", 553, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE);
            PASSWORD_UPDATE_SUCCESS = new Name("PASSWORD_UPDATE_SUCCESS", 554, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            EMAIL_UPDATE = new Name("EMAIL_UPDATE", 555, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE);
            EMAIL_UPDATE_VERIFICATION = new Name("EMAIL_UPDATE_VERIFICATION", 556, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE);
            EMAIL_UPDATE_SUCCESS = new Name("EMAIL_UPDATE_SUCCESS", 557, EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE);
            PHONE_UPDATE = new Name("PHONE_UPDATE", 558, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
            PHONE_UPDATE_CONFIRMATION = new Name("PHONE_UPDATE_CONFIRMATION", 559, 165);
            PHONE_UPDATE_VERIFICATION = new Name("PHONE_UPDATE_VERIFICATION", 560, EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE);
            PHONE_UPDATE_SUCCESS = new Name("PHONE_UPDATE_SUCCESS", 561, 167);
            TWO_FACTOR_AUTHENTICATION = new Name("TWO_FACTOR_AUTHENTICATION", 562, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
            MFA_AUTH_APP_SELECTION = new Name("MFA_AUTH_APP_SELECTION", 563, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE);
            MFA_BACKUP_CODE = new Name("MFA_BACKUP_CODE", 564, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
            MFA_SMS_VERIFICATION = new Name("MFA_SMS_VERIFICATION", 565, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE);
            VOICE_ENROLLMENT_INTRO = new Name("VOICE_ENROLLMENT_INTRO", 566, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE);
            VOICE_ENROLLMENT_CONSENT = new Name("VOICE_ENROLLMENT_CONSENT", 567, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
            VOICE_RECORD = new Name("VOICE_RECORD", 568, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE);
            VOICE_ENROLLMENT_COMPLETE = new Name("VOICE_ENROLLMENT_COMPLETE", 569, EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
            VOICE_VERIFICATION_SETTINGS = new Name("VOICE_VERIFICATION_SETTINGS", 570, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE);
            TRUSTED_DEVICES = new Name("TRUSTED_DEVICES", 571, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE);
            DEVICE_APPROVAL = new Name("DEVICE_APPROVAL", 572, EnumC7081g.f2777x89a9e432);
            DEVICE_APPROVAL_BLOCKED = new Name("DEVICE_APPROVAL_BLOCKED", 573, EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE);
            DEVICE_APPROVAL_LOGIN_APPROVED = new Name("DEVICE_APPROVAL_LOGIN_APPROVED", 574, 288);
            DEVICE_APPROVAL_LOGIN = new Name("DEVICE_APPROVAL_LOGIN", CompanyFinancialsSection.LINE_REVEAL_ANIMATION_DURATION, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE);
            DEVICE_APPROVAL_LOGIN_BLOCKED = new Name("DEVICE_APPROVAL_LOGIN_BLOCKED", 576, EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE);
            DEVICE_APPROVAL_ENROLL = new Name("DEVICE_APPROVAL_ENROLL", 577, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE);
            RESET_PASSWORD = new Name("RESET_PASSWORD", 578, EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE);
            IAV_DEVICE_APPROVAL_SILENT_RESULT = new Name("IAV_DEVICE_APPROVAL_SILENT_RESULT", 579, 334);
            IAV_DEVICE_APPROVAL_SILENT_WAITING = new Name("IAV_DEVICE_APPROVAL_SILENT_WAITING", 580, 335);
            DEVICE_SECURITY_SETTINGS = new Name("DEVICE_SECURITY_SETTINGS", 581, 515);
            PASSKEY_LOGIN = new Name("PASSKEY_LOGIN", 582, WaitlistAnimationConstants.RIGHT_YAW_END);
            WEBAUTHN_ENROLLMENT_SUCCESS = new Name("WEBAUTHN_ENROLLMENT_SUCCESS", 583, 517);
            WEBAUTHN_ENROLLMENT_EDUCATION = new Name("WEBAUTHN_ENROLLMENT_EDUCATION", 584, 518);
            DEVICE_APPROVAL_HANDLING = new Name("DEVICE_APPROVAL_HANDLING", 585, 893);
            DEVICE_APPROVAL_HANDLING_BLOCKED = new Name("DEVICE_APPROVAL_HANDLING_BLOCKED", 586, 894);
            KBA_VERIFICATION = new Name("KBA_VERIFICATION", 587, 973);
            REVAMP_LOGIN_CONFIRM_EMAIL = new Name("REVAMP_LOGIN_CONFIRM_EMAIL", 588, 974);
            REVAMP_LOGIN_UPDATE_EMAIL = new Name("REVAMP_LOGIN_UPDATE_EMAIL", 589, 975);
            REVAMP_LOGIN_VERIFY_EMAIL = new Name("REVAMP_LOGIN_VERIFY_EMAIL", 590, 976);
            REVAMP_LOGIN_ASK_UPDATE_PASSWORD = new Name("REVAMP_LOGIN_ASK_UPDATE_PASSWORD", 591, 977);
            REVAMP_LOGIN_UPDATE_PASSWORD = new Name("REVAMP_LOGIN_UPDATE_PASSWORD", 592, 978);
            LOGGED_IN_IDENTITY_VERIFICATION_WAIT = new Name("LOGGED_IN_IDENTITY_VERIFICATION_WAIT", 593, 1009);
            PRISM = new Name("PRISM", 594, 1043);
            WORKFLOW_UPDATE_APP = new Name("WORKFLOW_UPDATE_APP", 595, 1088);
            WORKFLOW_INFO = new Name("WORKFLOW_INFO", 596, 1089);
            WORKFLOW_SMS_CHALLENGE = new Name("WORKFLOW_SMS_CHALLENGE", 597, 1090);
            WORKFLOW_DEVICE_APPROVAL_CHALLENGE = new Name("WORKFLOW_DEVICE_APPROVAL_CHALLENGE", 598, 1091);
            WORKFLOW_PLAID_BANK_LIST = new Name("WORKFLOW_PLAID_BANK_LIST", 599, 1092);
            WORKFLOW_PLAID_AUTH = new Name("WORKFLOW_PLAID_AUTH", 600, 1093);
            WORKFLOW_GKBA = new Name("WORKFLOW_GKBA", 601, 1094);
            WORKFLOW_EMAIL_CHALLENGE = new Name("WORKFLOW_EMAIL_CHALLENGE", 602, 1095);
            WORKFLOW_KYC_STATUS_CHECK = new Name("WORKFLOW_KYC_STATUS_CHECK", 603, 1096);
            WORKFLOW_REQUEST_PHONE_CALL = new Name("WORKFLOW_REQUEST_PHONE_CALL", 604, 1097);
            WORKFLOW_KYC_AGREEMENT = new Name("WORKFLOW_KYC_AGREEMENT", 605, 1104);
            WORKFLOW_KYC_WAITING = new Name("WORKFLOW_KYC_WAITING", 606, 1105);
            WORKFLOW_REQUEST_PHONE_CALL_SELECT_COUNTRY = new Name("WORKFLOW_REQUEST_PHONE_CALL_SELECT_COUNTRY", 607, 1106);
            WORKFLOW_REQUEST_PHONE_CALL_EDIT = new Name("WORKFLOW_REQUEST_PHONE_CALL_EDIT", 608, 1107);
            WORKFLOW_CHECKLIST = new Name("WORKFLOW_CHECKLIST", 609, 1259);
            RHY_MIGRATION_FEATURE_REWARDS = new Name("RHY_MIGRATION_FEATURE_REWARDS", 610, 150);
            RHY_MIGRATION_FEATURE_DIRECT_DEPOSIT = new Name("RHY_MIGRATION_FEATURE_DIRECT_DEPOSIT", 611, 151);
            RHY_MIGRATION_CONTRAST_MULTIPLE_ACCOUNTS = new Name("RHY_MIGRATION_CONTRAST_MULTIPLE_ACCOUNTS", 612, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
            RHY_MIGRATION_AGREEMENT = new Name("RHY_MIGRATION_AGREEMENT", 613, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE);
            RHY_MIGRATION_CONFIRM_ADDRESS = new Name("RHY_MIGRATION_CONFIRM_ADDRESS", 614, EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE);
            RHY_MIGRATION_OPEN_SPENDING_ACCOUNT = new Name("RHY_MIGRATION_OPEN_SPENDING_ACCOUNT", 615, 155);
            RHY_MIGRATION_TIME_OUT_BOTTOM_SHEET = new Name("RHY_MIGRATION_TIME_OUT_BOTTOM_SHEET", 616, 156);
            RHY_MIGRATION_REVIEW_CHANGES = new Name("RHY_MIGRATION_REVIEW_CHANGES", 617, EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE);
            RHY_MIGRATION_SELECT_CARD = new Name("RHY_MIGRATION_SELECT_CARD", 618, EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE);
            RHY_MIGRATION_CONFIRMATION = new Name("RHY_MIGRATION_CONFIRMATION", 619, EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE);
            RHY_MIGRATION_FEATURE_MERCHANT_REWARDS = new Name("RHY_MIGRATION_FEATURE_MERCHANT_REWARDS", 620, 509);
            RHY_MIGRATION_INTRO_LONG = new Name("RHY_MIGRATION_INTRO_LONG", 621, 572);
            RHY_MIGRATION_FUNDING = new Name("RHY_MIGRATION_FUNDING", 622, 573);
            RHY_MIGRATION_SETUP_CHECKLIST = new Name("RHY_MIGRATION_SETUP_CHECKLIST", 623, 574);
            RHY_MIGRATION_OPT_OUT = new Name("RHY_MIGRATION_OPT_OUT", 624, CompanyFinancialsSection.LINE_REVEAL_ANIMATION_DURATION);
            RHY_MIGRATION_SETUP_COMPLETE = new Name("RHY_MIGRATION_SETUP_COMPLETE", 625, 576);
            RHY_MIGRATION_DD_SETUP = new Name("RHY_MIGRATION_DD_SETUP", 626, 577);
            RHY_TURBOTAX_INTRO = new Name("RHY_TURBOTAX_INTRO", 627, 596);
            RHY_TURBOTAX_OFFER_SELECTION = new Name("RHY_TURBOTAX_OFFER_SELECTION", 628, 597);
            RHY_TURBOTAX_OPEN_ACCOUNT = new Name("RHY_TURBOTAX_OPEN_ACCOUNT", 629, 598);
            RHY_TURBOTAX_ACCOUNT_INFO = new Name("RHY_TURBOTAX_ACCOUNT_INFO", 630, 599);
            RHY_TURBOTAX_ENABLE_EARLY_PAY = new Name("RHY_TURBOTAX_ENABLE_EARLY_PAY", 631, 600);
            RECS_FIRST_TRADE_INTRO = new Name("RECS_FIRST_TRADE_INTRO", 632, EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
            RECS_INVESTOR_PROFILE_INTRO = new Name("RECS_INVESTOR_PROFILE_INTRO", 633, EnumC7081g.f2773x8d9721ad);
            RECS_INVESTOR_PROFILE_QUESTION = new Name("RECS_INVESTOR_PROFILE_QUESTION", 634, EnumC7081g.f2780x600b66fe);
            RECS_INVESTOR_PROFILE_SECTION_COVER = new Name("RECS_INVESTOR_PROFILE_SECTION_COVER", 635, EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE);
            RECS_RISK_LOADER = new Name("RECS_RISK_LOADER", 636, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE);
            RECS_RISK_PROFILE = new Name("RECS_RISK_PROFILE", 637, 182);
            RECS_CONFIRM_QUESTIONNAIRE = new Name("RECS_CONFIRM_QUESTIONNAIRE", 638, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE);
            RECS_PORTFOLIO_INTRO = new Name("RECS_PORTFOLIO_INTRO", 639, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
            RECS_PORTFOLIO_DIVERSIFICATION = new Name("RECS_PORTFOLIO_DIVERSIFICATION", OptionsSimulatedReturnUtils.SMALL_DEVICE_HEIGHT_FOR_OPTIONS_SIMULATED_RETURNS, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE);
            RECS_PORTFOLIO_WALKTHROUGH = new Name("RECS_PORTFOLIO_WALKTHROUGH", 641, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE);
            RECS_LEARN_MORE = new Name("RECS_LEARN_MORE", 642, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE);
            RECS_PORTFOLIO_ALLOCATION = new Name("RECS_PORTFOLIO_ALLOCATION", 643, 188);
            RECS_PORTFOLIO_SUMMARY = new Name("RECS_PORTFOLIO_SUMMARY", 644, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE);
            RECS_ORDER_ENTRY = new Name("RECS_ORDER_ENTRY", 645, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
            RECS_ORDER_PREVIEW = new Name("RECS_ORDER_PREVIEW", 646, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
            RECS_ORDER_REVIEW = new Name("RECS_ORDER_REVIEW", 647, 192);
            RECS_DISCLOSURE = new Name("RECS_DISCLOSURE", 648, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE);
            RECS_ORDER_SUMMARY = new Name("RECS_ORDER_SUMMARY", 649, EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE);
            RECS_ORDER_RECEIPT = new Name("RECS_ORDER_RECEIPT", SduiMarginBufferBarLarge.MARGIN_BUFFER_BAR_LARGE_ANIMATION_DURATION_MILLIS, EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE);
            RECS_TRADE_CELEBRATION = new Name("RECS_TRADE_CELEBRATION", 651, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
            RECS_UNAVAILABLE = new Name("RECS_UNAVAILABLE", 652, EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE);
            RECS_PORTFOLIO_INCLUDES = new Name("RECS_PORTFOLIO_INCLUDES", 653, 211);
            RECS_REENTRY_INTRO = new Name("RECS_REENTRY_INTRO", 654, EnumC7081g.f2779x59907a3d);
            RECS_REENTRY_CONFIRMATION = new Name("RECS_REENTRY_CONFIRMATION", 655, 250);
            RECS_REENTRY_EDIT = new Name("RECS_REENTRY_EDIT", 656, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE);
            RECOMMENDATIONS_ONBOARDING_INTRO = new Name("RECOMMENDATIONS_ONBOARDING_INTRO", 657, 378);
            RECS_RET_INTRO = new Name("RECS_RET_INTRO", 658, 466);
            RECS_RET_QUESTIONNAIRE_RESULTS = new Name("RECS_RET_QUESTIONNAIRE_RESULTS", 659, 471);
            RECS_RET_PORTFOLIO = new Name("RECS_RET_PORTFOLIO", 660, 472);
            RECS_RET_TRADE_CELEBRATION = new Name("RECS_RET_TRADE_CELEBRATION", 661, 473);
            RECS_RET_RECURRING_HOOK = new Name("RECS_RET_RECURRING_HOOK", 662, 474);
            RECS_RET_RECURRING_DECISION = new Name("RECS_RET_RECURRING_DECISION", 663, 475);
            RECS_RET_CONGRATS = new Name("RECS_RET_CONGRATS", 664, 510);
            RECS_RET_QUESTIONNAIRE_RESULTS_INTRO = new Name("RECS_RET_QUESTIONNAIRE_RESULTS_INTRO", 665, 511);
            RECS_RET_PROSPECTUS = new Name("RECS_RET_PROSPECTUS", 666, 512);
            WAITLIST = new Name("WAITLIST", 667, EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE);
            LEARNING_LESSON_SELECTOR = new Name("LEARNING_LESSON_SELECTOR", 668, 58);
            LEARNING_LESSON = new Name("LEARNING_LESSON", 669, 59);
            LEARNING_LESSON_V2 = new Name("LEARNING_LESSON_V2", 670, 98);
            SAFETY_LABEL_LESSON = new Name("SAFETY_LABEL_LESSON", 671, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            EDUCATION_TOUR = new Name("EDUCATION_TOUR", 672, EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE);
            LEARNING_LESSON_V3 = new Name("LEARNING_LESSON_V3", 673, EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);
            EDUCATION_HOME = new Name("EDUCATION_HOME", 674, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
            SNACKS_ARTICLE_PAGE = new Name("SNACKS_ARTICLE_PAGE", 675, 379);
            L2E_ONBOARDING = new Name("L2E_ONBOARDING", 676, 589);
            ACATS_IN_ACCOUNT_ELIGIBLE = new Name("ACATS_IN_ACCOUNT_ELIGIBLE", 677, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            ACATS_IN_ACCOUNT_MAY_BE_ELIGIBLE = new Name("ACATS_IN_ACCOUNT_MAY_BE_ELIGIBLE", 678, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
            ACATS_IN_ACCOUNT_NOT_ELIGIBLE = new Name("ACATS_IN_ACCOUNT_NOT_ELIGIBLE", 679, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE);
            ACATS_IN_ACCOUNT_NUMBER_ENTRY = new Name("ACATS_IN_ACCOUNT_NUMBER_ENTRY", 680, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
            ACATS_IN_CELEBRATION = new Name("ACATS_IN_CELEBRATION", 681, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
            ACATS_IN_CONFIRMATION = new Name("ACATS_IN_CONFIRMATION", 682, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE);
            ACATS_IN_CONFIRM_NAME = new Name("ACATS_IN_CONFIRM_NAME", CylinderBarConstants.TOTAL_ANIMATION_DURATION_SINGLE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);
            ACATS_IN_DTC_ENTRY = new Name("ACATS_IN_DTC_ENTRY", 684, 239);
            ACATS_IN_ELIGIBILITY_QUESTION = new Name("ACATS_IN_ELIGIBILITY_QUESTION", 685, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            ACATS_IN_INTRO = new Name("ACATS_IN_INTRO", 686, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE);
            ACATS_IN_NAME_CHANGE = new Name("ACATS_IN_NAME_CHANGE", 687, EnumC7081g.f2778x3356acf6);
            ACATS_IN_SELECT_BROKERAGE = new Name("ACATS_IN_SELECT_BROKERAGE", 688, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE);
            ACATS_IN_SUBMIT = new Name("ACATS_IN_SUBMIT", 689, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
            ACATS_IN_TERMS_AND_CONDITIONS = new Name("ACATS_IN_TERMS_AND_CONDITIONS", 690, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
            ACATS_IN_ACCOUNT_SELECTION = new Name("ACATS_IN_ACCOUNT_SELECTION", 691, 390);
            ACATS_IN_TRANSFER_CONTENTS = new Name("ACATS_IN_TRANSFER_CONTENTS", 692, 391);
            ACATS_IN_NON_GOLD_UPGRADE = new Name("ACATS_IN_NON_GOLD_UPGRADE", 693, 392);
            ACATS_IN_GOLD_USER_MARGIN_UPGRADE = new Name("ACATS_IN_GOLD_USER_MARGIN_UPGRADE", 694, 393);
            ACATS_IN_PARTIAL_TRANSFER = new Name("ACATS_IN_PARTIAL_TRANSFER", 695, 394);
            ACATS_IN_MARGIN_ENABLEMENT = new Name("ACATS_IN_MARGIN_ENABLEMENT", 696, 532);
            ACATS_IN_IDENTIFY_PARTIAL_ASSETS = new Name("ACATS_IN_IDENTIFY_PARTIAL_ASSETS", 697, 567);
            ACATS_IN_PARTIAL_SEARCH_INSTRUMENT = new Name("ACATS_IN_PARTIAL_SEARCH_INSTRUMENT", 698, 568);
            ACATS_IN_PARTIAL_ADD_INSTRUMENT = new Name("ACATS_IN_PARTIAL_ADD_INSTRUMENT", 699, 569);
            ACATS_IN_BONUS_MATCH = new Name("ACATS_IN_BONUS_MATCH", Timeline.MIDDLE_META_OFFSET_ANIMATION_DURATION, 731);
            ACAT_HISTORY_DETAIL = new Name("ACAT_HISTORY_DETAIL", 701, 838);
            ACAT_RETRY = new Name("ACAT_RETRY", 702, 839);
            ACATS_IN_PARTIAL_TRANSFER_ELIGIBLE = new Name("ACATS_IN_PARTIAL_TRANSFER_ELIGIBLE", 703, 873);
            ACATS_IN_EDIT_ASSET = new Name("ACATS_IN_EDIT_ASSET", 704, 874);
            ACATS_IN_UNSUPPORTED_ASSETS = new Name("ACATS_IN_UNSUPPORTED_ASSETS", 705, 875);
            ACATS_IN_TRANSFER_UNSUPPORTED = new Name("ACATS_IN_TRANSFER_UNSUPPORTED", 706, 876);
            ACATS_IN_OPTIONS_ENABLEMENT = new Name("ACATS_IN_OPTIONS_ENABLEMENT", 707, 887);
            MARGIN_ACATS_LANDING = new Name("MARGIN_ACATS_LANDING", 708, 917);
            INTERNAL_ASSET_TRANSFER_TRANSFER_TYPE = new Name("INTERNAL_ASSET_TRANSFER_TRANSFER_TYPE", 709, 1017);
            INTERNAL_ASSET_TRANSFER_ASSET_SELECTION = new Name("INTERNAL_ASSET_TRANSFER_ASSET_SELECTION", 710, 1018);
            INTERNAL_ASSET_TRANSFER_EDIT_EQUITY = new Name("INTERNAL_ASSET_TRANSFER_EDIT_EQUITY", 711, 1019);
            INTERNAL_ASSET_TRANSFER_EDIT_CASH = new Name("INTERNAL_ASSET_TRANSFER_EDIT_CASH", 712, 1020);
            INTERNAL_ASSET_TRANSFER_EDIT_MARGIN = new Name("INTERNAL_ASSET_TRANSFER_EDIT_MARGIN", 713, 1021);
            CLAWBACK_GRACE_PERIOD_OPT_IN_SCREEN = new Name("CLAWBACK_GRACE_PERIOD_OPT_IN_SCREEN", 714, 1129);
            ACATS_CUSTODIALS_REVIEW = new Name("ACATS_CUSTODIALS_REVIEW", 715, 1303);
            TRANSFER_INFO = new Name("TRANSFER_INFO", 716, 1319);
            ACATS_TRANSFER_INFO = new Name("ACATS_TRANSFER_INFO", 717, 1327);
            ACATS_IN_INFO_REVIEW = new Name("ACATS_IN_INFO_REVIEW", 718, 1351);
            ACATS_IN_TRANSFER_INFO = new Name("ACATS_IN_TRANSFER_INFO", 719, 1373);
            ACATS_IN_CONFIRM_ACCOUNT_INFO = new Name("ACATS_IN_CONFIRM_ACCOUNT_INFO", 720, 1374);
            ACATS_IN_ACCOUNT_INFO_MISMATCH = new Name("ACATS_IN_ACCOUNT_INFO_MISMATCH", 721, 1375);
            RHY_SPENDING_HOME = new Name("RHY_SPENDING_HOME", 722, EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE);
            RHY_BACKUP_COVERAGE_BOTTOM_SHEET = new Name("RHY_BACKUP_COVERAGE_BOTTOM_SHEET", 723, 550);
            RHY_BACKUP_COVERAGE_DETAILS = new Name("RHY_BACKUP_COVERAGE_DETAILS", 724, 551);
            RHY_SPENDING_SETTINGS = new Name("RHY_SPENDING_SETTINGS", 725, RhRoomDatabase.MIGRATION_START_VER);
            RHY_SPENDING_CARD_CONTROLS = new Name("RHY_SPENDING_CARD_CONTROLS", 726, 553);
            SPENDING_ACCOUNT_CREATED = new Name("SPENDING_ACCOUNT_CREATED", 727, 624);
            RHY_POST_SIGNUP = new Name("RHY_POST_SIGNUP", 728, 667);
            CRYPTO_GIFT_EDIT = new Name("CRYPTO_GIFT_EDIT", 729, EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE);
            CRYPTO_GIFT_ONBOARDING = new Name("CRYPTO_GIFT_ONBOARDING", 730, EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE);
            CRYPTO_GIFT_PURCHASE_CONFIRMATION = new Name("CRYPTO_GIFT_PURCHASE_CONFIRMATION", 731, EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE);
            CRYPTO_GIFT_RECEIVE_DETAILS = new Name("CRYPTO_GIFT_RECEIVE_DETAILS", 732, 271);
            CRYPTO_GIFT_RECEIVE_CONFIRMATION = new Name("CRYPTO_GIFT_RECEIVE_CONFIRMATION", 733, EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE);
            CREATE_GRYPTO_GIFT_ERROR_DIALOG = new Name("CREATE_GRYPTO_GIFT_ERROR_DIALOG", 734, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE);
            RECEIVE_GRYPTO_GIFT_ERROR_DIALOG = new Name("RECEIVE_GRYPTO_GIFT_ERROR_DIALOG", 735, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE);
            CRYPTO_GIFT_PURCHASE_DETAILS = new Name("CRYPTO_GIFT_PURCHASE_DETAILS", 736, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE);
            CREATE_CRYPTO_GIFT_LOADING = new Name("CREATE_CRYPTO_GIFT_LOADING", 737, EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE);
            RECEIVE_CRYPTO_GIFT_LOADING = new Name("RECEIVE_CRYPTO_GIFT_LOADING", 738, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE);
            CRYPTO_GIFT_DASHBOARD = new Name("CRYPTO_GIFT_DASHBOARD", 739, EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE);
            CANCEL_CRYPTO_GIFT = new Name("CANCEL_CRYPTO_GIFT", 740, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE);
            SHAREHOLDER_QA_INTRO = new Name("SHAREHOLDER_QA_INTRO", 741, 280);
            SHAREHOLDER_QA_INTRO_DISCLOSURE = new Name("SHAREHOLDER_QA_INTRO_DISCLOSURE", 742, EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE);
            SHAREHOLDER_ASK_A_QUESTION = new Name("SHAREHOLDER_ASK_A_QUESTION", 743, EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE);
            SHAREHOLDER_QUESTIONS_LIST = new Name("SHAREHOLDER_QUESTIONS_LIST", 744, 283);
            SHAREHOLDER_EVENTS_LIST = new Name("SHAREHOLDER_EVENTS_LIST", 745, 376);
            BENEFICIARY_LIST = new Name("BENEFICIARY_LIST", 746, 300);
            BENEFICIARY_VALUE_PROP = new Name("BENEFICIARY_VALUE_PROP", 747, EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE);
            BENEFICIARY_DISCLOSURE = new Name("BENEFICIARY_DISCLOSURE", 748, 302);
            BENEFICIARY_NAME_INPUT = new Name("BENEFICIARY_NAME_INPUT", 749, EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE);
            BENEFICIARY_RELATIONSHIP_INPUT = new Name("BENEFICIARY_RELATIONSHIP_INPUT", OptionOnboardingUpsellAnimationConstants.UPSELL_ANIMATION_DURATION, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
            BENEFICIARY_SPOUSAL_AGREEMENT = new Name("BENEFICIARY_SPOUSAL_AGREEMENT", 751, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE);
            BENEFICIARY_DOB_INPUT = new Name("BENEFICIARY_DOB_INPUT", 752, EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE);
            BENEFICIARY_EMAIL_INPUT = new Name("BENEFICIARY_EMAIL_INPUT", 753, EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE);
            BENEFICIARY_DETAIL = new Name("BENEFICIARY_DETAIL", 754, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE);
            BENEFICIARY_ACCOUNT_SELECTION = new Name("BENEFICIARY_ACCOUNT_SELECTION", 755, 476);
            BENEFICIARY_TYPE = new Name("BENEFICIARY_TYPE", 756, 1074);
            BENEFICIARY_TRUST_DATE_INPUT = new Name("BENEFICIARY_TRUST_DATE_INPUT", 757, 1075);
            BENEFICIARY_TRUST_NAME_INPUT = new Name("BENEFICIARY_TRUST_NAME_INPUT", 758, 1076);
            BENEFICIARY_TRUST_TAX_ID_INPUT = new Name("BENEFICIARY_TRUST_TAX_ID_INPUT", 759, 1077);
            BENEFICIARY_TRUSTEE_EMAIL_INPUT = new Name("BENEFICIARY_TRUSTEE_EMAIL_INPUT", 760, 1078);
            BENEFICIARY_LEVEL = new Name("BENEFICIARY_LEVEL", 761, 1118);
            BENEFICIARY_CHOOSE_EXISTING = new Name("BENEFICIARY_CHOOSE_EXISTING", 762, 1217);
            CRYPTO_TRANSFER_RECEIVE = new Name("CRYPTO_TRANSFER_RECEIVE", 763, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            CRYPTO_TRANSFER_SEND_AMOUNT = new Name("CRYPTO_TRANSFER_SEND_AMOUNT", 764, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
            CRYPTO_TRANSFER_SEND_ADDRESS = new Name("CRYPTO_TRANSFER_SEND_ADDRESS", 765, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            CRYPTO_TRANSFER_SEND_REVIEW = new Name("CRYPTO_TRANSFER_SEND_REVIEW", 766, 255);
            CRYPTO_TRANSFER_SEND_CONFIRMATION = new Name("CRYPTO_TRANSFER_SEND_CONFIRMATION", 767, 256);
            CRYPTO_TRANSFER_SEND_QR_SCANNER = new Name("CRYPTO_TRANSFER_SEND_QR_SCANNER", 768, EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE);
            CRYPTO_TRANSFER_ENROLLMENT_PRODUCT_INTRO = new Name("CRYPTO_TRANSFER_ENROLLMENT_PRODUCT_INTRO", 769, 372);
            CRYPTO_TRANSFER_ENROLLMENT_AGREEMENT = new Name("CRYPTO_TRANSFER_ENROLLMENT_AGREEMENT", 770, com.robinhood.utils.http.HttpStatusCode.DOWNTIME_ERROR);
            CRYPTO_TRANSFER_ENROLLMENT_STEPS = new Name("CRYPTO_TRANSFER_ENROLLMENT_STEPS", 771, 522);
            CRYPTO_TRANSFER_SEND_NETWORK = new Name("CRYPTO_TRANSFER_SEND_NETWORK", 772, 523);
            CRYPTO_TRANSFER_LIMITS = new Name("CRYPTO_TRANSFER_LIMITS", 773, 850);
            CRYPTO_TRANSFER_SEND_PARTY_SELECTION = new Name("CRYPTO_TRANSFER_SEND_PARTY_SELECTION", 774, 992);
            CRYPTO_TRANSFER_SEND_WALLET_SELECTION = new Name("CRYPTO_TRANSFER_SEND_WALLET_SELECTION", 775, 993);
            CRYPTO_TRANSFER_SEND_EXCHANGE = new Name("CRYPTO_TRANSFER_SEND_EXCHANGE", 776, 994);
            CRYPTO_TRANSFER_SEND_EXCHANGE_SEARCH = new Name("CRYPTO_TRANSFER_SEND_EXCHANGE_SEARCH", 777, 995);
            CRYPTO_TRANSFER_SEND_RECEIVER_NAME = new Name("CRYPTO_TRANSFER_SEND_RECEIVER_NAME", 778, 996);
            CRYPTO_TRANSFER_SEND_RECEIVER_DOB = new Name("CRYPTO_TRANSFER_SEND_RECEIVER_DOB", 779, 997);
            CRYPTO_TRANSFER_SEND_PENDING_REVIEW = new Name("CRYPTO_TRANSFER_SEND_PENDING_REVIEW", 780, 998);
            CRYPTO_TRANSFER_SEND_FAILED = new Name("CRYPTO_TRANSFER_SEND_FAILED", 781, 999);
            CRYPTO_TRANSFER_HISTORY_DETAIL = new Name("CRYPTO_TRANSFER_HISTORY_DETAIL", 782, 1001);
            CRYPTO_TRANSFER_RECEIVE_PARTY_SELECTION = new Name("CRYPTO_TRANSFER_RECEIVE_PARTY_SELECTION", 783, 1002);
            CRYPTO_TRANSFER_RECEIVE_WALLET_SELECTION = new Name("CRYPTO_TRANSFER_RECEIVE_WALLET_SELECTION", 784, 1003);
            CRYPTO_TRANSFER_RECEIVE_PENDING_REVIEW = new Name("CRYPTO_TRANSFER_RECEIVE_PENDING_REVIEW", 785, 1004);
            CRYPTO_TRANSFER_RECEIVE_FAILED = new Name("CRYPTO_TRANSFER_RECEIVE_FAILED", 786, ErrorCodes.SOCKET_TIMEOUT_EXCEPTION);
            CRYPTO_TRANSFER_RECEIVE_CONTACT_SUPPORT = new Name("CRYPTO_TRANSFER_RECEIVE_CONTACT_SUPPORT", 787, ErrorCodes.SSL_HANDSHAKE_EXCEPTION);
            CRYPTO_TRANSFER_RECEIVE_EXCHANGE = new Name("CRYPTO_TRANSFER_RECEIVE_EXCHANGE", 788, 1022);
            RHY_WAITLIST_SIGN_UP = new Name("RHY_WAITLIST_SIGN_UP", 789, EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE);
            RHY_WAITLIST_MARKETING_SPLASH = new Name("RHY_WAITLIST_MARKETING_SPLASH", 790, EnumC7081g.f2775xbcb7e6f3);
            PAYCHECK_HUB = new Name("PAYCHECK_HUB", 791, 332);
            PAYCHECK_INVESTMENT_HUB = new Name("PAYCHECK_INVESTMENT_HUB", 792, 333);
            SLIP_ONBOARDING_INTRO = new Name("SLIP_ONBOARDING_INTRO", 793, 337);
            SLIP_ONBOARDING_EDUCATION = new Name("SLIP_ONBOARDING_EDUCATION", 794, 338);
            SLIP_ONBOARDING_CALCULATOR = new Name("SLIP_ONBOARDING_CALCULATOR", 795, 339);
            SLIP_ONBOARDING_RISKS = new Name("SLIP_ONBOARDING_RISKS", 796, 340);
            SLIP_ONBOARDING_FAQS = new Name("SLIP_ONBOARDING_FAQS", 797, 341);
            SLIP_ONBOARDING_AGREEMENTS = new Name("SLIP_ONBOARDING_AGREEMENTS", 798, 342);
            SLIP_ONBOARDING_CONFIRMATION = new Name("SLIP_ONBOARDING_CONFIRMATION", 799, 343);
            SLIP_HUB = new Name("SLIP_HUB", 800, 344);
            SLIP_HUB_SETTING = new Name("SLIP_HUB_SETTING", 801, 375);
            SLIP_ONBOARDING_INTRO_ABBREVIATED = new Name("SLIP_ONBOARDING_INTRO_ABBREVIATED", 802, 430);
            SLIP_ONBOARDING_AGREEMENTS_ABBREVIATED = new Name("SLIP_ONBOARDING_AGREEMENTS_ABBREVIATED", 803, 431);
            SLIP_UPDATED_AGREEMENT = new Name("SLIP_UPDATED_AGREEMENT", 804, 519);
            SLIP_ONBOARDING_INTRO_V3 = new Name("SLIP_ONBOARDING_INTRO_V3", 805, 691);
            SLIP_ONBOARDING_VALUE_PROPS = new Name("SLIP_ONBOARDING_VALUE_PROPS", 806, 692);
            SLIP_ONBOARDING_ELIGIBILITY_CHECKLIST = new Name("SLIP_ONBOARDING_ELIGIBILITY_CHECKLIST", 807, 742);
            SLIP_POST_TRADE_UPSELL = new Name("SLIP_POST_TRADE_UPSELL", 808, 743);
            SLIP_LEARN_AND_EARN_REWARD = new Name("SLIP_LEARN_AND_EARN_REWARD", 809, 758);
            SLIP_ONE_CLICK_AGREEMENTS = new Name("SLIP_ONE_CLICK_AGREEMENTS", 810, 935);
            CREATE_ACCOUNT_CONGRATULATIONS = new Name("CREATE_ACCOUNT_CONGRATULATIONS", 811, 348);
            CLAIM_FRACTIONAL_REWARD_GENERIC_INFO = new Name("CLAIM_FRACTIONAL_REWARD_GENERIC_INFO", 812, 349);
            PROGRESSIVE_ONBOARDING_EXPECTATION = new Name("PROGRESSIVE_ONBOARDING_EXPECTATION", 813, 350);
            PROGRESSIVE_ONBOARDING_RESUME_TRADE_SPLASH = new Name("PROGRESSIVE_ONBOARDING_RESUME_TRADE_SPLASH", 814, 351);
            WELCOME_SAFETY_FIRST = new Name("WELCOME_SAFETY_FIRST", 815, 449);
            WELCOME_START_WITH_DOLLAR = new Name("WELCOME_START_WITH_DOLLAR", 816, 450);
            WELCOME_INVESTING = new Name("WELCOME_INVESTING", 817, 451);
            WELCOME_MAIN = new Name("WELCOME_MAIN", 818, 452);
            USER_CREATION_SPLASH = new Name("USER_CREATION_SPLASH", 819, 453);
            USER_CREATION_EMAIL = new Name("USER_CREATION_EMAIL", CreateTransferShimActivity.transferRequestCode, 454);
            USER_CREATION_PASSWORD = new Name("USER_CREATION_PASSWORD", 821, 455);
            USER_CREATION_LEGAL_NAME = new Name("USER_CREATION_LEGAL_NAME", 822, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
            ONBOARDING_TAKEOVER = new Name("ONBOARDING_TAKEOVER", 823, 721);
            WELCOME_GB_MAIN = new Name("WELCOME_GB_MAIN", 824, 757);
            IDENTITY_VERIFICATION_SPLASH = new Name("IDENTITY_VERIFICATION_SPLASH", 825, 763);
            CONFIRM_REGION = new Name("CONFIRM_REGION", 826, 764);
            PERSONA_IDENTITY_VERIFICATION = new Name("PERSONA_IDENTITY_VERIFICATION", 827, 770);
            COUNTRY_UNAVAILABLE_ERROR = new Name("COUNTRY_UNAVAILABLE_ERROR", 828, 775);
            RESUME_APPLICATION_V1_TAKEOVER = new Name("RESUME_APPLICATION_V1_TAKEOVER", 829, 885);
            RESUME_APPLICATION_V2_TAKEOVER = new Name("RESUME_APPLICATION_V2_TAKEOVER", 830, 886);
            ONBOARDING_DEPOSIT_PAGE = new Name("ONBOARDING_DEPOSIT_PAGE", 831, 889);
            RESURRECTION_SPLASH = new Name("RESURRECTION_SPLASH", 832, 972);
            SELECT_RETIREMENT_CONTRIBUTION_TYPE = new Name("SELECT_RETIREMENT_CONTRIBUTION_TYPE", 833, 352);
            SELECT_RETIREMENT_TAX_YEAR = new Name("SELECT_RETIREMENT_TAX_YEAR", 834, 353);
            RETIREMENT_STATEMENTS_LIST = new Name("RETIREMENT_STATEMENTS_LIST", 835, 435);
            RETIREMENT_STATEMENT_VIEWER = new Name("RETIREMENT_STATEMENT_VIEWER", 836, 436);
            IRA_DISTRIBUTION_FAQ = new Name("IRA_DISTRIBUTION_FAQ", 837, 446);
            SELECT_IRA_DISTRIBUTION_TYPE = new Name("SELECT_IRA_DISTRIBUTION_TYPE", 838, 447);
            EDIT_IRA_TAX_WITHHOLDINGS = new Name("EDIT_IRA_TAX_WITHHOLDINGS", 839, 448);
            RETIREMENT_DASHBOARD = new Name("RETIREMENT_DASHBOARD", 840, 520);
            RETIREMENT_CONTRIBUTION_HUB = new Name("RETIREMENT_CONTRIBUTION_HUB", 841, 533);
            RETIREMENT_ACCOUNT_SELECTION = new Name("RETIREMENT_ACCOUNT_SELECTION", 842, 536);
            RETIREMENT_ACCOUNT_COMPARISON = new Name("RETIREMENT_ACCOUNT_COMPARISON", 843, 537);
            RETIREMENT_ACCOUNT_DESCRIPTION = new Name("RETIREMENT_ACCOUNT_DESCRIPTION", 844, 538);
            RETIREMENT_INSTANT = new Name("RETIREMENT_INSTANT", 845, 539);
            RETIREMENT_REVIEW_AGREEMENTS = new Name("RETIREMENT_REVIEW_AGREEMENTS", 846, 540);
            RETIREMENT_SIGNUP_SUCCESS = new Name("RETIREMENT_SIGNUP_SUCCESS", 847, 541);
            RETIREMENT_SIGNUP_ERROR = new Name("RETIREMENT_SIGNUP_ERROR", 848, 542);
            ENOKI_CONTRIBUTION_CELEBRATION = new Name("ENOKI_CONTRIBUTION_CELEBRATION", 849, 543);
            RETIREMENT_ONBOARDING_SWIPEY = new Name("RETIREMENT_ONBOARDING_SWIPEY", 850, 544);
            RETIREMENT_WAITLIST = new Name("RETIREMENT_WAITLIST", 851, 549);
            RETIREMENT_OPTIONS_OPT_IN = new Name("RETIREMENT_OPTIONS_OPT_IN", 852, 554);
            CREATE_RETIREMENT_CONTRIBUTION = new Name("CREATE_RETIREMENT_CONTRIBUTION", 853, 563);
            RETIREMENT_OPTIONS_CONFIRM_ELIGIBILITY = new Name("RETIREMENT_OPTIONS_CONFIRM_ELIGIBILITY", 854, 565);
            RETIREMENT_OPTIONS_CHECK_ELIGIBILITY = new Name("RETIREMENT_OPTIONS_CHECK_ELIGIBILITY", 855, 566);
            RETIREMENT_401K_ROLLOVER_EDUCATION = new Name("RETIREMENT_401K_ROLLOVER_EDUCATION", 856, 578);
            RETIREMENT_401K_ROLLOVER_OPTIONS = new Name("RETIREMENT_401K_ROLLOVER_OPTIONS", 857, 579);
            RETIREMENT_401K_ROLLOVER_TERMS = new Name("RETIREMENT_401K_ROLLOVER_TERMS", 858, 580);
            RETIREMENT_401K_ROLLOVER_CAPITALIZE = new Name("RETIREMENT_401K_ROLLOVER_CAPITALIZE", 859, 581);
            RETIREMENT_401K_ROLLOVER_DIY = new Name("RETIREMENT_401K_ROLLOVER_DIY", 860, 582);
            RETIREMENT_401K_ROLLOVER_QUESTIONS = new Name("RETIREMENT_401K_ROLLOVER_QUESTIONS", 861, 583);
            RETIREMENT_SIGNUP_LOADING = new Name("RETIREMENT_SIGNUP_LOADING", 862, 584);
            RECS_RET_BUY_AGAIN = new Name("RECS_RET_BUY_AGAIN", 863, 585);
            RETIREMENT_SIGNUP_WHICH_IRA = new Name("RETIREMENT_SIGNUP_WHICH_IRA", 864, 615);
            RETIREMENT_INVEST = new Name("RETIREMENT_INVEST", 865, 616);
            RETIREMENT_TAX_BENEFITS = new Name("RETIREMENT_TAX_BENEFITS", 866, 617);
            IRA_SYP_INTRO = new Name("IRA_SYP_INTRO", 867, 619);
            ROTH_CONVERSION_INFO = new Name("ROTH_CONVERSION_INFO", 868, 633);
            RETIREMENT_MULTIPLE_FUNDING_METHODS = new Name("RETIREMENT_MULTIPLE_FUNDING_METHODS", 869, 657);
            RETIREMENT_LEARN_AND_EARN_REWARD = new Name("RETIREMENT_LEARN_AND_EARN_REWARD", 870, 685);
            RETIREMENT_MATCH_RATE_SELECTION = new Name("RETIREMENT_MATCH_RATE_SELECTION", 871, 702);
            RETIREMENT_ENOKI_INFO = new Name("RETIREMENT_ENOKI_INFO", 872, 722);
            RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_INTRO = new Name("RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_INTRO", 873, 727);
            RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_QUESTION = new Name("RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_QUESTION", 874, 728);
            RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_RESULT = new Name("RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_RESULT", 875, 729);
            RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION = new Name("RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION", 876, 738);
            RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION_AGREEMENTS = new Name("RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION_AGREEMENTS", 877, 739);
            RETIREMENT_ONBOARDING_MANAGEMENT_TYPE_SELECTION = new Name("RETIREMENT_ONBOARDING_MANAGEMENT_TYPE_SELECTION", 878, 740);
            RETIREMENT_SCROLLING_VALUE_PROP = new Name("RETIREMENT_SCROLLING_VALUE_PROP", 879, 756);
            ADVISORY_PORTFOLIO_REVEAL_INTRO = new Name("ADVISORY_PORTFOLIO_REVEAL_INTRO", 880, 760);
            ADVISORY_PORTFOLIO_REVEAL_BREAKDOWN = new Name("ADVISORY_PORTFOLIO_REVEAL_BREAKDOWN", 881, 761);
            ADVISORY_PORTFOLIO_REVEAL_PROJECTION = new Name("ADVISORY_PORTFOLIO_REVEAL_PROJECTION", 882, 762);
            RETIREMENT_1099_PARTNERSHIP_DETAIL = new Name("RETIREMENT_1099_PARTNERSHIP_DETAIL", 883, 768);
            RETIREMENT_MATCH_HUB = new Name("RETIREMENT_MATCH_HUB", 884, 769);
            RETIREMENT_ONBOARDING_FUNDING_METHODS = new Name("RETIREMENT_ONBOARDING_FUNDING_METHODS", 885, 772);
            TAX_SEASON_PROMO_2024_PROMO = new Name("TAX_SEASON_PROMO_2024_PROMO", 886, 806);
            TAX_SEASON_PROMO_2024_MATCH_SELECTOR = new Name("TAX_SEASON_PROMO_2024_MATCH_SELECTOR", 887, 807);
            TAX_SEASON_PROMO_2024_TIMELINE = new Name("TAX_SEASON_PROMO_2024_TIMELINE", 888, 808);
            RETIREMENT_401K_ROLLOVER_METHOD_SELECTION = new Name("RETIREMENT_401K_ROLLOVER_METHOD_SELECTION", 889, 855);
            RETIREMENT_401K_ROLLOVER_VERIFY_INFO = new Name("RETIREMENT_401K_ROLLOVER_VERIFY_INFO", 890, 856);
            RETIREMENT_401K_ROLLOVER_INTERSTITIAL = new Name("RETIREMENT_401K_ROLLOVER_INTERSTITIAL", 891, 857);
            RETIREMENT_401K_ROLLOVER_CAPITALIZE_EMBED = new Name("RETIREMENT_401K_ROLLOVER_CAPITALIZE_EMBED", 892, 858);
            TAX_SEASON_PROMO_2024_MATCH_AGREEMENTS = new Name("TAX_SEASON_PROMO_2024_MATCH_AGREEMENTS", 893, 861);
            IRA_MANAGEMENT_STYLE_SELECTION = new Name("IRA_MANAGEMENT_STYLE_SELECTION", 894, 1214);
            RETIREMENT_401K_FINDER_INTERSTITIAL = new Name("RETIREMENT_401K_FINDER_INTERSTITIAL", 895, 1314);
            RETIREMENT_401K_FINDER_RESULTS = new Name("RETIREMENT_401K_FINDER_RESULTS", 896, 1315);
            RETIREMENT_401K_FINDER_ACCOUNT_DETAILS = new Name("RETIREMENT_401K_FINDER_ACCOUNT_DETAILS", 897, 1316);
            RETIREMENT_401K_FINDER_NO_RESULTS = new Name("RETIREMENT_401K_FINDER_NO_RESULTS", 898, 1317);
            RETIREMENT_401K_FINDER_NOT_SUPPORTED = new Name("RETIREMENT_401K_FINDER_NOT_SUPPORTED", RecsRetirementLoadingConstants.LoopingPhaseMaxFrame, 1318);
            SWEEP_ONBOARDING = new Name("SWEEP_ONBOARDING", 900, 357);
            SWEEP_ONBOARDING_VALUE_PROPS = new Name("SWEEP_ONBOARDING_VALUE_PROPS", 901, 358);
            SWEEP_ONBOARDING_CONFIRMATION = new Name("SWEEP_ONBOARDING_CONFIRMATION", 902, 359);
            SWEEP_ONBOARDING_AGREEMENT = new Name("SWEEP_ONBOARDING_AGREEMENT", 903, 360);
            GOLD_VALUE_PROPS = new Name("GOLD_VALUE_PROPS", 904, 503);
            GOLD_AGREEMENT = new Name("GOLD_AGREEMENT", 905, 504);
            SWEEP_ONBOARDING_CONFIRMATION_WITH_GOLD = new Name("SWEEP_ONBOARDING_CONFIRMATION_WITH_GOLD", 906, 505);
            SWEEP_ONBOARDING_AGREEMENTS_LIST = new Name("SWEEP_ONBOARDING_AGREEMENTS_LIST", 907, 506);
            SWEEP_ONBOARDING_SELECT_RATE = new Name("SWEEP_ONBOARDING_SELECT_RATE", 908, 507);
            SWEEP_ONBOARDING_ERROR = new Name("SWEEP_ONBOARDING_ERROR", 909, 508);
            GOLD_UPGRADE_SUCCESS = new Name("GOLD_UPGRADE_SUCCESS", 910, 514);
            SWEEP_ONBOARDING_HOW_IT_WORKS = new Name("SWEEP_ONBOARDING_HOW_IT_WORKS", 911, 564);
            CHOOSE_LINKING_PAYMENT_METHOD = new Name("CHOOSE_LINKING_PAYMENT_METHOD", 912, 363);
            DEBIT_CARD_NUMBERS_INPUT = new Name("DEBIT_CARD_NUMBERS_INPUT", 913, 364);
            DEBIT_CARD_NAME_INPUT = new Name("DEBIT_CARD_NAME_INPUT", 914, 365);
            DEBIT_CARD_LINKING_LOADING = new Name("DEBIT_CARD_LINKING_LOADING", 915, 366);
            DEBIT_CARD_LINKING_CONFIRMATION = new Name("DEBIT_CARD_LINKING_CONFIRMATION", 916, 367);
            POST_TRANSFER_CONFIRMATION = new Name("POST_TRANSFER_CONFIRMATION", 917, 368);
            TRANSFER_ACCOUNT_SELECTION = new Name("TRANSFER_ACCOUNT_SELECTION", 918, 369);
            DEBIT_CARD_LINKING_SPLASH_SCREEN = new Name("DEBIT_CARD_LINKING_SPLASH_SCREEN", 919, 370);
            MARGIN_UPGRADE_SPLASH = new Name("MARGIN_UPGRADE_SPLASH", 920, 395);
            MARGIN_UPGRADE_EDUCATION = new Name("MARGIN_UPGRADE_EDUCATION", 921, WaitlistAnimationConstants.LEFT_YAW_START);
            MARGIN_UPGRADE_VALUE_PROPS = new Name("MARGIN_UPGRADE_VALUE_PROPS", 922, 397);
            MARGIN_UPGRADE_ELIGIBILITY = new Name("MARGIN_UPGRADE_ELIGIBILITY", 923, 398);
            MARGIN_UPGRADE_MARGIN_LIMIT_SET = new Name("MARGIN_UPGRADE_MARGIN_LIMIT_SET", 924, 399);
            MARGIN_UPGRADE_MARGIN_WITHDRAWAL_SET = new Name("MARGIN_UPGRADE_MARGIN_WITHDRAWAL_SET", 925, 400);
            MARGIN_UPGRADE_INTEREST_RATE_SELECTION = new Name("MARGIN_UPGRADE_INTEREST_RATE_SELECTION", 926, 401);
            GOLD_AND_MARGIN_VALUE_PROPS = new Name("GOLD_AND_MARGIN_VALUE_PROPS", 927, 402);
            MARGIN_UPGRADE_AGREEMENT = new Name("MARGIN_UPGRADE_AGREEMENT", 928, com.robinhood.utils.http.HttpStatusCode.FORBIDDEN);
            MARGIN_UPGRADE_REVIEW = new Name("MARGIN_UPGRADE_REVIEW", 929, 404);
            MARGIN_UPGRADE_ERROR = new Name("MARGIN_UPGRADE_ERROR", 930, 405);
            MARGIN_UPGRADE_GOLD_AGREEMENT = new Name("MARGIN_UPGRADE_GOLD_AGREEMENT", 931, 406);
            MARGIN_UPGRADE_CONFIRMATION = new Name("MARGIN_UPGRADE_CONFIRMATION", 932, 407);
            MARGIN_UPGRADE_GOLD_ONLY_CONFIRMATION = new Name("MARGIN_UPGRADE_GOLD_ONLY_CONFIRMATION", 933, 408);
            MARGIN_UPGRADE_NOT_ELIGIBLE = new Name("MARGIN_UPGRADE_NOT_ELIGIBLE", 934, 409);
            MARGIN_UPGRADE_GOLD_CONFIRMATION = new Name("MARGIN_UPGRADE_GOLD_CONFIRMATION", 935, com.robinhood.utils.http.HttpStatusCode.GONE);
            MARGIN_LIMIT_EDIT = new Name("MARGIN_LIMIT_EDIT", 936, 432);
            MARGIN_UPGRADE_REVIEW_INVESTMENT_PROFILE = new Name("MARGIN_UPGRADE_REVIEW_INVESTMENT_PROFILE", 937, 442);
            MARGIN_CALL_MAINTENANCE = new Name("MARGIN_CALL_MAINTENANCE", 938, 534);
            MARGIN_CALL_MAINTENANCE_RESOLVED = new Name("MARGIN_CALL_MAINTENANCE_RESOLVED", 939, 535);
            NEAR_MARGIN_CALL = new Name("NEAR_MARGIN_CALL", 940, 602);
            BUYING_POWER = new Name("BUYING_POWER", 941, 611);
            MARGIN_CALL_WARN = new Name("MARGIN_CALL_WARN", 942, 612);
            DAY_TRADE_CALL_RESOLVED = new Name("DAY_TRADE_CALL_RESOLVED", 943, 613);
            MARGIN_BATCH_SELL_STOCK = new Name("MARGIN_BATCH_SELL_STOCK", 944, 618);
            BUYING_POWER_HUB = new Name("BUYING_POWER_HUB", 945, 664);
            MARGIN_STATUS_DETAIL = new Name("MARGIN_STATUS_DETAIL", 946, 665);
            MARGIN_REQUIREMENT_TABLE = new Name("MARGIN_REQUIREMENT_TABLE", 947, 666);
            RISKY_DEPOSIT_INSTANT_UPSELL = new Name("RISKY_DEPOSIT_INSTANT_UPSELL", 948, 759);
            MARGIN_UPGRADE_TIERED_RATES = new Name("MARGIN_UPGRADE_TIERED_RATES", 949, 862);
            MARGIN_UPGRADE_GOLD_UPSELL = new Name("MARGIN_UPGRADE_GOLD_UPSELL", 950, 863);
            UK_MARGIN_ONBOARDING_LOSSES = new Name("UK_MARGIN_ONBOARDING_LOSSES", 951, 1033);
            UK_MARGIN_ONBOARDING_GAINS = new Name("UK_MARGIN_ONBOARDING_GAINS", 952, 1034);
            UK_MARGIN_ONBOARDING_POTENTIAL_RISKS = new Name("UK_MARGIN_ONBOARDING_POTENTIAL_RISKS", 953, 1035);
            UK_MARGIN_ONBOARDING_MANAGE_RISKS = new Name("UK_MARGIN_ONBOARDING_MANAGE_RISKS", 954, 1036);
            UK_MARGIN_ONBOARDING_INVESTOR_PROFILE_SPLASH = new Name("UK_MARGIN_ONBOARDING_INVESTOR_PROFILE_SPLASH", 955, 1037);
            UK_MARGIN_ONBOARDING_EXPERIENCE_TEST_SPLASH = new Name("UK_MARGIN_ONBOARDING_EXPERIENCE_TEST_SPLASH", 956, 1038);
            UK_MARGIN_ONBOARDING_KNOWLEDGE_TEST_SPLASH = new Name("UK_MARGIN_ONBOARDING_KNOWLEDGE_TEST_SPLASH", 957, 1039);
            MARGIN_MAINTENANCE_TABLE = new Name("MARGIN_MAINTENANCE_TABLE", 958, 1114);
            MARGIN_MAINTENANCE_TABLE_ON_MARGIN_CALL = new Name("MARGIN_MAINTENANCE_TABLE_ON_MARGIN_CALL", 959, 1311);
            MARGIN_CALL_V2_CLOSE_POSITIONS_SUMMARY = new Name("MARGIN_CALL_V2_CLOSE_POSITIONS_SUMMARY", 960, 1312);
            MARGIN_CALL_V2_MARKET_ORDER = new Name("MARGIN_CALL_V2_MARKET_ORDER", 961, 1313);
            APP_MFA_ENROLLMENT_INTRODUCTION = new Name("APP_MFA_ENROLLMENT_INTRODUCTION", 962, 411);
            APP_MFA_ENROLLMENT_DOWNLOAD = new Name("APP_MFA_ENROLLMENT_DOWNLOAD", 963, 412);
            V1_TWO_FACTOR_TOTP_TOKEN = new Name("V1_TWO_FACTOR_TOTP_TOKEN", 964, 413);
            MANUAL_APP_MFA_ENROLLMENT_KEY = new Name("MANUAL_APP_MFA_ENROLLMENT_KEY", 965, 414);
            MANUAL_APP_MFA_ENROLLMENT_INTRODUCTION = new Name("MANUAL_APP_MFA_ENROLLMENT_INTRODUCTION", 966, 415);
            V1_TWO_FACTOR_CONFIRM_TOTP_TOKEN = new Name("V1_TWO_FACTOR_CONFIRM_TOTP_TOKEN", 967, 416);
            APP_MFA_ENROLLMENT_CODE = new Name("APP_MFA_ENROLLMENT_CODE", 968, 417);
            APP_MFA_ENROLLMENT_CONFIRMATION = new Name("APP_MFA_ENROLLMENT_CONFIRMATION", 969, 418);
            APP_MFA_ENROLLMENT_BACKUP_CODE = new Name("APP_MFA_ENROLLMENT_BACKUP_CODE", 970, 419);
            V1_TWO_FACTOR_BACKUP_CODE = new Name("V1_TWO_FACTOR_BACKUP_CODE", 971, 420);
            PROMPT_MFA_ENROLLMENT_INTRODUCTION = new Name("PROMPT_MFA_ENROLLMENT_INTRODUCTION", 972, 421);
            PROMPT_MFA_ENROLLMENT_CONFIRMATION = new Name("PROMPT_MFA_ENROLLMENT_CONFIRMATION", 973, 422);
            SMS_MFA_ENROLLMENT_INTRODUCTION = new Name("SMS_MFA_ENROLLMENT_INTRODUCTION", 974, 423);
            V1_TWO_FACTOR_CONFIRM_PHONE_NUMBER = new Name("V1_TWO_FACTOR_CONFIRM_PHONE_NUMBER", 975, 424);
            SMS_MFA_ENROLLMENT_CODE = new Name("SMS_MFA_ENROLLMENT_CODE", 976, CompanyFinancialsSection.BAR_ANIMATION_DURATION);
            SMS_MFA_ENROLLMENT_BACKUP_CODE = new Name("SMS_MFA_ENROLLMENT_BACKUP_CODE", 977, 426);
            SMS_MFA_ENROLLMENT_CONFIRMATION = new Name("SMS_MFA_ENROLLMENT_CONFIRMATION", 978, 427);
            V1_TWO_FACTOR_TOTP_BACKUP_CODE = new Name("V1_TWO_FACTOR_TOTP_BACKUP_CODE", 979, 428);
            V1_TWO_FACTOR_SMS_BACKUP_CODE = new Name("V1_TWO_FACTOR_SMS_BACKUP_CODE", 980, 429);
            NCW_HOME = new Name("NCW_HOME", 981, 477);
            NCW_ONBOARDING_PRODUCT_INTRO = new Name("NCW_ONBOARDING_PRODUCT_INTRO", 982, 478);
            NCW_ONBOARDING_CREATE_IMPORT = new Name("NCW_ONBOARDING_CREATE_IMPORT", 983, 479);
            NCW_CREATE_PIN = new Name("NCW_CREATE_PIN", 984, 480);
            NCW_BACKUPS_SECURITY = new Name("NCW_BACKUPS_SECURITY", 985, 481);
            NCW_IMPORTING_WALLET_RECOVERY_PHRASE = new Name("NCW_IMPORTING_WALLET_RECOVERY_PHRASE", 986, 482);
            NCW_CREATING_WALLET_PROGRESS = new Name("NCW_CREATING_WALLET_PROGRESS", 987, 483);
            NCW_CREATING_WALLET_CREATED = new Name("NCW_CREATING_WALLET_CREATED", 988, 484);
            NCW_BACKUP_WALLET = new Name("NCW_BACKUP_WALLET", 989, 485);
            NCW_SEARCH = new Name("NCW_SEARCH", 990, 486);
            NCW_CRYPTO_DETAIL_PAGE = new Name("NCW_CRYPTO_DETAIL_PAGE", 991, 487);
            NCW_OMNISCAN = new Name("NCW_OMNISCAN", 992, 488);
            NCW_WALLET_HUB = new Name("NCW_WALLET_HUB", 993, 489);
            NCW_CRYPTO_TRANSFER_SEND_ADDRESS = new Name("NCW_CRYPTO_TRANSFER_SEND_ADDRESS", 994, 490);
            NCW_CRYPTO_TRANSFER_SEND_CONFIRMATION = new Name("NCW_CRYPTO_TRANSFER_SEND_CONFIRMATION", 995, 491);
            NCW_CRYPTO_TRANSFER_AMOUNT = new Name("NCW_CRYPTO_TRANSFER_AMOUNT", 996, 492);
            NCW_CRYPTO_TRANSFER_SEND_REVIEW = new Name("NCW_CRYPTO_TRANSFER_SEND_REVIEW", 997, 493);
            NCW_CRYPTO_TRANSFER_SELECT_TOKEN = new Name("NCW_CRYPTO_TRANSFER_SELECT_TOKEN", 998, 494);
            NCW_CRYPTO_TRANSFER_RECEIVE = new Name("NCW_CRYPTO_TRANSFER_RECEIVE", 999, 495);
            NCW_FUND_WALLET = new Name("NCW_FUND_WALLET", 1000, 496);
            NCW_TRUSTED_DAPPS = new Name("NCW_TRUSTED_DAPPS", 1001, 497);
            NCW_CRYPTO_SWAP_AMOUNT_ENTRY = new Name("NCW_CRYPTO_SWAP_AMOUNT_ENTRY", 1002, 524);
            NCW_CRYPTO_SWAP_ORDER_REVIEW = new Name("NCW_CRYPTO_SWAP_ORDER_REVIEW", 1003, 525);
            NCW_CRYPTO_SWAP_ORDER_CONFIRMATION = new Name("NCW_CRYPTO_SWAP_ORDER_CONFIRMATION", 1004, 526);
            NCW_CRYPTO_TOKEN_LIST = new Name("NCW_CRYPTO_TOKEN_LIST", ErrorCodes.SOCKET_TIMEOUT_EXCEPTION, 527);
            NCW_ONBOARDING_SECURITY = new Name("NCW_ONBOARDING_SECURITY", ErrorCodes.SSL_HANDSHAKE_EXCEPTION, 528);
            NCW_ONBOARDING_CLAIM_COIN = new Name("NCW_ONBOARDING_CLAIM_COIN", ErrorCodes.IO_EXCEPTION, 529);
            NCW_ONBOARDING_SUCCESS = new Name("NCW_ONBOARDING_SUCCESS", 1008, 530);
            NCW_FUNDING_SELECT_TOKEN = new Name("NCW_FUNDING_SELECT_TOKEN", 1009, 531);
            NCW_LEARN_AND_EARN_LESSON = new Name("NCW_LEARN_AND_EARN_LESSON", 1010, 654);
            NCW_LEARN_AND_EARN_LESSON_COMPLETED = new Name("NCW_LEARN_AND_EARN_LESSON_COMPLETED", 1011, 655);
            NCW_WEB3_MAIN = new Name("NCW_WEB3_MAIN", 1012, 659);
            NCW_WEB3_BROWSER = new Name("NCW_WEB3_BROWSER", 1013, 660);
            NCW_WEB3_INFO = new Name("NCW_WEB3_INFO", 1014, 661);
            NCW_REWARD = new Name("NCW_REWARD", 1015, 703);
            NCW_DISCOVER_CRYPTO_NEWS = new Name("NCW_DISCOVER_CRYPTO_NEWS", 1016, 751);
            NCW_DISCOVER_TOP_LIST = new Name("NCW_DISCOVER_TOP_LIST", 1017, 752);
            NCW_TOKEN_VISIBILITY = new Name("NCW_TOKEN_VISIBILITY", 1018, 771);
            NCW_CLAIM_REWARD = new Name("NCW_CLAIM_REWARD", 1019, 791);
            NCW_CONFIRM_REWARD = new Name("NCW_CONFIRM_REWARD", 1020, 792);
            NCW_APP_REDIRECT = new Name("NCW_APP_REDIRECT", 1021, 793);
            NCW_WALLET_BACKUP_TYPE = new Name("NCW_WALLET_BACKUP_TYPE", 1022, 809);
            NCW_WEB3_LAUNCHPAD = new Name("NCW_WEB3_LAUNCHPAD", 1023, 844);
            NCW_BUY_CHOOSE_PROVIDER = new Name("NCW_BUY_CHOOSE_PROVIDER", 1024, 895);
            NCW_BUY_RH_SPLASH_CONNECT = new Name("NCW_BUY_RH_SPLASH_CONNECT", 1025, 896);
            NCW_BUY_SPLASH_SARDINE = new Name("NCW_BUY_SPLASH_SARDINE", 1026, 897);
            NCW_LAUNCH_SPLASH = new Name("NCW_LAUNCH_SPLASH", 1027, 914);
            NCW_GOLD_PROMO_PRIMER = new Name("NCW_GOLD_PROMO_PRIMER", 1028, 1070);
            NCW_GOLD_PROMO_PRIMER_CONNECTED = new Name("NCW_GOLD_PROMO_PRIMER_CONNECTED", 1029, 1071);
            GOLD_STATUS_NCW_AUTH = new Name("GOLD_STATUS_NCW_AUTH", 1030, 1081);
            NCW_ONBOARDING_STARTER = new Name("NCW_ONBOARDING_STARTER", 1031, 1108);
            NCW_ONBOARDING_BACKUP = new Name("NCW_ONBOARDING_BACKUP", 1032, 1109);
            NCW_ONBOARDING_NOTIFICATION_PROMPT = new Name("NCW_ONBOARDING_NOTIFICATION_PROMPT", 1033, 1110);
            NCW_IMPORTING_WALLET_CLOUD = new Name("NCW_IMPORTING_WALLET_CLOUD", 1034, 1125);
            NCW_IMPORTING_WALLET_REVIEW = new Name("NCW_IMPORTING_WALLET_REVIEW", 1035, 1126);
            NCW_OFFRAMP_SPLASH = new Name("NCW_OFFRAMP_SPLASH", 1036, 1144);
            NCW_OFFRAMP_TOKEN_SELECTION = new Name("NCW_OFFRAMP_TOKEN_SELECTION", 1037, 1145);
            NCW_OFFRAMP_NETWORK_SELECTION = new Name("NCW_OFFRAMP_NETWORK_SELECTION", 1038, 1146);
            NCW_OFFRAMP_AMOUNT_INPUT = new Name("NCW_OFFRAMP_AMOUNT_INPUT", 1039, 1147);
            HOME_QUICK_NAV = new Name("HOME_QUICK_NAV", 1040, 591);
            HOME_PORTFOLIO_TABLE = new Name("HOME_PORTFOLIO_TABLE", 1041, 592);
            RECURRING_DEPOSITS_HUB = new Name("RECURRING_DEPOSITS_HUB", 1042, 593);
            CHOOSE_TRANSFER_FREQUENCY = new Name("CHOOSE_TRANSFER_FREQUENCY", 1043, 594);
            RECURRING_DEPOSIT_DETAIL = new Name("RECURRING_DEPOSIT_DETAIL", 1044, 595);
            GOLD_REFERRAL_PROGRAM = new Name("GOLD_REFERRAL_PROGRAM", 1045, 607);
            GOLD_AGREEMENTS_LIST = new Name("GOLD_AGREEMENTS_LIST", 1046, 656);
            GOLD_ONBOARDING_LANDING = new Name("GOLD_ONBOARDING_LANDING", 1047, 677);
            GOLD_ONBOARDING_SWEEP_AGREEMENTS = new Name("GOLD_ONBOARDING_SWEEP_AGREEMENTS", 1048, 678);
            GOLD_ONBOARDING_AGREEMENTS = new Name("GOLD_ONBOARDING_AGREEMENTS", 1049, 679);
            GOLD_ONBOARDING_MARGIN_AGREEMENTS = new Name("GOLD_ONBOARDING_MARGIN_AGREEMENTS", CylinderBarConstants.TOTAL_ANIMATION_DURATION, 680);
            GOLD_ONBOARDING_MARGIN_AVAILABLE_MARGIN = new Name("GOLD_ONBOARDING_MARGIN_AVAILABLE_MARGIN", 1051, 681);
            GOLD_ONBOARDING_MARGIN_CHECK = new Name("GOLD_ONBOARDING_MARGIN_CHECK", 1052, 682);
            GOLD_ONBOARDING_MARGIN_INFO = new Name("GOLD_ONBOARDING_MARGIN_INFO", 1053, CylinderBarConstants.TOTAL_ANIMATION_DURATION_SINGLE);
            GOLD_ONBOARDING_SUCCESS = new Name("GOLD_ONBOARDING_SUCCESS", 1054, 684);
            GOLD_ONBOARDING_ERROR = new Name("GOLD_ONBOARDING_ERROR", 1055, 686);
            GOLD_ONBOARDING_OLD_LANDING = new Name("GOLD_ONBOARDING_OLD_LANDING", 1056, 697);
            GOLD_ONBOARDING_OLD_SUCCESS = new Name("GOLD_ONBOARDING_OLD_SUCCESS", 1057, 698);
            RETIREMENT_GOLD_MATCH_VALUE_PROPS = new Name("RETIREMENT_GOLD_MATCH_VALUE_PROPS", 1058, 699);
            GOLD_HUB = new Name("GOLD_HUB", 1059, 746);
            GOLD_SUGGESTED_ACTION = new Name("GOLD_SUGGESTED_ACTION", 1060, 747);
            GOLD_CELEBRATION = new Name("GOLD_CELEBRATION", 1061, 748);
            GOLD_PLAN_SELECTION = new Name("GOLD_PLAN_SELECTION", 1062, 796);
            GOLD_DOWNGRADE_CONFIRMATION = new Name("GOLD_DOWNGRADE_CONFIRMATION", 1063, 798);
            APY_BOOST_CELEBRATION = new Name("APY_BOOST_CELEBRATION", 1064, 803);
            GOLD_TAB = new Name("GOLD_TAB", 1065, 805);
            GOLD_DEPOSIT_BONUS_CELEBRATION = new Name("GOLD_DEPOSIT_BONUS_CELEBRATION", 1066, 864);
            FUNCTIONAL_DEPOSIT_UPSELL = new Name("FUNCTIONAL_DEPOSIT_UPSELL", 1067, 865);
            GOLD_DEPOSIT_BONUS_UPCOMING_PAYOUTS = new Name("GOLD_DEPOSIT_BONUS_UPCOMING_PAYOUTS", 1068, 866);
            GOLD_DEPOSIT_BONUS_CELEBRATION_TIMELINE = new Name("GOLD_DEPOSIT_BONUS_CELEBRATION_TIMELINE", 1069, 867);
            GOLD_DEPOSIT_BOOST_HUB = new Name("GOLD_DEPOSIT_BOOST_HUB", 1070, 884);
            GOLD_DEPOSIT_BONUS_PAYOUT_DETAIL = new Name("GOLD_DEPOSIT_BONUS_PAYOUT_DETAIL", 1071, 888);
            GOLD_DEPOSIT_BONUS_ADJUSTMENT_DETAIL = new Name("GOLD_DEPOSIT_BONUS_ADJUSTMENT_DETAIL", 1072, 898);
            GOLD_SWITCH_PLANS_CONFIRMATION = new Name("GOLD_SWITCH_PLANS_CONFIRMATION", 1073, 981);
            GOLD_PRIMARY_PAYMENT_METHOD = new Name("GOLD_PRIMARY_PAYMENT_METHOD", 1074, 1031);
            GOLD_BACKUP_PAYMENT_METHOD = new Name("GOLD_BACKUP_PAYMENT_METHOD", 1075, 1032);
            GOLD_EXTRA_AGREEMENTS = new Name("GOLD_EXTRA_AGREEMENTS", 1076, 1042);
            LIVE_TRIVIA = new Name("LIVE_TRIVIA", 1077, 1057);
            GOLD_EVENT_LIVE_2025 = new Name("GOLD_EVENT_LIVE_2025", 1078, 1072);
            GOLD_SAGE_SPLASH = new Name("GOLD_SAGE_SPLASH", 1079, 1130);
            GOLD_SAGE_TIMELINE = new Name("GOLD_SAGE_TIMELINE", 1080, 1131);
            GOLD_SAGE_RATE = new Name("GOLD_SAGE_RATE", 1081, 1132);
            GOLD_SAGE_START_APPLICATION = new Name("GOLD_SAGE_START_APPLICATION", 1082, 1133);
            GOLD_SAGE_APPLICATION = new Name("GOLD_SAGE_APPLICATION", 1083, 1134);
            GOLD_YG_BACKUP_BILLING_SURFACE = new Name("GOLD_YG_BACKUP_BILLING_SURFACE", 1084, 1260);
            CATPAY_ORDER_AMOUNT_INPUT = new Name("CATPAY_ORDER_AMOUNT_INPUT", 1085, 639);
            CATPAY_ORDER_REVIEW = new Name("CATPAY_ORDER_REVIEW", 1086, OptionsSimulatedReturnUtils.SMALL_DEVICE_HEIGHT_FOR_OPTIONS_SIMULATED_RETURNS);
            CATPAY_LOGIN = new Name("CATPAY_LOGIN", 1087, 1059);
            P2P_CREATE_TRANSACTION = new Name("P2P_CREATE_TRANSACTION", 1088, 647);
            P2P_SEARCH = new Name("P2P_SEARCH", 1089, 648);
            P2P_REVIEW_TRANSACTION = new Name("P2P_REVIEW_TRANSACTION", 1090, 649);
            P2P_CONFIRMATION = new Name("P2P_CONFIRMATION", 1091, SduiMarginBufferBarLarge.MARGIN_BUFFER_BAR_LARGE_ANIMATION_DURATION_MILLIS);
            P2P_PROFILE = new Name("P2P_PROFILE", 1092, 651);
            P2P_VIEW_QR_CODE = new Name("P2P_VIEW_QR_CODE", 1093, 652);
            P2P_SCAN_QR_CODE = new Name("P2P_SCAN_QR_CODE", 1094, 653);
            P2P_INTRO = new Name("P2P_INTRO", 1095, 668);
            PROFILE_VISIBILITY = new Name("PROFILE_VISIBILITY", 1096, 669);
            P2P_PENDING_TRANSACTIONS = new Name("P2P_PENDING_TRANSACTIONS", 1097, 670);
            P2P_CLAIM_TRANSFER = new Name("P2P_CLAIM_TRANSFER", 1098, 671);
            P2P_PAY_REQUEST = new Name("P2P_PAY_REQUEST", 1099, 672);
            P2P_ONBOARDING_ATTRIBUTION = new Name("P2P_ONBOARDING_ATTRIBUTION", ErrorCodes.THROWABLE, 706);
            P2P_REVIEW_MULTIUSER_TRANSACTION = new Name("P2P_REVIEW_MULTIUSER_TRANSACTION", 1101, 725);
            RETURNS_COMPARISON_INTRO = new Name("RETURNS_COMPARISON_INTRO", 1102, 662);
            RETURNS_COMPARISON_SEARCH = new Name("RETURNS_COMPARISON_SEARCH", 1103, 663);
            SHARE_PORTFOLIO_PAGE = new Name("SHARE_PORTFOLIO_PAGE", 1104, 693);
            SHARE_PORTFOLIO_LEARN_MORE_ABOUT_REFERRALS = new Name("SHARE_PORTFOLIO_LEARN_MORE_ABOUT_REFERRALS", 1105, 694);
            RHY_REFERRALS_TRACKING = new Name("RHY_REFERRALS_TRACKING", 1106, 707);
            RHY_REFERRALS_REFERRER_LANDING_PAGE = new Name("RHY_REFERRALS_REFERRER_LANDING_PAGE", 1107, 708);
            RHY_REFERRALS_REFEREE_LANDING_PAGE = new Name("RHY_REFERRALS_REFEREE_LANDING_PAGE", 1108, 709);
            RHY_REFERRALS_CONTACT_LIST = new Name("RHY_REFERRALS_CONTACT_LIST", 1109, 710);
            RHY_REFERALS_STATUS = new Name("RHY_REFERALS_STATUS", 1110, 711);
            RHY_REFERRAL_REWARD_DETAILS = new Name("RHY_REFERRAL_REWARD_DETAILS", 1111, 712);
            RHY_REFERRALS_WELCOME = new Name("RHY_REFERRALS_WELCOME", 1112, 713);
            RHY_REFERRALS_FUND_LANDING = new Name("RHY_REFERRALS_FUND_LANDING", 1113, 714);
            RHY_REFERRALS_FUND_SUCCESS = new Name("RHY_REFERRALS_FUND_SUCCESS", 1114, 719);
            RHY_REFERRALS_FUND_PILL = new Name("RHY_REFERRALS_FUND_PILL", 1115, 720);
            ENABLE_NOTIFICATIONS_PROMPT = new Name("ENABLE_NOTIFICATIONS_PROMPT", 1116, 777);
            START_DEPOSIT = new Name("START_DEPOSIT", 1117, 778);
            DEPOSIT_IN_PROGRESS = new Name("DEPOSIT_IN_PROGRESS", 1118, 779);
            WITHDRAWAL_INPUT = new Name("WITHDRAWAL_INPUT", 1119, 780);
            CHOOSE_WITHDRAWAL_ACCOUNT = new Name("CHOOSE_WITHDRAWAL_ACCOUNT", 1120, 781);
            WITHDRAWAL_REVIEW = new Name("WITHDRAWAL_REVIEW", 1121, 782);
            WITHDRAWAL_CONFIRMATION = new Name("WITHDRAWAL_CONFIRMATION", 1122, 783);
            CRYPTO_ORDER_REVIEW = new Name("CRYPTO_ORDER_REVIEW", 1123, 784);
            SIGNUP_REWARD_GRANTED = new Name("SIGNUP_REWARD_GRANTED", 1124, 785);
            REFERRAL_REWARD_GRANTED = new Name("REFERRAL_REWARD_GRANTED", 1125, 786);
            REFERRAL_REWARD_DETAIL = new Name("REFERRAL_REWARD_DETAIL", 1126, 787);
            RH_SUPPORT = new Name("RH_SUPPORT", 1127, 788);
            CONTACT_SUPPORT = new Name("CONTACT_SUPPORT", 1128, 789);
            TOKENIZED_STOCK_ORDER_ENTRY = new Name("TOKENIZED_STOCK_ORDER_ENTRY", 1129, 1156);
            TOKENIZED_STOCK_ORDER_TYPE = new Name("TOKENIZED_STOCK_ORDER_TYPE", 1130, 1157);
            TOKENIZED_STOCK_ORDER_REVIEW = new Name("TOKENIZED_STOCK_ORDER_REVIEW", 1131, 1158);
            TOKENIZED_STOCK_ORDER_RECEIPT = new Name("TOKENIZED_STOCK_ORDER_RECEIPT", 1132, 1159);
            TOKENIZED_STOCK_ORDER_HISTORY_DETAIL = new Name("TOKENIZED_STOCK_ORDER_HISTORY_DETAIL", 1133, 1160);
            IDENTITY = new Name("IDENTITY", 1134, 1161);
            INVESTOR_PROFILE = new Name("INVESTOR_PROFILE", 1135, 1162);
            STOCK_TOKEN_TAX_INFO = new Name("STOCK_TOKEN_TAX_INFO", 1136, 1163);
            STOCK_TOKEN_ASSESSMENT = new Name("STOCK_TOKEN_ASSESSMENT", 1137, 1164);
            STOCK_TOKEN_KNOWLEDGE_TEST = new Name("STOCK_TOKEN_KNOWLEDGE_TEST", 1138, 1165);
            TOKENIZED_STOCK_PRIMER = new Name("TOKENIZED_STOCK_PRIMER", 1139, 1166);
            TOKENIZED_STOCK_FAQ = new Name("TOKENIZED_STOCK_FAQ", 1140, 1167);
            TOKENIZED_STOCK_DETAIL_PAGE = new Name("TOKENIZED_STOCK_DETAIL_PAGE", 1141, 1168);
            TOKENIZED_STOCK_DETAIL_POSITION_ABOUT = new Name("TOKENIZED_STOCK_DETAIL_POSITION_ABOUT", 1142, 1169);
            TOKENIZED_STOCK_DETAIL_DISCLOSURE = new Name("TOKENIZED_STOCK_DETAIL_DISCLOSURE", 1143, 1170);
            PERPETUALS_PRIMER = new Name("PERPETUALS_PRIMER", 1144, 1171);
            PERPETUALS_ASSESSMENT = new Name("PERPETUALS_ASSESSMENT", 1145, 1172);
            PERPETUALS_KNOWLEDGE_TEST = new Name("PERPETUALS_KNOWLEDGE_TEST", 1146, 1173);
            PERPETUALS_ONBOARDING_STATUS = new Name("PERPETUALS_ONBOARDING_STATUS", 1147, 1174);
            PERPETUALS_AGREEMENT = new Name("PERPETUALS_AGREEMENT", 1148, 1175);
            PERPETUALS_TPSL_ENTRY = new Name("PERPETUALS_TPSL_ENTRY", 1149, 1177);
            PERPETUALS_TPSL_ERROR = new Name("PERPETUALS_TPSL_ERROR", 1150, 1178);
            PERPETUALS_TPSL_HUB = new Name("PERPETUALS_TPSL_HUB", 1151, 1179);
            PERPETUALS_TPSL_CANCELLATIONS = new Name("PERPETUALS_TPSL_CANCELLATIONS", 1152, 1180);
            PERPETUALS_ORDER_ENTRY = new Name(EducationTourScreenNames.PERPETUALS_ORDER_ENTRY, 1153, 1181);
            PERPETUALS_MANUAL_CONTRACT_DETAILS = new Name("PERPETUALS_MANUAL_CONTRACT_DETAILS", 1154, 1182);
            PERPETUALS_ORDER_TYPE = new Name("PERPETUALS_ORDER_TYPE", 1155, 1183);
            PERPETUALS_ORDER_REVIEW = new Name("PERPETUALS_ORDER_REVIEW", 1156, 1184);
            PERPETUALS_ORDER_RECEIPT = new Name("PERPETUALS_ORDER_RECEIPT", 1157, 1185);
            PERPETUALS_ORDER_HISTORY_DETAIL = new Name("PERPETUALS_ORDER_HISTORY_DETAIL", 1158, 1186);
            PERPETUALS_LIMIT_BUY_INTRO = new Name("PERPETUALS_LIMIT_BUY_INTRO", 1159, 1187);
            PERPETUALS_LIMIT_SELL_INTRO = new Name("PERPETUALS_LIMIT_SELL_INTRO", 1160, 1188);
            PERPETUALS_STOP_SELL_INTRO = new Name("PERPETUALS_STOP_SELL_INTRO", 1161, 1189);
            PERPETUALS_STOP_BUY_INTRO = new Name("PERPETUALS_STOP_BUY_INTRO", 1162, 1190);
            PERPETUALS_LIMIT_ORDER_PRICE = new Name("PERPETUALS_LIMIT_ORDER_PRICE", 1163, 1191);
            PERPETUALS_LIMIT_ORDER_TIF = new Name("PERPETUALS_LIMIT_ORDER_TIF", 1164, 1192);
            PERPETUALS_STOP_ORDER_PRICE = new Name("PERPETUALS_STOP_ORDER_PRICE", 1165, 1193);
            PERPETUALS_STOP_ORDER_TIF = new Name("PERPETUALS_STOP_ORDER_TIF", 1166, 1194);
            PERPETUALS_POSITION_HUB = new Name("PERPETUALS_POSITION_HUB", 1167, 1195);
            PERPETUALS_EXPLORE = new Name("PERPETUALS_EXPLORE", 1168, 1196);
            PERPETUALS_PNL_BALANCE_DETAIL = new Name("PERPETUALS_PNL_BALANCE_DETAIL", 1169, 1197);
            PERPETUALS_DETAIL_PAGE = new Name("PERPETUALS_DETAIL_PAGE", 1170, 1198);
            PERPETUALS_LIQUIDATION_DETAILS = new Name("PERPETUALS_LIQUIDATION_DETAILS", 1171, 1199);
            PERPETUALS_MARGIN_EDIT = new Name("PERPETUALS_MARGIN_EDIT", 1172, 1200);
            PERPETUALS_MARGIN_EDIT_REVIEW = new Name("PERPETUALS_MARGIN_EDIT_REVIEW", 1173, 1201);
            PERPETUALS_CLOSE_POSITION = new Name("PERPETUALS_CLOSE_POSITION", 1174, 1202);
            PERPETUALS_ORDER_FLOW_NUX = new Name("PERPETUALS_ORDER_FLOW_NUX", 1175, 1207);
            TOKENIZED_LIMIT_BUY_INTRO = new Name("TOKENIZED_LIMIT_BUY_INTRO", 1176, 1267);
            TOKENIZED_LIMIT_SELL_INTRO = new Name("TOKENIZED_LIMIT_SELL_INTRO", 1177, 1268);
            INTEREST_ENROLLMENT = new Name("INTEREST_ENROLLMENT", 1178, 1370);
            INTEREST_SETTINGS = new Name("INTEREST_SETTINGS", 1179, 1371);
            CC_APPLICATION_LANDING = new Name("CC_APPLICATION_LANDING", 1180, 813);
            CC_APPLICATION_PROFILE_INFO_REVIEW = new Name("CC_APPLICATION_PROFILE_INFO_REVIEW", 1181, 814);
            CC_APPLICATION_PROFILE_INFO_EDIT = new Name("CC_APPLICATION_PROFILE_INFO_EDIT", 1182, 815);
            CC_APPLICATION_SSN = new Name("CC_APPLICATION_SSN", 1183, 816);
            CC_APPLICATION_RESIDENTIAL_ADDRESS = new Name("CC_APPLICATION_RESIDENTIAL_ADDRESS", 1184, 817);
            CC_APPLICATION_ADDRESS_SEARCH = new Name("CC_APPLICATION_ADDRESS_SEARCH", 1185, 818);
            CC_APPLICATION_ADDRESS_MANUAL = new Name("CC_APPLICATION_ADDRESS_MANUAL", 1186, 819);
            CC_APPLICATION_ADDRESS_ERROR = new Name("CC_APPLICATION_ADDRESS_ERROR", 1187, CreateTransferShimActivity.transferRequestCode);
            CC_APPLICATION_ADDRESS_SUGGESTION = new Name("CC_APPLICATION_ADDRESS_SUGGESTION", 1188, 821);
            CC_APPLICATION_INCOME = new Name("CC_APPLICATION_INCOME", 1189, 822);
            CC_APPLICATION_TERMS = new Name("CC_APPLICATION_TERMS", 1190, 823);
            CC_APPLICATION_LOADING = new Name("CC_APPLICATION_LOADING", 1191, 824);
            CC_APPLICATION_FRAUD_ALERT = new Name("CC_APPLICATION_FRAUD_ALERT", 1192, 825);
            CC_APPLICATION_FRAUD_ALERT_VERIFICATION_CODE = new Name("CC_APPLICATION_FRAUD_ALERT_VERIFICATION_CODE", 1193, 826);
            CC_APPLICATION_FRAUD_ALERT_VERIFIED = new Name("CC_APPLICATION_FRAUD_ALERT_VERIFIED", 1194, 827);
            CC_APPLICATION_CREDIT_FROZEN = new Name("CC_APPLICATION_CREDIT_FROZEN", 1195, 828);
            CC_APPLICATION_REVIEW_NEEDED = new Name("CC_APPLICATION_REVIEW_NEEDED", 1196, 829);
            CC_APPLICATION_ADDRESS_CHALLENGE = new Name("CC_APPLICATION_ADDRESS_CHALLENGE", 1197, 830);
            CC_APPLICATION_IDV_FAIL = new Name("CC_APPLICATION_IDV_FAIL", 1198, 831);
            CC_APPLICATION_REJECTED = new Name("CC_APPLICATION_REJECTED", 1199, 832);
            CC_APPLICATION_LIMIT_REVEAL = new Name("CC_APPLICATION_LIMIT_REVEAL", 1200, 833);
            CC_APPLICATION_ACCOUNT_TERMS = new Name("CC_APPLICATION_ACCOUNT_TERMS", 1201, 834);
            CC_APPLICATION_SHIPPING_ADDRESS = new Name("CC_APPLICATION_SHIPPING_ADDRESS", 1202, 835);
            CC_APPLICATION_SHIPPING_ETA = new Name("CC_APPLICATION_SHIPPING_ETA", 1203, 836);
            CC_APPLICATION_DOWNLOAD_APP = new Name("CC_APPLICATION_DOWNLOAD_APP", 1204, 837);
            CC_WAITLIST_INTRO = new Name("CC_WAITLIST_INTRO", 1205, 849);
            CC_WAITLIST_JOINED = new Name("CC_WAITLIST_JOINED", 1206, 851);
            CC_WAITLIST_CONFIRMATION = new Name("CC_WAITLIST_CONFIRMATION", 1207, 853);
            CC_WAITLIST_GOLD_UPSELL = new Name("CC_WAITLIST_GOLD_UPSELL", 1208, 854);
            CC_ONBOARDING_LANDING = new Name("CC_ONBOARDING_LANDING", 1209, 859);
            CC_POST_ONBOARDING = new Name("CC_POST_ONBOARDING", 1210, 860);
            CC_APPLICATION_SOLID_GOLD_DELAY = new Name("CC_APPLICATION_SOLID_GOLD_DELAY", 1211, 915);
            CC_APPLICATION_SSN_VERIFICATION = new Name("CC_APPLICATION_SSN_VERIFICATION", 1212, 967);
            CC_APPLICATION_SSN_VERIFIED = new Name("CC_APPLICATION_SSN_VERIFIED", 1213, 968);
            CC_APPLICATION_PREMIUM_LIMITS = new Name("CC_APPLICATION_PREMIUM_LIMITS", 1214, 1073);
            CC_WAITLIST_POST_SIGNUP_INTRO = new Name("CC_WAITLIST_POST_SIGNUP_INTRO", 1215, 1269);
            CC_WAITLIST_POST_SIGNUP_JOINED = new Name("CC_WAITLIST_POST_SIGNUP_JOINED", 1216, 1270);
            CC_CHOOSE_BANK_ACCOUNT = new Name("CC_CHOOSE_BANK_ACCOUNT", 1217, 1271);
            CC_ADDITIONAL_INFORMATION = new Name("CC_ADDITIONAL_INFORMATION", 1218, 1272);
            JOINT_ACCOUNT_PRIMARY_INTRO = new Name("JOINT_ACCOUNT_PRIMARY_INTRO", 1219, RecsRetirementLoadingConstants.LoopingPhaseMaxFrame);
            JOINT_ACCOUNT_SEND_INVITE = new Name("JOINT_ACCOUNT_SEND_INVITE", 1220, 900);
            JOINT_ACCOUNT_INVITE_SENT_CELEBRATION = new Name("JOINT_ACCOUNT_INVITE_SENT_CELEBRATION", 1221, 901);
            JOINT_ACCOUNT_CONFIRM_SECONDARY = new Name("JOINT_ACCOUNT_CONFIRM_SECONDARY", 1222, 902);
            JOINT_ACCOUNT_PRIMARY_CELEBRATION = new Name("JOINT_ACCOUNT_PRIMARY_CELEBRATION", 1223, 903);
            JOINT_ACCOUNT_SECONDARY_INTRO = new Name("JOINT_ACCOUNT_SECONDARY_INTRO", 1224, 904);
            JOINT_ACCOUNT_SECONDARY_CELEBRATION = new Name("JOINT_ACCOUNT_SECONDARY_CELEBRATION", 1225, 905);
            JOINT_ACCOUNT_HOME = new Name("JOINT_ACCOUNT_HOME", 1226, 906);
            JOINT_ACCOUNT_HELP_CO_OWNER = new Name("JOINT_ACCOUNT_HELP_CO_OWNER", 1227, 907);
            JOINT_POST_CREATION = new Name("JOINT_POST_CREATION", 1228, 908);
            JOINT_ACCOUNT_FUNDING_METHODS = new Name("JOINT_ACCOUNT_FUNDING_METHODS", 1229, 923);
            INTERNAL_ASSET_TRANSFER_INTRO = new Name("INTERNAL_ASSET_TRANSFER_INTRO", 1230, 982);
            INTERNAL_ASSET_TRANSFER_ACCOUNT_SELECTION = new Name("INTERNAL_ASSET_TRANSFER_ACCOUNT_SELECTION", 1231, 983);
            INTERNAL_ASSET_TRANSFER_ACCOUNT_SELECTION_LIST = new Name("INTERNAL_ASSET_TRANSFER_ACCOUNT_SELECTION_LIST", 1232, 984);
            INTERNAL_ASSET_TRANSFER_TAX_IMPLICATIONS = new Name("INTERNAL_ASSET_TRANSFER_TAX_IMPLICATIONS", 1233, 985);
            INTERNAL_ASSET_TRANSFER_AGREEMENT = new Name("INTERNAL_ASSET_TRANSFER_AGREEMENT", 1234, 986);
            INTERNAL_ASSET_TRANSFER_REVIEW = new Name("INTERNAL_ASSET_TRANSFER_REVIEW", 1235, 987);
            INTERNAL_ASSET_TRANSFER_ASSET_LIST = new Name("INTERNAL_ASSET_TRANSFER_ASSET_LIST", 1236, 988);
            INTERNAL_ASSET_TRANSFER_CONFIRMATION = new Name("INTERNAL_ASSET_TRANSFER_CONFIRMATION", 1237, 989);
            INTERNAL_ASSET_TRANSFER_DETAILS = new Name("INTERNAL_ASSET_TRANSFER_DETAILS", 1238, 990);
            FUTURES_DETAIL_SCREEN = new Name("FUTURES_DETAIL_SCREEN", 1239, 924);
            FUTURES_LADDER_SCREEN = new Name("FUTURES_LADDER_SCREEN", 1240, 925);
            FUTURES_ORDER_FORM_SCREEN = new Name("FUTURES_ORDER_FORM_SCREEN", 1241, 926);
            FUTURES_ORDER_FORM_REVIEW_SCREEN = new Name("FUTURES_ORDER_FORM_REVIEW_SCREEN", 1242, 927);
            FUTURES_ORDER_CONFIRMATION_SCREEN = new Name("FUTURES_ORDER_CONFIRMATION_SCREEN", 1243, 928);
            FUTURES_ORDER_PLACEMENT_LOADING_SCREEN = new Name("FUTURES_ORDER_PLACEMENT_LOADING_SCREEN", 1244, 929);
            FUTURES_VALUE_PROPS_SCREEN = new Name("FUTURES_VALUE_PROPS_SCREEN", 1245, 930);
            FUTURES_ONBOARDING_REVIEW_INVESTOR_PROFILE_SCREEN = new Name("FUTURES_ONBOARDING_REVIEW_INVESTOR_PROFILE_SCREEN", 1246, 931);
            FUTURES_ONBOARDING_AGREEMENTS_AND_DISCLOSURES_SCREEN = new Name("FUTURES_ONBOARDING_AGREEMENTS_AND_DISCLOSURES_SCREEN", 1247, 932);
            FUTURES_LADDER_FUTX = new Name("FUTURES_LADDER_FUTX", 1248, 933);
            FUTURES_ORDER_HISTORY_DETAIL_SCREEN = new Name("FUTURES_ORDER_HISTORY_DETAIL_SCREEN", 1249, 936);
            FUTURES_LADDER_FTUX = new Name("FUTURES_LADDER_FTUX", 1250, 937);
            FUTURES_APPLICATION_ACCOUNT_APPROVED = new Name("FUTURES_APPLICATION_ACCOUNT_APPROVED", 1251, 939);
            FUTURES_APPLICATION_ACCOUNT_REVIEW_REQUIRED = new Name("FUTURES_APPLICATION_ACCOUNT_REVIEW_REQUIRED", 1252, 940);
            FUTURES_APPLICATION_ACCOUNT_REJECTED = new Name("FUTURES_APPLICATION_ACCOUNT_REJECTED", 1253, 941);
            FUTURES_ONBOARDING_ARBITRATION_AGREEMENT = new Name("FUTURES_ONBOARDING_ARBITRATION_AGREEMENT", 1254, 942);
            FUTURES_ONBOARDING_ELIGIBILITY_CHECK = new Name("FUTURES_ONBOARDING_ELIGIBILITY_CHECK", 1255, 965);
            ACATS_IN_PLAID_INTRO = new Name("ACATS_IN_PLAID_INTRO", 1256, 966);
            FUTURES_CASH_CORRECTION_HISTORY_DETAIL_SCREEN = new Name("FUTURES_CASH_CORRECTION_HISTORY_DETAIL_SCREEN", 1257, 1028);
            FUTURES_EXECUTION_HISTORY_DETAIL_SCREEN = new Name("FUTURES_EXECUTION_HISTORY_DETAIL_SCREEN", 1258, 1029);
            EVENT_CONTRACT_ORDER_HISTORY_DETAIL_SCREEN = new Name("EVENT_CONTRACT_ORDER_HISTORY_DETAIL_SCREEN", 1259, 1030);
            FUTURES_ASSET_HOME = new Name("FUTURES_ASSET_HOME", 1260, 1040);
            BLACK_WIDOW_SPLASH_UPSELL = new Name("BLACK_WIDOW_SPLASH_UPSELL", 1261, 963);
            WEB_CLIENT_PREFERENCE = new Name("WEB_CLIENT_PREFERENCE", 1262, ErrorCodes.IO_EXCEPTION);
            EOY_GIVEAWAY_2024 = new Name("EOY_GIVEAWAY_2024", 1263, 1027);
            PROMOTION_EDUCATION = new Name("PROMOTION_EDUCATION", 1264, 1239);
            PROMOTION_CONFIRMATION = new Name("PROMOTION_CONFIRMATION", 1265, 1264);
            EOY_GIVEAWAY_2025 = new Name("EOY_GIVEAWAY_2025", 1266, 1297);
            ACCOUNT_TYPE_SELECTION = new Name("ACCOUNT_TYPE_SELECTION", 1267, 1044);
            STRATEGIES_VALUE_PROPS = new Name("STRATEGIES_VALUE_PROPS", 1268, 1045);
            MANAGEMENT_TYPE_SELECTION = new Name("MANAGEMENT_TYPE_SELECTION", 1269, 1046);
            PORTFOLIO_QUESTIONNAIRE_INTRO = new Name("PORTFOLIO_QUESTIONNAIRE_INTRO", 1270, 1047);
            ADVISORY_PORTFOLIO_REVEAL_INFO_PAGE = new Name("ADVISORY_PORTFOLIO_REVEAL_INFO_PAGE", 1271, 1048);
            ADVISORY_PORTFOLIO_REVEAL_REGION_DETAILS = new Name("ADVISORY_PORTFOLIO_REVEAL_REGION_DETAILS", 1272, 1049);
            ADVISORY_ONBOARDING_FUNDING_METHODS = new Name("ADVISORY_ONBOARDING_FUNDING_METHODS", 1273, CylinderBarConstants.TOTAL_ANIMATION_DURATION);
            ADVISORY_ONBOARDING_FEES_PROMO = new Name("ADVISORY_ONBOARDING_FEES_PROMO", 1274, 1051);
            ADVISORY_ONBOARDING_TRANSFER_NEXT_STEPS = new Name("ADVISORY_ONBOARDING_TRANSFER_NEXT_STEPS", 1275, 1052);
            ADVISORY_ONBOARDING_FETCH_ACCOUNT = new Name("ADVISORY_ONBOARDING_FETCH_ACCOUNT", 1276, 1053);
            ADVISORY_ONBOARDING_SUBMIT_DEPOSIT = new Name("ADVISORY_ONBOARDING_SUBMIT_DEPOSIT", 1277, 1054);
            ADVISORY_ONBOARDING_FIRST_DEPOSIT_CELEBRATION = new Name("ADVISORY_ONBOARDING_FIRST_DEPOSIT_CELEBRATION", 1278, 1055);
            PORTFOLIO_DRILLDOWN = new Name("PORTFOLIO_DRILLDOWN", 1279, 1056);
            ADVISORY_FUTURE_RETURNS = new Name("ADVISORY_FUTURE_RETURNS", 1280, 1058);
            ADVISORY_DASHBOARD = new Name("ADVISORY_DASHBOARD", 1281, 1069);
            ADVISORY_INSIGHT = new Name("ADVISORY_INSIGHT", 1282, 1083);
            ADVISORY_INSIGHTS_HUB = new Name("ADVISORY_INSIGHTS_HUB", 1283, 1084);
            ADVISORY_WITHDRAW_AND_CLOSE_ACCOUNT = new Name("ADVISORY_WITHDRAW_AND_CLOSE_ACCOUNT", 1284, 1124);
            ADVISORY_GOLD_PERKS = new Name("ADVISORY_GOLD_PERKS", 1285, 1137);
            ADVISORY_ACATS_PROMO = new Name("ADVISORY_ACATS_PROMO", 1286, 1138);
            RESTRICT_SECURITIES = new Name("RESTRICT_SECURITIES", 1287, 1139);
            UPDATE_MANAGED_INVESTOR_PROFILE = new Name("UPDATE_MANAGED_INVESTOR_PROFILE", 1288, 1140);
            UPDATE_MANAGED_INVESTOR_PROFILE_RESULTS = new Name("UPDATE_MANAGED_INVESTOR_PROFILE_RESULTS", 1289, 1141);
            ADVISORY_PORTFOLIO_COMPUTE = new Name("ADVISORY_PORTFOLIO_COMPUTE", 1290, 1148);
            STRATEGIES_RETURNS_HUB = new Name("STRATEGIES_RETURNS_HUB", 1291, 1240);
            ADVISORY_ONBOARDING_QUESTIONNAIRE_REVIEW = new Name("ADVISORY_ONBOARDING_QUESTIONNAIRE_REVIEW", 1292, 1243);
            ADVISORY_ONBOARDING_QUESTIONNAIRE_INTRO = new Name("ADVISORY_ONBOARDING_QUESTIONNAIRE_INTRO", 1293, 1244);
            ADVISORY_ONBOARDING_AGREEMENTS = new Name("ADVISORY_ONBOARDING_AGREEMENTS", 1294, 1245);
            ADVISORY_RETURNS_HUB = new Name("ADVISORY_RETURNS_HUB", 1295, 1263);
            SETTINGS_INVESTING_INVESTOR_PROFILE_GRAPH_TAKEOVER_REVIEW = new Name("SETTINGS_INVESTING_INVESTOR_PROFILE_GRAPH_TAKEOVER_REVIEW", 1296, 1266);
            TAX_LOSS_HARVEST_DASHBOARD = new Name("TAX_LOSS_HARVEST_DASHBOARD", 1297, 1352);
            TAX_LOSS_HARVEST_NUX = new Name("TAX_LOSS_HARVEST_NUX", 1298, 1353);
            TAX_LOSS_HARVEST_CUSTOMIZE_INTRO = new Name("TAX_LOSS_HARVEST_CUSTOMIZE_INTRO", 1299, 1354);
            TAX_LOSS_HARVEST_CHOOSE_ACCOUNTS = new Name("TAX_LOSS_HARVEST_CHOOSE_ACCOUNTS", 1300, 1355);
            TAX_LOSS_HARVEST_LOADING_OPTIONS = new Name("TAX_LOSS_HARVEST_LOADING_OPTIONS", 1301, 1356);
            TAX_LOSS_HARVEST_OPTIONS_INTRO = new Name("TAX_LOSS_HARVEST_OPTIONS_INTRO", 1302, 1357);
            TAX_LOSS_HARVEST_CHOOSE_OPTION = new Name("TAX_LOSS_HARVEST_CHOOSE_OPTION", 1303, 1358);
            TAX_LOSS_HARVEST_CUSTOMIZE_REVIEW = new Name("TAX_LOSS_HARVEST_CUSTOMIZE_REVIEW", 1304, 1359);
            TAX_LOSS_HARVEST_CUSTOMIZE_CELEBRATION = new Name("TAX_LOSS_HARVEST_CUSTOMIZE_CELEBRATION", 1305, 1360);
            GAINS_AND_LOSSES = new Name("GAINS_AND_LOSSES", 1306, 1361);
            EVENT_CONTRACT_DETAIL_PAGE = new Name("EVENT_CONTRACT_DETAIL_PAGE", 1307, 1060);
            EVENT_CONTRACT_ORDER_FORM = new Name("EVENT_CONTRACT_ORDER_FORM", 1308, 1061);
            EVENT_CONTRACT_HUB = new Name("EVENT_CONTRACT_HUB", 1309, 1062);
            EVENT_CONTRACTS_BRACKET_PAGE = new Name("EVENT_CONTRACTS_BRACKET_PAGE", 1310, 1079);
            EVENT_CONTRACT_ATTESTATION = new Name("EVENT_CONTRACT_ATTESTATION", 1311, 1215);
            EVENT_CONTRACT_HUB_V2 = new Name("EVENT_CONTRACT_HUB_V2", 1312, 1216);
            EVENT_CONTRACT_ORDER_FORM_RECEIPT = new Name("EVENT_CONTRACT_ORDER_FORM_RECEIPT", 1313, 1218);
            EVENT_CONTRACT_ORDER_FORM_REVIEW = new Name("EVENT_CONTRACT_ORDER_FORM_REVIEW", 1314, 1219);
            EVENT_CONTRACT_SELECTOR_SCREEN = new Name("EVENT_CONTRACT_SELECTOR_SCREEN", 1315, 1277);
            GAME_DETAIL_PAGE = new Name("GAME_DETAIL_PAGE", 1316, 1280);
            CASH_BALANCES_DETAILS_PAGE = new Name("CASH_BALANCES_DETAILS_PAGE", 1317, 1113);
            CORTEX_SDP_DIGEST = new Name("CORTEX_SDP_DIGEST", 1318, 1142);
            CORTEX_SDP_DIGEST_FEEDBACK = new Name("CORTEX_SDP_DIGEST_FEEDBACK", 1319, 1143);
            SDP_DIGEST_BREAKING = new Name("SDP_DIGEST_BREAKING", 1320, 1149);
            CORTEX_SDP_DIGEST_SOURCE_OVERFLOW = new Name("CORTEX_SDP_DIGEST_SOURCE_OVERFLOW", 1321, 1176);
            CORTEX_DIGEST_ONBOARDING_SPLASH = new Name("CORTEX_DIGEST_ONBOARDING_SPLASH", 1322, 1203);
            CORTEX_DIGEST_ONBOARDING_AGREEMENT = new Name("CORTEX_DIGEST_ONBOARDING_AGREEMENT", 1323, 1204);
            CORTEX_DIGEST_ONBOARDING_SEARCH = new Name("CORTEX_DIGEST_ONBOARDING_SEARCH", 1324, 1205);
            CORTEX_CDP_DIGEST = new Name("CORTEX_CDP_DIGEST", 1325, 1226);
            CORTEX_CDP_DIGEST_BREAKING = new Name("CORTEX_CDP_DIGEST_BREAKING", 1326, 1227);
            CORTEX_CDP_DIGEST_FEEDBACK = new Name("CORTEX_CDP_DIGEST_FEEDBACK", 1327, 1228);
            CORTEX_CDP_DIGEST_SOURCE_OVERFLOW = new Name("CORTEX_CDP_DIGEST_SOURCE_OVERFLOW", 1328, 1229);
            PORTFOLIO_DIGEST_DETAIL = new Name("PORTFOLIO_DIGEST_DETAIL", 1329, 1278);
            PORTFOLIO_DIGEST_SPLASH = new Name("PORTFOLIO_DIGEST_SPLASH", 1330, 1298);
            PORTFOLIO_DIGEST_AGREEMENT = new Name("PORTFOLIO_DIGEST_AGREEMENT", 1331, 1299);
            CORTEX_DIGEST_SOURCE_LIST = new Name("CORTEX_DIGEST_SOURCE_LIST", 1332, 1300);
            FEE_TIER_PUSH_NOTIF_UPSELL = new Name("FEE_TIER_PUSH_NOTIF_UPSELL", 1333, 1206);
            SELF_DIRECTED_ACCOUNT_CONFIRMATION = new Name("SELF_DIRECTED_ACCOUNT_CONFIRMATION", 1334, 1211);
            EDIT_ACCOUNT_NICKNAME = new Name("EDIT_ACCOUNT_NICKNAME", 1335, 1212);
            ACCOUNT_FUNDING_OPTIONS = new Name("ACCOUNT_FUNDING_OPTIONS", 1336, 1213);
            MCW_CURRENY_CONVERSION_PAGE = new Name("MCW_CURRENY_CONVERSION_PAGE", 1337, 1220);
            MCW_CONVERSION_SUCCESS_PAGE = new Name("MCW_CONVERSION_SUCCESS_PAGE", 1338, 1221);
            NCW_FUNDING_NETWORK_SELECTION = new Name("NCW_FUNDING_NETWORK_SELECTION", 1339, 1230);
            EDIT_ACCOUNT_NICKNAME_LIST = new Name("EDIT_ACCOUNT_NICKNAME_LIST", 1340, 1241);
            CRYPTO_TRANSFER_MANAGE_SAVED_ADDRESSES = new Name("CRYPTO_TRANSFER_MANAGE_SAVED_ADDRESSES", 1341, 1246);
            CRYPTO_EXPLORE_LEAF = new Name("CRYPTO_EXPLORE_LEAF", 1342, 1265);
            CRYPTO_TRANSFER_SEND_ADDRESS_ALLOWLIST = new Name("CRYPTO_TRANSFER_SEND_ADDRESS_ALLOWLIST", 1343, 1273);
            CRYPTO_TRANSFER_ALLOWLIST_ENABLED_PRIMER = new Name("CRYPTO_TRANSFER_ALLOWLIST_ENABLED_PRIMER", 1344, 1274);
            CRYPTO_TRANSFER_ADD_SAVED_ADDRESS = new Name("CRYPTO_TRANSFER_ADD_SAVED_ADDRESS", 1345, 1275);
            CRYPTO_TRANSFER_ADD_SAVED_ADDRESS_QR_SCANNER = new Name("CRYPTO_TRANSFER_ADD_SAVED_ADDRESS_QR_SCANNER", 1346, 1276);
            CRYPTO_TRANSFER_COST_BASIS_HUB = new Name("CRYPTO_TRANSFER_COST_BASIS_HUB", 1347, 1306);
            CRYPTO_TRANSFER_COST_BASIS_DETAIL = new Name("CRYPTO_TRANSFER_COST_BASIS_DETAIL", 1348, 1307);
            CRYPTO_TRANSFER_COST_BASIS_INPUT = new Name("CRYPTO_TRANSFER_COST_BASIS_INPUT", 1349, 1308);
            SOCIAL_HOME = new Name("SOCIAL_HOME", 1350, 1328);
            POST_DETAIL = new Name("POST_DETAIL", 1351, 1329);
            TRADE_HISTORY = new Name("TRADE_HISTORY", 1352, 1330);
            USER_PROFILE = new Name("USER_PROFILE", 1353, 1331);
            QUICK_TRADE_ACTION_SHEET = new Name("QUICK_TRADE_ACTION_SHEET", 1354, 1332);
            ACTIVITY_FEED = new Name("ACTIVITY_FEED", 1355, 1333);
            SOCIAL_SEARCH_SCREEN = new Name("SOCIAL_SEARCH_SCREEN", 1356, 1334);
            SOCIAL_POST_COMPOSER = new Name("SOCIAL_POST_COMPOSER", 1357, 1335);
            SOCIAL_ONBOARDING_PAGE = new Name("SOCIAL_ONBOARDING_PAGE", 1358, 1336);
            SOCIAL_PROFILE_SETTINGS = new Name("SOCIAL_PROFILE_SETTINGS", 1359, 1337);
            PERPETUALS_ORDER_EDIT_LEVERAGE = new Name("PERPETUALS_ORDER_EDIT_LEVERAGE", 1360, 1349);
            PERPETUALS_POSITION_EDIT_LEVERAGE = new Name("PERPETUALS_POSITION_EDIT_LEVERAGE", 1361, 1350);
            ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TRANSFER_INTRO = new Name("ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TRANSFER_INTRO", 1362, 1362);
            ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TRANSFER_DETAIL = new Name("ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TRANSFER_DETAIL", 1363, 1363);
            ACATS_CRYPTO_MIGRATION_FLOW_ASSET_REVIEW = new Name("ACATS_CRYPTO_MIGRATION_FLOW_ASSET_REVIEW", 1364, 1364);
            ACATS_CRYPTO_MIGRATION_FLOW_ASSET_SUBMIT = new Name("ACATS_CRYPTO_MIGRATION_FLOW_ASSET_SUBMIT", 1365, 1365);
            ACATS_CRYPTO_MIGRATION_FLOW_ASSET_CONFIRMATION = new Name("ACATS_CRYPTO_MIGRATION_FLOW_ASSET_CONFIRMATION", 1366, 1366);
            ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TXN_DETAIL = new Name("ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TXN_DETAIL", 1367, 1367);
            ACATS_CRYPTO_MIGRATION_FLOW_ERROR_WITH_CX = new Name("ACATS_CRYPTO_MIGRATION_FLOW_ERROR_WITH_CX", 1368, 1368);
            ACATS_CRYPTO_MIGRATION_FLOW_ERROR = new Name("ACATS_CRYPTO_MIGRATION_FLOW_ERROR", 1369, 1369);
            Name[] nameArr$values = $values();
            $VALUES = nameArr$values;
            $ENTRIES = EnumEntries2.enumEntries(nameArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Name.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Name>(orCreateKotlinClass, syntax, name) { // from class: com.robinhood.rosetta.eventlogging.Screen$Name$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public Screen.Name fromValue(int value) {
                    return Screen.Name.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: Screen.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/Screen$Name$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/Screen$Name;", "fromValue", "value", "", "data_platform.event_logging.screen_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Name fromValue(int value) {
                switch (value) {
                    case 0:
                        return Name.NAME_UNSPECIFIED;
                    case 1:
                        return Name.HOME;
                    case 2:
                        return Name.LIST_DETAIL_PAGE;
                    case 3:
                        return Name.STOCK_DETAIL_PAGE;
                    case 4:
                        return Name.BROWSE_NEWSFEED;
                    case 5:
                        return Name.BROWSE_SEARCH;
                    case 6:
                        return Name.ROBINHOOD_LIST_DETAIL_PAGE;
                    case 7:
                        return Name.LIST_DISCOVERY_HUB;
                    case 8:
                        return Name.USER_LIST_DETAIL_PAGE;
                    case 9:
                        return Name.EXPANDED_LIST_CAROUSEL;
                    case 10:
                        return Name.CX_REVIEW_CALL_DETAILS;
                    case 11:
                        return Name.CX_CALL_STATUS;
                    case 12:
                        return Name.CX_CHANNEL_SELECTION;
                    case 13:
                        return Name.CX_WEB_BACK_ERROR;
                    case 14:
                        return Name.CRYPTO_DETAIL_PAGE;
                    case 15:
                        return Name.TRANSFERS;
                    case 16:
                        return Name.DD_INTRO;
                    case 17:
                        return Name.DD_SETUP_CHOICE;
                    case 18:
                        return Name.DD_ACCOUNT_INFO;
                    case 19:
                        return Name.DD_PREFILLED_INTRO;
                    case 20:
                        return Name.DD_CONFIRM_EMPLOYER;
                    case 21:
                        return Name.DD_UPDATE_EMPLOYER;
                    case 22:
                        return Name.DD_UNSIGNED_FORM;
                    case 23:
                        return Name.DD_SIGNATURE;
                    case 24:
                        return Name.DD_SIGNED_FORM;
                    case 25:
                        return Name.DD_CONGRATULATIONS;
                    case 26:
                        return Name.SIGNUP_FUND_ACCOUNT_INTRO;
                    case 27:
                        return Name.GROWTH_DEPOSIT_MATCH_OFFER;
                    case 28:
                        return Name.BROWSE_NEWSFEED_THEATRE;
                    case 29:
                        return Name.STOCK_NEWSFEED;
                    case 30:
                        return Name.CRYTPO_NEWSFEED;
                    case 31:
                        return Name.CRYPTO_NEWSFEED;
                    case 32:
                        return Name.EMBEDDED_ARTICLE_PAGE;
                    case 33:
                        return Name.CASH;
                    case 34:
                        return Name.DD_SWITCHER_SEARCH_COMPANY;
                    case 35:
                        return Name.DD_SWITCHER_SEARCH_PAYROLL;
                    case 36:
                        return Name.DD_SWITCHER_AUTHENTICATION;
                    case 37:
                        return Name.DD_SWITCHER_CONFIRMATION;
                    case 38:
                        return Name.DD_SWITCHER_AUTHENTICATION_HELP;
                    case 39:
                        return Name.RECURRING_RECEIPT_UPSELL;
                    case 40:
                        return Name.ORDER_RECEIPT;
                    case 41:
                        return Name.SELECT_ORDER_KIND_PAGE;
                    case 42:
                        return Name.RECURRING_FREQUENCY;
                    case 43:
                        return Name.RECURRING_PAYMENT_METHOD;
                    case 44:
                        return Name.RECURRING_BACKUP_PAYMENT_METHOD;
                    case 45:
                        return Name.RECURRING_AMOUNT;
                    case 46:
                        return Name.RECURRING_ORDER_REVIEW;
                    case 47:
                        return Name.ACCOUNT_DETAIL;
                    case 48:
                        return Name.RECURRING_HUB;
                    case 49:
                        return Name.RECURRING_FIND_INVESTMENT_PAGE;
                    case 50:
                        return Name.DD_SWITCHER_OPTIONS;
                    case 51:
                        return Name.DD_SWITCHER_OPTION_PERCENT;
                    case 52:
                        return Name.DD_SWITCHER_OPTION_FIXED;
                    case 53:
                        return Name.ROBINHOOD_LIST_PICKER;
                    case 54:
                        return Name.EQUITY_SELECT_ORDER_KIND_PAGE;
                    case 55:
                        return Name.EQUITY_ORDER_ENTRY;
                    case 56:
                        return Name.EQUITY_ORDER_REVIEW;
                    case 57:
                        return Name.EQUITY_ORDER_RECEIPT;
                    case 58:
                        return Name.LEARNING_LESSON_SELECTOR;
                    case 59:
                        return Name.LEARNING_LESSON;
                    case 60:
                        return Name.TRANSFER_DETAILS;
                    case 61:
                        return Name.BANKING;
                    case 62:
                    case 498:
                    case 704:
                    case 705:
                    case 799:
                    case 800:
                    default:
                        return null;
                    case 63:
                        return Name.ACCOUNT_OVERVIEW;
                    case 64:
                        return Name.MESSAGES;
                    case 65:
                        return Name.TRANSACTION_DETAIL_PAGE;
                    case 66:
                        return Name.TRANSACTION_RECATEGORIZATION_PAGE;
                    case 67:
                        return Name.EARLY_PAY_LEARN_MORE;
                    case SDK_ASSET_ICON_HOME_VALUE:
                        return Name.EARLY_PAY_ENROLLMENT_SUCCESS;
                    case 69:
                        return Name.EARLY_PAY_TRANSFER_DETAILS;
                    case 70:
                        return Name.TRADE_CELEBRATION;
                    case SDK_ASSET_ICON_GUIDE_VALUE:
                        return Name.DISPUTES_SPLASH_PAGE;
                    case SDK_ASSET_ICON_GLOBE_VALUE:
                        return Name.DISPUTES_REASON_SELECTION;
                    case 73:
                        return Name.DISPUTES_TRANSACTION_SELECTION;
                    case 74:
                        return Name.DISPUTES_TRANSACTION_REVIEW;
                    case 75:
                        return Name.CALENDAR_DATE_PICKER;
                    case 76:
                        return Name.DISPUTES_MULTIPLE_CHOICE_QUESTION;
                    case 77:
                        return Name.DISPUTES_AMOUNT_ENTRY_QUESTION;
                    case 78:
                        return Name.DISPUTES_DATE_ENTRY_QUESTION;
                    case 79:
                        return Name.DISPUTES_FREE_RESPONSE_QUESTION;
                    case 80:
                        return Name.DISPUTES_MEDIA_UPLOAD_QUESTION;
                    case 81:
                        return Name.DISPUTES_FREE_RESPONSE_WITH_MEDIA_UPLOAD;
                    case 82:
                        return Name.PHOTO_LIBRARY;
                    case 83:
                        return Name.FILE_BROWSER;
                    case 84:
                        return Name.MEDIA_UPLOAD_SELECTOR;
                    case 85:
                        return Name.MEDIA_VIEWER;
                    case 86:
                        return Name.DISPUTES_REVIEW;
                    case 87:
                        return Name.DISPUTES_CONFIRMATION;
                    case 88:
                        return Name.RECURRING_DETAIL;
                    case 89:
                        return Name.DOLLAR_BASED_ORDER_ENTRY;
                    case 90:
                        return Name.OPTION_CHAIN_EXPIRATION_PAGE;
                    case 91:
                        return Name.OPTION_STATISTICS_BOTTOM_SHEET;
                    case 92:
                        return Name.OPTION_SHOPPING_CART;
                    case 93:
                        return Name.IAV_SELECT_BANK_ACCOUNT;
                    case 94:
                        return Name.CREATE_QUEUED_DEPOSIT;
                    case 95:
                        return Name.REVIEW_QUEUED_DEPOSIT;
                    case 96:
                        return Name.CREATE_TRANSFER;
                    case 97:
                        return Name.REVIEW_TRANSFER;
                    case 98:
                        return Name.LEARNING_LESSON_V2;
                    case 99:
                        return Name.OPTION_CHAIN;
                    case 100:
                        return Name.EDUCATIONAL_PROPS_EXPLAIN;
                    case 101:
                        return Name.PICK_STOCK_SCREEN;
                    case 102:
                        return Name.SWIPE_TO_CLAIM_SCREEN;
                    case 103:
                        return Name.CLAIMED_SCREEN;
                    case 104:
                        return Name.CX_CALL_SCHEDULE;
                    case 105:
                        return Name.CX_EDIT_CALL_SCHEDULE;
                    case 106:
                        return Name.USER_LIST_DETAIL_SEARCH;
                    case 107:
                        return Name.FELIX_INTRODUCTION;
                    case 108:
                        return Name.FELIX_USER_ARCHETYPE;
                    case 109:
                        return Name.FELIX_TIMELINE;
                    case 110:
                        return Name.FELIX_ASSET_BREAKDOWN;
                    case 111:
                        return Name.FELIX_USERBASE_SIZE;
                    case 112:
                        return Name.FELIX_INVESTING_CULTURE;
                    case 113:
                        return Name.FELIX_OUTRO;
                    case 114:
                        return Name.FELIX_OUTRO_ANIMATION;
                    case 115:
                        return Name.FELIX_MANIFESTO;
                    case 116:
                        return Name.DD_PARTIAL_PAYCHECK;
                    case 117:
                        return Name.DD_EDIT_DOLLAR_AMOUNT;
                    case 118:
                        return Name.DD_EDIT_PERCENTAGE_AMOUNT;
                    case 119:
                        return Name.MESSAGES_THREAD;
                    case 120:
                        return Name.BONFIRE_SETTINGS_PAGE;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                        return Name.CLAIM_REWARD;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                        return Name.SAFETY_LABEL_LESSON;
                    case 123:
                        return Name.IRR_REQUEST;
                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                        return Name.IRR_DELETE;
                    case 125:
                        return Name.IRR_REQUEST_CONFIRMATION;
                    case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                        return Name.IRR_DELETE_CONFIRMATION;
                    case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                        return Name.IRR_REQUEST_IN_PROGRESS;
                    case 128:
                        return Name.IRR_DELETE_IN_PROGRESS;
                    case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                        return Name.IRR_DOWNLOAD;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                        return Name.OPTION_STRATEGY_DETAIL;
                    case 131:
                        return Name.OPTION_AGGREGATE_DETAIL;
                    case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                        return Name.OPTION_INSTRUMENT_DETAIL;
                    case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                        return Name.NEWSFEED_DISCLOSURE;
                    case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                        return Name.IPOA_ALLOCATED_RESULT;
                    case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                        return Name.IPOA_SUMMARY;
                    case 136:
                        return Name.LOGIN;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                        return Name.IPOA_ENROLLMENT;
                    case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                        return Name.CX_SURVEY_YES_NO_QUESTION;
                    case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                        return Name.CX_SURVEY_FREE_FORM_QUESTION;
                    case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                        return Name.CX_SURVEY_MULTIPLE_CHOICE_QUESTION;
                    case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                        return Name.CX_SURVEY_RATING_QUESTION;
                    case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                        return Name.CX_SURVEY_ERROR_TOAST;
                    case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                        return Name.CX_SURVEY_COMPLETE_PAGE;
                    case 144:
                        return Name.CX_SURVEY_COMPLETE_TOAST;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                        return Name.CRYPTO_ORDER_RECEIPT;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                        return Name.CRYPTO_SELECT_ORDER_KIND_PAGE;
                    case 147:
                        return Name.IPOA_LIST;
                    case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                        return Name.IPOA_NOT_ALLOCATED_RESULT;
                    case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                        return Name.PROFILE;
                    case 150:
                        return Name.RHY_MIGRATION_FEATURE_REWARDS;
                    case 151:
                        return Name.RHY_MIGRATION_FEATURE_DIRECT_DEPOSIT;
                    case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                        return Name.RHY_MIGRATION_CONTRAST_MULTIPLE_ACCOUNTS;
                    case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
                        return Name.RHY_MIGRATION_AGREEMENT;
                    case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                        return Name.RHY_MIGRATION_CONFIRM_ADDRESS;
                    case 155:
                        return Name.RHY_MIGRATION_OPEN_SPENDING_ACCOUNT;
                    case 156:
                        return Name.RHY_MIGRATION_TIME_OUT_BOTTOM_SHEET;
                    case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                        return Name.SECURITY_PRIVACY_CENTER;
                    case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                        return Name.IN_APP_VERIFICATION;
                    case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                        return Name.PASSWORD_UPDATE;
                    case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                        return Name.PASSWORD_UPDATE_SUCCESS;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                        return Name.EMAIL_UPDATE;
                    case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                        return Name.EMAIL_UPDATE_VERIFICATION;
                    case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                        return Name.EMAIL_UPDATE_SUCCESS;
                    case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                        return Name.PHONE_UPDATE;
                    case 165:
                        return Name.PHONE_UPDATE_CONFIRMATION;
                    case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                        return Name.PHONE_UPDATE_VERIFICATION;
                    case 167:
                        return Name.PHONE_UPDATE_SUCCESS;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                        return Name.TWO_FACTOR_AUTHENTICATION;
                    case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                        return Name.MFA_AUTH_APP_SELECTION;
                    case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                        return Name.MFA_BACKUP_CODE;
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                        return Name.MFA_SMS_VERIFICATION;
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                        return Name.REFERRAL_REWARD_OFFER_DETAIL;
                    case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                        return Name.CONTACTS_LIST;
                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                        return Name.PAST_REWARDS;
                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                        return Name.CREATE_MAX_TRANSFER;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                        return Name.REWARD_OFFER_DETAIL;
                    case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                        return Name.RECS_FIRST_TRADE_INTRO;
                    case f2773x8d9721ad:
                        return Name.RECS_INVESTOR_PROFILE_INTRO;
                    case f2780x600b66fe:
                        return Name.RECS_INVESTOR_PROFILE_QUESTION;
                    case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                        return Name.RECS_INVESTOR_PROFILE_SECTION_COVER;
                    case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                        return Name.RECS_RISK_LOADER;
                    case 182:
                        return Name.RECS_RISK_PROFILE;
                    case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                        return Name.RECS_CONFIRM_QUESTIONNAIRE;
                    case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                        return Name.RECS_PORTFOLIO_INTRO;
                    case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE:
                        return Name.RECS_PORTFOLIO_DIVERSIFICATION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                        return Name.RECS_PORTFOLIO_WALKTHROUGH;
                    case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                        return Name.RECS_LEARN_MORE;
                    case 188:
                        return Name.RECS_PORTFOLIO_ALLOCATION;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                        return Name.RECS_PORTFOLIO_SUMMARY;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                        return Name.RECS_ORDER_ENTRY;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                        return Name.RECS_ORDER_PREVIEW;
                    case 192:
                        return Name.RECS_ORDER_REVIEW;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                        return Name.RECS_DISCLOSURE;
                    case SDK_ASSET_ICON_EXTERNAL_VALUE:
                        return Name.RECS_ORDER_SUMMARY;
                    case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                        return Name.RECS_ORDER_RECEIPT;
                    case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                        return Name.RECS_TRADE_CELEBRATION;
                    case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                        return Name.RECS_UNAVAILABLE;
                    case SDK_ASSET_ICON_ARROW_UP_VALUE:
                        return Name.WAITLIST;
                    case SDK_ASSET_ICON_CANCEL_VALUE:
                        return Name.CX_CALL_DESCRIPTION;
                    case 200:
                        return Name.IPOA_ANNOUNCEMENT;
                    case 201:
                        return Name.IPOA_LEARNING_HUB;
                    case 202:
                        return Name.IPOA_COB_FOLLOW_UP;
                    case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                        return Name.EDUCATION_TOUR;
                    case 204:
                        return Name.STATEMENTS_AND_HISTORY;
                    case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                        return Name.IPOA_NOT_ALLOCATED;
                    case SDK_ASSET_ICON_CLOCK_VALUE:
                        return Name.OPTION_WATCHLIST_HUB;
                    case SDK_ASSET_ICON_COMMENT_VALUE:
                        return Name.OPTION_ORDER_FORM;
                    case SDK_ASSET_ICON_INCOME_VALUE:
                        return Name.OPTION_ORDER_CONFIGURATION_SELECTION;
                    case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                        return Name.OPTION_ORDER_CONFIGURATION_BOTTOM_SHEET;
                    case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                        return Name.CRYPTO_ORDER_ENTRY;
                    case 211:
                        return Name.RECS_PORTFOLIO_INCLUDES;
                    case SDK_ASSET_ICON_OVERRIDE_VALUE:
                        return Name.OPTION_WATCHLIST_ABOUT;
                    case SDK_ASSET_ICON_PAUSE_VALUE:
                        return Name.ACCOUNT_HISTORY;
                    case SDK_ASSET_ICON_PIN_VALUE:
                        return Name.ACCOUNT_CENTER;
                    case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                        return Name.RECURRING_INSIGHTS;
                    case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                        return Name.CX_ACCOUNT_DETAIL_PAGE;
                    case SDK_ASSET_ICON_PROGRESS_VALUE:
                        return Name.CX_CONTACT_SECRET_CODE_PAGE;
                    case SDK_ASSET_ICON_QUESTION_VALUE:
                        return Name.CX_CONTACT_VOICE_VERIFICATION_CONSENT_PAGE;
                    case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                        return Name.CX_CONTACT_VOICE_VERIFICATION_PAGE;
                    case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                        return Name.CX_CONTACT_SELFIE_VERIFICATION_INITIATE_PAGE;
                    case SDK_ASSET_ICON_SUBMIT_VALUE:
                        return Name.CX_CONTACT_SELFIE_VERIFICATION_WAIT_PAGE;
                    case SDK_ASSET_ICON_SUBTRACT_VALUE:
                        return Name.CX_CONTACT_VOICE_ENROLLMENT_CONSENT_PAGE;
                    case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                        return Name.CX_CONTACT_VOICE_ENROLLMENT_PAGE;
                    case 224:
                        return Name.CX_CONTACT_EMAIL_PAGE;
                    case 225:
                        return Name.CX_CONTACT_SELFIE_VERIFICATION_FAILURE_PAGE;
                    case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                        return Name.OPTION_ROLLING_CONTRACT_SELECTOR;
                    case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                        return Name.VOICE_ENROLLMENT_INTRO;
                    case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                        return Name.VOICE_ENROLLMENT_CONSENT;
                    case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                        return Name.VOICE_RECORD;
                    case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                        return Name.VOICE_ENROLLMENT_COMPLETE;
                    case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                        return Name.VOICE_VERIFICATION_SETTINGS;
                    case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                        return Name.ACATS_IN_ACCOUNT_ELIGIBLE;
                    case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                        return Name.ACATS_IN_ACCOUNT_MAY_BE_ELIGIBLE;
                    case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                        return Name.ACATS_IN_ACCOUNT_NOT_ELIGIBLE;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                        return Name.ACATS_IN_ACCOUNT_NUMBER_ENTRY;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                        return Name.ACATS_IN_CELEBRATION;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                        return Name.ACATS_IN_CONFIRMATION;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                        return Name.ACATS_IN_CONFIRM_NAME;
                    case 239:
                        return Name.ACATS_IN_DTC_ENTRY;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                        return Name.ACATS_IN_ELIGIBILITY_QUESTION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                        return Name.ACATS_IN_INTRO;
                    case f2778x3356acf6:
                        return Name.ACATS_IN_NAME_CHANGE;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                        return Name.ACATS_IN_SELECT_BROKERAGE;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                        return Name.ACATS_IN_SUBMIT;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE:
                        return Name.ACATS_IN_TERMS_AND_CONDITIONS;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE:
                        return Name.OPTIONS_STRATEGY_ROLL_NO_AVAILABLE_POSITIONS;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE:
                        return Name.OPTIONS_STRATEGY_ROLL;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                        return Name.OPTIONS_STRATEGY_ROLL_STRATEGY_SUMMARY;
                    case f2779x59907a3d:
                        return Name.RECS_REENTRY_INTRO;
                    case 250:
                        return Name.RECS_REENTRY_CONFIRMATION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
                        return Name.RECS_REENTRY_EDIT;
                    case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE:
                        return Name.CRYPTO_TRANSFER_RECEIVE;
                    case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE:
                        return Name.CRYPTO_TRANSFER_SEND_AMOUNT;
                    case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                        return Name.CRYPTO_TRANSFER_SEND_ADDRESS;
                    case 255:
                        return Name.CRYPTO_TRANSFER_SEND_REVIEW;
                    case 256:
                        return Name.CRYPTO_TRANSFER_SEND_CONFIRMATION;
                    case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                        return Name.BROKERAGE_STATEMENTS_LIST;
                    case SDK_ASSET_HEADER_BOLT_VALUE:
                        return Name.TAX_DOCUMENTS_LIST;
                    case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                        return Name.SPENDING_STATEMENTS_LIST;
                    case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                        return Name.BROKERAGE_STATEMENT_VIEWER;
                    case SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE:
                        return Name.TAX_DOCUMENT_VIEWER;
                    case SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE:
                        return Name.SPENDING_STATEMENT_VIEWER;
                    case SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE:
                        return Name.RHY_MIGRATION_REVIEW_CHANGES;
                    case SDK_ASSET_ICON_PLAID_LOGO_VALUE:
                        return Name.RHY_MIGRATION_SELECT_CARD;
                    case SDK_ASSET_HEADER_SHIELD_VALUE:
                        return Name.INSTANT_DEPOSIT_OUTCOME;
                    case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                        return Name.INSTANT_DEPOSIT_EDUCATION;
                    case SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE:
                        return Name.OPTIONS_ROLLING_NUX;
                    case SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE:
                        return Name.CRYPTO_GIFT_EDIT;
                    case SDK_ASSET_HEADER_REPORT_SHARED_VALUE:
                        return Name.CRYPTO_GIFT_ONBOARDING;
                    case SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE:
                        return Name.CRYPTO_GIFT_PURCHASE_CONFIRMATION;
                    case 271:
                        return Name.CRYPTO_GIFT_RECEIVE_DETAILS;
                    case SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE:
                        return Name.CRYPTO_GIFT_RECEIVE_CONFIRMATION;
                    case SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE:
                        return Name.CREATE_GRYPTO_GIFT_ERROR_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE:
                        return Name.RECEIVE_GRYPTO_GIFT_ERROR_DIALOG;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE:
                        return Name.CRYPTO_GIFT_PURCHASE_DETAILS;
                    case SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE:
                        return Name.CREATE_CRYPTO_GIFT_LOADING;
                    case SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE:
                        return Name.RECEIVE_CRYPTO_GIFT_LOADING;
                    case SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE:
                        return Name.CRYPTO_GIFT_DASHBOARD;
                    case SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE:
                        return Name.CANCEL_CRYPTO_GIFT;
                    case 280:
                        return Name.SHAREHOLDER_QA_INTRO;
                    case SDK_ASSET_ILLUSTRATION_BANK_VALUE:
                        return Name.SHAREHOLDER_QA_INTRO_DISCLOSURE;
                    case SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE:
                        return Name.SHAREHOLDER_ASK_A_QUESTION;
                    case 283:
                        return Name.SHAREHOLDER_QUESTIONS_LIST;
                    case SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE:
                        return Name.RHY_SPENDING_HOME;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE:
                        return Name.TRUSTED_DEVICES;
                    case f2777x89a9e432:
                        return Name.DEVICE_APPROVAL;
                    case SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE:
                        return Name.DEVICE_APPROVAL_BLOCKED;
                    case 288:
                        return Name.DEVICE_APPROVAL_LOGIN_APPROVED;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE:
                        return Name.DEVICE_APPROVAL_LOGIN;
                    case SDK_ASSET_ILLUSTRATION_NOTE_VALUE:
                        return Name.DEVICE_APPROVAL_LOGIN_BLOCKED;
                    case f2776x87e624cb:
                        return Name.DOWNLOAD_APPS;
                    case SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE:
                        return Name.LEARNING_LESSON_V3;
                    case SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE:
                        return Name.EQUITY_ORDER_CHECK_ALERT;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE:
                        return Name.DEVICE_APPROVAL_ENROLL;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE:
                        return Name.ERROR_SCREEN;
                    case SDK_ASSET_LOADING_INDICATOR_VALUE:
                        return Name.DISCLOSURE;
                    case SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE:
                        return Name.RECURRING_DIRECT_DEPOSIT_SOURCE;
                    case SDK_ASSET_BANK_ICON_CIRCLE_VALUE:
                        return Name.SYP_LEARN_MORE;
                    case SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE:
                        return Name.RECURRING_AMOUNT_TYPE;
                    case 300:
                        return Name.BENEFICIARY_LIST;
                    case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                        return Name.BENEFICIARY_VALUE_PROP;
                    case 302:
                        return Name.BENEFICIARY_DISCLOSURE;
                    case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                        return Name.BENEFICIARY_NAME_INPUT;
                    case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                        return Name.BENEFICIARY_RELATIONSHIP_INPUT;
                    case SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE:
                        return Name.BENEFICIARY_SPOUSAL_AGREEMENT;
                    case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE:
                        return Name.BENEFICIARY_DOB_INPUT;
                    case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE:
                        return Name.BENEFICIARY_EMAIL_INPUT;
                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE:
                        return Name.BENEFICIARY_DETAIL;
                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE:
                        return Name.RECURRING_UNIFIED_CREATION;
                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE:
                        return Name.OPTION_UPGRADE_L0_WHAT_ARE_OPTIONS;
                    case SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE:
                        return Name.OPTION_UPGRADE_L0_STRATEGIES_PRICE_MOVEMENT;
                    case f2774x74902ae0:
                        return Name.OPTION_UPGRADE_L0_UNDERSTAND_OPTIONS;
                    case SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE:
                        return Name.ROUNDUP_ENROLL_INTRO;
                    case SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE:
                        return Name.ROUNDUP_ASSET_SELECTION;
                    case SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE:
                        return Name.ROUNDUP_ENROLL_REVIEW;
                    case 316:
                        return Name.ROUNDUP_ENROLL_COMPLETE;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE:
                        return Name.ROUNDUP_HUB;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE:
                        return Name.ROUNDUP_SETTINGS;
                    case f2781x2ba65ba3:
                        return Name.ROUNDUP_FIRST_SETTLEMENT;
                    case SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE:
                        return Name.ROUNDUP_END_OF_WEEK;
                    case SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE:
                        return Name.ROUNDUP_HISTORY_DETAIL;
                    case SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE:
                        return Name.RHY_WAITLIST_SIGN_UP;
                    case f2775xbcb7e6f3:
                        return Name.RHY_WAITLIST_MARKETING_SPLASH;
                    case SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE:
                        return Name.EDUCATION_HOME;
                    case SDK_ASSET_ICON_REPORT_VALUE:
                        return Name.RHY_MIGRATION_CONFIRMATION;
                    case SDK_ASSET_ICON_STEP_COMPLETE_VALUE:
                        return Name.CRYPTO_TRANSFER_SEND_QR_SCANNER;
                    case SDK_ASSET_ICON_UPLOAD_VALUE:
                        return Name.RESET_PASSWORD;
                    case SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE:
                        return Name.EARLY_PAY_ONBOARDING_CONFIRMATION;
                    case SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE:
                        return Name.SYP_ONBOARDING_DD_CONFIRMATION;
                    case 330:
                        return Name.SYP_AGREEMENT;
                    case 331:
                        return Name.SYP_DISCLOSURE_ALERT;
                    case 332:
                        return Name.PAYCHECK_HUB;
                    case 333:
                        return Name.PAYCHECK_INVESTMENT_HUB;
                    case 334:
                        return Name.IAV_DEVICE_APPROVAL_SILENT_RESULT;
                    case 335:
                        return Name.IAV_DEVICE_APPROVAL_SILENT_WAITING;
                    case WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END /* 336 */:
                        return Name.RECURRING_ORDER_RECEIPT;
                    case 337:
                        return Name.SLIP_ONBOARDING_INTRO;
                    case 338:
                        return Name.SLIP_ONBOARDING_EDUCATION;
                    case 339:
                        return Name.SLIP_ONBOARDING_CALCULATOR;
                    case 340:
                        return Name.SLIP_ONBOARDING_RISKS;
                    case 341:
                        return Name.SLIP_ONBOARDING_FAQS;
                    case 342:
                        return Name.SLIP_ONBOARDING_AGREEMENTS;
                    case 343:
                        return Name.SLIP_ONBOARDING_CONFIRMATION;
                    case 344:
                        return Name.SLIP_HUB;
                    case 345:
                        return Name.OPTION_LEGO_CHAIN_PREMIUM;
                    case 346:
                        return Name.OPTION_LEGO_CHAIN_TRADE_OPTION;
                    case 347:
                        return Name.SDP_REFERRAL;
                    case 348:
                        return Name.CREATE_ACCOUNT_CONGRATULATIONS;
                    case 349:
                        return Name.CLAIM_FRACTIONAL_REWARD_GENERIC_INFO;
                    case 350:
                        return Name.PROGRESSIVE_ONBOARDING_EXPECTATION;
                    case 351:
                        return Name.PROGRESSIVE_ONBOARDING_RESUME_TRADE_SPLASH;
                    case 352:
                        return Name.SELECT_RETIREMENT_CONTRIBUTION_TYPE;
                    case 353:
                        return Name.SELECT_RETIREMENT_TAX_YEAR;
                    case 354:
                        return Name.BANK_TRANSFER;
                    case 355:
                        return Name.PSP_DETAIL;
                    case 356:
                        return Name.PSP_CELEBRATION;
                    case 357:
                        return Name.SWEEP_ONBOARDING;
                    case 358:
                        return Name.SWEEP_ONBOARDING_VALUE_PROPS;
                    case 359:
                        return Name.SWEEP_ONBOARDING_CONFIRMATION;
                    case 360:
                        return Name.SWEEP_ONBOARDING_AGREEMENT;
                    case 361:
                        return Name.OPTION_CHAIN_SETTINGS;
                    case 362:
                        return Name.PSP_HISTORY_DETAIL;
                    case 363:
                        return Name.CHOOSE_LINKING_PAYMENT_METHOD;
                    case 364:
                        return Name.DEBIT_CARD_NUMBERS_INPUT;
                    case 365:
                        return Name.DEBIT_CARD_NAME_INPUT;
                    case 366:
                        return Name.DEBIT_CARD_LINKING_LOADING;
                    case 367:
                        return Name.DEBIT_CARD_LINKING_CONFIRMATION;
                    case 368:
                        return Name.POST_TRANSFER_CONFIRMATION;
                    case 369:
                        return Name.TRANSFER_ACCOUNT_SELECTION;
                    case 370:
                        return Name.DEBIT_CARD_LINKING_SPLASH_SCREEN;
                    case 371:
                        return Name.INVEST_FLOW_MOO;
                    case 372:
                        return Name.CRYPTO_TRANSFER_ENROLLMENT_PRODUCT_INTRO;
                    case 373:
                        return Name.CX_CHAT_THREAD;
                    case 374:
                        return Name.CX_SUPPORT_CASES;
                    case 375:
                        return Name.SLIP_HUB_SETTING;
                    case 376:
                        return Name.SHAREHOLDER_EVENTS_LIST;
                    case 377:
                        return Name.EQUITY_ADVANCED_CHARTS;
                    case 378:
                        return Name.RECOMMENDATIONS_ONBOARDING_INTRO;
                    case 379:
                        return Name.SNACKS_ARTICLE_PAGE;
                    case 380:
                        return Name.STOCK_DETAIL_PAGE_MINI;
                    case 381:
                        return Name.CRYPTO_DETAIL_PAGE_MINI;
                    case 382:
                        return Name.INVEST_FLOW_SEARCH;
                    case 383:
                        return Name.INVEST_FLOW_ORDER_ENTRY;
                    case 384:
                        return Name.INVEST_FLOW_BUDGET_ALLOCATION;
                    case 385:
                        return Name.INVEST_FLOW_ORDER_PREVIEW;
                    case 386:
                        return Name.INVEST_FLOW_ORDER_REVIEW;
                    case 387:
                        return Name.INVEST_FLOW_ORDER_RECEIPT;
                    case 388:
                        return Name.INVEST_FLOW_DISCOVER;
                    case 389:
                        return Name.INVEST_FLOW_FREQUENCY;
                    case 390:
                        return Name.ACATS_IN_ACCOUNT_SELECTION;
                    case 391:
                        return Name.ACATS_IN_TRANSFER_CONTENTS;
                    case 392:
                        return Name.ACATS_IN_NON_GOLD_UPGRADE;
                    case 393:
                        return Name.ACATS_IN_GOLD_USER_MARGIN_UPGRADE;
                    case 394:
                        return Name.ACATS_IN_PARTIAL_TRANSFER;
                    case 395:
                        return Name.MARGIN_UPGRADE_SPLASH;
                    case WaitlistAnimationConstants.LEFT_YAW_START /* 396 */:
                        return Name.MARGIN_UPGRADE_EDUCATION;
                    case 397:
                        return Name.MARGIN_UPGRADE_VALUE_PROPS;
                    case 398:
                        return Name.MARGIN_UPGRADE_ELIGIBILITY;
                    case 399:
                        return Name.MARGIN_UPGRADE_MARGIN_LIMIT_SET;
                    case 400:
                        return Name.MARGIN_UPGRADE_MARGIN_WITHDRAWAL_SET;
                    case 401:
                        return Name.MARGIN_UPGRADE_INTEREST_RATE_SELECTION;
                    case 402:
                        return Name.GOLD_AND_MARGIN_VALUE_PROPS;
                    case com.robinhood.utils.http.HttpStatusCode.FORBIDDEN /* 403 */:
                        return Name.MARGIN_UPGRADE_AGREEMENT;
                    case 404:
                        return Name.MARGIN_UPGRADE_REVIEW;
                    case 405:
                        return Name.MARGIN_UPGRADE_ERROR;
                    case 406:
                        return Name.MARGIN_UPGRADE_GOLD_AGREEMENT;
                    case 407:
                        return Name.MARGIN_UPGRADE_CONFIRMATION;
                    case 408:
                        return Name.MARGIN_UPGRADE_GOLD_ONLY_CONFIRMATION;
                    case 409:
                        return Name.MARGIN_UPGRADE_NOT_ELIGIBLE;
                    case com.robinhood.utils.http.HttpStatusCode.GONE /* 410 */:
                        return Name.MARGIN_UPGRADE_GOLD_CONFIRMATION;
                    case 411:
                        return Name.APP_MFA_ENROLLMENT_INTRODUCTION;
                    case 412:
                        return Name.APP_MFA_ENROLLMENT_DOWNLOAD;
                    case 413:
                        return Name.V1_TWO_FACTOR_TOTP_TOKEN;
                    case 414:
                        return Name.MANUAL_APP_MFA_ENROLLMENT_KEY;
                    case 415:
                        return Name.MANUAL_APP_MFA_ENROLLMENT_INTRODUCTION;
                    case 416:
                        return Name.V1_TWO_FACTOR_CONFIRM_TOTP_TOKEN;
                    case 417:
                        return Name.APP_MFA_ENROLLMENT_CODE;
                    case 418:
                        return Name.APP_MFA_ENROLLMENT_CONFIRMATION;
                    case 419:
                        return Name.APP_MFA_ENROLLMENT_BACKUP_CODE;
                    case 420:
                        return Name.V1_TWO_FACTOR_BACKUP_CODE;
                    case 421:
                        return Name.PROMPT_MFA_ENROLLMENT_INTRODUCTION;
                    case 422:
                        return Name.PROMPT_MFA_ENROLLMENT_CONFIRMATION;
                    case 423:
                        return Name.SMS_MFA_ENROLLMENT_INTRODUCTION;
                    case 424:
                        return Name.V1_TWO_FACTOR_CONFIRM_PHONE_NUMBER;
                    case CompanyFinancialsSection.BAR_ANIMATION_DURATION /* 425 */:
                        return Name.SMS_MFA_ENROLLMENT_CODE;
                    case 426:
                        return Name.SMS_MFA_ENROLLMENT_BACKUP_CODE;
                    case 427:
                        return Name.SMS_MFA_ENROLLMENT_CONFIRMATION;
                    case 428:
                        return Name.V1_TWO_FACTOR_TOTP_BACKUP_CODE;
                    case 429:
                        return Name.V1_TWO_FACTOR_SMS_BACKUP_CODE;
                    case 430:
                        return Name.SLIP_ONBOARDING_INTRO_ABBREVIATED;
                    case 431:
                        return Name.SLIP_ONBOARDING_AGREEMENTS_ABBREVIATED;
                    case 432:
                        return Name.MARGIN_LIMIT_EDIT;
                    case 433:
                        return Name.ADVANCED_CHARTS_ONBOARDING;
                    case 434:
                        return Name.ADVANCED_CHARTS_EQUITY_SEARCH;
                    case 435:
                        return Name.RETIREMENT_STATEMENTS_LIST;
                    case 436:
                        return Name.RETIREMENT_STATEMENT_VIEWER;
                    case 437:
                        return Name.MERCHANT_REWARDS_INTRO;
                    case 438:
                        return Name.MERCHANT_REWARD_OFFER_PAGE;
                    case 439:
                        return Name.MERCHANT_REWARD_REWARD_HISTORY;
                    case 440:
                        return Name.MERCHANT_REWARD_REWARD_HISTORY_DETAILS;
                    case 441:
                        return Name.REFERRAL_REWARD_OFFER_DETAIL_INFO;
                    case 442:
                        return Name.MARGIN_UPGRADE_REVIEW_INVESTMENT_PROFILE;
                    case 443:
                        return Name.PLUTO_ACTIVITY_UNSPECIFIED;
                    case 444:
                        return Name.REFERRAL_INVITE_SENT_CONFIRMATION_DIALOG;
                    case 445:
                        return Name.PSP_INTRO;
                    case 446:
                        return Name.IRA_DISTRIBUTION_FAQ;
                    case 447:
                        return Name.SELECT_IRA_DISTRIBUTION_TYPE;
                    case 448:
                        return Name.EDIT_IRA_TAX_WITHHOLDINGS;
                    case 449:
                        return Name.WELCOME_SAFETY_FIRST;
                    case 450:
                        return Name.WELCOME_START_WITH_DOLLAR;
                    case 451:
                        return Name.WELCOME_INVESTING;
                    case 452:
                        return Name.WELCOME_MAIN;
                    case 453:
                        return Name.USER_CREATION_SPLASH;
                    case 454:
                        return Name.USER_CREATION_EMAIL;
                    case 455:
                        return Name.USER_CREATION_PASSWORD;
                    case WaitlistAnimationConstants.MIDDLE_YAW_FRAME /* 456 */:
                        return Name.USER_CREATION_LEGAL_NAME;
                    case 457:
                        return Name.EMBEDDED_WEBVIEW;
                    case 458:
                        return Name.OPTION_STRATEGY_BUILDER;
                    case 459:
                        return Name.OPTION_STRATEGY_BUILDER_NUX;
                    case 460:
                        return Name.OPTION_STRATEGY_CHAIN;
                    case 461:
                        return Name.OPTION_STRATEGY_BUILDER_DEEP_LINK_INTRO;
                    case 462:
                        return Name.OPTION_STRATEGY_BUILDER_DEEP_LINK_SEARCH;
                    case 463:
                        return Name.OPTION_STRATEGY_BUILDER_AVAILABLE_NUX;
                    case 464:
                        return Name.OPTION_STRATEGY_BUILDER_NOT_AVAILABLE_NUX;
                    case 465:
                        return Name.OPTION_STRATEGY_BUILDER_NOT_ELIGIBLE_NUX;
                    case 466:
                        return Name.RECS_RET_INTRO;
                    case 467:
                        return Name.INVESTOR_PROFILE_COMPLETE;
                    case 468:
                        return Name.INVESTOR_PROFILE_INTRO;
                    case 469:
                        return Name.INVESTOR_PROFILE_QUESTION;
                    case 470:
                        return Name.INVESTOR_PROFILE_REVIEW;
                    case 471:
                        return Name.RECS_RET_QUESTIONNAIRE_RESULTS;
                    case 472:
                        return Name.RECS_RET_PORTFOLIO;
                    case 473:
                        return Name.RECS_RET_TRADE_CELEBRATION;
                    case 474:
                        return Name.RECS_RET_RECURRING_HOOK;
                    case 475:
                        return Name.RECS_RET_RECURRING_DECISION;
                    case 476:
                        return Name.BENEFICIARY_ACCOUNT_SELECTION;
                    case 477:
                        return Name.NCW_HOME;
                    case 478:
                        return Name.NCW_ONBOARDING_PRODUCT_INTRO;
                    case 479:
                        return Name.NCW_ONBOARDING_CREATE_IMPORT;
                    case 480:
                        return Name.NCW_CREATE_PIN;
                    case 481:
                        return Name.NCW_BACKUPS_SECURITY;
                    case 482:
                        return Name.NCW_IMPORTING_WALLET_RECOVERY_PHRASE;
                    case 483:
                        return Name.NCW_CREATING_WALLET_PROGRESS;
                    case 484:
                        return Name.NCW_CREATING_WALLET_CREATED;
                    case 485:
                        return Name.NCW_BACKUP_WALLET;
                    case 486:
                        return Name.NCW_SEARCH;
                    case 487:
                        return Name.NCW_CRYPTO_DETAIL_PAGE;
                    case 488:
                        return Name.NCW_OMNISCAN;
                    case 489:
                        return Name.NCW_WALLET_HUB;
                    case 490:
                        return Name.NCW_CRYPTO_TRANSFER_SEND_ADDRESS;
                    case 491:
                        return Name.NCW_CRYPTO_TRANSFER_SEND_CONFIRMATION;
                    case 492:
                        return Name.NCW_CRYPTO_TRANSFER_AMOUNT;
                    case 493:
                        return Name.NCW_CRYPTO_TRANSFER_SEND_REVIEW;
                    case 494:
                        return Name.NCW_CRYPTO_TRANSFER_SELECT_TOKEN;
                    case 495:
                        return Name.NCW_CRYPTO_TRANSFER_RECEIVE;
                    case 496:
                        return Name.NCW_FUND_WALLET;
                    case 497:
                        return Name.NCW_TRUSTED_DAPPS;
                    case 499:
                        return Name.CRYPTO_STATEMENTS_LIST;
                    case 500:
                        return Name.CRYPTO_STATEMENT_VIEWER;
                    case 501:
                        return Name.RECURRING_ASSET_TYPE_SELECTION;
                    case HttpStatusCode.BAD_GATEWAY_502 /* 502 */:
                        return Name.BROKERAGE_CASH_ORDER_ENTRY;
                    case 503:
                        return Name.GOLD_VALUE_PROPS;
                    case 504:
                        return Name.GOLD_AGREEMENT;
                    case 505:
                        return Name.SWEEP_ONBOARDING_CONFIRMATION_WITH_GOLD;
                    case 506:
                        return Name.SWEEP_ONBOARDING_AGREEMENTS_LIST;
                    case 507:
                        return Name.SWEEP_ONBOARDING_SELECT_RATE;
                    case 508:
                        return Name.SWEEP_ONBOARDING_ERROR;
                    case 509:
                        return Name.RHY_MIGRATION_FEATURE_MERCHANT_REWARDS;
                    case 510:
                        return Name.RECS_RET_CONGRATS;
                    case 511:
                        return Name.RECS_RET_QUESTIONNAIRE_RESULTS_INTRO;
                    case 512:
                        return Name.RECS_RET_PROSPECTUS;
                    case 513:
                        return Name.NEW_PRODUCTS_LANDING;
                    case 514:
                        return Name.GOLD_UPGRADE_SUCCESS;
                    case 515:
                        return Name.DEVICE_SECURITY_SETTINGS;
                    case WaitlistAnimationConstants.RIGHT_YAW_END /* 516 */:
                        return Name.PASSKEY_LOGIN;
                    case 517:
                        return Name.WEBAUTHN_ENROLLMENT_SUCCESS;
                    case 518:
                        return Name.WEBAUTHN_ENROLLMENT_EDUCATION;
                    case 519:
                        return Name.SLIP_UPDATED_AGREEMENT;
                    case 520:
                        return Name.RETIREMENT_DASHBOARD;
                    case com.robinhood.utils.http.HttpStatusCode.DOWNTIME_ERROR /* 521 */:
                        return Name.CRYPTO_TRANSFER_ENROLLMENT_AGREEMENT;
                    case 522:
                        return Name.CRYPTO_TRANSFER_ENROLLMENT_STEPS;
                    case 523:
                        return Name.CRYPTO_TRANSFER_SEND_NETWORK;
                    case 524:
                        return Name.NCW_CRYPTO_SWAP_AMOUNT_ENTRY;
                    case 525:
                        return Name.NCW_CRYPTO_SWAP_ORDER_REVIEW;
                    case 526:
                        return Name.NCW_CRYPTO_SWAP_ORDER_CONFIRMATION;
                    case 527:
                        return Name.NCW_CRYPTO_TOKEN_LIST;
                    case 528:
                        return Name.NCW_ONBOARDING_SECURITY;
                    case 529:
                        return Name.NCW_ONBOARDING_CLAIM_COIN;
                    case 530:
                        return Name.NCW_ONBOARDING_SUCCESS;
                    case 531:
                        return Name.NCW_FUNDING_SELECT_TOKEN;
                    case 532:
                        return Name.ACATS_IN_MARGIN_ENABLEMENT;
                    case 533:
                        return Name.RETIREMENT_CONTRIBUTION_HUB;
                    case 534:
                        return Name.MARGIN_CALL_MAINTENANCE;
                    case 535:
                        return Name.MARGIN_CALL_MAINTENANCE_RESOLVED;
                    case 536:
                        return Name.RETIREMENT_ACCOUNT_SELECTION;
                    case 537:
                        return Name.RETIREMENT_ACCOUNT_COMPARISON;
                    case 538:
                        return Name.RETIREMENT_ACCOUNT_DESCRIPTION;
                    case 539:
                        return Name.RETIREMENT_INSTANT;
                    case 540:
                        return Name.RETIREMENT_REVIEW_AGREEMENTS;
                    case 541:
                        return Name.RETIREMENT_SIGNUP_SUCCESS;
                    case 542:
                        return Name.RETIREMENT_SIGNUP_ERROR;
                    case 543:
                        return Name.ENOKI_CONTRIBUTION_CELEBRATION;
                    case 544:
                        return Name.RETIREMENT_ONBOARDING_SWIPEY;
                    case 545:
                        return Name.CRYPTO_LEARN_AND_EARN;
                    case 546:
                        return Name.VERIFY_DEBIT_CARD_SPLASH;
                    case 547:
                        return Name.VERIFY_DEBIT_CARD_STEPS;
                    case 548:
                        return Name.VERIFY_DEBIT_CARD_CODE_ENTRY;
                    case 549:
                        return Name.RETIREMENT_WAITLIST;
                    case 550:
                        return Name.RHY_BACKUP_COVERAGE_BOTTOM_SHEET;
                    case 551:
                        return Name.RHY_BACKUP_COVERAGE_DETAILS;
                    case RhRoomDatabase.MIGRATION_START_VER /* 552 */:
                        return Name.RHY_SPENDING_SETTINGS;
                    case 553:
                        return Name.RHY_SPENDING_CARD_CONTROLS;
                    case 554:
                        return Name.RETIREMENT_OPTIONS_OPT_IN;
                    case 555:
                        return Name.C2C_REFERRAL_OFFER_SENDER_DETAILS_PAGE;
                    case 556:
                        return Name.C2C_REFERRAL_OFFER_RECEIVER_DETAILS_PAGE;
                    case 557:
                        return Name.C2C_REFERRAL_OFFER_SENDER_FRIENDS_LIST;
                    case 558:
                        return Name.CRYPTO_ORDER_SET_LIMIT_PRICE;
                    case 559:
                        return Name.CRYPTO_ORDER_INFORMATION;
                    case 560:
                        return Name.CRYPTO_ORDER_SET_TIME_IN_FORCE;
                    case 561:
                        return Name.CRYPTO_ORDER_SET_STOP_PRICE;
                    case 562:
                        return Name.CRYPTO_ORDER_HISTORY_DETAIL;
                    case 563:
                        return Name.CREATE_RETIREMENT_CONTRIBUTION;
                    case 564:
                        return Name.SWEEP_ONBOARDING_HOW_IT_WORKS;
                    case 565:
                        return Name.RETIREMENT_OPTIONS_CONFIRM_ELIGIBILITY;
                    case 566:
                        return Name.RETIREMENT_OPTIONS_CHECK_ELIGIBILITY;
                    case 567:
                        return Name.ACATS_IN_IDENTIFY_PARTIAL_ASSETS;
                    case 568:
                        return Name.ACATS_IN_PARTIAL_SEARCH_INSTRUMENT;
                    case 569:
                        return Name.ACATS_IN_PARTIAL_ADD_INSTRUMENT;
                    case 570:
                        return Name.CRYPTO_HOME_TAB;
                    case 571:
                        return Name.CRYPTO_VALUE_PAGE;
                    case 572:
                        return Name.RHY_MIGRATION_INTRO_LONG;
                    case 573:
                        return Name.RHY_MIGRATION_FUNDING;
                    case 574:
                        return Name.RHY_MIGRATION_SETUP_CHECKLIST;
                    case CompanyFinancialsSection.LINE_REVEAL_ANIMATION_DURATION /* 575 */:
                        return Name.RHY_MIGRATION_OPT_OUT;
                    case 576:
                        return Name.RHY_MIGRATION_SETUP_COMPLETE;
                    case 577:
                        return Name.RHY_MIGRATION_DD_SETUP;
                    case 578:
                        return Name.RETIREMENT_401K_ROLLOVER_EDUCATION;
                    case 579:
                        return Name.RETIREMENT_401K_ROLLOVER_OPTIONS;
                    case 580:
                        return Name.RETIREMENT_401K_ROLLOVER_TERMS;
                    case 581:
                        return Name.RETIREMENT_401K_ROLLOVER_CAPITALIZE;
                    case 582:
                        return Name.RETIREMENT_401K_ROLLOVER_DIY;
                    case 583:
                        return Name.RETIREMENT_401K_ROLLOVER_QUESTIONS;
                    case 584:
                        return Name.RETIREMENT_SIGNUP_LOADING;
                    case 585:
                        return Name.RECS_RET_BUY_AGAIN;
                    case 586:
                        return Name.ADVANCED_ALERT_HUB;
                    case 587:
                        return Name.INDICATOR_ALERT_EDITOR;
                    case 588:
                        return Name.INDICATOR_SELECTOR;
                    case 589:
                        return Name.L2E_ONBOARDING;
                    case 590:
                        return Name.L2E_TRY_AGAIN;
                    case 591:
                        return Name.HOME_QUICK_NAV;
                    case 592:
                        return Name.HOME_PORTFOLIO_TABLE;
                    case 593:
                        return Name.RECURRING_DEPOSITS_HUB;
                    case 594:
                        return Name.CHOOSE_TRANSFER_FREQUENCY;
                    case 595:
                        return Name.RECURRING_DEPOSIT_DETAIL;
                    case 596:
                        return Name.RHY_TURBOTAX_INTRO;
                    case 597:
                        return Name.RHY_TURBOTAX_OFFER_SELECTION;
                    case 598:
                        return Name.RHY_TURBOTAX_OPEN_ACCOUNT;
                    case 599:
                        return Name.RHY_TURBOTAX_ACCOUNT_INFO;
                    case 600:
                        return Name.RHY_TURBOTAX_ENABLE_EARLY_PAY;
                    case 601:
                        return Name.EQUITY_TRADING_SESSION_CHANGED_PAGE;
                    case 602:
                        return Name.NEAR_MARGIN_CALL;
                    case 603:
                        return Name.TAX_CENTER;
                    case 604:
                        return Name.CRYPTO_ADVANCED_CHARTS;
                    case 605:
                        return Name.ADVANCED_CHARTS_CRYPTO_SEARCH;
                    case 606:
                        return Name.ADVANCED_CHARTS_CRYPTO_ONBOARDING;
                    case 607:
                        return Name.GOLD_REFERRAL_PROGRAM;
                    case 608:
                        return Name.CRYPTO_ADVANCED_CHART_TECHNICAL_INDICATOR_MANAGER;
                    case 609:
                        return Name.EQUITY_ADVANCED_CHART_TECHNICAL_INDICATOR_MANAGER;
                    case 610:
                        return Name.OPTION_ORDER_DETAIL;
                    case 611:
                        return Name.BUYING_POWER;
                    case 612:
                        return Name.MARGIN_CALL_WARN;
                    case 613:
                        return Name.DAY_TRADE_CALL_RESOLVED;
                    case 614:
                        return Name.CRYPTO_TRANSFER_ENROLLMENT_FRAUD_INFO;
                    case 615:
                        return Name.RETIREMENT_SIGNUP_WHICH_IRA;
                    case 616:
                        return Name.RETIREMENT_INVEST;
                    case 617:
                        return Name.RETIREMENT_TAX_BENEFITS;
                    case 618:
                        return Name.MARGIN_BATCH_SELL_STOCK;
                    case 619:
                        return Name.IRA_SYP_INTRO;
                    case 620:
                        return Name.EQUITY_SET_TRADING_HOURS_PAGE;
                    case 621:
                        return Name.CX_CHATBOT_PAGE;
                    case 622:
                        return Name.CUSTOM_ACCOUNT_ACTIVITY_EXPORTER_LIST;
                    case 623:
                        return Name.GENERATE_CUSTOM_ACCOUNT_ACTIVITY_REPORT;
                    case 624:
                        return Name.SPENDING_ACCOUNT_CREATED;
                    case 625:
                        return Name.SCREENER_DETAIL;
                    case 626:
                        return Name.SCREENER_INDICATORS_LIST;
                    case 627:
                        return Name.SCREENER_INDICATOR_DETAIL;
                    case 628:
                        return Name.SCREENER_DATA_DISPLAY;
                    case 629:
                        return Name.SCREENER_PRESET_LIST;
                    case 630:
                        return Name.ADD_INDICATOR;
                    case 631:
                        return Name.ADD_INDICATOR_FORM;
                    case 632:
                        return Name.PRICE_ALERT_EDITOR;
                    case 633:
                        return Name.ROTH_CONVERSION_INFO;
                    case 634:
                        return Name.EQUITY_ADVANCED_ALERTS_DISCLOSURE;
                    case 635:
                        return Name.EQUITY_24H_MARKET_REMINDER;
                    case 636:
                        return Name.NCDI_DEPOSIT_PERIOD_PAGE;
                    case 637:
                        return Name.NCDI_HOLD_PERIOD_PAGE;
                    case 638:
                        return Name.NCDI_HOLD_PERIOD_WITHDREW_PAGE;
                    case 639:
                        return Name.CATPAY_ORDER_AMOUNT_INPUT;
                    case OptionsSimulatedReturnUtils.SMALL_DEVICE_HEIGHT_FOR_OPTIONS_SIMULATED_RETURNS /* 640 */:
                        return Name.CATPAY_ORDER_REVIEW;
                    case 641:
                        return Name.SCREENER_LIST;
                    case 642:
                        return Name.CRYPTO_TRANSFER_ENROLLMENT_PENDING;
                    case 643:
                        return Name.CRYPTO_TRANSFER_ENROLLMENT_FAILED;
                    case 644:
                        return Name.CRYPTO_TRANSFER_ENROLLMENT_ADDITIONAL_STEPS_REQUIRED;
                    case 645:
                        return Name.CRYPTO_TRANSFER_ENROLLMENT_SECURITY_CHECK;
                    case 646:
                        return Name.CRYPTO_TRANSFER_ENROLLMENT_COMPLETED;
                    case 647:
                        return Name.P2P_CREATE_TRANSACTION;
                    case 648:
                        return Name.P2P_SEARCH;
                    case 649:
                        return Name.P2P_REVIEW_TRANSACTION;
                    case SduiMarginBufferBarLarge.MARGIN_BUFFER_BAR_LARGE_ANIMATION_DURATION_MILLIS /* 650 */:
                        return Name.P2P_CONFIRMATION;
                    case 651:
                        return Name.P2P_PROFILE;
                    case 652:
                        return Name.P2P_VIEW_QR_CODE;
                    case 653:
                        return Name.P2P_SCAN_QR_CODE;
                    case 654:
                        return Name.NCW_LEARN_AND_EARN_LESSON;
                    case 655:
                        return Name.NCW_LEARN_AND_EARN_LESSON_COMPLETED;
                    case 656:
                        return Name.GOLD_AGREEMENTS_LIST;
                    case 657:
                        return Name.RETIREMENT_MULTIPLE_FUNDING_METHODS;
                    case 658:
                        return Name.ORDER_CONFIRMATION_FUNDING_UPSELL;
                    case 659:
                        return Name.NCW_WEB3_MAIN;
                    case 660:
                        return Name.NCW_WEB3_BROWSER;
                    case 661:
                        return Name.NCW_WEB3_INFO;
                    case 662:
                        return Name.RETURNS_COMPARISON_INTRO;
                    case 663:
                        return Name.RETURNS_COMPARISON_SEARCH;
                    case 664:
                        return Name.BUYING_POWER_HUB;
                    case 665:
                        return Name.MARGIN_STATUS_DETAIL;
                    case 666:
                        return Name.MARGIN_REQUIREMENT_TABLE;
                    case 667:
                        return Name.RHY_POST_SIGNUP;
                    case 668:
                        return Name.P2P_INTRO;
                    case 669:
                        return Name.PROFILE_VISIBILITY;
                    case 670:
                        return Name.P2P_PENDING_TRANSACTIONS;
                    case 671:
                        return Name.P2P_CLAIM_TRANSFER;
                    case 672:
                        return Name.P2P_PAY_REQUEST;
                    case 673:
                        return Name.PRODUCT_UPSELL;
                    case 674:
                        return Name.INVESTING_SETTINGS;
                    case 675:
                        return Name.DAY_TRADE_SETTINGS;
                    case 676:
                        return Name.LIMIT_HUB;
                    case 677:
                        return Name.GOLD_ONBOARDING_LANDING;
                    case 678:
                        return Name.GOLD_ONBOARDING_SWEEP_AGREEMENTS;
                    case 679:
                        return Name.GOLD_ONBOARDING_AGREEMENTS;
                    case 680:
                        return Name.GOLD_ONBOARDING_MARGIN_AGREEMENTS;
                    case 681:
                        return Name.GOLD_ONBOARDING_MARGIN_AVAILABLE_MARGIN;
                    case 682:
                        return Name.GOLD_ONBOARDING_MARGIN_CHECK;
                    case CylinderBarConstants.TOTAL_ANIMATION_DURATION_SINGLE /* 683 */:
                        return Name.GOLD_ONBOARDING_MARGIN_INFO;
                    case 684:
                        return Name.GOLD_ONBOARDING_SUCCESS;
                    case 685:
                        return Name.RETIREMENT_LEARN_AND_EARN_REWARD;
                    case 686:
                        return Name.GOLD_ONBOARDING_ERROR;
                    case 687:
                        return Name.EQUITY_ORDER_DETAIL;
                    case 688:
                        return Name.WIRE_TRANSFER;
                    case 689:
                        return Name.WIRE_VAN_DETAILS;
                    case 690:
                        return Name.WIRE_INFO_SCREEN;
                    case 691:
                        return Name.SLIP_ONBOARDING_INTRO_V3;
                    case 692:
                        return Name.SLIP_ONBOARDING_VALUE_PROPS;
                    case 693:
                        return Name.SHARE_PORTFOLIO_PAGE;
                    case 694:
                        return Name.SHARE_PORTFOLIO_LEARN_MORE_ABOUT_REFERRALS;
                    case 695:
                        return Name.ALERT_HUB_SETTING;
                    case 696:
                        return Name.CRYPTO_TRADING_COIN_LIST;
                    case 697:
                        return Name.GOLD_ONBOARDING_OLD_LANDING;
                    case 698:
                        return Name.GOLD_ONBOARDING_OLD_SUCCESS;
                    case 699:
                        return Name.RETIREMENT_GOLD_MATCH_VALUE_PROPS;
                    case Timeline.MIDDLE_META_OFFSET_ANIMATION_DURATION /* 700 */:
                        return Name.EQUITY_ENTER_LIMIT_PRICE_PAGE;
                    case 701:
                        return Name.POST_DAY_TRADE_SCREEN;
                    case 702:
                        return Name.RETIREMENT_MATCH_RATE_SELECTION;
                    case 703:
                        return Name.NCW_REWARD;
                    case 706:
                        return Name.P2P_ONBOARDING_ATTRIBUTION;
                    case 707:
                        return Name.RHY_REFERRALS_TRACKING;
                    case 708:
                        return Name.RHY_REFERRALS_REFERRER_LANDING_PAGE;
                    case 709:
                        return Name.RHY_REFERRALS_REFEREE_LANDING_PAGE;
                    case 710:
                        return Name.RHY_REFERRALS_CONTACT_LIST;
                    case 711:
                        return Name.RHY_REFERALS_STATUS;
                    case 712:
                        return Name.RHY_REFERRAL_REWARD_DETAILS;
                    case 713:
                        return Name.RHY_REFERRALS_WELCOME;
                    case 714:
                        return Name.RHY_REFERRALS_FUND_LANDING;
                    case 715:
                        return Name.EQUITY_SET_TIME_IN_FORCE_PAGE;
                    case 716:
                        return Name.OPTION_CHAIN_CUSTOMIZATION_SETTINGS;
                    case 717:
                        return Name.EQUITY_ENTER_STOP_PRICE_PAGE;
                    case 718:
                        return Name.EQUITY_ENTER_TRAIL_AMOUNT_PAGE;
                    case 719:
                        return Name.RHY_REFERRALS_FUND_SUCCESS;
                    case 720:
                        return Name.RHY_REFERRALS_FUND_PILL;
                    case 721:
                        return Name.ONBOARDING_TAKEOVER;
                    case 722:
                        return Name.RETIREMENT_ENOKI_INFO;
                    case 723:
                        return Name.EMAIL_PREFERENCES_PAGE;
                    case 724:
                        return Name.EMAIL_UNSUBSCRIBE_PAGE;
                    case 725:
                        return Name.P2P_REVIEW_MULTIUSER_TRANSACTION;
                    case 726:
                        return Name.CX_MULTIPLE_ACCOUNT_SUPPORT_PAGE;
                    case 727:
                        return Name.RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_INTRO;
                    case 728:
                        return Name.RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_QUESTION;
                    case 729:
                        return Name.RETIREMENT_ACCOUNT_ELIGIBILITY_QUIZ_RESULT;
                    case 730:
                        return Name.OPTION_ORDER_CONFIRMATION;
                    case 731:
                        return Name.ACATS_IN_BONUS_MATCH;
                    case 732:
                        return Name.PDT_RULES_UPDATES_INFO;
                    case 733:
                        return Name.PIN_SETUP_SCREEN;
                    case 734:
                        return Name.POST_TRANSFER_PAGE_RFP_PENDING;
                    case 735:
                        return Name.ASSET_HOME;
                    case 736:
                        return Name.SCREEN_PROTECT;
                    case 737:
                        return Name.DISTRIBUTE_INVEST_FLOW;
                    case 738:
                        return Name.RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION;
                    case 739:
                        return Name.RETIREMENT_TRANSFERS_MATCH_RATE_SELECTION_AGREEMENTS;
                    case 740:
                        return Name.RETIREMENT_ONBOARDING_MANAGEMENT_TYPE_SELECTION;
                    case 741:
                        return Name.OAUTH_WATING_SCREEN;
                    case 742:
                        return Name.SLIP_ONBOARDING_ELIGIBILITY_CHECKLIST;
                    case 743:
                        return Name.SLIP_POST_TRADE_UPSELL;
                    case 744:
                        return Name.OPTION_SIMULATED_RETURNS;
                    case 745:
                        return Name.SUGGESTION_SEARCH;
                    case 746:
                        return Name.GOLD_HUB;
                    case 747:
                        return Name.GOLD_SUGGESTED_ACTION;
                    case 748:
                        return Name.GOLD_CELEBRATION;
                    case 749:
                        return Name.RECURRING_DEPOSIT_UPSELL;
                    case OptionOnboardingUpsellAnimationConstants.UPSELL_ANIMATION_DURATION /* 750 */:
                        return Name.GOLD_DEPOSIT_UPSELL;
                    case 751:
                        return Name.NCW_DISCOVER_CRYPTO_NEWS;
                    case 752:
                        return Name.NCW_DISCOVER_TOP_LIST;
                    case 753:
                        return Name.APP_PRIVACY_SETTINGS;
                    case 754:
                        return Name.DEVICE_APPROVAL_WAITING;
                    case 755:
                        return Name.DEVICE_APPROVAL_WAITING_BLOCKED;
                    case 756:
                        return Name.RETIREMENT_SCROLLING_VALUE_PROP;
                    case 757:
                        return Name.WELCOME_GB_MAIN;
                    case 758:
                        return Name.SLIP_LEARN_AND_EARN_REWARD;
                    case 759:
                        return Name.RISKY_DEPOSIT_INSTANT_UPSELL;
                    case 760:
                        return Name.ADVISORY_PORTFOLIO_REVEAL_INTRO;
                    case 761:
                        return Name.ADVISORY_PORTFOLIO_REVEAL_BREAKDOWN;
                    case 762:
                        return Name.ADVISORY_PORTFOLIO_REVEAL_PROJECTION;
                    case 763:
                        return Name.IDENTITY_VERIFICATION_SPLASH;
                    case 764:
                        return Name.CONFIRM_REGION;
                    case 765:
                        return Name.PLAID_BANK_LIST;
                    case 766:
                        return Name.PLAID_AUTHENTICATION;
                    case 767:
                        return Name.OPTION_EDIT_LEG_RATIO;
                    case 768:
                        return Name.RETIREMENT_1099_PARTNERSHIP_DETAIL;
                    case 769:
                        return Name.RETIREMENT_MATCH_HUB;
                    case 770:
                        return Name.PERSONA_IDENTITY_VERIFICATION;
                    case 771:
                        return Name.NCW_TOKEN_VISIBILITY;
                    case 772:
                        return Name.RETIREMENT_ONBOARDING_FUNDING_METHODS;
                    case 773:
                        return Name.EQUITY_SELECT_ORDER_KIND_MINI_MENU_PAGE;
                    case 774:
                        return Name.SEPA_INFO;
                    case 775:
                        return Name.COUNTRY_UNAVAILABLE_ERROR;
                    case 776:
                        return Name.ACH_GRACE_PERIOD_CONFIRMATION;
                    case 777:
                        return Name.ENABLE_NOTIFICATIONS_PROMPT;
                    case 778:
                        return Name.START_DEPOSIT;
                    case 779:
                        return Name.DEPOSIT_IN_PROGRESS;
                    case 780:
                        return Name.WITHDRAWAL_INPUT;
                    case 781:
                        return Name.CHOOSE_WITHDRAWAL_ACCOUNT;
                    case 782:
                        return Name.WITHDRAWAL_REVIEW;
                    case 783:
                        return Name.WITHDRAWAL_CONFIRMATION;
                    case 784:
                        return Name.CRYPTO_ORDER_REVIEW;
                    case 785:
                        return Name.SIGNUP_REWARD_GRANTED;
                    case 786:
                        return Name.REFERRAL_REWARD_GRANTED;
                    case 787:
                        return Name.REFERRAL_REWARD_DETAIL;
                    case 788:
                        return Name.RH_SUPPORT;
                    case 789:
                        return Name.CONTACT_SUPPORT;
                    case 790:
                        return Name.TRADING_TRENDS;
                    case 791:
                        return Name.NCW_CLAIM_REWARD;
                    case 792:
                        return Name.NCW_CONFIRM_REWARD;
                    case 793:
                        return Name.NCW_APP_REDIRECT;
                    case 794:
                        return Name.TRADING_TRENDS_ONBOARDING_SEARCH;
                    case 795:
                        return Name.TRADING_TRENDS_ONBOARDING;
                    case 796:
                        return Name.GOLD_PLAN_SELECTION;
                    case 797:
                        return Name.CX_SUPPORT_CHAT_THREAD;
                    case 798:
                        return Name.GOLD_DOWNGRADE_CONFIRMATION;
                    case 801:
                        return Name.MARGIN_CALL_WIRE_UPSELL;
                    case 802:
                        return Name.POST_INCOMING_WIRE;
                    case 803:
                        return Name.APY_BOOST_CELEBRATION;
                    case 804:
                        return Name.DIRECT_DEPOSIT_HUB;
                    case 805:
                        return Name.GOLD_TAB;
                    case 806:
                        return Name.TAX_SEASON_PROMO_2024_PROMO;
                    case 807:
                        return Name.TAX_SEASON_PROMO_2024_MATCH_SELECTOR;
                    case 808:
                        return Name.TAX_SEASON_PROMO_2024_TIMELINE;
                    case 809:
                        return Name.NCW_WALLET_BACKUP_TYPE;
                    case 810:
                        return Name.OPTIONS_STOP_MARKET_NUX;
                    case 811:
                        return Name.OUTGOING_WIRE_DETAIL_INPUT;
                    case 812:
                        return Name.OUTGOING_WIRE_LINK_ACCOUNT;
                    case 813:
                        return Name.CC_APPLICATION_LANDING;
                    case 814:
                        return Name.CC_APPLICATION_PROFILE_INFO_REVIEW;
                    case 815:
                        return Name.CC_APPLICATION_PROFILE_INFO_EDIT;
                    case 816:
                        return Name.CC_APPLICATION_SSN;
                    case 817:
                        return Name.CC_APPLICATION_RESIDENTIAL_ADDRESS;
                    case 818:
                        return Name.CC_APPLICATION_ADDRESS_SEARCH;
                    case 819:
                        return Name.CC_APPLICATION_ADDRESS_MANUAL;
                    case CreateTransferShimActivity.transferRequestCode /* 820 */:
                        return Name.CC_APPLICATION_ADDRESS_ERROR;
                    case 821:
                        return Name.CC_APPLICATION_ADDRESS_SUGGESTION;
                    case 822:
                        return Name.CC_APPLICATION_INCOME;
                    case 823:
                        return Name.CC_APPLICATION_TERMS;
                    case 824:
                        return Name.CC_APPLICATION_LOADING;
                    case 825:
                        return Name.CC_APPLICATION_FRAUD_ALERT;
                    case 826:
                        return Name.CC_APPLICATION_FRAUD_ALERT_VERIFICATION_CODE;
                    case 827:
                        return Name.CC_APPLICATION_FRAUD_ALERT_VERIFIED;
                    case 828:
                        return Name.CC_APPLICATION_CREDIT_FROZEN;
                    case 829:
                        return Name.CC_APPLICATION_REVIEW_NEEDED;
                    case 830:
                        return Name.CC_APPLICATION_ADDRESS_CHALLENGE;
                    case 831:
                        return Name.CC_APPLICATION_IDV_FAIL;
                    case 832:
                        return Name.CC_APPLICATION_REJECTED;
                    case 833:
                        return Name.CC_APPLICATION_LIMIT_REVEAL;
                    case 834:
                        return Name.CC_APPLICATION_ACCOUNT_TERMS;
                    case 835:
                        return Name.CC_APPLICATION_SHIPPING_ADDRESS;
                    case 836:
                        return Name.CC_APPLICATION_SHIPPING_ETA;
                    case 837:
                        return Name.CC_APPLICATION_DOWNLOAD_APP;
                    case 838:
                        return Name.ACAT_HISTORY_DETAIL;
                    case 839:
                        return Name.ACAT_RETRY;
                    case 840:
                        return Name.CRYPTO_SETTINGS;
                    case 841:
                        return Name.LINK_APPLE_PAY_INTRO;
                    case 842:
                        return Name.LINK_APPLE_PAY_ERROR;
                    case 843:
                        return Name.LINK_APPLE_PAY_CONFIRMATION;
                    case 844:
                        return Name.NCW_WEB3_LAUNCHPAD;
                    case 845:
                        return Name.POST_ONBOARDING_FUND_SPLASH;
                    case 846:
                        return Name.POST_ONBOARDING_FUND_DETAIL;
                    case 847:
                        return Name.QUEUED_DEPOSIT_LEARN_MORE;
                    case 848:
                        return Name.POST_QUEUED_DEPOSIT_CONFIRMATION;
                    case 849:
                        return Name.CC_WAITLIST_INTRO;
                    case 850:
                        return Name.CRYPTO_TRANSFER_LIMITS;
                    case 851:
                        return Name.CC_WAITLIST_JOINED;
                    case 852:
                        return Name.PRE_IPO_BID;
                    case 853:
                        return Name.CC_WAITLIST_CONFIRMATION;
                    case 854:
                        return Name.CC_WAITLIST_GOLD_UPSELL;
                    case 855:
                        return Name.RETIREMENT_401K_ROLLOVER_METHOD_SELECTION;
                    case 856:
                        return Name.RETIREMENT_401K_ROLLOVER_VERIFY_INFO;
                    case 857:
                        return Name.RETIREMENT_401K_ROLLOVER_INTERSTITIAL;
                    case 858:
                        return Name.RETIREMENT_401K_ROLLOVER_CAPITALIZE_EMBED;
                    case 859:
                        return Name.CC_ONBOARDING_LANDING;
                    case 860:
                        return Name.CC_POST_ONBOARDING;
                    case 861:
                        return Name.TAX_SEASON_PROMO_2024_MATCH_AGREEMENTS;
                    case 862:
                        return Name.MARGIN_UPGRADE_TIERED_RATES;
                    case 863:
                        return Name.MARGIN_UPGRADE_GOLD_UPSELL;
                    case 864:
                        return Name.GOLD_DEPOSIT_BONUS_CELEBRATION;
                    case 865:
                        return Name.FUNCTIONAL_DEPOSIT_UPSELL;
                    case 866:
                        return Name.GOLD_DEPOSIT_BONUS_UPCOMING_PAYOUTS;
                    case 867:
                        return Name.GOLD_DEPOSIT_BONUS_CELEBRATION_TIMELINE;
                    case 868:
                        return Name.CRYPTO_REFERRAL_DETAIL;
                    case 869:
                        return Name.RHC_LOGIN_REFERRAL;
                    case 870:
                        return Name.RHC_SIGNUP_REFERRAL_RH;
                    case 871:
                        return Name.CX_SUPPORT_HUB;
                    case 872:
                        return Name.PROFIT_AND_LOSS_HUB;
                    case 873:
                        return Name.ACATS_IN_PARTIAL_TRANSFER_ELIGIBLE;
                    case 874:
                        return Name.ACATS_IN_EDIT_ASSET;
                    case 875:
                        return Name.ACATS_IN_UNSUPPORTED_ASSETS;
                    case 876:
                        return Name.ACATS_IN_TRANSFER_UNSUPPORTED;
                    case 877:
                        return Name.CRYPTO_STAKING_AMOUNT_ENTRY;
                    case 878:
                        return Name.CRYPTO_STAKING_HISTORY_DETAIL;
                    case 879:
                        return Name.CRYPTO_STAKING_HUB;
                    case 880:
                        return Name.CRYPTO_STAKING_INTRO;
                    case 881:
                        return Name.CRYPTO_STAKING_ORDER_CONFIRMATION;
                    case 882:
                        return Name.CRYPTO_STAKING_ORDER_REVIEW;
                    case 883:
                        return Name.CRYPTO_STAKING_SUMMARY;
                    case 884:
                        return Name.GOLD_DEPOSIT_BOOST_HUB;
                    case 885:
                        return Name.RESUME_APPLICATION_V1_TAKEOVER;
                    case 886:
                        return Name.RESUME_APPLICATION_V2_TAKEOVER;
                    case 887:
                        return Name.ACATS_IN_OPTIONS_ENABLEMENT;
                    case 888:
                        return Name.GOLD_DEPOSIT_BONUS_PAYOUT_DETAIL;
                    case 889:
                        return Name.ONBOARDING_DEPOSIT_PAGE;
                    case 890:
                        return Name.IAC_BOTTOM_SHEET;
                    case 891:
                        return Name.LEVEL_TWO_MARKET_DATA;
                    case 892:
                        return Name.OPTION_EVENT_DETAIL;
                    case 893:
                        return Name.DEVICE_APPROVAL_HANDLING;
                    case 894:
                        return Name.DEVICE_APPROVAL_HANDLING_BLOCKED;
                    case 895:
                        return Name.NCW_BUY_CHOOSE_PROVIDER;
                    case 896:
                        return Name.NCW_BUY_RH_SPLASH_CONNECT;
                    case 897:
                        return Name.NCW_BUY_SPLASH_SARDINE;
                    case 898:
                        return Name.GOLD_DEPOSIT_BONUS_ADJUSTMENT_DETAIL;
                    case RecsRetirementLoadingConstants.LoopingPhaseMaxFrame /* 899 */:
                        return Name.JOINT_ACCOUNT_PRIMARY_INTRO;
                    case 900:
                        return Name.JOINT_ACCOUNT_SEND_INVITE;
                    case 901:
                        return Name.JOINT_ACCOUNT_INVITE_SENT_CELEBRATION;
                    case 902:
                        return Name.JOINT_ACCOUNT_CONFIRM_SECONDARY;
                    case 903:
                        return Name.JOINT_ACCOUNT_PRIMARY_CELEBRATION;
                    case 904:
                        return Name.JOINT_ACCOUNT_SECONDARY_INTRO;
                    case 905:
                        return Name.JOINT_ACCOUNT_SECONDARY_CELEBRATION;
                    case 906:
                        return Name.JOINT_ACCOUNT_HOME;
                    case 907:
                        return Name.JOINT_ACCOUNT_HELP_CO_OWNER;
                    case 908:
                        return Name.JOINT_POST_CREATION;
                    case 909:
                        return Name.OUTGOING_WIRE_DETAIL_V2_INPUT;
                    case 910:
                        return Name.OUTGOING_WIRE_DETAIL_CONFIRMATION;
                    case 911:
                        return Name.OUTGOING_WIRE_FRAUD_ALERT;
                    case 912:
                        return Name.ADR_FEE_DETAIL;
                    case 913:
                        return Name.PLAID_LINK_BANK_ACCOUNT;
                    case 914:
                        return Name.NCW_LAUNCH_SPLASH;
                    case 915:
                        return Name.CC_APPLICATION_SOLID_GOLD_DELAY;
                    case 916:
                        return Name.CREATE_TRANSFER_V2;
                    case 917:
                        return Name.MARGIN_ACATS_LANDING;
                    case 918:
                        return Name.DIRECT_DEPOSIT_UPSELL;
                    case 919:
                        return Name.DIRECT_DEPOSIT_DISCLOSURES;
                    case 920:
                        return Name.DIRECT_DEPOSIT_SETUP_INFO;
                    case 921:
                        return Name.DIRECT_DEPOSIT_HISTORY;
                    case 922:
                        return Name.DIRECT_DEPOSIT_POST_TRANSFER_UPSELL;
                    case 923:
                        return Name.JOINT_ACCOUNT_FUNDING_METHODS;
                    case 924:
                        return Name.FUTURES_DETAIL_SCREEN;
                    case 925:
                        return Name.FUTURES_LADDER_SCREEN;
                    case 926:
                        return Name.FUTURES_ORDER_FORM_SCREEN;
                    case 927:
                        return Name.FUTURES_ORDER_FORM_REVIEW_SCREEN;
                    case 928:
                        return Name.FUTURES_ORDER_CONFIRMATION_SCREEN;
                    case 929:
                        return Name.FUTURES_ORDER_PLACEMENT_LOADING_SCREEN;
                    case 930:
                        return Name.FUTURES_VALUE_PROPS_SCREEN;
                    case 931:
                        return Name.FUTURES_ONBOARDING_REVIEW_INVESTOR_PROFILE_SCREEN;
                    case 932:
                        return Name.FUTURES_ONBOARDING_AGREEMENTS_AND_DISCLOSURES_SCREEN;
                    case 933:
                        return Name.FUTURES_LADDER_FUTX;
                    case 934:
                        return Name.GOLD_BILLING_PAYMENT_PREFERENCE;
                    case 935:
                        return Name.SLIP_ONE_CLICK_AGREEMENTS;
                    case 936:
                        return Name.FUTURES_ORDER_HISTORY_DETAIL_SCREEN;
                    case 937:
                        return Name.FUTURES_LADDER_FTUX;
                    case 938:
                        return Name.CRYPTO_TRANSFER_SEND_MEMO;
                    case 939:
                        return Name.FUTURES_APPLICATION_ACCOUNT_APPROVED;
                    case 940:
                        return Name.FUTURES_APPLICATION_ACCOUNT_REVIEW_REQUIRED;
                    case 941:
                        return Name.FUTURES_APPLICATION_ACCOUNT_REJECTED;
                    case 942:
                        return Name.FUTURES_ONBOARDING_ARBITRATION_AGREEMENT;
                    case 943:
                        return Name.OPTION_ONBOARDING_START;
                    case 944:
                        return Name.OPTION_ONBOARDING_SPLASH_L0;
                    case 945:
                        return Name.OPTION_ONBOARDING_SPLASH_L2;
                    case 946:
                        return Name.OPTION_ONBOARDING_SPLASH_RETIREMENT;
                    case 947:
                        return Name.OPTION_ONBOARDING_QUESTION_OPTION_EXPERIENCE;
                    case 948:
                        return Name.OPTION_ONBOARDING_QUESTION_UNDERSTAND_SPREAD;
                    case 949:
                        return Name.OPTION_ONBOARDING_QUESTION_INVESTMENT_ADVICE;
                    case 950:
                        return Name.OPTION_ONBOARDING_QUESTION_FINANCIAL_REGULATOR;
                    case 951:
                        return Name.OPTION_ONBOARDING_SUITABILITY;
                    case 952:
                        return Name.OPTION_ONBOARDING_INVESTMENT_PROFILE;
                    case 953:
                        return Name.OPTION_ONBOARDING_DISCLOSURE;
                    case 954:
                        return Name.OPTION_ONBOARDING_APPROVED_TRADES;
                    case 955:
                        return Name.OPTION_ONBOARDING_SUCCESS;
                    case 956:
                        return Name.OPTION_ONBOARDING_FAILURE;
                    case 957:
                        return Name.OPTION_ONBOARDING_EDUCATION_SPREAD;
                    case 958:
                        return Name.OPTION_ONBOARDING_EDUCATION_L3_STRATEGIES;
                    case 959:
                        return Name.OPTION_ONBOARDING_READY_L3_UPGRADE;
                    case 960:
                        return Name.OPTION_ONBOARDING_UPSELL_ALERT;
                    case 961:
                        return Name.OPTION_ONBOARDING_UPSELL_TRADE_ON_EXPIRATION;
                    case 962:
                        return Name.OPTION_ONBOARDING_UPSELL_ALL_SET;
                    case 963:
                        return Name.BLACK_WIDOW_SPLASH_UPSELL;
                    case 964:
                        return Name.CX_CHAT_ERROR_SCREEN;
                    case 965:
                        return Name.FUTURES_ONBOARDING_ELIGIBILITY_CHECK;
                    case 966:
                        return Name.ACATS_IN_PLAID_INTRO;
                    case 967:
                        return Name.CC_APPLICATION_SSN_VERIFICATION;
                    case 968:
                        return Name.CC_APPLICATION_SSN_VERIFIED;
                    case 969:
                        return Name.AGREEMENT;
                    case 970:
                        return Name.REWARD_OFFERS_LIST;
                    case 971:
                        return Name.POST_REWARD_CLAIM_UPSELL_SCREEN;
                    case 972:
                        return Name.RESURRECTION_SPLASH;
                    case 973:
                        return Name.KBA_VERIFICATION;
                    case 974:
                        return Name.REVAMP_LOGIN_CONFIRM_EMAIL;
                    case 975:
                        return Name.REVAMP_LOGIN_UPDATE_EMAIL;
                    case 976:
                        return Name.REVAMP_LOGIN_VERIFY_EMAIL;
                    case 977:
                        return Name.REVAMP_LOGIN_ASK_UPDATE_PASSWORD;
                    case 978:
                        return Name.REVAMP_LOGIN_UPDATE_PASSWORD;
                    case 979:
                        return Name.WITHDRAW_INTERVENTION_UPSELL;
                    case 980:
                        return Name.WITHDRAW_INTERVENTION_CONFIRMATION;
                    case 981:
                        return Name.GOLD_SWITCH_PLANS_CONFIRMATION;
                    case 982:
                        return Name.INTERNAL_ASSET_TRANSFER_INTRO;
                    case 983:
                        return Name.INTERNAL_ASSET_TRANSFER_ACCOUNT_SELECTION;
                    case 984:
                        return Name.INTERNAL_ASSET_TRANSFER_ACCOUNT_SELECTION_LIST;
                    case 985:
                        return Name.INTERNAL_ASSET_TRANSFER_TAX_IMPLICATIONS;
                    case 986:
                        return Name.INTERNAL_ASSET_TRANSFER_AGREEMENT;
                    case 987:
                        return Name.INTERNAL_ASSET_TRANSFER_REVIEW;
                    case 988:
                        return Name.INTERNAL_ASSET_TRANSFER_ASSET_LIST;
                    case 989:
                        return Name.INTERNAL_ASSET_TRANSFER_CONFIRMATION;
                    case 990:
                        return Name.INTERNAL_ASSET_TRANSFER_DETAILS;
                    case 991:
                        return Name.INDEX_DETAIL;
                    case 992:
                        return Name.CRYPTO_TRANSFER_SEND_PARTY_SELECTION;
                    case 993:
                        return Name.CRYPTO_TRANSFER_SEND_WALLET_SELECTION;
                    case 994:
                        return Name.CRYPTO_TRANSFER_SEND_EXCHANGE;
                    case 995:
                        return Name.CRYPTO_TRANSFER_SEND_EXCHANGE_SEARCH;
                    case 996:
                        return Name.CRYPTO_TRANSFER_SEND_RECEIVER_NAME;
                    case 997:
                        return Name.CRYPTO_TRANSFER_SEND_RECEIVER_DOB;
                    case 998:
                        return Name.CRYPTO_TRANSFER_SEND_PENDING_REVIEW;
                    case 999:
                        return Name.CRYPTO_TRANSFER_SEND_FAILED;
                    case 1000:
                        return Name.TAX_LOTS_SELECTION;
                    case 1001:
                        return Name.CRYPTO_TRANSFER_HISTORY_DETAIL;
                    case 1002:
                        return Name.CRYPTO_TRANSFER_RECEIVE_PARTY_SELECTION;
                    case 1003:
                        return Name.CRYPTO_TRANSFER_RECEIVE_WALLET_SELECTION;
                    case 1004:
                        return Name.CRYPTO_TRANSFER_RECEIVE_PENDING_REVIEW;
                    case ErrorCodes.SOCKET_TIMEOUT_EXCEPTION /* 1005 */:
                        return Name.CRYPTO_TRANSFER_RECEIVE_FAILED;
                    case ErrorCodes.SSL_HANDSHAKE_EXCEPTION /* 1006 */:
                        return Name.CRYPTO_TRANSFER_RECEIVE_CONTACT_SUPPORT;
                    case ErrorCodes.IO_EXCEPTION /* 1007 */:
                        return Name.WEB_CLIENT_PREFERENCE;
                    case 1008:
                        return Name.UK_OPTION_ONBOARDING_SPLASH_L0;
                    case 1009:
                        return Name.LOGGED_IN_IDENTITY_VERIFICATION_WAIT;
                    case 1010:
                        return Name.UK_OPTION_ONBOARDING_EDUCATION_BENEFITS;
                    case 1011:
                        return Name.UK_OPTION_ONBOARDING_EDUCATION_RISKS;
                    case 1012:
                        return Name.UK_OPTION_ONBOARDING_EXPERIENCE_QUESTIONNAIRE;
                    case 1013:
                        return Name.UK_OPTION_ONBOARDING_KNOWLEDGE_QUESTIONNAIRE;
                    case 1014:
                        return Name.UK_OPTION_ONBOARDING_INVESTOR_PROFILE;
                    case 1015:
                        return Name.UK_OPTION_ONBOARDING_REVIEW_INVESTOR_PROFILE;
                    case 1016:
                        return Name.UK_OPTION_ONBOARDING_PROFESSIONAL_TRADER;
                    case 1017:
                        return Name.INTERNAL_ASSET_TRANSFER_TRANSFER_TYPE;
                    case 1018:
                        return Name.INTERNAL_ASSET_TRANSFER_ASSET_SELECTION;
                    case 1019:
                        return Name.INTERNAL_ASSET_TRANSFER_EDIT_EQUITY;
                    case 1020:
                        return Name.INTERNAL_ASSET_TRANSFER_EDIT_CASH;
                    case 1021:
                        return Name.INTERNAL_ASSET_TRANSFER_EDIT_MARGIN;
                    case 1022:
                        return Name.CRYPTO_TRANSFER_RECEIVE_EXCHANGE;
                    case 1023:
                        return Name.TAX_LOTS_HISTORY;
                    case 1024:
                        return Name.STAKING_UPSELL;
                    case 1025:
                        return Name.UK_OPTION_ONBOARDING_SPLASH_L2;
                    case 1026:
                        return Name.UK_OPTION_ONBOARDING_EDUCATION_BENEFITS_L2;
                    case 1027:
                        return Name.EOY_GIVEAWAY_2024;
                    case 1028:
                        return Name.FUTURES_CASH_CORRECTION_HISTORY_DETAIL_SCREEN;
                    case 1029:
                        return Name.FUTURES_EXECUTION_HISTORY_DETAIL_SCREEN;
                    case 1030:
                        return Name.EVENT_CONTRACT_ORDER_HISTORY_DETAIL_SCREEN;
                    case 1031:
                        return Name.GOLD_PRIMARY_PAYMENT_METHOD;
                    case 1032:
                        return Name.GOLD_BACKUP_PAYMENT_METHOD;
                    case 1033:
                        return Name.UK_MARGIN_ONBOARDING_LOSSES;
                    case 1034:
                        return Name.UK_MARGIN_ONBOARDING_GAINS;
                    case 1035:
                        return Name.UK_MARGIN_ONBOARDING_POTENTIAL_RISKS;
                    case 1036:
                        return Name.UK_MARGIN_ONBOARDING_MANAGE_RISKS;
                    case 1037:
                        return Name.UK_MARGIN_ONBOARDING_INVESTOR_PROFILE_SPLASH;
                    case 1038:
                        return Name.UK_MARGIN_ONBOARDING_EXPERIENCE_TEST_SPLASH;
                    case 1039:
                        return Name.UK_MARGIN_ONBOARDING_KNOWLEDGE_TEST_SPLASH;
                    case 1040:
                        return Name.FUTURES_ASSET_HOME;
                    case 1041:
                        return Name.OPTION_ONBOARDING_JOINT_PENDING;
                    case 1042:
                        return Name.GOLD_EXTRA_AGREEMENTS;
                    case 1043:
                        return Name.PRISM;
                    case 1044:
                        return Name.ACCOUNT_TYPE_SELECTION;
                    case 1045:
                        return Name.STRATEGIES_VALUE_PROPS;
                    case 1046:
                        return Name.MANAGEMENT_TYPE_SELECTION;
                    case 1047:
                        return Name.PORTFOLIO_QUESTIONNAIRE_INTRO;
                    case 1048:
                        return Name.ADVISORY_PORTFOLIO_REVEAL_INFO_PAGE;
                    case 1049:
                        return Name.ADVISORY_PORTFOLIO_REVEAL_REGION_DETAILS;
                    case CylinderBarConstants.TOTAL_ANIMATION_DURATION /* 1050 */:
                        return Name.ADVISORY_ONBOARDING_FUNDING_METHODS;
                    case 1051:
                        return Name.ADVISORY_ONBOARDING_FEES_PROMO;
                    case 1052:
                        return Name.ADVISORY_ONBOARDING_TRANSFER_NEXT_STEPS;
                    case 1053:
                        return Name.ADVISORY_ONBOARDING_FETCH_ACCOUNT;
                    case 1054:
                        return Name.ADVISORY_ONBOARDING_SUBMIT_DEPOSIT;
                    case 1055:
                        return Name.ADVISORY_ONBOARDING_FIRST_DEPOSIT_CELEBRATION;
                    case 1056:
                        return Name.PORTFOLIO_DRILLDOWN;
                    case 1057:
                        return Name.LIVE_TRIVIA;
                    case 1058:
                        return Name.ADVISORY_FUTURE_RETURNS;
                    case 1059:
                        return Name.CATPAY_LOGIN;
                    case 1060:
                        return Name.EVENT_CONTRACT_DETAIL_PAGE;
                    case 1061:
                        return Name.EVENT_CONTRACT_ORDER_FORM;
                    case 1062:
                        return Name.EVENT_CONTRACT_HUB;
                    case 1063:
                        return Name.CRYPTO_VOLUME_TIER_PRIMER;
                    case 1064:
                        return Name.CRYPTO_VOLUME_TIER_HUB;
                    case 1065:
                        return Name.CRYPTO_VOLUME_TIER_EXPLAINER;
                    case 1066:
                        return Name.CRYPTO_VOLUME_TIER_INELIGIBLE;
                    case 1067:
                        return Name.SIDE_BY_SIDE_OPTION_CHAIN;
                    case 1068:
                        return Name.CRYPTO_TRANSFER_SEARCH;
                    case 1069:
                        return Name.ADVISORY_DASHBOARD;
                    case 1070:
                        return Name.NCW_GOLD_PROMO_PRIMER;
                    case 1071:
                        return Name.NCW_GOLD_PROMO_PRIMER_CONNECTED;
                    case 1072:
                        return Name.GOLD_EVENT_LIVE_2025;
                    case 1073:
                        return Name.CC_APPLICATION_PREMIUM_LIMITS;
                    case 1074:
                        return Name.BENEFICIARY_TYPE;
                    case 1075:
                        return Name.BENEFICIARY_TRUST_DATE_INPUT;
                    case 1076:
                        return Name.BENEFICIARY_TRUST_NAME_INPUT;
                    case 1077:
                        return Name.BENEFICIARY_TRUST_TAX_ID_INPUT;
                    case 1078:
                        return Name.BENEFICIARY_TRUSTEE_EMAIL_INPUT;
                    case 1079:
                        return Name.EVENT_CONTRACTS_BRACKET_PAGE;
                    case 1080:
                        return Name.OPTIONS_SBS_CHAIN;
                    case 1081:
                        return Name.GOLD_STATUS_NCW_AUTH;
                    case 1082:
                        return Name.CRYPTO_MAIN_NEWSFEED;
                    case 1083:
                        return Name.ADVISORY_INSIGHT;
                    case 1084:
                        return Name.ADVISORY_INSIGHTS_HUB;
                    case 1085:
                        return Name.CRYPTO_TAX_LOTS_PRIMER;
                    case 1086:
                        return Name.EU_CRYPTO_COUNTDOWN_PAGE;
                    case 1087:
                        return Name.EU_CRYPTO_REWARD_GRANTED;
                    case 1088:
                        return Name.WORKFLOW_UPDATE_APP;
                    case 1089:
                        return Name.WORKFLOW_INFO;
                    case 1090:
                        return Name.WORKFLOW_SMS_CHALLENGE;
                    case 1091:
                        return Name.WORKFLOW_DEVICE_APPROVAL_CHALLENGE;
                    case 1092:
                        return Name.WORKFLOW_PLAID_BANK_LIST;
                    case 1093:
                        return Name.WORKFLOW_PLAID_AUTH;
                    case 1094:
                        return Name.WORKFLOW_GKBA;
                    case 1095:
                        return Name.WORKFLOW_EMAIL_CHALLENGE;
                    case 1096:
                        return Name.WORKFLOW_KYC_STATUS_CHECK;
                    case 1097:
                        return Name.WORKFLOW_REQUEST_PHONE_CALL;
                    case 1098:
                        return Name.CUSTOMER_ACCOUNT_REVIEW_SPLASH;
                    case 1099:
                        return Name.CX_APPOINTMENT_TIME_SELECTION;
                    case ErrorCodes.THROWABLE /* 1100 */:
                        return Name.CX_APPOINTMENT_NOTES_ENTRY;
                    case 1101:
                        return Name.CX_APPOINTMENT_REVIEW_DETAILS;
                    case 1102:
                        return Name.CX_APPOINTMENT_CONFIRMATION;
                    case 1103:
                        return Name.CX_APPOINTMENT_DETAILS;
                    case 1104:
                        return Name.WORKFLOW_KYC_AGREEMENT;
                    case 1105:
                        return Name.WORKFLOW_KYC_WAITING;
                    case 1106:
                        return Name.WORKFLOW_REQUEST_PHONE_CALL_SELECT_COUNTRY;
                    case 1107:
                        return Name.WORKFLOW_REQUEST_PHONE_CALL_EDIT;
                    case 1108:
                        return Name.NCW_ONBOARDING_STARTER;
                    case 1109:
                        return Name.NCW_ONBOARDING_BACKUP;
                    case 1110:
                        return Name.NCW_ONBOARDING_NOTIFICATION_PROMPT;
                    case 1111:
                        return Name.APAC_OPTION_ONBOARDING_SPLASH_L0;
                    case 1112:
                        return Name.APAC_OPTION_ONBOARDING_CAR_QUESTIONNAIRE;
                    case 1113:
                        return Name.CASH_BALANCES_DETAILS_PAGE;
                    case 1114:
                        return Name.MARGIN_MAINTENANCE_TABLE;
                    case 1115:
                        return Name.VOLUME_TIERS_DEPOSIT_PROMO_INFO;
                    case 1116:
                        return Name.CRYPTO_VOLUME_TIER_ENROLLMENT_CONFIRMATION;
                    case 1117:
                        return Name.CRYPTO_DEPOSIT_INCENTIVE_ERROR;
                    case 1118:
                        return Name.BENEFICIARY_LEVEL;
                    case 1119:
                        return Name.SIDE_BY_SIDE_OPTION_CHAIN_ONBOARDING_SEARCH;
                    case 1120:
                        return Name.MOBILE_ADVANCED_CHARTS;
                    case 1121:
                        return Name.CX_CONCIERGE_ONBOARDING;
                    case 1122:
                        return Name.CUSTOMER_ACCOUNT_REVIEW_RESULT_PASS;
                    case 1123:
                        return Name.CUSTOMER_ACCOUNT_REVIEW_RESULT_FAIL;
                    case 1124:
                        return Name.ADVISORY_WITHDRAW_AND_CLOSE_ACCOUNT;
                    case 1125:
                        return Name.NCW_IMPORTING_WALLET_CLOUD;
                    case 1126:
                        return Name.NCW_IMPORTING_WALLET_REVIEW;
                    case 1127:
                        return Name.CX_APPOINTMENT_ALREADY_BOOKED;
                    case 1128:
                        return Name.CX_APPOINTMENT_CANCEL_CONFIRMATION;
                    case 1129:
                        return Name.CLAWBACK_GRACE_PERIOD_OPT_IN_SCREEN;
                    case 1130:
                        return Name.GOLD_SAGE_SPLASH;
                    case 1131:
                        return Name.GOLD_SAGE_TIMELINE;
                    case 1132:
                        return Name.GOLD_SAGE_RATE;
                    case 1133:
                        return Name.GOLD_SAGE_START_APPLICATION;
                    case 1134:
                        return Name.GOLD_SAGE_APPLICATION;
                    case 1135:
                        return Name.CX_CONCIERGE_INFO;
                    case 1136:
                        return Name.CX_CONCIERGE_FAQ;
                    case 1137:
                        return Name.ADVISORY_GOLD_PERKS;
                    case 1138:
                        return Name.ADVISORY_ACATS_PROMO;
                    case 1139:
                        return Name.RESTRICT_SECURITIES;
                    case 1140:
                        return Name.UPDATE_MANAGED_INVESTOR_PROFILE;
                    case 1141:
                        return Name.UPDATE_MANAGED_INVESTOR_PROFILE_RESULTS;
                    case 1142:
                        return Name.CORTEX_SDP_DIGEST;
                    case 1143:
                        return Name.CORTEX_SDP_DIGEST_FEEDBACK;
                    case 1144:
                        return Name.NCW_OFFRAMP_SPLASH;
                    case 1145:
                        return Name.NCW_OFFRAMP_TOKEN_SELECTION;
                    case 1146:
                        return Name.NCW_OFFRAMP_NETWORK_SELECTION;
                    case 1147:
                        return Name.NCW_OFFRAMP_AMOUNT_INPUT;
                    case 1148:
                        return Name.ADVISORY_PORTFOLIO_COMPUTE;
                    case 1149:
                        return Name.SDP_DIGEST_BREAKING;
                    case 1150:
                        return Name.WIRE_TRANSFER_MEMO;
                    case 1151:
                        return Name.OUTGOING_WIRE_THIRD_PARTY_FRAUD_ALERT;
                    case 1152:
                        return Name.WIRE_TRANSFER_SUBMIT_TITLE_DOCUMENTS;
                    case 1153:
                        return Name.WIRE_TRANSFER_ENTER_BANK_DETAILS;
                    case 1154:
                        return Name.WIRE_TRANSFER_CONFIRM_BANK_DETAILS;
                    case 1155:
                        return Name.INVESTING_MONITOR;
                    case 1156:
                        return Name.TOKENIZED_STOCK_ORDER_ENTRY;
                    case 1157:
                        return Name.TOKENIZED_STOCK_ORDER_TYPE;
                    case 1158:
                        return Name.TOKENIZED_STOCK_ORDER_REVIEW;
                    case 1159:
                        return Name.TOKENIZED_STOCK_ORDER_RECEIPT;
                    case 1160:
                        return Name.TOKENIZED_STOCK_ORDER_HISTORY_DETAIL;
                    case 1161:
                        return Name.IDENTITY;
                    case 1162:
                        return Name.INVESTOR_PROFILE;
                    case 1163:
                        return Name.STOCK_TOKEN_TAX_INFO;
                    case 1164:
                        return Name.STOCK_TOKEN_ASSESSMENT;
                    case 1165:
                        return Name.STOCK_TOKEN_KNOWLEDGE_TEST;
                    case 1166:
                        return Name.TOKENIZED_STOCK_PRIMER;
                    case 1167:
                        return Name.TOKENIZED_STOCK_FAQ;
                    case 1168:
                        return Name.TOKENIZED_STOCK_DETAIL_PAGE;
                    case 1169:
                        return Name.TOKENIZED_STOCK_DETAIL_POSITION_ABOUT;
                    case 1170:
                        return Name.TOKENIZED_STOCK_DETAIL_DISCLOSURE;
                    case 1171:
                        return Name.PERPETUALS_PRIMER;
                    case 1172:
                        return Name.PERPETUALS_ASSESSMENT;
                    case 1173:
                        return Name.PERPETUALS_KNOWLEDGE_TEST;
                    case 1174:
                        return Name.PERPETUALS_ONBOARDING_STATUS;
                    case 1175:
                        return Name.PERPETUALS_AGREEMENT;
                    case 1176:
                        return Name.CORTEX_SDP_DIGEST_SOURCE_OVERFLOW;
                    case 1177:
                        return Name.PERPETUALS_TPSL_ENTRY;
                    case 1178:
                        return Name.PERPETUALS_TPSL_ERROR;
                    case 1179:
                        return Name.PERPETUALS_TPSL_HUB;
                    case 1180:
                        return Name.PERPETUALS_TPSL_CANCELLATIONS;
                    case 1181:
                        return Name.PERPETUALS_ORDER_ENTRY;
                    case 1182:
                        return Name.PERPETUALS_MANUAL_CONTRACT_DETAILS;
                    case 1183:
                        return Name.PERPETUALS_ORDER_TYPE;
                    case 1184:
                        return Name.PERPETUALS_ORDER_REVIEW;
                    case 1185:
                        return Name.PERPETUALS_ORDER_RECEIPT;
                    case 1186:
                        return Name.PERPETUALS_ORDER_HISTORY_DETAIL;
                    case 1187:
                        return Name.PERPETUALS_LIMIT_BUY_INTRO;
                    case 1188:
                        return Name.PERPETUALS_LIMIT_SELL_INTRO;
                    case 1189:
                        return Name.PERPETUALS_STOP_SELL_INTRO;
                    case 1190:
                        return Name.PERPETUALS_STOP_BUY_INTRO;
                    case 1191:
                        return Name.PERPETUALS_LIMIT_ORDER_PRICE;
                    case 1192:
                        return Name.PERPETUALS_LIMIT_ORDER_TIF;
                    case 1193:
                        return Name.PERPETUALS_STOP_ORDER_PRICE;
                    case 1194:
                        return Name.PERPETUALS_STOP_ORDER_TIF;
                    case 1195:
                        return Name.PERPETUALS_POSITION_HUB;
                    case 1196:
                        return Name.PERPETUALS_EXPLORE;
                    case 1197:
                        return Name.PERPETUALS_PNL_BALANCE_DETAIL;
                    case 1198:
                        return Name.PERPETUALS_DETAIL_PAGE;
                    case 1199:
                        return Name.PERPETUALS_LIQUIDATION_DETAILS;
                    case 1200:
                        return Name.PERPETUALS_MARGIN_EDIT;
                    case 1201:
                        return Name.PERPETUALS_MARGIN_EDIT_REVIEW;
                    case 1202:
                        return Name.PERPETUALS_CLOSE_POSITION;
                    case 1203:
                        return Name.CORTEX_DIGEST_ONBOARDING_SPLASH;
                    case 1204:
                        return Name.CORTEX_DIGEST_ONBOARDING_AGREEMENT;
                    case 1205:
                        return Name.CORTEX_DIGEST_ONBOARDING_SEARCH;
                    case 1206:
                        return Name.FEE_TIER_PUSH_NOTIF_UPSELL;
                    case 1207:
                        return Name.PERPETUALS_ORDER_FLOW_NUX;
                    case 1208:
                        return Name.OPTION_ONBOARDING_JA_APPLICATION_PENDING;
                    case 1209:
                        return Name.CRYPTO_ORDER_SELECT_PAYMENT_METHOD;
                    case 1210:
                        return Name.INTERNAL_TRANSFER_SELECTION;
                    case 1211:
                        return Name.SELF_DIRECTED_ACCOUNT_CONFIRMATION;
                    case 1212:
                        return Name.EDIT_ACCOUNT_NICKNAME;
                    case 1213:
                        return Name.ACCOUNT_FUNDING_OPTIONS;
                    case 1214:
                        return Name.IRA_MANAGEMENT_STYLE_SELECTION;
                    case 1215:
                        return Name.EVENT_CONTRACT_ATTESTATION;
                    case 1216:
                        return Name.EVENT_CONTRACT_HUB_V2;
                    case 1217:
                        return Name.BENEFICIARY_CHOOSE_EXISTING;
                    case 1218:
                        return Name.EVENT_CONTRACT_ORDER_FORM_RECEIPT;
                    case 1219:
                        return Name.EVENT_CONTRACT_ORDER_FORM_REVIEW;
                    case 1220:
                        return Name.MCW_CURRENY_CONVERSION_PAGE;
                    case 1221:
                        return Name.MCW_CONVERSION_SUCCESS_PAGE;
                    case 1222:
                        return Name.COMPANY_FINANCIALS_ONBOARDING;
                    case 1223:
                        return Name.COMPANY_FINANCIALS_ONBOARDING_SEARCH;
                    case 1224:
                        return Name.CRYPTO_TRADING_LADDER;
                    case 1225:
                        return Name.EQUITIES_TRADING_LADDER;
                    case 1226:
                        return Name.CORTEX_CDP_DIGEST;
                    case 1227:
                        return Name.CORTEX_CDP_DIGEST_BREAKING;
                    case 1228:
                        return Name.CORTEX_CDP_DIGEST_FEEDBACK;
                    case 1229:
                        return Name.CORTEX_CDP_DIGEST_SOURCE_OVERFLOW;
                    case 1230:
                        return Name.NCW_FUNDING_NETWORK_SELECTION;
                    case 1231:
                        return Name.I18N_CURRENCY_SELECTION;
                    case 1232:
                        return Name.I18N_METHOD_SELECTION;
                    case 1233:
                        return Name.I18N_ACCOUNT_INFO;
                    case 1234:
                        return Name.I18N_POST_DEPOSIT;
                    case 1235:
                        return Name.I18N_ACCOUNT_SELECTION;
                    case 1236:
                        return Name.I18N_TRANSFER_CREATE;
                    case 1237:
                        return Name.I18N_MEMO;
                    case 1238:
                        return Name.I18N_TRANSFER_REVIEW;
                    case 1239:
                        return Name.PROMOTION_EDUCATION;
                    case 1240:
                        return Name.STRATEGIES_RETURNS_HUB;
                    case 1241:
                        return Name.EDIT_ACCOUNT_NICKNAME_LIST;
                    case 1242:
                        return Name.COMBO_ORDER_DETAIL;
                    case 1243:
                        return Name.ADVISORY_ONBOARDING_QUESTIONNAIRE_REVIEW;
                    case 1244:
                        return Name.ADVISORY_ONBOARDING_QUESTIONNAIRE_INTRO;
                    case 1245:
                        return Name.ADVISORY_ONBOARDING_AGREEMENTS;
                    case 1246:
                        return Name.CRYPTO_TRANSFER_MANAGE_SAVED_ADDRESSES;
                    case 1247:
                        return Name.POST_TRANSFER_TIMELINE;
                    case 1248:
                        return Name.I18N_TRANSFER_ACCOUNT_INFO;
                    case 1249:
                        return Name.I18N_TRANSFER_ACCOUNT_SELECTION;
                    case 1250:
                        return Name.I18N_TRANSFER_CURRENCY_SELECTION;
                    case 1251:
                        return Name.I18N_TRANSFER_METHOD_SELECTION;
                    case 1252:
                        return Name.I18N_TRANSFER_MEMO;
                    case 1253:
                        return Name.WATCHLIST_REDESIGN;
                    case 1254:
                        return Name.RECURRING_EXTRA_CASH_SPLASH;
                    case 1255:
                        return Name.EXTRA_CASH_SETUP_ACCOUNT_SELECTION;
                    case 1256:
                        return Name.EXTRA_CASH_SETUP_SET_AMOUNT;
                    case 1257:
                        return Name.EXTRA_CASH_SETUP_REVIEW;
                    case 1258:
                        return Name.RECURRING_TRANSFERS_HUB;
                    case 1259:
                        return Name.WORKFLOW_CHECKLIST;
                    case 1260:
                        return Name.GOLD_YG_BACKUP_BILLING_SURFACE;
                    case 1261:
                        return Name.RESEARCH_REPORT;
                    case 1262:
                        return Name.FX_SWITCHER_FTUX;
                    case 1263:
                        return Name.ADVISORY_RETURNS_HUB;
                    case 1264:
                        return Name.PROMOTION_CONFIRMATION;
                    case 1265:
                        return Name.CRYPTO_EXPLORE_LEAF;
                    case 1266:
                        return Name.SETTINGS_INVESTING_INVESTOR_PROFILE_GRAPH_TAKEOVER_REVIEW;
                    case 1267:
                        return Name.TOKENIZED_LIMIT_BUY_INTRO;
                    case 1268:
                        return Name.TOKENIZED_LIMIT_SELL_INTRO;
                    case 1269:
                        return Name.CC_WAITLIST_POST_SIGNUP_INTRO;
                    case 1270:
                        return Name.CC_WAITLIST_POST_SIGNUP_JOINED;
                    case 1271:
                        return Name.CC_CHOOSE_BANK_ACCOUNT;
                    case 1272:
                        return Name.CC_ADDITIONAL_INFORMATION;
                    case 1273:
                        return Name.CRYPTO_TRANSFER_SEND_ADDRESS_ALLOWLIST;
                    case 1274:
                        return Name.CRYPTO_TRANSFER_ALLOWLIST_ENABLED_PRIMER;
                    case 1275:
                        return Name.CRYPTO_TRANSFER_ADD_SAVED_ADDRESS;
                    case 1276:
                        return Name.CRYPTO_TRANSFER_ADD_SAVED_ADDRESS_QR_SCANNER;
                    case 1277:
                        return Name.EVENT_CONTRACT_SELECTOR_SCREEN;
                    case 1278:
                        return Name.PORTFOLIO_DIGEST_DETAIL;
                    case 1279:
                        return Name.OPTION_L3_ENTRYPOINT_POST_TRADE_UPSELL;
                    case 1280:
                        return Name.GAME_DETAIL_PAGE;
                    case 1281:
                        return Name.OPTION_TRADING_SESSION;
                    case 1282:
                        return Name.ISA_CASH_TRANSFER_INTRO;
                    case 1283:
                        return Name.ISA_CASH_TRANSFER_SELECT_TYPE;
                    case 1284:
                        return Name.ISA_CASH_TRANSFER_SELECT_PROVIDER;
                    case 1285:
                        return Name.ISA_CASH_TRANSFER_MANUAL_PROVIDER;
                    case 1286:
                        return Name.ISA_CASH_TRANSFER_ACCOUNT_NUMBER;
                    case 1287:
                        return Name.ISA_CASH_TRANSFER_SORT_CODE;
                    case 1288:
                        return Name.ISA_CASH_TRANSFER_CONFIRM_DETAILS;
                    case 1289:
                        return Name.ISA_CASH_TRANSFER_UPDATE_YOUR_DETAILS;
                    case 1290:
                        return Name.ISA_CASH_TRANSFER_SELECT_AMOUNT;
                    case 1291:
                        return Name.ISA_CASH_TRANSFER_ONLY_CASH_INFO;
                    case 1292:
                        return Name.ISA_CASH_TRANSFER_ENTER_AMOUNT;
                    case 1293:
                        return Name.ISA_CASH_TRANSFER_CURRENT_TAX_YEAR;
                    case 1294:
                        return Name.ISA_CASH_TRANSFER_DECLARATION;
                    case 1295:
                        return Name.ISA_CASH_TRANSFER_REVIEW_AND_SUBMIT;
                    case 1296:
                        return Name.ISA_CASH_TRANSFER_REQUEST_RECEIVED;
                    case 1297:
                        return Name.EOY_GIVEAWAY_2025;
                    case 1298:
                        return Name.PORTFOLIO_DIGEST_SPLASH;
                    case 1299:
                        return Name.PORTFOLIO_DIGEST_AGREEMENT;
                    case 1300:
                        return Name.CORTEX_DIGEST_SOURCE_LIST;
                    case 1301:
                        return Name.EQUITIES_SUBZERO_ONBOARDING;
                    case 1302:
                        return Name.EQUITIES_SUBZERO_MARKETING;
                    case 1303:
                        return Name.ACATS_CUSTODIALS_REVIEW;
                    case 1304:
                        return Name.LADDER_MARKETING;
                    case 1305:
                        return Name.LADDER_MARKETING_SEARCH;
                    case 1306:
                        return Name.CRYPTO_TRANSFER_COST_BASIS_HUB;
                    case 1307:
                        return Name.CRYPTO_TRANSFER_COST_BASIS_DETAIL;
                    case 1308:
                        return Name.CRYPTO_TRANSFER_COST_BASIS_INPUT;
                    case 1309:
                        return Name.OPTION_MANUAL_REVIEW_KNOWLEDGE_CHECK;
                    case 1310:
                        return Name.API_TRADING_TERMS;
                    case 1311:
                        return Name.MARGIN_MAINTENANCE_TABLE_ON_MARGIN_CALL;
                    case 1312:
                        return Name.MARGIN_CALL_V2_CLOSE_POSITIONS_SUMMARY;
                    case 1313:
                        return Name.MARGIN_CALL_V2_MARKET_ORDER;
                    case 1314:
                        return Name.RETIREMENT_401K_FINDER_INTERSTITIAL;
                    case 1315:
                        return Name.RETIREMENT_401K_FINDER_RESULTS;
                    case 1316:
                        return Name.RETIREMENT_401K_FINDER_ACCOUNT_DETAILS;
                    case 1317:
                        return Name.RETIREMENT_401K_FINDER_NO_RESULTS;
                    case 1318:
                        return Name.RETIREMENT_401K_FINDER_NOT_SUPPORTED;
                    case 1319:
                        return Name.TRANSFER_INFO;
                    case 1320:
                        return Name.CX_CONCIERGE_PLUS_LANDING;
                    case 1321:
                        return Name.CX_CONCIERGE_PLUS_ONBOARDING;
                    case 1322:
                        return Name.CX_CONCIERGE_PLUS_HUB;
                    case 1323:
                        return Name.CX_CONCIERGE_PLUS_TAX_ONBOARDING;
                    case 1324:
                        return Name.CX_CONCIERGE_PLUS_ESTATE_ONBOARDING;
                    case 1325:
                        return Name.CX_CONCIERGE_PLUS_TAX;
                    case 1326:
                        return Name.CX_CONCIERGE_PLUS_ESTATE;
                    case 1327:
                        return Name.ACATS_TRANSFER_INFO;
                    case 1328:
                        return Name.SOCIAL_HOME;
                    case 1329:
                        return Name.POST_DETAIL;
                    case 1330:
                        return Name.TRADE_HISTORY;
                    case 1331:
                        return Name.USER_PROFILE;
                    case 1332:
                        return Name.QUICK_TRADE_ACTION_SHEET;
                    case 1333:
                        return Name.ACTIVITY_FEED;
                    case 1334:
                        return Name.SOCIAL_SEARCH_SCREEN;
                    case 1335:
                        return Name.SOCIAL_POST_COMPOSER;
                    case 1336:
                        return Name.SOCIAL_ONBOARDING_PAGE;
                    case 1337:
                        return Name.SOCIAL_PROFILE_SETTINGS;
                    case 1338:
                        return Name.INVESTMENTS_TRACKER_FTUX_TRACK_ALL_ASSETS;
                    case 1339:
                        return Name.INVESTMENTS_TRACKER_FTUX_ASSET_ALLOCATION;
                    case 1340:
                        return Name.INVESTMENTS_TRACKER_FTUX_ADDITIONAL_INFO;
                    case 1341:
                        return Name.INVESTMENTS_TRACKER_PERFORMANCE_VIEW;
                    case 1342:
                        return Name.INVESTMENTS_TRACKER_ACCOUNT_LINK_AGREEMENT;
                    case 1343:
                        return Name.INVESTMENTS_TRACKER_ACCOUNT_DETAILS;
                    case 1344:
                        return Name.INVESTMENTS_TRACKER_ALLOCATIONS_VIEW;
                    case 1345:
                        return Name.INVESTMENTS_TRACKER_TOOLTIP_SHEET_ADD_ACCOUNT;
                    case 1346:
                        return Name.INVESTMENTS_TRACKER_SETTINGS;
                    case 1347:
                        return Name.INVESTMENTS_TRACKER_ACCOUNT_REMOVAL_SHEET;
                    case 1348:
                        return Name.INVESTMENTS_TRACKER_REMOVAL_CONFIRMATION_SHEET;
                    case 1349:
                        return Name.PERPETUALS_ORDER_EDIT_LEVERAGE;
                    case 1350:
                        return Name.PERPETUALS_POSITION_EDIT_LEVERAGE;
                    case 1351:
                        return Name.ACATS_IN_INFO_REVIEW;
                    case 1352:
                        return Name.TAX_LOSS_HARVEST_DASHBOARD;
                    case 1353:
                        return Name.TAX_LOSS_HARVEST_NUX;
                    case 1354:
                        return Name.TAX_LOSS_HARVEST_CUSTOMIZE_INTRO;
                    case 1355:
                        return Name.TAX_LOSS_HARVEST_CHOOSE_ACCOUNTS;
                    case 1356:
                        return Name.TAX_LOSS_HARVEST_LOADING_OPTIONS;
                    case 1357:
                        return Name.TAX_LOSS_HARVEST_OPTIONS_INTRO;
                    case 1358:
                        return Name.TAX_LOSS_HARVEST_CHOOSE_OPTION;
                    case 1359:
                        return Name.TAX_LOSS_HARVEST_CUSTOMIZE_REVIEW;
                    case 1360:
                        return Name.TAX_LOSS_HARVEST_CUSTOMIZE_CELEBRATION;
                    case 1361:
                        return Name.GAINS_AND_LOSSES;
                    case 1362:
                        return Name.ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TRANSFER_INTRO;
                    case 1363:
                        return Name.ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TRANSFER_DETAIL;
                    case 1364:
                        return Name.ACATS_CRYPTO_MIGRATION_FLOW_ASSET_REVIEW;
                    case 1365:
                        return Name.ACATS_CRYPTO_MIGRATION_FLOW_ASSET_SUBMIT;
                    case 1366:
                        return Name.ACATS_CRYPTO_MIGRATION_FLOW_ASSET_CONFIRMATION;
                    case 1367:
                        return Name.ACATS_CRYPTO_MIGRATION_FLOW_ASSET_TXN_DETAIL;
                    case 1368:
                        return Name.ACATS_CRYPTO_MIGRATION_FLOW_ERROR_WITH_CX;
                    case 1369:
                        return Name.ACATS_CRYPTO_MIGRATION_FLOW_ERROR;
                    case 1370:
                        return Name.INTEREST_ENROLLMENT;
                    case 1371:
                        return Name.INTEREST_SETTINGS;
                    case 1372:
                        return Name.CRYPTO_QUICK_TRADE_SHEET;
                    case 1373:
                        return Name.ACATS_IN_TRANSFER_INFO;
                    case 1374:
                        return Name.ACATS_IN_CONFIRM_ACCOUNT_INFO;
                    case 1375:
                        return Name.ACATS_IN_ACCOUNT_INFO_MISMATCH;
                }
            }
        }

        public static Name valueOf(String str) {
            return (Name) Enum.valueOf(Name.class, str);
        }

        public static Name[] values() {
            return (Name[]) $VALUES.clone();
        }
    }
}
