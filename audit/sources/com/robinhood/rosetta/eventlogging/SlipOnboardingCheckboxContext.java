package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.educationtour.EducationTourScreenNames;
import com.robinhood.rosetta.eventlogging.SlipOnboardingCheckboxContext;
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

/* compiled from: SlipOnboardingCheckboxContext.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002\u001b\u001cB9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J8\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\tR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext;", "Lcom/squareup/wire/Message;", "", "individual", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState;", "ira_roth", "ira_traditional", "joint_tenancy_with_ros", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState;Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState;Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState;Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState;Lokio/ByteString;)V", "getIndividual", "()Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState;", "getIra_roth", "getIra_traditional", "getJoint_tenancy_with_ros", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "CheckboxState", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class SlipOnboardingCheckboxContext extends Message {

    @JvmField
    public static final ProtoAdapter<SlipOnboardingCheckboxContext> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.SlipOnboardingCheckboxContext$CheckboxState#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final CheckboxState individual;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.SlipOnboardingCheckboxContext$CheckboxState#ADAPTER", jsonName = "iraRoth", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final CheckboxState ira_roth;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.SlipOnboardingCheckboxContext$CheckboxState#ADAPTER", jsonName = "iraTraditional", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final CheckboxState ira_traditional;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.SlipOnboardingCheckboxContext$CheckboxState#ADAPTER", jsonName = "jointTenancyWithRos", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final CheckboxState joint_tenancy_with_ros;

    public SlipOnboardingCheckboxContext() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24566newBuilder();
    }

    public final CheckboxState getIndividual() {
        return this.individual;
    }

    public /* synthetic */ SlipOnboardingCheckboxContext(CheckboxState checkboxState, CheckboxState checkboxState2, CheckboxState checkboxState3, CheckboxState checkboxState4, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CheckboxState.UNSPECIFIED : checkboxState, (i & 2) != 0 ? CheckboxState.UNSPECIFIED : checkboxState2, (i & 4) != 0 ? CheckboxState.UNSPECIFIED : checkboxState3, (i & 8) != 0 ? CheckboxState.UNSPECIFIED : checkboxState4, (i & 16) != 0 ? ByteString.EMPTY : byteString);
    }

    public final CheckboxState getIra_roth() {
        return this.ira_roth;
    }

    public final CheckboxState getIra_traditional() {
        return this.ira_traditional;
    }

    public final CheckboxState getJoint_tenancy_with_ros() {
        return this.joint_tenancy_with_ros;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SlipOnboardingCheckboxContext(CheckboxState individual, CheckboxState ira_roth, CheckboxState ira_traditional, CheckboxState joint_tenancy_with_ros, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(individual, "individual");
        Intrinsics.checkNotNullParameter(ira_roth, "ira_roth");
        Intrinsics.checkNotNullParameter(ira_traditional, "ira_traditional");
        Intrinsics.checkNotNullParameter(joint_tenancy_with_ros, "joint_tenancy_with_ros");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.individual = individual;
        this.ira_roth = ira_roth;
        this.ira_traditional = ira_traditional;
        this.joint_tenancy_with_ros = joint_tenancy_with_ros;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24566newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof SlipOnboardingCheckboxContext)) {
            return false;
        }
        SlipOnboardingCheckboxContext slipOnboardingCheckboxContext = (SlipOnboardingCheckboxContext) other;
        return Intrinsics.areEqual(unknownFields(), slipOnboardingCheckboxContext.unknownFields()) && this.individual == slipOnboardingCheckboxContext.individual && this.ira_roth == slipOnboardingCheckboxContext.ira_roth && this.ira_traditional == slipOnboardingCheckboxContext.ira_traditional && this.joint_tenancy_with_ros == slipOnboardingCheckboxContext.joint_tenancy_with_ros;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((unknownFields().hashCode() * 37) + this.individual.hashCode()) * 37) + this.ira_roth.hashCode()) * 37) + this.ira_traditional.hashCode()) * 37) + this.joint_tenancy_with_ros.hashCode();
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("individual=" + this.individual);
        arrayList.add("ira_roth=" + this.ira_roth);
        arrayList.add("ira_traditional=" + this.ira_traditional);
        arrayList.add("joint_tenancy_with_ros=" + this.joint_tenancy_with_ros);
        return CollectionsKt.joinToString$default(arrayList, ", ", "SlipOnboardingCheckboxContext{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ SlipOnboardingCheckboxContext copy$default(SlipOnboardingCheckboxContext slipOnboardingCheckboxContext, CheckboxState checkboxState, CheckboxState checkboxState2, CheckboxState checkboxState3, CheckboxState checkboxState4, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            checkboxState = slipOnboardingCheckboxContext.individual;
        }
        if ((i & 2) != 0) {
            checkboxState2 = slipOnboardingCheckboxContext.ira_roth;
        }
        if ((i & 4) != 0) {
            checkboxState3 = slipOnboardingCheckboxContext.ira_traditional;
        }
        if ((i & 8) != 0) {
            checkboxState4 = slipOnboardingCheckboxContext.joint_tenancy_with_ros;
        }
        if ((i & 16) != 0) {
            byteString = slipOnboardingCheckboxContext.unknownFields();
        }
        ByteString byteString2 = byteString;
        CheckboxState checkboxState5 = checkboxState3;
        return slipOnboardingCheckboxContext.copy(checkboxState, checkboxState2, checkboxState5, checkboxState4, byteString2);
    }

    public final SlipOnboardingCheckboxContext copy(CheckboxState individual, CheckboxState ira_roth, CheckboxState ira_traditional, CheckboxState joint_tenancy_with_ros, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(individual, "individual");
        Intrinsics.checkNotNullParameter(ira_roth, "ira_roth");
        Intrinsics.checkNotNullParameter(ira_traditional, "ira_traditional");
        Intrinsics.checkNotNullParameter(joint_tenancy_with_ros, "joint_tenancy_with_ros");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new SlipOnboardingCheckboxContext(individual, ira_roth, ira_traditional, joint_tenancy_with_ros, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SlipOnboardingCheckboxContext.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<SlipOnboardingCheckboxContext>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.SlipOnboardingCheckboxContext$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(SlipOnboardingCheckboxContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                SlipOnboardingCheckboxContext.CheckboxState individual = value.getIndividual();
                SlipOnboardingCheckboxContext.CheckboxState checkboxState = SlipOnboardingCheckboxContext.CheckboxState.UNSPECIFIED;
                if (individual != checkboxState) {
                    size += SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.encodedSizeWithTag(1, value.getIndividual());
                }
                if (value.getIra_roth() != checkboxState) {
                    size += SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.encodedSizeWithTag(2, value.getIra_roth());
                }
                if (value.getIra_traditional() != checkboxState) {
                    size += SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.encodedSizeWithTag(3, value.getIra_traditional());
                }
                return value.getJoint_tenancy_with_ros() != checkboxState ? size + SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.encodedSizeWithTag(4, value.getJoint_tenancy_with_ros()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, SlipOnboardingCheckboxContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                SlipOnboardingCheckboxContext.CheckboxState individual = value.getIndividual();
                SlipOnboardingCheckboxContext.CheckboxState checkboxState = SlipOnboardingCheckboxContext.CheckboxState.UNSPECIFIED;
                if (individual != checkboxState) {
                    SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.encodeWithTag(writer, 1, (int) value.getIndividual());
                }
                if (value.getIra_roth() != checkboxState) {
                    SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.encodeWithTag(writer, 2, (int) value.getIra_roth());
                }
                if (value.getIra_traditional() != checkboxState) {
                    SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.encodeWithTag(writer, 3, (int) value.getIra_traditional());
                }
                if (value.getJoint_tenancy_with_ros() != checkboxState) {
                    SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.encodeWithTag(writer, 4, (int) value.getJoint_tenancy_with_ros());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, SlipOnboardingCheckboxContext value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                SlipOnboardingCheckboxContext.CheckboxState joint_tenancy_with_ros = value.getJoint_tenancy_with_ros();
                SlipOnboardingCheckboxContext.CheckboxState checkboxState = SlipOnboardingCheckboxContext.CheckboxState.UNSPECIFIED;
                if (joint_tenancy_with_ros != checkboxState) {
                    SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.encodeWithTag(writer, 4, (int) value.getJoint_tenancy_with_ros());
                }
                if (value.getIra_traditional() != checkboxState) {
                    SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.encodeWithTag(writer, 3, (int) value.getIra_traditional());
                }
                if (value.getIra_roth() != checkboxState) {
                    SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.encodeWithTag(writer, 2, (int) value.getIra_roth());
                }
                if (value.getIndividual() != checkboxState) {
                    SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.encodeWithTag(writer, 1, (int) value.getIndividual());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public SlipOnboardingCheckboxContext decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                SlipOnboardingCheckboxContext.CheckboxState checkboxState = SlipOnboardingCheckboxContext.CheckboxState.UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                SlipOnboardingCheckboxContext.CheckboxState checkboxStateDecode = checkboxState;
                SlipOnboardingCheckboxContext.CheckboxState checkboxStateDecode2 = checkboxStateDecode;
                SlipOnboardingCheckboxContext.CheckboxState checkboxStateDecode3 = checkboxStateDecode2;
                SlipOnboardingCheckboxContext.CheckboxState checkboxStateDecode4 = checkboxStateDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new SlipOnboardingCheckboxContext(checkboxStateDecode, checkboxStateDecode2, checkboxStateDecode3, checkboxStateDecode4, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        try {
                            checkboxStateDecode = SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (iNextTag == 2) {
                        try {
                            checkboxStateDecode2 = SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                        }
                    } else if (iNextTag == 3) {
                        try {
                            checkboxStateDecode3 = SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e3) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e3.value));
                        }
                    } else if (iNextTag == 4) {
                        try {
                            checkboxStateDecode4 = SlipOnboardingCheckboxContext.CheckboxState.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e4) {
                            reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e4.value));
                        }
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public SlipOnboardingCheckboxContext redact(SlipOnboardingCheckboxContext value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return SlipOnboardingCheckboxContext.copy$default(value, null, null, null, null, ByteString.EMPTY, 15, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SlipOnboardingCheckboxContext.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", EducationTourScreenNames.UNSPECIFIED_SCREEN, "NONE", "UNCHECKED", "CHECKED", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CheckboxState implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ CheckboxState[] $VALUES;

        @JvmField
        public static final ProtoAdapter<CheckboxState> ADAPTER;
        public static final CheckboxState CHECKED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final CheckboxState NONE;
        public static final CheckboxState UNCHECKED;
        public static final CheckboxState UNSPECIFIED;
        private final int value;

        private static final /* synthetic */ CheckboxState[] $values() {
            return new CheckboxState[]{UNSPECIFIED, NONE, UNCHECKED, CHECKED};
        }

        @JvmStatic
        public static final CheckboxState fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<CheckboxState> getEntries() {
            return $ENTRIES;
        }

        private CheckboxState(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final CheckboxState checkboxState = new CheckboxState(EducationTourScreenNames.UNSPECIFIED_SCREEN, 0, 0);
            UNSPECIFIED = checkboxState;
            NONE = new CheckboxState("NONE", 1, 1);
            UNCHECKED = new CheckboxState("UNCHECKED", 2, 2);
            CHECKED = new CheckboxState("CHECKED", 3, 3);
            CheckboxState[] checkboxStateArr$values = $values();
            $VALUES = checkboxStateArr$values;
            $ENTRIES = EnumEntries2.enumEntries(checkboxStateArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(CheckboxState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<CheckboxState>(orCreateKotlinClass, syntax, checkboxState) { // from class: com.robinhood.rosetta.eventlogging.SlipOnboardingCheckboxContext$CheckboxState$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public SlipOnboardingCheckboxContext.CheckboxState fromValue(int value) {
                    return SlipOnboardingCheckboxContext.CheckboxState.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: SlipOnboardingCheckboxContext.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/SlipOnboardingCheckboxContext$CheckboxState;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final CheckboxState fromValue(int value) {
                if (value == 0) {
                    return CheckboxState.UNSPECIFIED;
                }
                if (value == 1) {
                    return CheckboxState.NONE;
                }
                if (value == 2) {
                    return CheckboxState.UNCHECKED;
                }
                if (value != 3) {
                    return null;
                }
                return CheckboxState.CHECKED;
            }
        }

        public static CheckboxState valueOf(String str) {
            return (CheckboxState) Enum.valueOf(CheckboxState.class, str);
        }

        public static CheckboxState[] values() {
            return (CheckboxState[]) $VALUES.clone();
        }
    }
}
