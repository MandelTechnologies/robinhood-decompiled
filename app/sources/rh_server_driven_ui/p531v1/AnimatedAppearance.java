package rh_server_driven_ui.p531v1;

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
import rh_server_driven_ui.p531v1.AnimatedAppearance;

/* compiled from: AnimatedAppearance.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\u0018\u0000 ,2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0006,-./01Bo\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\b\u0010#\u001a\u00020\u0002H\u0017J\u0013\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'H\u0096\u0002J\b\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020\nH\u0016Jn\u0010+\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0011\u001a\u00020\u0012R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u0018¨\u00062"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearance;", "Lcom/squareup/wire/Message;", "", "content", "Lrh_server_driven_ui/v1/UIComponent;", "initial_state", "Lrh_server_driven_ui/v1/AnimatedAppearance$InitialState;", "animation_data", "Lrh_server_driven_ui/v1/AnimatedAppearance$AnimationData;", "identifier", "", "on_completion", "Lrh_server_driven_ui/v1/Action;", "final_state", "Lrh_server_driven_ui/v1/AnimatedAppearance$FinalState;", "disappearing_animation_data", "disappeared_state", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/UIComponent;Lrh_server_driven_ui/v1/AnimatedAppearance$InitialState;Lrh_server_driven_ui/v1/AnimatedAppearance$AnimationData;Ljava/lang/String;Lrh_server_driven_ui/v1/Action;Lrh_server_driven_ui/v1/AnimatedAppearance$FinalState;Lrh_server_driven_ui/v1/AnimatedAppearance$AnimationData;Lrh_server_driven_ui/v1/AnimatedAppearance$InitialState;Lokio/ByteString;)V", "getContent", "()Lrh_server_driven_ui/v1/UIComponent;", "getInitial_state", "()Lrh_server_driven_ui/v1/AnimatedAppearance$InitialState;", "getAnimation_data", "()Lrh_server_driven_ui/v1/AnimatedAppearance$AnimationData;", "getIdentifier", "()Ljava/lang/String;", "getOn_completion", "()Lrh_server_driven_ui/v1/Action;", "getFinal_state", "()Lrh_server_driven_ui/v1/AnimatedAppearance$FinalState;", "getDisappearing_animation_data", "getDisappeared_state", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "InitialState", "FinalState", "Translation", "AnimationData", "Curve", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes25.dex */
public final class AnimatedAppearance extends Message {

    @JvmField
    public static final ProtoAdapter<AnimatedAppearance> ADAPTER;

    @WireField(adapter = "rh_server_driven_ui.v1.AnimatedAppearance$AnimationData#ADAPTER", jsonName = "animationData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final AnimationData animation_data;

    @WireField(adapter = "rh_server_driven_ui.v1.UIComponent#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final UIComponent content;

    @WireField(adapter = "rh_server_driven_ui.v1.AnimatedAppearance$InitialState#ADAPTER", jsonName = "disappearedState", schemaIndex = 7, tag = 8)
    private final InitialState disappeared_state;

    @WireField(adapter = "rh_server_driven_ui.v1.AnimatedAppearance$AnimationData#ADAPTER", jsonName = "disappearingAnimationData", schemaIndex = 6, tag = 7)
    private final AnimationData disappearing_animation_data;

    @WireField(adapter = "rh_server_driven_ui.v1.AnimatedAppearance$FinalState#ADAPTER", jsonName = "finalState", schemaIndex = 5, tag = 6)
    private final FinalState final_state;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String identifier;

    @WireField(adapter = "rh_server_driven_ui.v1.AnimatedAppearance$InitialState#ADAPTER", jsonName = "initialState", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final InitialState initial_state;

    @WireField(adapter = "rh_server_driven_ui.v1.Action#ADAPTER", jsonName = "onCompletion", schemaIndex = 4, tag = 5)
    private final Action on_completion;

    public AnimatedAppearance() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m29657newBuilder();
    }

    public final UIComponent getContent() {
        return this.content;
    }

    public final InitialState getInitial_state() {
        return this.initial_state;
    }

    public final AnimationData getAnimation_data() {
        return this.animation_data;
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public /* synthetic */ AnimatedAppearance(UIComponent uIComponent, InitialState initialState, AnimationData animationData, String str, Action action, FinalState finalState, AnimationData animationData2, InitialState initialState2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : uIComponent, (i & 2) != 0 ? null : initialState, (i & 4) != 0 ? null : animationData, (i & 8) != 0 ? "" : str, (i & 16) != 0 ? null : action, (i & 32) != 0 ? null : finalState, (i & 64) != 0 ? null : animationData2, (i & 128) != 0 ? null : initialState2, (i & 256) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Action getOn_completion() {
        return this.on_completion;
    }

    public final FinalState getFinal_state() {
        return this.final_state;
    }

    public final AnimationData getDisappearing_animation_data() {
        return this.disappearing_animation_data;
    }

    public final InitialState getDisappeared_state() {
        return this.disappeared_state;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AnimatedAppearance(UIComponent uIComponent, InitialState initialState, AnimationData animationData, String identifier, Action action, FinalState finalState, AnimationData animationData2, InitialState initialState2, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.content = uIComponent;
        this.initial_state = initialState;
        this.animation_data = animationData;
        this.identifier = identifier;
        this.on_completion = action;
        this.final_state = finalState;
        this.disappearing_animation_data = animationData2;
        this.disappeared_state = initialState2;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m29657newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof AnimatedAppearance)) {
            return false;
        }
        AnimatedAppearance animatedAppearance = (AnimatedAppearance) other;
        return Intrinsics.areEqual(unknownFields(), animatedAppearance.unknownFields()) && Intrinsics.areEqual(this.content, animatedAppearance.content) && Intrinsics.areEqual(this.initial_state, animatedAppearance.initial_state) && Intrinsics.areEqual(this.animation_data, animatedAppearance.animation_data) && Intrinsics.areEqual(this.identifier, animatedAppearance.identifier) && Intrinsics.areEqual(this.on_completion, animatedAppearance.on_completion) && Intrinsics.areEqual(this.final_state, animatedAppearance.final_state) && Intrinsics.areEqual(this.disappearing_animation_data, animatedAppearance.disappearing_animation_data) && Intrinsics.areEqual(this.disappeared_state, animatedAppearance.disappeared_state);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = unknownFields().hashCode() * 37;
        UIComponent uIComponent = this.content;
        int iHashCode2 = (iHashCode + (uIComponent != null ? uIComponent.hashCode() : 0)) * 37;
        InitialState initialState = this.initial_state;
        int iHashCode3 = (iHashCode2 + (initialState != null ? initialState.hashCode() : 0)) * 37;
        AnimationData animationData = this.animation_data;
        int iHashCode4 = (((iHashCode3 + (animationData != null ? animationData.hashCode() : 0)) * 37) + this.identifier.hashCode()) * 37;
        Action action = this.on_completion;
        int iHashCode5 = (iHashCode4 + (action != null ? action.hashCode() : 0)) * 37;
        FinalState finalState = this.final_state;
        int iHashCode6 = (iHashCode5 + (finalState != null ? finalState.hashCode() : 0)) * 37;
        AnimationData animationData2 = this.disappearing_animation_data;
        int iHashCode7 = (iHashCode6 + (animationData2 != null ? animationData2.hashCode() : 0)) * 37;
        InitialState initialState2 = this.disappeared_state;
        int iHashCode8 = iHashCode7 + (initialState2 != null ? initialState2.hashCode() : 0);
        this.hashCode = iHashCode8;
        return iHashCode8;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        UIComponent uIComponent = this.content;
        if (uIComponent != null) {
            arrayList.add("content=" + uIComponent);
        }
        InitialState initialState = this.initial_state;
        if (initialState != null) {
            arrayList.add("initial_state=" + initialState);
        }
        AnimationData animationData = this.animation_data;
        if (animationData != null) {
            arrayList.add("animation_data=" + animationData);
        }
        arrayList.add("identifier=" + Internal.sanitize(this.identifier));
        Action action = this.on_completion;
        if (action != null) {
            arrayList.add("on_completion=" + action);
        }
        FinalState finalState = this.final_state;
        if (finalState != null) {
            arrayList.add("final_state=" + finalState);
        }
        AnimationData animationData2 = this.disappearing_animation_data;
        if (animationData2 != null) {
            arrayList.add("disappearing_animation_data=" + animationData2);
        }
        InitialState initialState2 = this.disappeared_state;
        if (initialState2 != null) {
            arrayList.add("disappeared_state=" + initialState2);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "AnimatedAppearance{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ AnimatedAppearance copy$default(AnimatedAppearance animatedAppearance, UIComponent uIComponent, InitialState initialState, AnimationData animationData, String str, Action action, FinalState finalState, AnimationData animationData2, InitialState initialState2, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            uIComponent = animatedAppearance.content;
        }
        if ((i & 2) != 0) {
            initialState = animatedAppearance.initial_state;
        }
        if ((i & 4) != 0) {
            animationData = animatedAppearance.animation_data;
        }
        if ((i & 8) != 0) {
            str = animatedAppearance.identifier;
        }
        if ((i & 16) != 0) {
            action = animatedAppearance.on_completion;
        }
        if ((i & 32) != 0) {
            finalState = animatedAppearance.final_state;
        }
        if ((i & 64) != 0) {
            animationData2 = animatedAppearance.disappearing_animation_data;
        }
        if ((i & 128) != 0) {
            initialState2 = animatedAppearance.disappeared_state;
        }
        if ((i & 256) != 0) {
            byteString = animatedAppearance.unknownFields();
        }
        InitialState initialState3 = initialState2;
        ByteString byteString2 = byteString;
        FinalState finalState2 = finalState;
        AnimationData animationData3 = animationData2;
        Action action2 = action;
        AnimationData animationData4 = animationData;
        return animatedAppearance.copy(uIComponent, initialState, animationData4, str, action2, finalState2, animationData3, initialState3, byteString2);
    }

    public final AnimatedAppearance copy(UIComponent content, InitialState initial_state, AnimationData animation_data, String identifier, Action on_completion, FinalState final_state, AnimationData disappearing_animation_data, InitialState disappeared_state, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new AnimatedAppearance(content, initial_state, animation_data, identifier, on_completion, final_state, disappearing_animation_data, disappeared_state, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AnimatedAppearance.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<AnimatedAppearance>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.AnimatedAppearance$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(AnimatedAppearance value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getContent() != null) {
                    size += UIComponent.ADAPTER.encodedSizeWithTag(1, value.getContent());
                }
                if (value.getInitial_state() != null) {
                    size += AnimatedAppearance.InitialState.ADAPTER.encodedSizeWithTag(2, value.getInitial_state());
                }
                if (value.getAnimation_data() != null) {
                    size += AnimatedAppearance.AnimationData.ADAPTER.encodedSizeWithTag(3, value.getAnimation_data());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getIdentifier());
                }
                return size + Action.ADAPTER.encodedSizeWithTag(5, value.getOn_completion()) + AnimatedAppearance.FinalState.ADAPTER.encodedSizeWithTag(6, value.getFinal_state()) + AnimatedAppearance.AnimationData.ADAPTER.encodedSizeWithTag(7, value.getDisappearing_animation_data()) + AnimatedAppearance.InitialState.ADAPTER.encodedSizeWithTag(8, value.getDisappeared_state());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, AnimatedAppearance value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getContent() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent());
                }
                if (value.getInitial_state() != null) {
                    AnimatedAppearance.InitialState.ADAPTER.encodeWithTag(writer, 2, (int) value.getInitial_state());
                }
                if (value.getAnimation_data() != null) {
                    AnimatedAppearance.AnimationData.ADAPTER.encodeWithTag(writer, 3, (int) value.getAnimation_data());
                }
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getIdentifier());
                }
                Action.ADAPTER.encodeWithTag(writer, 5, (int) value.getOn_completion());
                AnimatedAppearance.FinalState.ADAPTER.encodeWithTag(writer, 6, (int) value.getFinal_state());
                AnimatedAppearance.AnimationData.ADAPTER.encodeWithTag(writer, 7, (int) value.getDisappearing_animation_data());
                AnimatedAppearance.InitialState.ADAPTER.encodeWithTag(writer, 8, (int) value.getDisappeared_state());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, AnimatedAppearance value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<AnimatedAppearance.InitialState> protoAdapter = AnimatedAppearance.InitialState.ADAPTER;
                protoAdapter.encodeWithTag(writer, 8, (int) value.getDisappeared_state());
                ProtoAdapter<AnimatedAppearance.AnimationData> protoAdapter2 = AnimatedAppearance.AnimationData.ADAPTER;
                protoAdapter2.encodeWithTag(writer, 7, (int) value.getDisappearing_animation_data());
                AnimatedAppearance.FinalState.ADAPTER.encodeWithTag(writer, 6, (int) value.getFinal_state());
                Action.ADAPTER.encodeWithTag(writer, 5, (int) value.getOn_completion());
                if (!Intrinsics.areEqual(value.getIdentifier(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getIdentifier());
                }
                if (value.getAnimation_data() != null) {
                    protoAdapter2.encodeWithTag(writer, 3, (int) value.getAnimation_data());
                }
                if (value.getInitial_state() != null) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getInitial_state());
                }
                if (value.getContent() != null) {
                    UIComponent.ADAPTER.encodeWithTag(writer, 1, (int) value.getContent());
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AnimatedAppearance redact(AnimatedAppearance value) {
                Intrinsics.checkNotNullParameter(value, "value");
                UIComponent content = value.getContent();
                UIComponent uIComponentRedact = content != null ? UIComponent.ADAPTER.redact(content) : null;
                AnimatedAppearance.InitialState initial_state = value.getInitial_state();
                AnimatedAppearance.InitialState initialStateRedact = initial_state != null ? AnimatedAppearance.InitialState.ADAPTER.redact(initial_state) : null;
                AnimatedAppearance.AnimationData animation_data = value.getAnimation_data();
                AnimatedAppearance.AnimationData animationDataRedact = animation_data != null ? AnimatedAppearance.AnimationData.ADAPTER.redact(animation_data) : null;
                Action on_completion = value.getOn_completion();
                Action actionRedact = on_completion != null ? Action.ADAPTER.redact(on_completion) : null;
                AnimatedAppearance.FinalState final_state = value.getFinal_state();
                AnimatedAppearance.FinalState finalStateRedact = final_state != null ? AnimatedAppearance.FinalState.ADAPTER.redact(final_state) : null;
                AnimatedAppearance.AnimationData disappearing_animation_data = value.getDisappearing_animation_data();
                AnimatedAppearance.AnimationData animationDataRedact2 = disappearing_animation_data != null ? AnimatedAppearance.AnimationData.ADAPTER.redact(disappearing_animation_data) : null;
                AnimatedAppearance.InitialState disappeared_state = value.getDisappeared_state();
                return AnimatedAppearance.copy$default(value, uIComponentRedact, initialStateRedact, animationDataRedact, null, actionRedact, finalStateRedact, animationDataRedact2, disappeared_state != null ? AnimatedAppearance.InitialState.ADAPTER.redact(disappeared_state) : null, ByteString.EMPTY, 8, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public AnimatedAppearance decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                UIComponent uIComponentDecode = null;
                AnimatedAppearance.AnimationData animationDataDecode = null;
                Action actionDecode = null;
                AnimatedAppearance.FinalState finalStateDecode = null;
                AnimatedAppearance.AnimationData animationDataDecode2 = null;
                AnimatedAppearance.InitialState initialStateDecode = null;
                String strDecode = "";
                AnimatedAppearance.InitialState initialStateDecode2 = null;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag != -1) {
                        switch (iNextTag) {
                            case 1:
                                uIComponentDecode = UIComponent.ADAPTER.decode(reader);
                                break;
                            case 2:
                                initialStateDecode2 = AnimatedAppearance.InitialState.ADAPTER.decode(reader);
                                break;
                            case 3:
                                animationDataDecode = AnimatedAppearance.AnimationData.ADAPTER.decode(reader);
                                break;
                            case 4:
                                strDecode = ProtoAdapter.STRING.decode(reader);
                                break;
                            case 5:
                                actionDecode = Action.ADAPTER.decode(reader);
                                break;
                            case 6:
                                finalStateDecode = AnimatedAppearance.FinalState.ADAPTER.decode(reader);
                                break;
                            case 7:
                                animationDataDecode2 = AnimatedAppearance.AnimationData.ADAPTER.decode(reader);
                                break;
                            case 8:
                                initialStateDecode = AnimatedAppearance.InitialState.ADAPTER.decode(reader);
                                break;
                            default:
                                reader.readUnknownField(iNextTag);
                                break;
                        }
                    } else {
                        return new AnimatedAppearance(uIComponentDecode, initialStateDecode2, animationDataDecode, strDecode, actionDecode, finalStateDecode, animationDataDecode2, initialStateDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                }
            }
        };
    }

    /* compiled from: AnimatedAppearance.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001!BM\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0016\u001a\u00020\u0002H\u0017J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0096\u0002J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\b\u0010\u001d\u001a\u00020\u001eH\u0016JQ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010 R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0012R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0013\u001a\u0004\b\u0015\u0010\u0012¨\u0006\""}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearance$InitialState;", "Lcom/squareup/wire/Message;", "", "translation_x", "Lrh_server_driven_ui/v1/AnimatedAppearance$Translation;", "translation_y", "scale", "", "rotation", "opacity", "unknownFields", "Lokio/ByteString;", "<init>", "(Lrh_server_driven_ui/v1/AnimatedAppearance$Translation;Lrh_server_driven_ui/v1/AnimatedAppearance$Translation;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lokio/ByteString;)V", "getTranslation_x", "()Lrh_server_driven_ui/v1/AnimatedAppearance$Translation;", "getTranslation_y", "getScale", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getRotation", "getOpacity", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Lrh_server_driven_ui/v1/AnimatedAppearance$Translation;Lrh_server_driven_ui/v1/AnimatedAppearance$Translation;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/Double;Lokio/ByteString;)Lrh_server_driven_ui/v1/AnimatedAppearance$InitialState;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class InitialState extends Message {

        @JvmField
        public static final ProtoAdapter<InitialState> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 4, tag = 5)
        private final Double opacity;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 3, tag = 4)
        private final Double rotation;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 2, tag = 3)
        private final Double scale;

        @WireField(adapter = "rh_server_driven_ui.v1.AnimatedAppearance$Translation#ADAPTER", jsonName = "translationX", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
        private final Translation translation_x;

        @WireField(adapter = "rh_server_driven_ui.v1.AnimatedAppearance$Translation#ADAPTER", jsonName = "translationY", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final Translation translation_y;

        public InitialState() {
            this(null, null, null, null, null, null, 63, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29660newBuilder();
        }

        public final Translation getTranslation_x() {
            return this.translation_x;
        }

        public final Translation getTranslation_y() {
            return this.translation_y;
        }

        public final Double getScale() {
            return this.scale;
        }

        public final Double getRotation() {
            return this.rotation;
        }

        public final Double getOpacity() {
            return this.opacity;
        }

        public /* synthetic */ InitialState(Translation translation, Translation translation2, Double d, Double d2, Double d3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : translation, (i & 2) != 0 ? null : translation2, (i & 4) != 0 ? null : d, (i & 8) != 0 ? null : d2, (i & 16) != 0 ? null : d3, (i & 32) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InitialState(Translation translation, Translation translation2, Double d, Double d2, Double d3, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.translation_x = translation;
            this.translation_y = translation2;
            this.scale = d;
            this.rotation = d2;
            this.opacity = d3;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29660newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof InitialState)) {
                return false;
            }
            InitialState initialState = (InitialState) other;
            return Intrinsics.areEqual(unknownFields(), initialState.unknownFields()) && Intrinsics.areEqual(this.translation_x, initialState.translation_x) && Intrinsics.areEqual(this.translation_y, initialState.translation_y) && Intrinsics.areEqual(this.scale, initialState.scale) && Intrinsics.areEqual(this.rotation, initialState.rotation) && Intrinsics.areEqual(this.opacity, initialState.opacity);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Translation translation = this.translation_x;
            int iHashCode2 = (iHashCode + (translation != null ? translation.hashCode() : 0)) * 37;
            Translation translation2 = this.translation_y;
            int iHashCode3 = (iHashCode2 + (translation2 != null ? translation2.hashCode() : 0)) * 37;
            Double d = this.scale;
            int iHashCode4 = (iHashCode3 + (d != null ? d.hashCode() : 0)) * 37;
            Double d2 = this.rotation;
            int iHashCode5 = (iHashCode4 + (d2 != null ? d2.hashCode() : 0)) * 37;
            Double d3 = this.opacity;
            int iHashCode6 = iHashCode5 + (d3 != null ? d3.hashCode() : 0);
            this.hashCode = iHashCode6;
            return iHashCode6;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Translation translation = this.translation_x;
            if (translation != null) {
                arrayList.add("translation_x=" + translation);
            }
            Translation translation2 = this.translation_y;
            if (translation2 != null) {
                arrayList.add("translation_y=" + translation2);
            }
            Double d = this.scale;
            if (d != null) {
                arrayList.add("scale=" + d);
            }
            Double d2 = this.rotation;
            if (d2 != null) {
                arrayList.add("rotation=" + d2);
            }
            Double d3 = this.opacity;
            if (d3 != null) {
                arrayList.add("opacity=" + d3);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "InitialState{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ InitialState copy$default(InitialState initialState, Translation translation, Translation translation2, Double d, Double d2, Double d3, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                translation = initialState.translation_x;
            }
            if ((i & 2) != 0) {
                translation2 = initialState.translation_y;
            }
            if ((i & 4) != 0) {
                d = initialState.scale;
            }
            if ((i & 8) != 0) {
                d2 = initialState.rotation;
            }
            if ((i & 16) != 0) {
                d3 = initialState.opacity;
            }
            if ((i & 32) != 0) {
                byteString = initialState.unknownFields();
            }
            Double d4 = d3;
            ByteString byteString2 = byteString;
            return initialState.copy(translation, translation2, d, d2, d4, byteString2);
        }

        public final InitialState copy(Translation translation_x, Translation translation_y, Double scale, Double rotation, Double opacity, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new InitialState(translation_x, translation_y, scale, rotation, opacity, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InitialState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<InitialState>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.AnimatedAppearance$InitialState$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AnimatedAppearance.InitialState value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    if (value.getTranslation_x() != null) {
                        size += AnimatedAppearance.Translation.ADAPTER.encodedSizeWithTag(1, value.getTranslation_x());
                    }
                    if (value.getTranslation_y() != null) {
                        size += AnimatedAppearance.Translation.ADAPTER.encodedSizeWithTag(2, value.getTranslation_y());
                    }
                    ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
                    return size + protoAdapter.encodedSizeWithTag(3, value.getScale()) + protoAdapter.encodedSizeWithTag(4, value.getRotation()) + protoAdapter.encodedSizeWithTag(5, value.getOpacity());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AnimatedAppearance.InitialState value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    if (value.getTranslation_x() != null) {
                        AnimatedAppearance.Translation.ADAPTER.encodeWithTag(writer, 1, (int) value.getTranslation_x());
                    }
                    if (value.getTranslation_y() != null) {
                        AnimatedAppearance.Translation.ADAPTER.encodeWithTag(writer, 2, (int) value.getTranslation_y());
                    }
                    ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getScale());
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getRotation());
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getOpacity());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AnimatedAppearance.InitialState value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
                    protoAdapter.encodeWithTag(writer, 5, (int) value.getOpacity());
                    protoAdapter.encodeWithTag(writer, 4, (int) value.getRotation());
                    protoAdapter.encodeWithTag(writer, 3, (int) value.getScale());
                    if (value.getTranslation_y() != null) {
                        AnimatedAppearance.Translation.ADAPTER.encodeWithTag(writer, 2, (int) value.getTranslation_y());
                    }
                    if (value.getTranslation_x() != null) {
                        AnimatedAppearance.Translation.ADAPTER.encodeWithTag(writer, 1, (int) value.getTranslation_x());
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AnimatedAppearance.InitialState decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    AnimatedAppearance.Translation translationDecode = null;
                    AnimatedAppearance.Translation translationDecode2 = null;
                    Double dDecode = null;
                    Double dDecode2 = null;
                    Double dDecode3 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new AnimatedAppearance.InitialState(translationDecode, translationDecode2, dDecode, dDecode2, dDecode3, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            translationDecode = AnimatedAppearance.Translation.ADAPTER.decode(reader);
                        } else if (iNextTag == 2) {
                            translationDecode2 = AnimatedAppearance.Translation.ADAPTER.decode(reader);
                        } else if (iNextTag == 3) {
                            dDecode = ProtoAdapter.DOUBLE.decode(reader);
                        } else if (iNextTag == 4) {
                            dDecode2 = ProtoAdapter.DOUBLE.decode(reader);
                        } else if (iNextTag == 5) {
                            dDecode3 = ProtoAdapter.DOUBLE.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AnimatedAppearance.InitialState redact(AnimatedAppearance.InitialState value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    AnimatedAppearance.Translation translation_x = value.getTranslation_x();
                    AnimatedAppearance.Translation translationRedact = translation_x != null ? AnimatedAppearance.Translation.ADAPTER.redact(translation_x) : null;
                    AnimatedAppearance.Translation translation_y = value.getTranslation_y();
                    return AnimatedAppearance.InitialState.copy$default(value, translationRedact, translation_y != null ? AnimatedAppearance.Translation.ADAPTER.redact(translation_y) : null, null, null, null, ByteString.EMPTY, 28, null);
                }
            };
        }
    }

    /* compiled from: AnimatedAppearance.kt */
    @Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00172\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\f\u001a\u00020\u0002H\u0017J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0096\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0014H\u0016J!\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0016R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0018"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearance$FinalState;", "Lcom/squareup/wire/Message;", "", "opacity", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Double;Lokio/ByteString;)V", "getOpacity", "()Ljava/lang/Double;", "Ljava/lang/Double;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Double;Lokio/ByteString;)Lrh_server_driven_ui/v1/AnimatedAppearance$FinalState;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FinalState extends Message {

        @JvmField
        public static final ProtoAdapter<FinalState> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 0, tag = 1)
        private final Double opacity;

        /* JADX WARN: Multi-variable type inference failed */
        public FinalState() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29659newBuilder();
        }

        public final Double getOpacity() {
            return this.opacity;
        }

        public /* synthetic */ FinalState(Double d, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FinalState(Double d, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.opacity = d;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29659newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof FinalState)) {
                return false;
            }
            FinalState finalState = (FinalState) other;
            return Intrinsics.areEqual(unknownFields(), finalState.unknownFields()) && Intrinsics.areEqual(this.opacity, finalState.opacity);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Double d = this.opacity;
            int iHashCode2 = iHashCode + (d != null ? d.hashCode() : 0);
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Double d = this.opacity;
            if (d != null) {
                arrayList.add("opacity=" + d);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "FinalState{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ FinalState copy$default(FinalState finalState, Double d, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                d = finalState.opacity;
            }
            if ((i & 2) != 0) {
                byteString = finalState.unknownFields();
            }
            return finalState.copy(d, byteString);
        }

        public final FinalState copy(Double opacity, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new FinalState(opacity, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(FinalState.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<FinalState>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.AnimatedAppearance$FinalState$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AnimatedAppearance.FinalState decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    Double dDecode = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new AnimatedAppearance.FinalState(dDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            dDecode = ProtoAdapter.DOUBLE.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AnimatedAppearance.FinalState value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return value.unknownFields().size() + ProtoAdapter.DOUBLE.encodedSizeWithTag(1, value.getOpacity());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AnimatedAppearance.FinalState value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) value.getOpacity());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AnimatedAppearance.FinalState value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) value.getOpacity());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AnimatedAppearance.FinalState redact(AnimatedAppearance.FinalState value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return AnimatedAppearance.FinalState.copy$default(value, null, ByteString.EMPTY, 1, null);
                }
            };
        }
    }

    /* compiled from: AnimatedAppearance.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u00192\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0019B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u0002H\u0017J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J-\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\u0018R\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\r\u0010\u000b¨\u0006\u001a"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearance$Translation;", "Lcom/squareup/wire/Message;", "", "absolute", "", "percentage", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Double;Ljava/lang/Double;Lokio/ByteString;)V", "getAbsolute", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getPercentage", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Double;Ljava/lang/Double;Lokio/ByteString;)Lrh_server_driven_ui/v1/AnimatedAppearance$Translation;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Translation extends Message {

        @JvmField
        public static final ProtoAdapter<Translation> ADAPTER;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", oneofName = "value", schemaIndex = 0, tag = 1)
        private final Double absolute;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", oneofName = "value", schemaIndex = 1, tag = 2)
        private final Double percentage;

        public Translation() {
            this(null, null, null, 7, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29661newBuilder();
        }

        public final Double getAbsolute() {
            return this.absolute;
        }

        public final Double getPercentage() {
            return this.percentage;
        }

        public /* synthetic */ Translation(Double d, Double d2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? null : d2, (i & 4) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Translation(Double d, Double d2, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.absolute = d;
            this.percentage = d2;
            if (Internal.countNonNull(d, d2) > 1) {
                throw new IllegalArgumentException("At most one of absolute, percentage may be non-null");
            }
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29661newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Translation)) {
                return false;
            }
            Translation translation = (Translation) other;
            return Intrinsics.areEqual(unknownFields(), translation.unknownFields()) && Intrinsics.areEqual(this.absolute, translation.absolute) && Intrinsics.areEqual(this.percentage, translation.percentage);
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Double d = this.absolute;
            int iHashCode2 = (iHashCode + (d != null ? d.hashCode() : 0)) * 37;
            Double d2 = this.percentage;
            int iHashCode3 = iHashCode2 + (d2 != null ? d2.hashCode() : 0);
            this.hashCode = iHashCode3;
            return iHashCode3;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Double d = this.absolute;
            if (d != null) {
                arrayList.add("absolute=" + d);
            }
            Double d2 = this.percentage;
            if (d2 != null) {
                arrayList.add("percentage=" + d2);
            }
            return CollectionsKt.joinToString$default(arrayList, ", ", "Translation{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ Translation copy$default(Translation translation, Double d, Double d2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                d = translation.absolute;
            }
            if ((i & 2) != 0) {
                d2 = translation.percentage;
            }
            if ((i & 4) != 0) {
                byteString = translation.unknownFields();
            }
            return translation.copy(d, d2, byteString);
        }

        public final Translation copy(Double absolute, Double percentage, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new Translation(absolute, percentage, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Translation.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Translation>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.AnimatedAppearance$Translation$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public AnimatedAppearance.Translation decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    long jBeginMessage = reader.beginMessage();
                    Double dDecode = null;
                    Double dDecode2 = null;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag == -1) {
                            return new AnimatedAppearance.Translation(dDecode, dDecode2, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                        if (iNextTag == 1) {
                            dDecode = ProtoAdapter.DOUBLE.decode(reader);
                        } else if (iNextTag == 2) {
                            dDecode2 = ProtoAdapter.DOUBLE.decode(reader);
                        } else {
                            reader.readUnknownField(iNextTag);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AnimatedAppearance.Translation value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
                    return size + protoAdapter.encodedSizeWithTag(1, value.getAbsolute()) + protoAdapter.encodedSizeWithTag(2, value.getPercentage());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AnimatedAppearance.Translation value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getAbsolute());
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getPercentage());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AnimatedAppearance.Translation value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getPercentage());
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getAbsolute());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AnimatedAppearance.Translation redact(AnimatedAppearance.Translation value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return AnimatedAppearance.Translation.copy$default(value, null, null, ByteString.EMPTY, 3, null);
                }
            };
        }
    }

    /* compiled from: AnimatedAppearance.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u0000 \u001e2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001eB1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0002H\u0017J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0016J5\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\u001dR\u001a\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001f"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearance$AnimationData;", "Lcom/squareup/wire/Message;", "", "duration", "", "delay", "curve", "Lrh_server_driven_ui/v1/AnimatedAppearance$Curve;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/Double;DLrh_server_driven_ui/v1/AnimatedAppearance$Curve;Lokio/ByteString;)V", "getDuration", "()Ljava/lang/Double;", "Ljava/lang/Double;", "getDelay", "()D", "getCurve", "()Lrh_server_driven_ui/v1/AnimatedAppearance$Curve;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "(Ljava/lang/Double;DLrh_server_driven_ui/v1/AnimatedAppearance$Curve;Lokio/ByteString;)Lrh_server_driven_ui/v1/AnimatedAppearance$AnimationData;", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AnimationData extends Message {

        @JvmField
        public static final ProtoAdapter<AnimationData> ADAPTER;

        @WireField(adapter = "rh_server_driven_ui.v1.AnimatedAppearance$Curve#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
        private final Curve curve;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
        private final double delay;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#DOUBLE", schemaIndex = 0, tag = 1)
        private final Double duration;

        public AnimationData() {
            this(null, 0.0d, null, null, 15, null);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m29658newBuilder();
        }

        public final Double getDuration() {
            return this.duration;
        }

        public final double getDelay() {
            return this.delay;
        }

        public final Curve getCurve() {
            return this.curve;
        }

        public /* synthetic */ AnimationData(Double d, double d2, Curve curve, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : d, (i & 2) != 0 ? 0.0d : d2, (i & 4) != 0 ? Curve.CURVE_UNSPECIFIED : curve, (i & 8) != 0 ? ByteString.EMPTY : byteString);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnimationData(Double d, double d2, Curve curve, ByteString unknownFields) {
            super(ADAPTER, unknownFields);
            Intrinsics.checkNotNullParameter(curve, "curve");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            this.duration = d;
            this.delay = d2;
            this.curve = curve;
        }

        @Deprecated
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m29658newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof AnimationData)) {
                return false;
            }
            AnimationData animationData = (AnimationData) other;
            return Intrinsics.areEqual(unknownFields(), animationData.unknownFields()) && Intrinsics.areEqual(this.duration, animationData.duration) && this.delay == animationData.delay && this.curve == animationData.curve;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int iHashCode = unknownFields().hashCode() * 37;
            Double d = this.duration;
            int iHashCode2 = ((((iHashCode + (d != null ? d.hashCode() : 0)) * 37) + Double.hashCode(this.delay)) * 37) + this.curve.hashCode();
            this.hashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Double d = this.duration;
            if (d != null) {
                arrayList.add("duration=" + d);
            }
            arrayList.add("delay=" + this.delay);
            arrayList.add("curve=" + this.curve);
            return CollectionsKt.joinToString$default(arrayList, ", ", "AnimationData{", "}", 0, null, null, 56, null);
        }

        public static /* synthetic */ AnimationData copy$default(AnimationData animationData, Double d, double d2, Curve curve, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                d = animationData.duration;
            }
            if ((i & 2) != 0) {
                d2 = animationData.delay;
            }
            if ((i & 4) != 0) {
                curve = animationData.curve;
            }
            if ((i & 8) != 0) {
                byteString = animationData.unknownFields();
            }
            return animationData.copy(d, d2, curve, byteString);
        }

        public final AnimationData copy(Double duration, double delay, Curve curve, ByteString unknownFields) {
            Intrinsics.checkNotNullParameter(curve, "curve");
            Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
            return new AnimationData(duration, delay, curve, unknownFields);
        }

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AnimationData.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<AnimationData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: rh_server_driven_ui.v1.AnimatedAppearance$AnimationData$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(AnimatedAppearance.AnimationData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    int size = value.unknownFields().size();
                    ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
                    int iEncodedSizeWithTag = size + protoAdapter.encodedSizeWithTag(1, value.getDuration());
                    if (!Double.valueOf(value.getDelay()).equals(Double.valueOf(0.0d))) {
                        iEncodedSizeWithTag += protoAdapter.encodedSizeWithTag(2, Double.valueOf(value.getDelay()));
                    }
                    return value.getCurve() != AnimatedAppearance.Curve.CURVE_UNSPECIFIED ? iEncodedSizeWithTag + AnimatedAppearance.Curve.ADAPTER.encodedSizeWithTag(3, value.getCurve()) : iEncodedSizeWithTag;
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, AnimatedAppearance.AnimationData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    ProtoAdapter<Double> protoAdapter = ProtoAdapter.DOUBLE;
                    protoAdapter.encodeWithTag(writer, 1, (int) value.getDuration());
                    if (!Double.valueOf(value.getDelay()).equals(Double.valueOf(0.0d))) {
                        protoAdapter.encodeWithTag(writer, 2, (int) Double.valueOf(value.getDelay()));
                    }
                    if (value.getCurve() != AnimatedAppearance.Curve.CURVE_UNSPECIFIED) {
                        AnimatedAppearance.Curve.ADAPTER.encodeWithTag(writer, 3, (int) value.getCurve());
                    }
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, AnimatedAppearance.AnimationData value) throws IOException {
                    Intrinsics.checkNotNullParameter(writer, "writer");
                    Intrinsics.checkNotNullParameter(value, "value");
                    writer.writeBytes(value.unknownFields());
                    if (value.getCurve() != AnimatedAppearance.Curve.CURVE_UNSPECIFIED) {
                        AnimatedAppearance.Curve.ADAPTER.encodeWithTag(writer, 3, (int) value.getCurve());
                    }
                    if (!Double.valueOf(value.getDelay()).equals(Double.valueOf(0.0d))) {
                        ProtoAdapter.DOUBLE.encodeWithTag(writer, 2, (int) Double.valueOf(value.getDelay()));
                    }
                    ProtoAdapter.DOUBLE.encodeWithTag(writer, 1, (int) value.getDuration());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AnimatedAppearance.AnimationData decode(ProtoReader reader) throws IOException {
                    Intrinsics.checkNotNullParameter(reader, "reader");
                    AnimatedAppearance.Curve curveDecode = AnimatedAppearance.Curve.CURVE_UNSPECIFIED;
                    long jBeginMessage = reader.beginMessage();
                    double dDoubleValue = 0.0d;
                    Double dDecode = null;
                    while (true) {
                        AnimatedAppearance.Curve curve = curveDecode;
                        while (true) {
                            int iNextTag = reader.nextTag();
                            if (iNextTag == -1) {
                                return new AnimatedAppearance.AnimationData(dDecode, dDoubleValue, curve, reader.endMessageAndGetUnknownFields(jBeginMessage));
                            }
                            if (iNextTag == 1) {
                                dDecode = ProtoAdapter.DOUBLE.decode(reader);
                            } else if (iNextTag == 2) {
                                dDoubleValue = ProtoAdapter.DOUBLE.decode(reader).doubleValue();
                            } else if (iNextTag == 3) {
                                try {
                                    curveDecode = AnimatedAppearance.Curve.ADAPTER.decode(reader);
                                    break;
                                } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                    reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                }
                            } else {
                                reader.readUnknownField(iNextTag);
                            }
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public AnimatedAppearance.AnimationData redact(AnimatedAppearance.AnimationData value) {
                    Intrinsics.checkNotNullParameter(value, "value");
                    return AnimatedAppearance.AnimationData.copy$default(value, null, 0.0d, null, ByteString.EMPTY, 7, null);
                }
            };
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnimatedAppearance.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearance$Curve;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "CURVE_UNSPECIFIED", "CURVE_DEFAULT", "CURVE_DECELERATION", "CURVE_ACCELERATION", "CURVE_EXPANSION", "Companion", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Curve implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Curve[] $VALUES;

        @JvmField
        public static final ProtoAdapter<Curve> ADAPTER;
        public static final Curve CURVE_ACCELERATION;
        public static final Curve CURVE_DECELERATION;
        public static final Curve CURVE_DEFAULT;
        public static final Curve CURVE_EXPANSION;
        public static final Curve CURVE_UNSPECIFIED;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        private final int value;

        private static final /* synthetic */ Curve[] $values() {
            return new Curve[]{CURVE_UNSPECIFIED, CURVE_DEFAULT, CURVE_DECELERATION, CURVE_ACCELERATION, CURVE_EXPANSION};
        }

        @JvmStatic
        public static final Curve fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Curve> getEntries() {
            return $ENTRIES;
        }

        private Curve(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Curve curve = new Curve("CURVE_UNSPECIFIED", 0, 0);
            CURVE_UNSPECIFIED = curve;
            CURVE_DEFAULT = new Curve("CURVE_DEFAULT", 1, 1);
            CURVE_DECELERATION = new Curve("CURVE_DECELERATION", 2, 2);
            CURVE_ACCELERATION = new Curve("CURVE_ACCELERATION", 3, 3);
            CURVE_EXPANSION = new Curve("CURVE_EXPANSION", 4, 4);
            Curve[] curveArr$values = $values();
            $VALUES = curveArr$values;
            $ENTRIES = EnumEntries2.enumEntries(curveArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Curve.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Curve>(orCreateKotlinClass, syntax, curve) { // from class: rh_server_driven_ui.v1.AnimatedAppearance$Curve$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public AnimatedAppearance.Curve fromValue(int value) {
                    return AnimatedAppearance.Curve.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: AnimatedAppearance.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lrh_server_driven_ui/v1/AnimatedAppearance$Curve$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lrh_server_driven_ui/v1/AnimatedAppearance$Curve;", "fromValue", "value", "", "sdui.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Curve fromValue(int value) {
                if (value == 0) {
                    return Curve.CURVE_UNSPECIFIED;
                }
                if (value == 1) {
                    return Curve.CURVE_DEFAULT;
                }
                if (value == 2) {
                    return Curve.CURVE_DECELERATION;
                }
                if (value == 3) {
                    return Curve.CURVE_ACCELERATION;
                }
                if (value != 4) {
                    return null;
                }
                return Curve.CURVE_EXPANSION;
            }
        }

        public static Curve valueOf(String str) {
            return (Curve) Enum.valueOf(Curve.class, str);
        }

        public static Curve[] values() {
            return (Curve[]) $VALUES.clone();
        }
    }
}
