package gold_flow.proto.p466v1;

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

/* compiled from: OpenDeeplink.kt */
@Metadata(m3635d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u0000 %2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001%BQ\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u001c\u001a\u00020\u0002H\u0017J\u0013\u0010\u001d\u001a\u00020\f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0096\u0002J\b\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0004H\u0016JU\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\u0014\b\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0002\u0010$R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\"\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006&"}, m3636d2 = {"Lgold_flow/proto/v1/OpenDeeplink;", "Lcom/squareup/wire/Message;", "", "deeplink_uri", "", "presentation_type", "Lgold_flow/proto/v1/PresentationType;", "transition_animation", "Lgold_flow/proto/v1/TransitionAnimation;", "generic_args", "", "should_open_externally", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lgold_flow/proto/v1/PresentationType;Lgold_flow/proto/v1/TransitionAnimation;Ljava/util/Map;Ljava/lang/Boolean;Lokio/ByteString;)V", "getDeeplink_uri", "()Ljava/lang/String;", "getPresentation_type", "()Lgold_flow/proto/v1/PresentationType;", "getTransition_animation", "()Lgold_flow/proto/v1/TransitionAnimation;", "getShould_open_externally", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getGeneric_args", "()Ljava/util/Map;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Lgold_flow/proto/v1/PresentationType;Lgold_flow/proto/v1/TransitionAnimation;Ljava/util/Map;Ljava/lang/Boolean;Lokio/ByteString;)Lgold_flow/proto/v1/OpenDeeplink;", "Companion", "gold_flow.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes21.dex */
public final class OpenDeeplink extends Message {

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "deeplinkUri", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String deeplink_uri;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "genericArgs", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 3, tag = 4)
    private final Map<String, String> generic_args;

    @WireField(adapter = "gold_flow.proto.v1.PresentationType#ADAPTER", jsonName = "presentationType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final PresentationType presentation_type;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "shouldOpenExternally", schemaIndex = 4, tag = 5)
    private final Boolean should_open_externally;

    @WireField(adapter = "gold_flow.proto.v1.TransitionAnimation#ADAPTER", jsonName = "transitionAnimation", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final TransitionAnimation transition_animation;

    @JvmField
    public static final ProtoAdapter<OpenDeeplink> ADAPTER = new OpenDeeplink2(FieldEncoding.LENGTH_DELIMITED, Reflection.getOrCreateKotlinClass(OpenDeeplink.class), Syntax.PROTO_3);

    public OpenDeeplink() {
        this(null, null, null, null, null, null, 63, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m28177newBuilder();
    }

    public final String getDeeplink_uri() {
        return this.deeplink_uri;
    }

    public /* synthetic */ OpenDeeplink(String str, PresentationType presentationType, TransitionAnimation transitionAnimation, Map map, Boolean bool, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? PresentationType.PRESENTATION_UNSPECIFIED : presentationType, (i & 4) != 0 ? TransitionAnimation.ANIMATION_UNSPECIFIED : transitionAnimation, (i & 8) != 0 ? MapsKt.emptyMap() : map, (i & 16) != 0 ? null : bool, (i & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    public final PresentationType getPresentation_type() {
        return this.presentation_type;
    }

    public final TransitionAnimation getTransition_animation() {
        return this.transition_animation;
    }

    public final Boolean getShould_open_externally() {
        return this.should_open_externally;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenDeeplink(String deeplink_uri, PresentationType presentation_type, TransitionAnimation transition_animation, Map<String, String> generic_args, Boolean bool, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(deeplink_uri, "deeplink_uri");
        Intrinsics.checkNotNullParameter(presentation_type, "presentation_type");
        Intrinsics.checkNotNullParameter(transition_animation, "transition_animation");
        Intrinsics.checkNotNullParameter(generic_args, "generic_args");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.deeplink_uri = deeplink_uri;
        this.presentation_type = presentation_type;
        this.transition_animation = transition_animation;
        this.should_open_externally = bool;
        this.generic_args = Internal.immutableCopyOf("generic_args", generic_args);
    }

    public final Map<String, String> getGeneric_args() {
        return this.generic_args;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m28177newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OpenDeeplink)) {
            return false;
        }
        OpenDeeplink openDeeplink = (OpenDeeplink) other;
        return Intrinsics.areEqual(unknownFields(), openDeeplink.unknownFields()) && Intrinsics.areEqual(this.deeplink_uri, openDeeplink.deeplink_uri) && this.presentation_type == openDeeplink.presentation_type && this.transition_animation == openDeeplink.transition_animation && Intrinsics.areEqual(this.generic_args, openDeeplink.generic_args) && Intrinsics.areEqual(this.should_open_externally, openDeeplink.should_open_externally);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((((((((unknownFields().hashCode() * 37) + this.deeplink_uri.hashCode()) * 37) + this.presentation_type.hashCode()) * 37) + this.transition_animation.hashCode()) * 37) + this.generic_args.hashCode()) * 37;
        Boolean bool = this.should_open_externally;
        int iHashCode2 = iHashCode + (bool != null ? bool.hashCode() : 0);
        this.hashCode = iHashCode2;
        return iHashCode2;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("deeplink_uri=" + Internal.sanitize(this.deeplink_uri));
        arrayList.add("presentation_type=" + this.presentation_type);
        arrayList.add("transition_animation=" + this.transition_animation);
        if (!this.generic_args.isEmpty()) {
            arrayList.add("generic_args=" + this.generic_args);
        }
        Boolean bool = this.should_open_externally;
        if (bool != null) {
            arrayList.add("should_open_externally=" + bool);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "OpenDeeplink{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ OpenDeeplink copy$default(OpenDeeplink openDeeplink, String str, PresentationType presentationType, TransitionAnimation transitionAnimation, Map map, Boolean bool, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = openDeeplink.deeplink_uri;
        }
        if ((i & 2) != 0) {
            presentationType = openDeeplink.presentation_type;
        }
        if ((i & 4) != 0) {
            transitionAnimation = openDeeplink.transition_animation;
        }
        if ((i & 8) != 0) {
            map = openDeeplink.generic_args;
        }
        if ((i & 16) != 0) {
            bool = openDeeplink.should_open_externally;
        }
        if ((i & 32) != 0) {
            byteString = openDeeplink.unknownFields();
        }
        Boolean bool2 = bool;
        ByteString byteString2 = byteString;
        return openDeeplink.copy(str, presentationType, transitionAnimation, map, bool2, byteString2);
    }

    public final OpenDeeplink copy(String deeplink_uri, PresentationType presentation_type, TransitionAnimation transition_animation, Map<String, String> generic_args, Boolean should_open_externally, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(deeplink_uri, "deeplink_uri");
        Intrinsics.checkNotNullParameter(presentation_type, "presentation_type");
        Intrinsics.checkNotNullParameter(transition_animation, "transition_animation");
        Intrinsics.checkNotNullParameter(generic_args, "generic_args");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new OpenDeeplink(deeplink_uri, presentation_type, transition_animation, generic_args, should_open_externally, unknownFields);
    }
}
