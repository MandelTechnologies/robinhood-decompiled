package com.robinhood.rosetta.eventlogging;

import com.robinhood.rosetta.eventlogging.ConciergeSupportContext;
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

/* compiled from: ConciergeSupportContext.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u0015\u0016B\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0002H\u0017J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u001a\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ConciergeSupportContext;", "Lcom/squareup/wire/Message;", "", "onboarding_screen", "Lcom/robinhood/rosetta/eventlogging/ConciergeSupportContext$OnboardingScreen;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/ConciergeSupportContext$OnboardingScreen;Lokio/ByteString;)V", "getOnboarding_screen", "()Lcom/robinhood/rosetta/eventlogging/ConciergeSupportContext$OnboardingScreen;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "OnboardingScreen", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class ConciergeSupportContext extends Message {

    @JvmField
    public static final ProtoAdapter<ConciergeSupportContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ConciergeSupportContext$OnboardingScreen#ADAPTER", jsonName = "onboardingScreen", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final OnboardingScreen onboarding_screen;

    /* JADX WARN: Multi-variable type inference failed */
    public ConciergeSupportContext() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24140newBuilder();
    }

    public final OnboardingScreen getOnboarding_screen() {
        return this.onboarding_screen;
    }

    public /* synthetic */ ConciergeSupportContext(OnboardingScreen onboardingScreen, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? OnboardingScreen.WELCOME : onboardingScreen, (i & 2) != 0 ? ByteString.EMPTY : byteString);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConciergeSupportContext(OnboardingScreen onboarding_screen, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(onboarding_screen, "onboarding_screen");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.onboarding_screen = onboarding_screen;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24140newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof ConciergeSupportContext)) {
            return false;
        }
        ConciergeSupportContext conciergeSupportContext = (ConciergeSupportContext) other;
        return Intrinsics.areEqual(unknownFields(), conciergeSupportContext.unknownFields()) && this.onboarding_screen == conciergeSupportContext.onboarding_screen;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (unknownFields().hashCode() * 37) + this.onboarding_screen.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("onboarding_screen=" + this.onboarding_screen);
        return CollectionsKt.joinToString$default(arrayList, ", ", "ConciergeSupportContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ ConciergeSupportContext copy$default(ConciergeSupportContext conciergeSupportContext, OnboardingScreen onboardingScreen, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            onboardingScreen = conciergeSupportContext.onboarding_screen;
        }
        if ((i & 2) != 0) {
            byteString = conciergeSupportContext.unknownFields();
        }
        return conciergeSupportContext.copy(onboardingScreen, byteString);
    }

    public final ConciergeSupportContext copy(OnboardingScreen onboarding_screen, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(onboarding_screen, "onboarding_screen");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new ConciergeSupportContext(onboarding_screen, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ConciergeSupportContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<ConciergeSupportContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.ConciergeSupportContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(ConciergeSupportContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                return value.getOnboarding_screen() != ConciergeSupportContext.OnboardingScreen.WELCOME ? size + ConciergeSupportContext.OnboardingScreen.ADAPTER.encodedSizeWithTag(1, value.getOnboarding_screen()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, ConciergeSupportContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getOnboarding_screen() != ConciergeSupportContext.OnboardingScreen.WELCOME) {
                    ConciergeSupportContext.OnboardingScreen.ADAPTER.encodeWithTag(writer, 1, (int) value.getOnboarding_screen());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, ConciergeSupportContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getOnboarding_screen() != ConciergeSupportContext.OnboardingScreen.WELCOME) {
                    ConciergeSupportContext.OnboardingScreen.ADAPTER.encodeWithTag(writer, 1, (int) value.getOnboarding_screen());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public ConciergeSupportContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                ConciergeSupportContext.OnboardingScreen onboardingScreenDecode = ConciergeSupportContext.OnboardingScreen.WELCOME;
                long jBeginMessage = reader.beginMessage();
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new ConciergeSupportContext(onboardingScreenDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            onboardingScreenDecode = ConciergeSupportContext.OnboardingScreen.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public ConciergeSupportContext redact(ConciergeSupportContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return ConciergeSupportContext.copy$default(value, null, ByteString.EMPTY, 1, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ConciergeSupportContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ConciergeSupportContext$OnboardingScreen;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "WELCOME", "VIDEO", "ELIGIBILITY", "PERKS", "PERKS_DEDICATED_EXPERT", "PERKS_PRIORITY_SUPPORT", "LANDING", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OnboardingScreen implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ OnboardingScreen[] $VALUES;

        @JvmField
        public static final ProtoAdapter<OnboardingScreen> ADAPTER;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;

        @Deprecated
        public static final OnboardingScreen ELIGIBILITY;
        public static final OnboardingScreen LANDING;
        public static final OnboardingScreen PERKS;
        public static final OnboardingScreen PERKS_DEDICATED_EXPERT;
        public static final OnboardingScreen PERKS_PRIORITY_SUPPORT;
        public static final OnboardingScreen VIDEO;

        @Deprecated
        public static final OnboardingScreen WELCOME;
        private final int value;

        private static final /* synthetic */ OnboardingScreen[] $values() {
            return new OnboardingScreen[]{WELCOME, VIDEO, ELIGIBILITY, PERKS, PERKS_DEDICATED_EXPERT, PERKS_PRIORITY_SUPPORT, LANDING};
        }

        @JvmStatic
        public static final OnboardingScreen fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<OnboardingScreen> getEntries() {
            return $ENTRIES;
        }

        private OnboardingScreen(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final OnboardingScreen onboardingScreen = new OnboardingScreen("WELCOME", 0, 0);
            WELCOME = onboardingScreen;
            VIDEO = new OnboardingScreen("VIDEO", 1, 1);
            ELIGIBILITY = new OnboardingScreen("ELIGIBILITY", 2, 2);
            PERKS = new OnboardingScreen("PERKS", 3, 30);
            PERKS_DEDICATED_EXPERT = new OnboardingScreen("PERKS_DEDICATED_EXPERT", 4, 31);
            PERKS_PRIORITY_SUPPORT = new OnboardingScreen("PERKS_PRIORITY_SUPPORT", 5, 32);
            LANDING = new OnboardingScreen("LANDING", 6, 4);
            OnboardingScreen[] onboardingScreenArr$values = $values();
            $VALUES = onboardingScreenArr$values;
            $ENTRIES = EnumEntries2.enumEntries(onboardingScreenArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(OnboardingScreen.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<OnboardingScreen>(orCreateKotlinClass, syntax, onboardingScreen) { // from class: com.robinhood.rosetta.eventlogging.ConciergeSupportContext$OnboardingScreen$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public ConciergeSupportContext.OnboardingScreen fromValue(int value) {
                    return ConciergeSupportContext.OnboardingScreen.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: ConciergeSupportContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/ConciergeSupportContext$OnboardingScreen$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/ConciergeSupportContext$OnboardingScreen;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final OnboardingScreen fromValue(int value) {
                if (value == 0) {
                    return OnboardingScreen.WELCOME;
                }
                if (value == 1) {
                    return OnboardingScreen.VIDEO;
                }
                if (value == 2) {
                    return OnboardingScreen.ELIGIBILITY;
                }
                if (value != 4) {
                    switch (value) {
                        case 30:
                            return OnboardingScreen.PERKS;
                        case 31:
                            return OnboardingScreen.PERKS_DEDICATED_EXPERT;
                        case 32:
                            return OnboardingScreen.PERKS_PRIORITY_SUPPORT;
                        default:
                            return null;
                    }
                }
                return OnboardingScreen.LANDING;
            }
        }

        public static OnboardingScreen valueOf(String str) {
            return (OnboardingScreen) Enum.valueOf(OnboardingScreen.class, str);
        }

        public static OnboardingScreen[] values() {
            return (OnboardingScreen[]) $VALUES.clone();
        }
    }
}
