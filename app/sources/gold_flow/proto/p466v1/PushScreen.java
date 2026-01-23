package gold_flow.proto.p466v1;

import com.plaid.internal.EnumC7081g;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import okio.ByteString;

/* compiled from: PushScreen.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 *2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001*B]\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\b\u0010!\u001a\u00020\u0002H\u0017J\u0013\u0010\"\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010$H\u0096\u0002J\b\u0010%\u001a\u00020&H\u0016J\b\u0010'\u001a\u00020\u0007H\u0016Ja\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0002\u0010)R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0018\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u000f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u001e\u001a\u0004\b\u001c\u0010\u001dR\"\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006+"}, m3636d2 = {"Lgold_flow/proto/v1/PushScreen;", "Lcom/squareup/wire/Message;", "", "screen", "Lgold_flow/proto/v1/GoldFlowScreen;", "generic_args", "", "", "presentation_type", "Lgold_flow/proto/v1/PresentationType;", "transition_animation", "Lgold_flow/proto/v1/TransitionAnimation;", "custom_back_action", "Lgold_flow/proto/v1/Action;", "dismiss_on_custom_back_action", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Lgold_flow/proto/v1/GoldFlowScreen;Ljava/util/Map;Lgold_flow/proto/v1/PresentationType;Lgold_flow/proto/v1/TransitionAnimation;Lgold_flow/proto/v1/Action;Ljava/lang/Boolean;Lokio/ByteString;)V", "getScreen", "()Lgold_flow/proto/v1/GoldFlowScreen;", "getPresentation_type", "()Lgold_flow/proto/v1/PresentationType;", "getTransition_animation", "()Lgold_flow/proto/v1/TransitionAnimation;", "getCustom_back_action", "()Lgold_flow/proto/v1/Action;", "getDismiss_on_custom_back_action", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGeneric_args", "()Ljava/util/Map;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Lgold_flow/proto/v1/GoldFlowScreen;Ljava/util/Map;Lgold_flow/proto/v1/PresentationType;Lgold_flow/proto/v1/TransitionAnimation;Lgold_flow/proto/v1/Action;Ljava/lang/Boolean;Lokio/ByteString;)Lgold_flow/proto/v1/PushScreen;", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class PushScreen extends Message {

    @WireField(adapter = "gold_flow.proto.v1.Action#ADAPTER", jsonName = "customBackAction", schemaIndex = 4, tag = 5)
    private final Action custom_back_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "dismissOnCustomBackAction", schemaIndex = 5, tag = 6)
    private final Boolean dismiss_on_custom_back_action;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "genericArgs", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
    private final Map<String, String> generic_args;

    @WireField(adapter = "gold_flow.proto.v1.PresentationType#ADAPTER", jsonName = "presentationType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final PresentationType presentation_type;

    @WireField(adapter = "gold_flow.proto.v1.GoldFlowScreen#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final GoldFlowScreen screen;

    @WireField(adapter = "gold_flow.proto.v1.TransitionAnimation#ADAPTER", jsonName = "transitionAnimation", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final TransitionAnimation transition_animation;

    @JvmField
    public static final ProtoAdapter<PushScreen> ADAPTER = new PushScreen2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(PushScreen.class), Syntax.PROTO_3);

    public PushScreen() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28180newBuilder();
    }

    public final GoldFlowScreen getScreen() {
        return this.screen;
    }

    public /* synthetic */ PushScreen(GoldFlowScreen goldFlowScreen, Map map, PresentationType presentationType, TransitionAnimation transitionAnimation, Action action, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? GoldFlowScreen.SCREEN_UNSPECIFIED : goldFlowScreen, (i & 2) != 0 ? MapsKt.emptyMap() : map, (i & 4) != 0 ? PresentationType.PRESENTATION_UNSPECIFIED : presentationType, (i & 8) != 0 ? TransitionAnimation.ANIMATION_UNSPECIFIED : transitionAnimation, (i & 16) != 0 ? null : action, (i & 32) != 0 ? null : bool, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final PresentationType getPresentation_type() {
        return this.presentation_type;
    }

    public final TransitionAnimation getTransition_animation() {
        return this.transition_animation;
    }

    public final Action getCustom_back_action() {
        return this.custom_back_action;
    }

    public final Boolean getDismiss_on_custom_back_action() {
        return this.dismiss_on_custom_back_action;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushScreen(GoldFlowScreen screen, Map<String, String> generic_args, PresentationType presentation_type, TransitionAnimation transition_animation, Action action, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(generic_args, "generic_args");
        Intrinsics.checkNotNullParameter(presentation_type, "presentation_type");
        Intrinsics.checkNotNullParameter(transition_animation, "transition_animation");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.screen = screen;
        this.presentation_type = presentation_type;
        this.transition_animation = transition_animation;
        this.custom_back_action = action;
        this.dismiss_on_custom_back_action = bool;
        this.generic_args = Internal.immutableCopyOf("generic_args", generic_args);
    }

    public final Map<String, String> getGeneric_args() {
        return this.generic_args;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28180newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PushScreen)) {
            return false;
        }
        PushScreen pushScreen = (PushScreen) other;
        return Intrinsics.areEqual(unknownFields(), pushScreen.unknownFields()) && this.screen == pushScreen.screen && Intrinsics.areEqual(this.generic_args, pushScreen.generic_args) && this.presentation_type == pushScreen.presentation_type && this.transition_animation == pushScreen.transition_animation && Intrinsics.areEqual(this.custom_back_action, pushScreen.custom_back_action) && Intrinsics.areEqual(this.dismiss_on_custom_back_action, pushScreen.dismiss_on_custom_back_action);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.screen.hashCode()) * 37) + this.generic_args.hashCode()) * 37) + this.presentation_type.hashCode()) * 37) + this.transition_animation.hashCode()) * 37;
        Action action = this.custom_back_action;
        int iHashCode2 = (iHashCode + (action != null ? action.hashCode() : 0)) * 37;
        Boolean bool = this.dismiss_on_custom_back_action;
        int iHashCode3 = iHashCode2 + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode3;
        return iHashCode3;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("screen=" + this.screen);
        if (!this.generic_args.isEmpty()) {
            arrayList.add("generic_args=" + this.generic_args);
        }
        arrayList.add("presentation_type=" + this.presentation_type);
        arrayList.add("transition_animation=" + this.transition_animation);
        Action action = this.custom_back_action;
        if (action != null) {
            arrayList.add("custom_back_action=" + action);
        }
        Boolean bool = this.dismiss_on_custom_back_action;
        if (bool != null) {
            arrayList.add("dismiss_on_custom_back_action=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "PushScreen{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ PushScreen copy$default(PushScreen pushScreen, GoldFlowScreen goldFlowScreen, Map map, PresentationType presentationType, TransitionAnimation transitionAnimation, Action action, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            goldFlowScreen = pushScreen.screen;
        }
        if ((i & 2) != 0) {
            map = pushScreen.generic_args;
        }
        if ((i & 4) != 0) {
            presentationType = pushScreen.presentation_type;
        }
        if ((i & 8) != 0) {
            transitionAnimation = pushScreen.transition_animation;
        }
        if ((i & 16) != 0) {
            action = pushScreen.custom_back_action;
        }
        if ((i & 32) != 0) {
            bool = pushScreen.dismiss_on_custom_back_action;
        }
        if ((i & 64) != 0) {
            byteString = pushScreen.unknownFields();
        }
        Boolean bool2 = bool;
        ByteString byteString2 = byteString;
        Action action2 = action;
        PresentationType presentationType2 = presentationType;
        return pushScreen.copy(goldFlowScreen, map, presentationType2, transitionAnimation, action2, bool2, byteString2);
    }

    public final PushScreen copy(GoldFlowScreen screen, Map<String, String> generic_args, PresentationType presentation_type, TransitionAnimation transition_animation, Action custom_back_action, Boolean dismiss_on_custom_back_action, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(generic_args, "generic_args");
        Intrinsics.checkNotNullParameter(presentation_type, "presentation_type");
        Intrinsics.checkNotNullParameter(transition_animation, "transition_animation");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new PushScreen(screen, generic_args, presentation_type, transition_animation, custom_back_action, dismiss_on_custom_back_action, unknownFields);
    }
}
