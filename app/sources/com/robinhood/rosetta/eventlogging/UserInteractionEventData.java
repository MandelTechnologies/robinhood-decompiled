package com.robinhood.rosetta.eventlogging;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.companyfinancials.p116ui.CompanyFinancialsSection;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.models.dao.RhRoomDatabase;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.http.HttpStatusCode;
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

/* compiled from: UserInteractionEventData.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 )2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0003)*+BU\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u001f\u001a\u00020\u0002H\u0017J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020'H\u0016JT\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001e¨\u0006,"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData;", "Lcom/squareup/wire/Message;", "", "event_type", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "component", "Lcom/robinhood/rosetta/eventlogging/Component;", "action", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "context", "Lcom/robinhood/rosetta/eventlogging/Context;", "component_hierarchy", "Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "unknownFields", "Lokio/ByteString;", "<init>", "(Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/rosetta/eventlogging/Component;Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;Lcom/robinhood/rosetta/eventlogging/Context;Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;Lokio/ByteString;)V", "getEvent_type", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "getScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "getComponent", "()Lcom/robinhood/rosetta/eventlogging/Component;", "getAction", "()Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "getContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "getComponent_hierarchy", "()Lcom/robinhood/rosetta/eventlogging/ComponentHierarchy;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "", "copy", "Companion", "EventType", "Action", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class UserInteractionEventData extends Message {

    @JvmField
    public static final ProtoAdapter<UserInteractionEventData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.UserInteractionEventData$Action#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final Action action;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Component#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final Component component;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.ComponentHierarchy#ADAPTER", jsonName = "componentHierarchy", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 6)
    private final ComponentHierarchy component_hierarchy;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Context#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final Context context;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.UserInteractionEventData$EventType#ADAPTER", jsonName = "eventType", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final EventType event_type;

    @WireField(adapter = "com.robinhood.rosetta.eventlogging.Screen#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final Screen screen;

    public UserInteractionEventData() {
        this(null, null, null, null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, null);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24601newBuilder();
    }

    public final EventType getEvent_type() {
        return this.event_type;
    }

    public /* synthetic */ UserInteractionEventData(EventType eventType, Screen screen, Component component, Action action, Context context, ComponentHierarchy componentHierarchy, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? EventType.EVENT_TYPE_UNSPECIFIED : eventType, (i & 2) != 0 ? null : screen, (i & 4) != 0 ? null : component, (i & 8) != 0 ? Action.ACTION_UNSPECIFIED : action, (i & 16) != 0 ? null : context, (i & 32) != 0 ? null : componentHierarchy, (i & 64) != 0 ? ByteString.EMPTY : byteString);
    }

    public final Screen getScreen() {
        return this.screen;
    }

    public final Component getComponent() {
        return this.component;
    }

    public final Action getAction() {
        return this.action;
    }

    public final Context getContext() {
        return this.context;
    }

    public final ComponentHierarchy getComponent_hierarchy() {
        return this.component_hierarchy;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserInteractionEventData(EventType event_type, Screen screen, Component component, Action action, Context context, ComponentHierarchy componentHierarchy, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.event_type = event_type;
        this.screen = screen;
        this.component = component;
        this.action = action;
        this.context = context;
        this.component_hierarchy = componentHierarchy;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24601newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UserInteractionEventData)) {
            return false;
        }
        UserInteractionEventData userInteractionEventData = (UserInteractionEventData) other;
        return Intrinsics.areEqual(unknownFields(), userInteractionEventData.unknownFields()) && this.event_type == userInteractionEventData.event_type && Intrinsics.areEqual(this.screen, userInteractionEventData.screen) && Intrinsics.areEqual(this.component, userInteractionEventData.component) && this.action == userInteractionEventData.action && Intrinsics.areEqual(this.context, userInteractionEventData.context) && Intrinsics.areEqual(this.component_hierarchy, userInteractionEventData.component_hierarchy);
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = ((unknownFields().hashCode() * 37) + this.event_type.hashCode()) * 37;
        Screen screen = this.screen;
        int iHashCode2 = (iHashCode + (screen != null ? screen.hashCode() : 0)) * 37;
        Component component = this.component;
        int iHashCode3 = (((iHashCode2 + (component != null ? component.hashCode() : 0)) * 37) + this.action.hashCode()) * 37;
        Context context = this.context;
        int iHashCode4 = (iHashCode3 + (context != null ? context.hashCode() : 0)) * 37;
        ComponentHierarchy componentHierarchy = this.component_hierarchy;
        int iHashCode5 = iHashCode4 + (componentHierarchy != null ? componentHierarchy.hashCode() : 0);
        this.hashCode = iHashCode5;
        return iHashCode5;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("event_type=" + this.event_type);
        Screen screen = this.screen;
        if (screen != null) {
            arrayList.add("screen=" + screen);
        }
        Component component = this.component;
        if (component != null) {
            arrayList.add("component=" + component);
        }
        arrayList.add("action=" + this.action);
        Context context = this.context;
        if (context != null) {
            arrayList.add("context=" + context);
        }
        ComponentHierarchy componentHierarchy = this.component_hierarchy;
        if (componentHierarchy != null) {
            arrayList.add("component_hierarchy=" + componentHierarchy);
        }
        return CollectionsKt.joinToString$default(arrayList, ", ", "UserInteractionEventData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UserInteractionEventData copy$default(UserInteractionEventData userInteractionEventData, EventType eventType, Screen screen, Component component, Action action, Context context, ComponentHierarchy componentHierarchy, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            eventType = userInteractionEventData.event_type;
        }
        if ((i & 2) != 0) {
            screen = userInteractionEventData.screen;
        }
        if ((i & 4) != 0) {
            component = userInteractionEventData.component;
        }
        if ((i & 8) != 0) {
            action = userInteractionEventData.action;
        }
        if ((i & 16) != 0) {
            context = userInteractionEventData.context;
        }
        if ((i & 32) != 0) {
            componentHierarchy = userInteractionEventData.component_hierarchy;
        }
        if ((i & 64) != 0) {
            byteString = userInteractionEventData.unknownFields();
        }
        ComponentHierarchy componentHierarchy2 = componentHierarchy;
        ByteString byteString2 = byteString;
        Context context2 = context;
        Component component2 = component;
        return userInteractionEventData.copy(eventType, screen, component2, action, context2, componentHierarchy2, byteString2);
    }

    public final UserInteractionEventData copy(EventType event_type, Screen screen, Component component, Action action, Context context, ComponentHierarchy component_hierarchy, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(event_type, "event_type");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UserInteractionEventData(event_type, screen, component, action, context, component_hierarchy, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserInteractionEventData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UserInteractionEventData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.UserInteractionEventData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UserInteractionEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (value.getEvent_type() != UserInteractionEventData.EventType.EVENT_TYPE_UNSPECIFIED) {
                    size += UserInteractionEventData.EventType.ADAPTER.encodedSizeWithTag(1, value.getEvent_type());
                }
                if (value.getScreen() != null) {
                    size += Screen.ADAPTER.encodedSizeWithTag(2, value.getScreen());
                }
                if (value.getComponent() != null) {
                    size += Component.ADAPTER.encodedSizeWithTag(3, value.getComponent());
                }
                if (value.getAction() != UserInteractionEventData.Action.ACTION_UNSPECIFIED) {
                    size += UserInteractionEventData.Action.ADAPTER.encodedSizeWithTag(4, value.getAction());
                }
                if (value.getContext() != null) {
                    size += Context.ADAPTER.encodedSizeWithTag(5, value.getContext());
                }
                return value.getComponent_hierarchy() != null ? size + ComponentHierarchy.ADAPTER.encodedSizeWithTag(6, value.getComponent_hierarchy()) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UserInteractionEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (value.getEvent_type() != UserInteractionEventData.EventType.EVENT_TYPE_UNSPECIFIED) {
                    UserInteractionEventData.EventType.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent_type());
                }
                if (value.getScreen() != null) {
                    Screen.ADAPTER.encodeWithTag(writer, 2, (int) value.getScreen());
                }
                if (value.getComponent() != null) {
                    Component.ADAPTER.encodeWithTag(writer, 3, (int) value.getComponent());
                }
                if (value.getAction() != UserInteractionEventData.Action.ACTION_UNSPECIFIED) {
                    UserInteractionEventData.Action.ADAPTER.encodeWithTag(writer, 4, (int) value.getAction());
                }
                if (value.getContext() != null) {
                    Context.ADAPTER.encodeWithTag(writer, 5, (int) value.getContext());
                }
                if (value.getComponent_hierarchy() != null) {
                    ComponentHierarchy.ADAPTER.encodeWithTag(writer, 6, (int) value.getComponent_hierarchy());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UserInteractionEventData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getComponent_hierarchy() != null) {
                    ComponentHierarchy.ADAPTER.encodeWithTag(writer, 6, (int) value.getComponent_hierarchy());
                }
                if (value.getContext() != null) {
                    Context.ADAPTER.encodeWithTag(writer, 5, (int) value.getContext());
                }
                if (value.getAction() != UserInteractionEventData.Action.ACTION_UNSPECIFIED) {
                    UserInteractionEventData.Action.ADAPTER.encodeWithTag(writer, 4, (int) value.getAction());
                }
                if (value.getComponent() != null) {
                    Component.ADAPTER.encodeWithTag(writer, 3, (int) value.getComponent());
                }
                if (value.getScreen() != null) {
                    Screen.ADAPTER.encodeWithTag(writer, 2, (int) value.getScreen());
                }
                if (value.getEvent_type() != UserInteractionEventData.EventType.EVENT_TYPE_UNSPECIFIED) {
                    UserInteractionEventData.EventType.ADAPTER.encodeWithTag(writer, 1, (int) value.getEvent_type());
                }
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UserInteractionEventData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                UserInteractionEventData.EventType eventTypeDecode = UserInteractionEventData.EventType.EVENT_TYPE_UNSPECIFIED;
                UserInteractionEventData.Action action = UserInteractionEventData.Action.ACTION_UNSPECIFIED;
                long jBeginMessage = reader.beginMessage();
                Screen screenDecode = null;
                Component componentDecode = null;
                Context contextDecode = null;
                ComponentHierarchy componentHierarchyDecode = null;
                UserInteractionEventData.Action actionDecode = action;
                while (true) {
                    UserInteractionEventData.EventType eventType = eventTypeDecode;
                    while (true) {
                        int iNextTag = reader.nextTag();
                        if (iNextTag != -1) {
                            switch (iNextTag) {
                                case 1:
                                    try {
                                        eventTypeDecode = UserInteractionEventData.EventType.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                                        break;
                                    }
                                case 2:
                                    screenDecode = Screen.ADAPTER.decode(reader);
                                    break;
                                case 3:
                                    componentDecode = Component.ADAPTER.decode(reader);
                                    break;
                                case 4:
                                    try {
                                        actionDecode = UserInteractionEventData.Action.ADAPTER.decode(reader);
                                        break;
                                    } catch (ProtoAdapter.EnumConstantNotFoundException e2) {
                                        reader.addUnknownField(iNextTag, FieldEncoding.VARINT, Long.valueOf(e2.value));
                                        break;
                                    }
                                case 5:
                                    contextDecode = Context.ADAPTER.decode(reader);
                                    break;
                                case 6:
                                    componentHierarchyDecode = ComponentHierarchy.ADAPTER.decode(reader);
                                    break;
                                default:
                                    reader.readUnknownField(iNextTag);
                                    break;
                            }
                        } else {
                            return new UserInteractionEventData(eventType, screenDecode, componentDecode, actionDecode, contextDecode, componentHierarchyDecode, reader.endMessageAndGetUnknownFields(jBeginMessage));
                        }
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UserInteractionEventData redact(UserInteractionEventData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                Screen screen = value.getScreen();
                Screen screenRedact = screen != null ? Screen.ADAPTER.redact(screen) : null;
                Component component = value.getComponent();
                Component componentRedact = component != null ? Component.ADAPTER.redact(component) : null;
                Context context = value.getContext();
                Context contextRedact = context != null ? Context.ADAPTER.redact(context) : null;
                ComponentHierarchy component_hierarchy = value.getComponent_hierarchy();
                return UserInteractionEventData.copy$default(value, null, screenRedact, componentRedact, null, contextRedact, component_hierarchy != null ? ComponentHierarchy.ADAPTER.redact(component_hierarchy) : null, ByteString.EMPTY, 9, null);
            }
        };
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserInteractionEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001c\b\u0086\u0081\u0002\u0018\u0000 \u001f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u001fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001e¨\u0006 "}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "EVENT_TYPE_UNSPECIFIED", "TAP", "APPEAR", "SCROLL", "LONG_PRESS", "DRAG", "SCREENSHOT", "CLICK", "SWIPE", CredentialProviderBaseController.TYPE_TAG, "NETWORK", "DEEPLINK", "DISAPPEAR", "PLAID_IAV", "SCREEN_TRANSITION_APPEAR", "SCREEN_TRANSITION_DISAPPEAR", "INITIALIZE_PLAID", "DOUBLE_TAP", "SCREEN_CAPTURE", "KEYBOARD_SHORTCUT", "PLAID_ACATS_IN", "SELFIE_STATE_UPDATE", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class EventType implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ EventType[] $VALUES;

        @JvmField
        public static final ProtoAdapter<EventType> ADAPTER;
        public static final EventType APPEAR;
        public static final EventType CLICK;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EventType DEEPLINK;
        public static final EventType DISAPPEAR;
        public static final EventType DOUBLE_TAP;
        public static final EventType DRAG;
        public static final EventType EVENT_TYPE_UNSPECIFIED;
        public static final EventType INITIALIZE_PLAID;
        public static final EventType KEYBOARD_SHORTCUT;
        public static final EventType LONG_PRESS;
        public static final EventType NETWORK;
        public static final EventType PLAID_ACATS_IN;
        public static final EventType PLAID_IAV;
        public static final EventType SCREENSHOT;
        public static final EventType SCREEN_CAPTURE;
        public static final EventType SCREEN_TRANSITION_APPEAR;
        public static final EventType SCREEN_TRANSITION_DISAPPEAR;
        public static final EventType SCROLL;
        public static final EventType SELFIE_STATE_UPDATE;
        public static final EventType SWIPE;
        public static final EventType TAP;
        public static final EventType TYPE;
        private final int value;

        private static final /* synthetic */ EventType[] $values() {
            return new EventType[]{EVENT_TYPE_UNSPECIFIED, TAP, APPEAR, SCROLL, LONG_PRESS, DRAG, SCREENSHOT, CLICK, SWIPE, TYPE, NETWORK, DEEPLINK, DISAPPEAR, PLAID_IAV, SCREEN_TRANSITION_APPEAR, SCREEN_TRANSITION_DISAPPEAR, INITIALIZE_PLAID, DOUBLE_TAP, SCREEN_CAPTURE, KEYBOARD_SHORTCUT, PLAID_ACATS_IN, SELFIE_STATE_UPDATE};
        }

        @JvmStatic
        public static final EventType fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<EventType> getEntries() {
            return $ENTRIES;
        }

        private EventType(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final EventType eventType = new EventType("EVENT_TYPE_UNSPECIFIED", 0, 0);
            EVENT_TYPE_UNSPECIFIED = eventType;
            TAP = new EventType("TAP", 1, 1);
            APPEAR = new EventType("APPEAR", 2, 2);
            SCROLL = new EventType("SCROLL", 3, 3);
            LONG_PRESS = new EventType("LONG_PRESS", 4, 4);
            DRAG = new EventType("DRAG", 5, 5);
            SCREENSHOT = new EventType("SCREENSHOT", 6, 6);
            CLICK = new EventType("CLICK", 7, 7);
            SWIPE = new EventType("SWIPE", 8, 8);
            TYPE = new EventType(CredentialProviderBaseController.TYPE_TAG, 9, 9);
            NETWORK = new EventType("NETWORK", 10, 10);
            DEEPLINK = new EventType("DEEPLINK", 11, 11);
            DISAPPEAR = new EventType("DISAPPEAR", 12, 12);
            PLAID_IAV = new EventType("PLAID_IAV", 13, 13);
            SCREEN_TRANSITION_APPEAR = new EventType("SCREEN_TRANSITION_APPEAR", 14, 14);
            SCREEN_TRANSITION_DISAPPEAR = new EventType("SCREEN_TRANSITION_DISAPPEAR", 15, 15);
            INITIALIZE_PLAID = new EventType("INITIALIZE_PLAID", 16, 16);
            DOUBLE_TAP = new EventType("DOUBLE_TAP", 17, 17);
            SCREEN_CAPTURE = new EventType("SCREEN_CAPTURE", 18, 18);
            KEYBOARD_SHORTCUT = new EventType("KEYBOARD_SHORTCUT", 19, 19);
            PLAID_ACATS_IN = new EventType("PLAID_ACATS_IN", 20, 20);
            SELFIE_STATE_UPDATE = new EventType("SELFIE_STATE_UPDATE", 21, 21);
            EventType[] eventTypeArr$values = $values();
            $VALUES = eventTypeArr$values;
            $ENTRIES = EnumEntries2.enumEntries(eventTypeArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(EventType.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EventType>(orCreateKotlinClass, syntax, eventType) { // from class: com.robinhood.rosetta.eventlogging.UserInteractionEventData$EventType$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public UserInteractionEventData.EventType fromValue(int value) {
                    return UserInteractionEventData.EventType.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: UserInteractionEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$EventType;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final EventType fromValue(int value) {
                switch (value) {
                    case 0:
                        return EventType.EVENT_TYPE_UNSPECIFIED;
                    case 1:
                        return EventType.TAP;
                    case 2:
                        return EventType.APPEAR;
                    case 3:
                        return EventType.SCROLL;
                    case 4:
                        return EventType.LONG_PRESS;
                    case 5:
                        return EventType.DRAG;
                    case 6:
                        return EventType.SCREENSHOT;
                    case 7:
                        return EventType.CLICK;
                    case 8:
                        return EventType.SWIPE;
                    case 9:
                        return EventType.TYPE;
                    case 10:
                        return EventType.NETWORK;
                    case 11:
                        return EventType.DEEPLINK;
                    case 12:
                        return EventType.DISAPPEAR;
                    case 13:
                        return EventType.PLAID_IAV;
                    case 14:
                        return EventType.SCREEN_TRANSITION_APPEAR;
                    case 15:
                        return EventType.SCREEN_TRANSITION_DISAPPEAR;
                    case 16:
                        return EventType.INITIALIZE_PLAID;
                    case 17:
                        return EventType.DOUBLE_TAP;
                    case 18:
                        return EventType.SCREEN_CAPTURE;
                    case 19:
                        return EventType.KEYBOARD_SHORTCUT;
                    case 20:
                        return EventType.PLAID_ACATS_IN;
                    case 21:
                        return EventType.SELFIE_STATE_UPDATE;
                    default:
                        return null;
                }
            }
        }

        public static EventType valueOf(String str) {
            return (EventType) Enum.valueOf(EventType.class, str);
        }

        public static EventType[] values() {
            return (EventType[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UserInteractionEventData.kt */
    @Metadata(m3635d1 = {"\u0000\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0003\b÷\u0004\b\u0086\u0081\u0002\u0018\u0000 ú\u00042\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0002ú\u0004B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002j\u0003\b\u008d\u0002j\u0003\b\u008e\u0002j\u0003\b\u008f\u0002j\u0003\b\u0090\u0002j\u0003\b\u0091\u0002j\u0003\b\u0092\u0002j\u0003\b\u0093\u0002j\u0003\b\u0094\u0002j\u0003\b\u0095\u0002j\u0003\b\u0096\u0002j\u0003\b\u0097\u0002j\u0003\b\u0098\u0002j\u0003\b\u0099\u0002j\u0003\b\u009a\u0002j\u0003\b\u009b\u0002j\u0003\b\u009c\u0002j\u0003\b\u009d\u0002j\u0003\b\u009e\u0002j\u0003\b\u009f\u0002j\u0003\b \u0002j\u0003\b¡\u0002j\u0003\b¢\u0002j\u0003\b£\u0002j\u0003\b¤\u0002j\u0003\b¥\u0002j\u0003\b¦\u0002j\u0003\b§\u0002j\u0003\b¨\u0002j\u0003\b©\u0002j\u0003\bª\u0002j\u0003\b«\u0002j\u0003\b¬\u0002j\u0003\b\u00ad\u0002j\u0003\b®\u0002j\u0003\b¯\u0002j\u0003\b°\u0002j\u0003\b±\u0002j\u0003\b²\u0002j\u0003\b³\u0002j\u0003\b´\u0002j\u0003\bµ\u0002j\u0003\b¶\u0002j\u0003\b·\u0002j\u0003\b¸\u0002j\u0003\b¹\u0002j\u0003\bº\u0002j\u0003\b»\u0002j\u0003\b¼\u0002j\u0003\b½\u0002j\u0003\b¾\u0002j\u0003\b¿\u0002j\u0003\bÀ\u0002j\u0003\bÁ\u0002j\u0003\bÂ\u0002j\u0003\bÃ\u0002j\u0003\bÄ\u0002j\u0003\bÅ\u0002j\u0003\bÆ\u0002j\u0003\bÇ\u0002j\u0003\bÈ\u0002j\u0003\bÉ\u0002j\u0003\bÊ\u0002j\u0003\bË\u0002j\u0003\bÌ\u0002j\u0003\bÍ\u0002j\u0003\bÎ\u0002j\u0003\bÏ\u0002j\u0003\bÐ\u0002j\u0003\bÑ\u0002j\u0003\bÒ\u0002j\u0003\bÓ\u0002j\u0003\bÔ\u0002j\u0003\bÕ\u0002j\u0003\bÖ\u0002j\u0003\b×\u0002j\u0003\bØ\u0002j\u0003\bÙ\u0002j\u0003\bÚ\u0002j\u0003\bÛ\u0002j\u0003\bÜ\u0002j\u0003\bÝ\u0002j\u0003\bÞ\u0002j\u0003\bß\u0002j\u0003\bà\u0002j\u0003\bá\u0002j\u0003\bâ\u0002j\u0003\bã\u0002j\u0003\bä\u0002j\u0003\bå\u0002j\u0003\bæ\u0002j\u0003\bç\u0002j\u0003\bè\u0002j\u0003\bé\u0002j\u0003\bê\u0002j\u0003\bë\u0002j\u0003\bì\u0002j\u0003\bí\u0002j\u0003\bî\u0002j\u0003\bï\u0002j\u0003\bð\u0002j\u0003\bñ\u0002j\u0003\bò\u0002j\u0003\bó\u0002j\u0003\bô\u0002j\u0003\bõ\u0002j\u0003\bö\u0002j\u0003\b÷\u0002j\u0003\bø\u0002j\u0003\bù\u0002j\u0003\bú\u0002j\u0003\bû\u0002j\u0003\bü\u0002j\u0003\bý\u0002j\u0003\bþ\u0002j\u0003\bÿ\u0002j\u0003\b\u0080\u0003j\u0003\b\u0081\u0003j\u0003\b\u0082\u0003j\u0003\b\u0083\u0003j\u0003\b\u0084\u0003j\u0003\b\u0085\u0003j\u0003\b\u0086\u0003j\u0003\b\u0087\u0003j\u0003\b\u0088\u0003j\u0003\b\u0089\u0003j\u0003\b\u008a\u0003j\u0003\b\u008b\u0003j\u0003\b\u008c\u0003j\u0003\b\u008d\u0003j\u0003\b\u008e\u0003j\u0003\b\u008f\u0003j\u0003\b\u0090\u0003j\u0003\b\u0091\u0003j\u0003\b\u0092\u0003j\u0003\b\u0093\u0003j\u0003\b\u0094\u0003j\u0003\b\u0095\u0003j\u0003\b\u0096\u0003j\u0003\b\u0097\u0003j\u0003\b\u0098\u0003j\u0003\b\u0099\u0003j\u0003\b\u009a\u0003j\u0003\b\u009b\u0003j\u0003\b\u009c\u0003j\u0003\b\u009d\u0003j\u0003\b\u009e\u0003j\u0003\b\u009f\u0003j\u0003\b \u0003j\u0003\b¡\u0003j\u0003\b¢\u0003j\u0003\b£\u0003j\u0003\b¤\u0003j\u0003\b¥\u0003j\u0003\b¦\u0003j\u0003\b§\u0003j\u0003\b¨\u0003j\u0003\b©\u0003j\u0003\bª\u0003j\u0003\b«\u0003j\u0003\b¬\u0003j\u0003\b\u00ad\u0003j\u0003\b®\u0003j\u0003\b¯\u0003j\u0003\b°\u0003j\u0003\b±\u0003j\u0003\b²\u0003j\u0003\b³\u0003j\u0003\b´\u0003j\u0003\bµ\u0003j\u0003\b¶\u0003j\u0003\b·\u0003j\u0003\b¸\u0003j\u0003\b¹\u0003j\u0003\bº\u0003j\u0003\b»\u0003j\u0003\b¼\u0003j\u0003\b½\u0003j\u0003\b¾\u0003j\u0003\b¿\u0003j\u0003\bÀ\u0003j\u0003\bÁ\u0003j\u0003\bÂ\u0003j\u0003\bÃ\u0003j\u0003\bÄ\u0003j\u0003\bÅ\u0003j\u0003\bÆ\u0003j\u0003\bÇ\u0003j\u0003\bÈ\u0003j\u0003\bÉ\u0003j\u0003\bÊ\u0003j\u0003\bË\u0003j\u0003\bÌ\u0003j\u0003\bÍ\u0003j\u0003\bÎ\u0003j\u0003\bÏ\u0003j\u0003\bÐ\u0003j\u0003\bÑ\u0003j\u0003\bÒ\u0003j\u0003\bÓ\u0003j\u0003\bÔ\u0003j\u0003\bÕ\u0003j\u0003\bÖ\u0003j\u0003\b×\u0003j\u0003\bØ\u0003j\u0003\bÙ\u0003j\u0003\bÚ\u0003j\u0003\bÛ\u0003j\u0003\bÜ\u0003j\u0003\bÝ\u0003j\u0003\bÞ\u0003j\u0003\bß\u0003j\u0003\bà\u0003j\u0003\bá\u0003j\u0003\bâ\u0003j\u0003\bã\u0003j\u0003\bä\u0003j\u0003\bå\u0003j\u0003\bæ\u0003j\u0003\bç\u0003j\u0003\bè\u0003j\u0003\bé\u0003j\u0003\bê\u0003j\u0003\bë\u0003j\u0003\bì\u0003j\u0003\bí\u0003j\u0003\bî\u0003j\u0003\bï\u0003j\u0003\bð\u0003j\u0003\bñ\u0003j\u0003\bò\u0003j\u0003\bó\u0003j\u0003\bô\u0003j\u0003\bõ\u0003j\u0003\bö\u0003j\u0003\b÷\u0003j\u0003\bø\u0003j\u0003\bù\u0003j\u0003\bú\u0003j\u0003\bû\u0003j\u0003\bü\u0003j\u0003\bý\u0003j\u0003\bþ\u0003j\u0003\bÿ\u0003j\u0003\b\u0080\u0004j\u0003\b\u0081\u0004j\u0003\b\u0082\u0004j\u0003\b\u0083\u0004j\u0003\b\u0084\u0004j\u0003\b\u0085\u0004j\u0003\b\u0086\u0004j\u0003\b\u0087\u0004j\u0003\b\u0088\u0004j\u0003\b\u0089\u0004j\u0003\b\u008a\u0004j\u0003\b\u008b\u0004j\u0003\b\u008c\u0004j\u0003\b\u008d\u0004j\u0003\b\u008e\u0004j\u0003\b\u008f\u0004j\u0003\b\u0090\u0004j\u0003\b\u0091\u0004j\u0003\b\u0092\u0004j\u0003\b\u0093\u0004j\u0003\b\u0094\u0004j\u0003\b\u0095\u0004j\u0003\b\u0096\u0004j\u0003\b\u0097\u0004j\u0003\b\u0098\u0004j\u0003\b\u0099\u0004j\u0003\b\u009a\u0004j\u0003\b\u009b\u0004j\u0003\b\u009c\u0004j\u0003\b\u009d\u0004j\u0003\b\u009e\u0004j\u0003\b\u009f\u0004j\u0003\b \u0004j\u0003\b¡\u0004j\u0003\b¢\u0004j\u0003\b£\u0004j\u0003\b¤\u0004j\u0003\b¥\u0004j\u0003\b¦\u0004j\u0003\b§\u0004j\u0003\b¨\u0004j\u0003\b©\u0004j\u0003\bª\u0004j\u0003\b«\u0004j\u0003\b¬\u0004j\u0003\b\u00ad\u0004j\u0003\b®\u0004j\u0003\b¯\u0004j\u0003\b°\u0004j\u0003\b±\u0004j\u0003\b²\u0004j\u0003\b³\u0004j\u0003\b´\u0004j\u0003\bµ\u0004j\u0003\b¶\u0004j\u0003\b·\u0004j\u0003\b¸\u0004j\u0003\b¹\u0004j\u0003\bº\u0004j\u0003\b»\u0004j\u0003\b¼\u0004j\u0003\b½\u0004j\u0003\b¾\u0004j\u0003\b¿\u0004j\u0003\bÀ\u0004j\u0003\bÁ\u0004j\u0003\bÂ\u0004j\u0003\bÃ\u0004j\u0003\bÄ\u0004j\u0003\bÅ\u0004j\u0003\bÆ\u0004j\u0003\bÇ\u0004j\u0003\bÈ\u0004j\u0003\bÉ\u0004j\u0003\bÊ\u0004j\u0003\bË\u0004j\u0003\bÌ\u0004j\u0003\bÍ\u0004j\u0003\bÎ\u0004j\u0003\bÏ\u0004j\u0003\bÐ\u0004j\u0003\bÑ\u0004j\u0003\bÒ\u0004j\u0003\bÓ\u0004j\u0003\bÔ\u0004j\u0003\bÕ\u0004j\u0003\bÖ\u0004j\u0003\b×\u0004j\u0003\bØ\u0004j\u0003\bÙ\u0004j\u0003\bÚ\u0004j\u0003\bÛ\u0004j\u0003\bÜ\u0004j\u0003\bÝ\u0004j\u0003\bÞ\u0004j\u0003\bß\u0004j\u0003\bà\u0004j\u0003\bá\u0004j\u0003\bâ\u0004j\u0003\bã\u0004j\u0003\bä\u0004j\u0003\bå\u0004j\u0003\bæ\u0004j\u0003\bç\u0004j\u0003\bè\u0004j\u0003\bé\u0004j\u0003\bê\u0004j\u0003\bë\u0004j\u0003\bì\u0004j\u0003\bí\u0004j\u0003\bî\u0004j\u0003\bï\u0004j\u0003\bð\u0004j\u0003\bñ\u0004j\u0003\bò\u0004j\u0003\bó\u0004j\u0003\bô\u0004j\u0003\bõ\u0004j\u0003\bö\u0004j\u0003\b÷\u0004j\u0003\bø\u0004j\u0003\bù\u0004¨\u0006û\u0004"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "ACTION_UNSPECIFIED", "APPROVE", "DISMISS", "UNDO", "SAVE", "CONTINUE", "SKIP", "EXPAND", "COLLAPSE", "APPLY_FILTERS", "CLEAR_FILTERS", "SUBMIT_FEEDBACK", "OPEN_URL", "BACK", "SELECT", "DESELECT", "LEARN_MORE", "SUBMIT", "EDIT", "SEND", "RECEIVE", "COPY", "ENTER_TRANSFER_ADDRESS", "PRIMARY_CTA", "VOTE", "SHARE", "DONE", "JOIN_WAITLIST", "VIEW_INBOX", "VIEW_SEARCH", "REMOVE_SCRUB", "LOGOUT", "SECONDARY_CTA", "KEEP_ME_LOGGED_IN", "OMNISCAN", "IMPORT", "CANCEL", "CLEAR_STALE_DATA", "VIEW_USER_AGREEMENT", "TOGGLE_ON", "TOGGLE_OFF", "OPEN_SHORTCUTS_MODAL", "FOCUS_BUY_TAB", "FOCUS_SEARCH_BAR", "FOCUS_SELL_TAB", "SORT_ASCENDING", "SORT_DESCENDING", "SORT_RESET", "DOWNLOAD", "RELOAD_LOGIN_AFTER_ERROR", "OPEN_FAQ", "DELETE", "PAY", "REQUEST", "VIEW_PROFILE", "PAY_BY_PHONE", "PAY_BY_EMAIL", "DENY", "TIMEOUT", "ACCEPT", "DECLINE", "REMIND", "FUND", "BUY", "TEXT_SENT", "EMAIL_SENT", "CONFIRM_PIN", "RETRY_SETUP_PIN", "COMPLETE_SETUP_PIN", "ANIMATION", "CHALLENGE_FALLBACK", "MANAGE_VISIBILITY", "SELL", "OPEN_POSITION", "CLOSE_POSITION", "CONFIRM", "ADD_WIDGET", "REMOVE_WIDGET", "ZOOM", "REPORT", "MICROGRAM_INSTALL", "VIEW_ALL", "FROM_ACCOUNT_DEFAULT", "TO_ACCOUNT_TYPE", "PLACE_MARKET_ORDER", "PLACE_LIMIT_ORDER", "PLACE_STOP_MARKET_ORDER", "START_TYPING", "FINISH_TYPING", "SWIPE_INITIATED", "SWIPE_COMPLETED", "HALF_EXPAND", "SCROLL_HORIZONTALLY", "OPEN_RH_MAIN_APP", "CHANGE_COUNTRY_CODE", "RETRY", "REFRESH", "FETCH", "TYPE_SEARCH_QUERY", "VIEW_SEARCH_RESULT", "CANCEL_SEARCH_QUERY", "CLEAR_SEARCH_QUERY", "SEARCH_SHOW_MORE_CRYPTOS", "VIEW_RECENT_SEARCH_ITEM", "PLAY", "PAUSE", "SKIP_FORWARD", "SKIP_BACKWARD", "REPLAY", "MUTE", "UNMUTE", "SCRUB", "REQUEST_CX_CALL", "REQUEUE_CX_CALL", "CANCEL_CX_CALL", "CONTACT_SIGN_IN", "SELECT_CALL_SCHEDULE_OPTION", "VIEW_EDIT_CALL_SCHEDULE", "RECORD_VOICE", "BEGIN_SELFIE_VERIFICATION", "VIEW_LOGIN", "VIEW_SETTINGS", "UPDATE_VOICE_VERIFICATION", "NEED_HELP", "VIEW_CX_CHAT_THREAD", "END_CX_CHAT", "END_CX_CHAT_CONFIRM", "START_NEW_INQUIRY", "VIEW_DEEPLINK", "CHAT_ACTION", "CHATBOT_ACTION", "VIEW_CX_CHATBOT", "CANCEL_APPOINTMENT", "RESCHEDULE_APPOINTMENT", "SCHEDULE_APPOINTMENT", "COMPLETE_DD_FLOW", "START_DD_SWITCHER_AUTHENTICATION", "COMPLETE_DD_SWITCHER", "SELECT_DD_SWITCHER_COMPANY", "SELECT_DD_SWITCHER_PAYROLL", "SELECT_DD_SWITCHER_PARTIAL_AMOUNT", "SEARCH_DD_SWITCHER_COMPANY", "CREATE_NEW_LIST", "FOLLOW_ROBINHOOD_LIST", "UNFOLLOW_ROBINHOOD_LIST", "UPDATE_LIST_ITEMS", "TAP_OPTION_INSTRUMENT_ROW", "TAP_OPTION_INSTRUMENT_PRIMARY_BUTTON", "TAP_OPTION_INSTRUMENT_SECONDARY_BUTTON", "MULTILEG_SELECT", "MULTILEG_CANCEL", "MULTILEG_CLEAR", "TRADE", "REVIEW", "VIEW_OPTION_CHAIN_STOCK_CHART", "HIDE_OPTION_CHAIN_STOCK_CHART", "VIEW_OPTION_CHAIN", "VIEW_EXERCISE_OPTION_FLOW", "VIEW_OPTION_WATCHLIST_HUB", "VIEW_OPTION_STRATEGY_DETAIL", "SORT_OPTION_WATCHLIST", "REARRANGE_OPTION_WATCHLIST", "OPTION_WATCHLIST_CHART_SCRUB", "VIEW_OPTION_ORDER", "VIEW_OPTION_WATCHLIST_ABOUT", "CHANGE_PRIMARY_OPTION_CHART_LINE", "VIEW_OPTION_TYPE", "CONFIRM_OPTION_ATTESTATION", "DENY_OPTION_ATTESTATION", "OPTION_CHAIN_LEGACY_STALLING", "OPTION_CHAIN_NAPA_STALLING", "VIEW_OPTION_CHAIN_SETTINGS", "VIEW_STRATEGY_BUILDER_NUX", "VIEW_STRATEGY_CHAIN", "VIEW_STRATEGY_CHAIN_DISCLOSURE", "VIEW_OPTION_ORDER_FORM", "VIEW_OPTIONS_STATISTICS_BOTTOM_SHEET", "VIEW_STRATEGY_CHAIN_BOTTOM_SHEET", "VIEW_STRATEGY_BUILDER", "VIEW_RETIREMENT_OPTIONS_DISCLOSURES", "VIEW_OPTION_INSTRUMENT_QUOTE_DETAIL", "VIEW_OPTION_ORDER_DETAIL", "VIEW_OPTION_FEE_RATE", "OPTION_CHAIN_SWITCH_TO_BUY", "OPTION_CHAIN_SWITCH_TO_SELL", "OPTION_CHAIN_SWITCH_TO_CALL", "OPTION_CHAIN_SWITCH_TO_PUT", "ENABLE_OPTIONS_TRADING", "VIEW_OPTION_UPGRADE_FLOW", "ENTER_RECURRING_CREATION", "SELECT_RECURRING_FREQUENCY", "SET_RECURRING_START_DATE", "SELECT_PAYMENT_METHOD", "ADD_PAYMENT_METHOD", "ADD_PAYMENT_METHOD_SUCCESS", "SET_RECURRING_AMOUNT", "VIEW_RECURRING_HUB", "VIEW_RECURRING_FIND_INVESTMENT", "VIEW_RECURRING_DETAILS", "SET_RECURRING_NEXT_ORDER_DATE", "EDIT_RECURRING_ORDER_DATE", "DELETE_RECURRING_INVESTMENT", "EDIT_RECURRING_INVESTMENT", "PAUSE_RECURRING_INVESTMENT", "SET_UP_DIRECT_DEPOSIT", "SELECT_DOLLAR_AMOUNT", "SELECT_PERCENTAGE_AMOUNT", "CANCEL_RECURRING_CREATION", "SELECT_BACKUP_PAYMENT_METHOD", "ALREADY_SET_UP_DIRECT_DEPOSIT", "RECURRING_SELECT_INVESTMENTS", "RECURRING_SELECT_BROKERAGE_CASH", "RECS_RECURRING_KEEP_LAST_ORDER", "RECS_RECURRING_START_FROM_SCRATCH", "RECURRING_SELECT_ROTH_IRA", "RECURRING_SELECT_TRADITIONAL_IRA", "RECURRING_SELECT_RETIREMENT_SIGN_UP", "VIEW_ADVANCED_CHARTS", "CHANGE_CHART_SPAN", "TOGGLE_PRICE_CHART_TYPE", "EDIT_INDICATOR", "REMOVE_INDICATOR", "CREATE_INDICATOR", "REVIEW_INVESTOR_PROFILE", "CANCEL_ORDER", "REPLACE_ORDER", "VIEW_TRADE_CONFIRMATION", "CONVERT_TO_LIMIT_ORDER", "GOLD_UPSELL_UPGRADE", "VIEW_EARNINGS_CALL", "VIEW_SIP_DISCLOSURE", "EQUITY_SELECT_ORDER_KIND", "EQUITY_SUBMIT_ORDER", "EQUITY_ORDER_SUCCESS", "EQUITY_ORDER_FAILURE", "VIEW_ORDER_TYPES", "SELECT_ORDER_TYPE", "SUBMIT_ORDER", "VIEW_NEWS_ARTICLE", "VIEW_BROWSE_NEWSFEED_THEATRE", "VIEW_STOCK_NEWSFEED", "VIEW_FEEDBACK_BOTTOM_SHEET", "VIEW_CRYPTO_NEWSFEED", "VIEW_NEWSFEED_DISCLOSURE", "VIEW_NEWSFEED_PAGE", "VIEW_CX_CALL_STATUS", "VIEW_CX_EMAIL_SUPPORT", "VIEW_CX_CONTACT_US_FLOW", "VIEW_DD_INTRO", "VIEW_DD_SETUP_CHOICE", "VIEW_DD_ACCOUNT_INFO", "VIEW_DD_PREFILLED_INTRO", "VIEW_DD_CONFIRM_EMPLOYER", "VIEW_DD_UPDATE_EMPLOYER", "VIEW_DD_UNSIGNED_FORM", "VIEW_DD_SIGNATURE", "VIEW_DD_SIGNED_FORM", "VIEW_DD_CONGRATULATIONS", "VIEW_DD_SWITCHER_SEARCH_COMPANY", "VIEW_DD_SWITCHER_SEARCH_PAYROLL", "VIEW_DD_SWITCHER_AUTHENTICATION", "VIEW_DD_SWITCHER_AUTHENTICATION_SUCCESS", "VIEW_DD_SWITCHER_AUTHENTICATION_ERROR", "VIEW_DD_SWITCHER_AUTHENTICATION_MFA", "VIEW_DD_SWITCHER_FORGOT_CREDENTIALS", "VIEW_DD_PARTIAL_PAYCHECK", "VIEW_DIRECT_DEPOSIT", "VIEW_PAYCHECK_HUB", "CREATE_PAYCHECK_INVESTMENT", "MANAGE_PAYCHECK_INVESTMENTS", "CANCEL_DISPUTE", "VIEW_HOME", "VIEW_STOCK_DETAIL_PAGE", "VIEW_CRYPTO_DETAIL_PAGE", "FIND_INVESTMENT", "REMOVE_FROM_BASKET", "ADD_TO_BASKET", "SUBMIT_INVEST_FLOW_ORDER", "EDIT_BASKET", "FIND_AN_INVESTMENT", "UPDATE_PAYMENT_METHOD", "ENABLE_ALERT", "DISABLE_ALERT", "SELECT_PERFORMANCE_CHART_VIEW", "VIEW_PERFORMANCE_CHART_MANUAL", "SET_UP_IRA", "UPDATE_USERS_POSITION_SORT", "VIEW_LIST_DISCOVERY_HUB", "VIEW_ROBINHOOD_LIST_DETAIL_PAGE", "VIEW_EXPANDED_LIST_CAROUSEL", "VIEW_ADD_TO_LIST_BOTTOM_SHEET", "VIEW_CALENDAR_DATE_PICKER", "VIEW_EDIT_PHONE_NUMBER", "TURN_ON_NOTIFICATION", "EDIT_INVESTMENT_PROFILE", "DELETE_ALERT", "VIEW_LEARNING_LESSON", "ANSWER_QUESTION", "VIEW_SAFETY_LABEL_LESSON", "VIEW_EDUCATION_TOUR", "VIEW_EDUCATION_HOME", "VIEW_PROCESSING_TIMES", "CANCEL_TRANSFER", "VIEW_TRANSFER_DETAILS", "VIEW_FUNDING", "VIEW_BANK_LINKING", "VIEW_GOLD_UPGRADE", "IAV_SELECT_BANK_ACCOUNT", "REVIEW_QUEUED_DEPOSIT", "SUBMIT_QUEUED_DEPOSIT", "REVIEW_TRANSFER", "SUBMIT_TRANSFER", "ENTER_TRANSFER_AMOUNT", "SELECT_ACCOUNT", "SELECT_FREQUENCY", "SCHEDULE_AUTOMATIC_DEPOSIT", "WITHDRAW_MONEY", "VIEW_TRANSFER_MONEY", "SKIP_RECURRING_DEPOSIT", "VIEW_LIMIT_HUB", "INCOMING_WIRE", "VIEW_DD_SETUP", "APPLE_PAY_LINKING", "POST_TRANSFER_UPSELL", "ENTER_REDEMPTION_FLOW", "CLAIM_STOCK_BEGIN", "CLAIM_CHOSEN_STOCK", "HELP_ME_PICK", "CLAIM_REWARD", "DECLINE_REWARD", "CONFIRM_DECLINE_REWARD", "CANCEL_DECLINE_REWARD", "EARN_REWARDS", "VIEW_ALL_OFFERS", "ENTER_REFERRAL_FLOW", "INVITE_CONTACTS", "SHARE_LINK", "PAST", "INVITE", "INVITE_MORE_FRIENDS", "OFFER_PRIMARY_CTA", "OFFER_SECONDARY_CTA", "SHARE_TO_TWITTER", "FELIX_CLOSE_EXPERIENCE", "FELIX_SCREENSHOT", "FELIX_CLICK_DONE", "FELIX_VIEW_OUTRO_LINK", "FELIX_VIEW_OUTRO_ANIMATION", "VIEW_PROSPECTUS", "TOGGLE_GRAPH_LINE_CANDLESTICKS", "CHANGE_GRAPH_INTERVAL", "SCRUB_GRAPH", "TOGGLE_ETP_COMPOSITION_VIEW", "TAP_ETP_ITEM", "VIEW_BEAR_RATING", "VIEW_BULL_RATING", "SCRUB_CANDLESTICK_CHART", "SCRUB_LINE_CHART", "TRADE_BAR_VIEW_ALL_OPTIONS", "TRADE_BAR_BUY", "TRADE_BAR_SELL", "LOGIN", "FORGOT_PASSWORD", "UPDATE_PASSWORD", "VERIFY_EMAIL", "VERIFY_PHONE", "UPDATE_TWO_FACTOR_AUTHENTICATION", "COPY_BACKUP_CODE", "RESEND_SMS_CODE", "RESEND_CHALLENGE", "MISSING_DEVICE_APPROVAL_NOTIFICATION", "REMOVE_ALL_DEVICES", "REMOVE_DEVICE", "REMOVE_ALL_DEVICES_CONFIRM", "RESET_PASSWORD", "FORGOT_EMAIL_PASSWORD", "ACCESS_TO_SOMEONE_ELSES_ACCOUNT", "VERIFIED_EMAIL", "RESEND_LINK", "FORGOT_EMAIL", "LOOKING_FOR_FACE", "FACE_BLURRY", "FACE_NOT_DETECTED", "FACE_DETECTED_CAPTURING", "PROCESSING_SELFIE", "SELFIE_VERIFICATION_SUCCESS", "SELFIE_VERIFICATION_FAILED", "SELFIE_UPLOAD_SUCCESS", "SELFIE_CAMERA_NOT_AUTHORIZED", "SELFIE_ENVIRONMENT_DARK", "SELFIE_CAMERA_BLOCKED", "SELFIE_EXCEEDED_MAX_RETRIES", "SELFIE_CAPTURE_RETRY", "SELFIE_GLARE_DETECTED", "SELFIE_FACE_NOT_STRAIGHT", "SELFIE_FACE_TOO_FAR", "SELFIE_FACE_TOO_CLOSE", "SELFIE_MULTIPLE_FACES_DETECTED", "VIEW_RHY_MIGRATION_ROUNDUP_UPSELL", "VIEW_RHY_MIGRATION_CASHBACK_UPSELL", "VIEW_RHY_MIGRATION_EARLY_DD_UPSELL", "VIEW_RHY_MIGRATION_SYP_UPSELL", "RHY_TURBOTAX_ACCOUNT_OPENED", "RHY_TURBOTAX_VISIT_NON_RHY", "RHY_TURBOTAX_VISIT_RHY", "RHY_MIGRATION_FEATURE_INTRO_OPEN_ACCOUNT", "RHY_MIGRATION_AGREE", "RHY_MIGRATION_CONFIRM_ADDRESS", "RHY_MIGRATION_OPEN_ACCOUNT_CONTINUE", "RHY_MIGRATION_OPEN_ACCOUNT_TIMEOUT_DONE", "RHY_MIGRATION_WHATS_CHANGING", "RHY_MIGRATION_EDIT_ADDRESS", "EXIT_RECS_FLOW", "SUBMIT_RECOMMENDATION_ORDER", "GET_ACCESS", "VIEW_ASSET_DETAIL_PAGE", "ADD_TO_LIST", "REMOVE_FROM_LIST", "SUBMIT_RECURRING_ORDER", "RECURRING_ORDER_SUCCESS", "RECURRING_ORDER_ERROR", "SELECT_ORDER_KIND", "ACATS_IN_NAME_NOT_MATCHING", "CONTACT_SUPPORT", "EXIT_ACATS_IN_FLOW", "ACATS_IN_CANT_FIND_BROKERAGE", "VIEW_ACATS_IN_TRANSFER", "CONFIRM_GIFT", "CANCEL_GIFT", "CLAIM_GIFT", "CLAIM_GIFT_DONE", "VIEW_CRYPTO_GIFT_HISTORY", "CREATE_CRYPTO_GIFT", "CANCEL_CRYPTO_GIFT", "ADD_BENEFICIARY", "EDIT_BENEFICIARY", "REMOVE_BENEFICIARY", "VIEW_BENEFICIARY_DETAIL", "VIEW_ROUNDUP_REWARD", "VIEW_HISTORY_ITEM", "VIEW_SEND_CHECK", "VIEW_RHY_SETTINGS", "ENABLE_EARLY_PAY", "DISABLE_EARLY_PAY", "VIEW_ROUNDUP_AMOUNT_FAQ", "VIEW_ROUNDUP_SET_ASIDE_FAQ", "SKIP_ROUNDUP_ORDER", "VIEW_CRYPTO_SIGNUP_NOTICE", "VIEW_SUITABILITY_NOTICE", "TAP_RHY_MIGRATION_FUNDING_AMOUNT", "SET_UP_MOBILE_WALLET", "UPGRADE_TO_CASH_CARD", "SLIP_ONBOARDING_CLICK_FAQS", "ENABLE_SLIP_STOCK_INTEREST", "DISABLE_SLIP_STOCK_INTEREST", "ENABLE_CASH_SWEEP", "DISABLE_CASH_SWEEP", "ADD_ACCOUNT", "DEBIT_CARD_LINKING", "BANK_LINKING", "DEPOSIT_MONEY", "DEBIT_CARD_LINKING_PRECHECK", "MARGIN_UPGRADE_SELECT_GOLD_INTEREST_RATE", "MARGIN_UPGRADE_SELECT_REGULAR_INTEREST_RATE", "VIEW_MARGIN_UPGRADE_DISCLOSURE_STATEMENT", "SET_MARGIN_LIMIT", "COVER_MARGIN_CALL_DEPOSIT_FUNDS", "COVER_MARGIN_CALL_SELL_STOCKS", "INSTANT_UPSELL_HELP_ARTICLE", "ENABLE_MARGIN_INVESTING", "SIGN_UP", "CREATE_LOGIN", "HIDE_PASSWORD", "SHOW_PASSWORD", "COMPLETE_USER_CREATION", "APP_TRACKING_TRANSPARENCY_ALLOW", "APP_TRACKING_TRANSPARENCY_DENY", "VERIFY_ID_INSTANTLY", "VERIFY_ID_MANUALLY", "MARKETING_EMAILS_OPT_IN", "MARKETING_EMAILS_OPT_OUT", "RESURRECTION_TAKEOVER_UPSELL", "ACCOUNT_STATE_CHANGED", "SIGN", "REJECT_DAPP", "ALLOW_DAPP", "CONFIRM_DAPP_TXN", "VIEW_BACKUPS", "VIEW_ACTIVITY_HISTORY", "PASTE", "SHOW_TOKEN_ACTIVITY", "DEPOSIT_TOKEN", "DELETE_BACKUP", "CREATE_NC_WALLET", "IMPORT_NC_WALLET", "RECOVER_NC_WALLET", "ENROLL_BIOMETRIC_AUTHENTICATION", "ENROLL_PIN", "VIEW_TOKEN_LIST", "SELECT_TOKEN", "RH_CORE_FUNDING_RETURN", "DISCONNECT_ALL", "SHOW_TXN_DETAIL", "CONFIRM_DISCONNECT", "DISCONNECT", "TRANSFER_FROM_ROBINHOOD", "REMOVE_WALLET", "SEE_DAPP_CONNECTIONS", "MANAGE_DAPP_CONNECTION", "TOGGLE_COIN_EXPLORE", "VIEW_CRYPTO_LIST_PAGE", "BEGIN_CRYPTO_TRANSFER", "BEGIN_TRANSFER_CRYPTO", "BEGIN_CRYPTO_DEPOSIT", "VIEW_STAKING", "ENTER_RH_CONNECT_FLOW", "ENTER_SARDINE_FLOW", "BUY_CRYPTO", "DEPOSIT_CRYPTO", "CRYPTO_TRANSFER_ENROLLMENT_SUCCESS", "VIEW_USER_LIST_DETAIL_PAGE", "ASSET_ROW_DISPLAY_VALUE_CHANGED_LAST_PRICE", "ASSET_ROW_DISPLAY_VALUE_CHANGED_EQUITY", "ASSET_ROW_DISPLAY_VALUE_CHANGED_RETURNS_TODAY", "ASSET_ROW_DISPLAY_VALUE_CHANGED_RETURNS_TOTAL", "VIEW_OPTION_AGGREGATE_DETAIL_PAGE", "VIEW_REFERRAL_OFFER", "VIEW_VIRTUAL_CARD", "TAP_RHY_REFERRALS_FUNDING_AMOUNT", "GOLD_UPGRADE_SUCCESS", "VIEW_GOLD_BILLING_DISCLOSURES_STATEMENT", "RH_GOLD_OFFER", "VIEW_PNL_HUB", "GROUP_BY", "LADDER_SELECT_BULK_PENDING_ORDERS", "LADDER_SWIPE_TO_DELETE_START", "LADDER_CANCEL_ORDER", "LADDER_DRAG_TO_MODIFY_START", "LADDER_MODIFY_ORDER", "FUTURES_DETAIL_VIEW_PICTURE_IN_PICTURE", "BACKUP_WALLET", "BACKUP_TO_ICLOUD", "BACKUP_MANUALLY", "ENABLE_NOTIFICATION", "ONBOARDING_COMPLETE", "VIEW_CASH_BALANCES_DETAILS_PAGE", "VIEW_MCW_DEPOSIT_FLOW", "VIEW_HOW_CASH_IS_CALCULATED", "VIEW_MCW_CONVERT_CURRENCY_FLOW", "EDIT_COLLATERAL", "EDIT_LEVERAGE", "EDIT_TP", "EDIT_SL", "VIEW_PDP", "FETCH_VERTIAS_DEVICE_ID", "SELFIE_START_RECORDING_CALLED", "SELFIE_DID_START_RECORDING_TO_CALLED", "SELFIE_STOP_RECORDING_CALLED", "SEFLIE_DID_FINISH_RECORDING_TO_CALLED", "SELFIE_PHOTO_CAPTURE_CALLED", "SELFIE_DID_FINISH_PROCESSING_PHOTO_CALLED", "SELECT_CURRENCY", "SWAP_INPUTS", "SET_CONVERSION_AMOUNT", "VIEW_FX_ORDER_DETAILS", "SELFIE_CAPTURE_HELPERS_INIT", "SELFIE_CAPTURE_MANAGERS_INIT", "VIEW_COMBO_ORDER_DETAIL", "SELFIE_CAPTURE_BROADCASTER_INIT", "OPEN_TAKEOVER", "VIEW_FUTURES_DETAIL_PAGE", "SHOW_DROPDOWN", "SELECT_SUPPORT_CHANNEL", "VIEW_EVENT_CONTRACT_DETAIL_PAGE", "VIEW_PICTURE_IN_PICTURE", "VIEW_EQUITY_TRADING_LADDER", "CRYPTO_TRANSFER_ADD_COST_BASIS_LOT_SUCCESS", "CRYPTO_TRANSFER_ADD_COST_BASIS_COMPLETED", "MARGIN_CALL_SUMMARY_TO_ORDER_DATA_MISMATCH", "CONNECT_FOUND_ACCOUNT", "VIEW_APPOINTMENT", "INITIATE_TAX_FLOW", "INITIATE_ESTATE_FLOW", "SWITCH_TAB", "VIEW_ACTIVITY_FEED", "COMPOSE", "SELECT_TRADE_TO_POST", "VIEW_POST_DETAIL_PAGE", "PULL_TO_REFRESH", "SCROLL_FEED", "TOGGLE_DISPLAY_TYPE", "INITIATE_COPY_TRADE", "LIKE", "UNLIKE", "VIEW_LIKES", "VIEW_COPY_TRADE_LIST", "OPEN_POST_MENU", "EDIT_POST", "CONFIRM_DELETE_POST", "SUBMIT_COMMENT", "LIKE_COMMENT", "UNLIKE_COMMENT", "VIEW_COMMENT_LIKE_COUNT", "QUICK_TRADE_BUY", "QUICK_TRADE_SELL", "QUICK_TRADE_SHORT", "FOLLOW_USER", "UNFOLLOW_USER", "VIEW_FOLLOWERS", "VIEW_FOLLOWING", "SUBMIT_POST", "CANCEL_POST_COMPOSER", "SELECT_LICENSE_STATUS", "SELECT_VIEW_ONLY_STATUS", "ACCEPT_AGREEMENT", "VIEW_SOCIAL_FEED", "EDIT_PROFILE", "UPLOAD_PROFILE_IMAGE", "EDIT_USERNAME", "EDIT_BIO", "ACTIVITY_ITEM_TAP", "SOCIAL_GET_STARTED", "SELECT_NOT_LICENSED", "SELECT_LICENSED", "VIEW_POSTS_ABOUT_INSTRUMENT", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Action implements WireEnum {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Action[] $VALUES;
        public static final Action ACATS_IN_CANT_FIND_BROKERAGE;

        @Deprecated
        public static final Action ACATS_IN_NAME_NOT_MATCHING;
        public static final Action ACCEPT;
        public static final Action ACCEPT_AGREEMENT;
        public static final Action ACCESS_TO_SOMEONE_ELSES_ACCOUNT;
        public static final Action ACCOUNT_STATE_CHANGED;
        public static final Action ACTION_UNSPECIFIED;
        public static final Action ACTIVITY_ITEM_TAP;

        @JvmField
        public static final ProtoAdapter<Action> ADAPTER;
        public static final Action ADD_ACCOUNT;
        public static final Action ADD_BENEFICIARY;
        public static final Action ADD_PAYMENT_METHOD;
        public static final Action ADD_PAYMENT_METHOD_SUCCESS;
        public static final Action ADD_TO_BASKET;
        public static final Action ADD_TO_LIST;
        public static final Action ADD_WIDGET;
        public static final Action ALLOW_DAPP;
        public static final Action ALREADY_SET_UP_DIRECT_DEPOSIT;
        public static final Action ANIMATION;
        public static final Action ANSWER_QUESTION;
        public static final Action APPLE_PAY_LINKING;
        public static final Action APPLY_FILTERS;
        public static final Action APPROVE;
        public static final Action APP_TRACKING_TRANSPARENCY_ALLOW;
        public static final Action APP_TRACKING_TRANSPARENCY_DENY;
        public static final Action ASSET_ROW_DISPLAY_VALUE_CHANGED_EQUITY;
        public static final Action ASSET_ROW_DISPLAY_VALUE_CHANGED_LAST_PRICE;
        public static final Action ASSET_ROW_DISPLAY_VALUE_CHANGED_RETURNS_TODAY;
        public static final Action ASSET_ROW_DISPLAY_VALUE_CHANGED_RETURNS_TOTAL;
        public static final Action BACK;
        public static final Action BACKUP_MANUALLY;
        public static final Action BACKUP_TO_ICLOUD;
        public static final Action BACKUP_WALLET;
        public static final Action BANK_LINKING;
        public static final Action BEGIN_CRYPTO_DEPOSIT;

        @Deprecated
        public static final Action BEGIN_CRYPTO_TRANSFER;
        public static final Action BEGIN_SELFIE_VERIFICATION;
        public static final Action BEGIN_TRANSFER_CRYPTO;
        public static final Action BUY;
        public static final Action BUY_CRYPTO;
        public static final Action CANCEL;
        public static final Action CANCEL_APPOINTMENT;
        public static final Action CANCEL_CRYPTO_GIFT;
        public static final Action CANCEL_CX_CALL;
        public static final Action CANCEL_DECLINE_REWARD;
        public static final Action CANCEL_DISPUTE;
        public static final Action CANCEL_GIFT;
        public static final Action CANCEL_ORDER;
        public static final Action CANCEL_POST_COMPOSER;
        public static final Action CANCEL_RECURRING_CREATION;
        public static final Action CANCEL_SEARCH_QUERY;
        public static final Action CANCEL_TRANSFER;
        public static final Action CHALLENGE_FALLBACK;
        public static final Action CHANGE_CHART_SPAN;
        public static final Action CHANGE_COUNTRY_CODE;
        public static final Action CHANGE_GRAPH_INTERVAL;
        public static final Action CHANGE_PRIMARY_OPTION_CHART_LINE;
        public static final Action CHATBOT_ACTION;
        public static final Action CHAT_ACTION;
        public static final Action CLAIM_CHOSEN_STOCK;
        public static final Action CLAIM_GIFT;
        public static final Action CLAIM_GIFT_DONE;
        public static final Action CLAIM_REWARD;
        public static final Action CLAIM_STOCK_BEGIN;
        public static final Action CLEAR_FILTERS;
        public static final Action CLEAR_SEARCH_QUERY;
        public static final Action CLEAR_STALE_DATA;
        public static final Action CLOSE_POSITION;
        public static final Action COLLAPSE;
        public static final Action COMPLETE_DD_FLOW;
        public static final Action COMPLETE_DD_SWITCHER;
        public static final Action COMPLETE_SETUP_PIN;
        public static final Action COMPLETE_USER_CREATION;
        public static final Action COMPOSE;
        public static final Action CONFIRM;
        public static final Action CONFIRM_DAPP_TXN;
        public static final Action CONFIRM_DECLINE_REWARD;
        public static final Action CONFIRM_DELETE_POST;
        public static final Action CONFIRM_DISCONNECT;
        public static final Action CONFIRM_GIFT;
        public static final Action CONFIRM_OPTION_ATTESTATION;
        public static final Action CONFIRM_PIN;
        public static final Action CONNECT_FOUND_ACCOUNT;
        public static final Action CONTACT_SIGN_IN;
        public static final Action CONTACT_SUPPORT;
        public static final Action CONTINUE;
        public static final Action CONVERT_TO_LIMIT_ORDER;
        public static final Action COPY;
        public static final Action COPY_BACKUP_CODE;
        public static final Action COVER_MARGIN_CALL_DEPOSIT_FUNDS;
        public static final Action COVER_MARGIN_CALL_SELL_STOCKS;
        public static final Action CREATE_CRYPTO_GIFT;
        public static final Action CREATE_INDICATOR;
        public static final Action CREATE_LOGIN;
        public static final Action CREATE_NC_WALLET;
        public static final Action CREATE_NEW_LIST;
        public static final Action CREATE_PAYCHECK_INVESTMENT;
        public static final Action CRYPTO_TRANSFER_ADD_COST_BASIS_COMPLETED;
        public static final Action CRYPTO_TRANSFER_ADD_COST_BASIS_LOT_SUCCESS;
        public static final Action CRYPTO_TRANSFER_ENROLLMENT_SUCCESS;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Action DEBIT_CARD_LINKING;
        public static final Action DEBIT_CARD_LINKING_PRECHECK;
        public static final Action DECLINE;
        public static final Action DECLINE_REWARD;
        public static final Action DELETE;
        public static final Action DELETE_ALERT;
        public static final Action DELETE_BACKUP;
        public static final Action DELETE_RECURRING_INVESTMENT;
        public static final Action DENY;
        public static final Action DENY_OPTION_ATTESTATION;
        public static final Action DEPOSIT_CRYPTO;
        public static final Action DEPOSIT_MONEY;
        public static final Action DEPOSIT_TOKEN;
        public static final Action DESELECT;
        public static final Action DISABLE_ALERT;
        public static final Action DISABLE_CASH_SWEEP;
        public static final Action DISABLE_EARLY_PAY;
        public static final Action DISABLE_SLIP_STOCK_INTEREST;
        public static final Action DISCONNECT;
        public static final Action DISCONNECT_ALL;
        public static final Action DISMISS;
        public static final Action DONE;
        public static final Action DOWNLOAD;
        public static final Action EARN_REWARDS;
        public static final Action EDIT;
        public static final Action EDIT_BASKET;
        public static final Action EDIT_BENEFICIARY;
        public static final Action EDIT_BIO;
        public static final Action EDIT_COLLATERAL;
        public static final Action EDIT_INDICATOR;
        public static final Action EDIT_INVESTMENT_PROFILE;
        public static final Action EDIT_LEVERAGE;
        public static final Action EDIT_POST;
        public static final Action EDIT_PROFILE;
        public static final Action EDIT_RECURRING_INVESTMENT;
        public static final Action EDIT_RECURRING_ORDER_DATE;
        public static final Action EDIT_SL;
        public static final Action EDIT_TP;
        public static final Action EDIT_USERNAME;
        public static final Action EMAIL_SENT;
        public static final Action ENABLE_ALERT;
        public static final Action ENABLE_CASH_SWEEP;
        public static final Action ENABLE_EARLY_PAY;
        public static final Action ENABLE_MARGIN_INVESTING;
        public static final Action ENABLE_NOTIFICATION;
        public static final Action ENABLE_OPTIONS_TRADING;
        public static final Action ENABLE_SLIP_STOCK_INTEREST;
        public static final Action END_CX_CHAT;
        public static final Action END_CX_CHAT_CONFIRM;
        public static final Action ENROLL_BIOMETRIC_AUTHENTICATION;
        public static final Action ENROLL_PIN;
        public static final Action ENTER_RECURRING_CREATION;
        public static final Action ENTER_REDEMPTION_FLOW;
        public static final Action ENTER_REFERRAL_FLOW;
        public static final Action ENTER_RH_CONNECT_FLOW;
        public static final Action ENTER_SARDINE_FLOW;
        public static final Action ENTER_TRANSFER_ADDRESS;
        public static final Action ENTER_TRANSFER_AMOUNT;
        public static final Action EQUITY_ORDER_FAILURE;
        public static final Action EQUITY_ORDER_SUCCESS;
        public static final Action EQUITY_SELECT_ORDER_KIND;
        public static final Action EQUITY_SUBMIT_ORDER;
        public static final Action EXIT_ACATS_IN_FLOW;
        public static final Action EXIT_RECS_FLOW;
        public static final Action EXPAND;
        public static final Action FACE_BLURRY;
        public static final Action FACE_DETECTED_CAPTURING;
        public static final Action FACE_NOT_DETECTED;
        public static final Action FELIX_CLICK_DONE;
        public static final Action FELIX_CLOSE_EXPERIENCE;
        public static final Action FELIX_SCREENSHOT;
        public static final Action FELIX_VIEW_OUTRO_ANIMATION;
        public static final Action FELIX_VIEW_OUTRO_LINK;
        public static final Action FETCH;
        public static final Action FETCH_VERTIAS_DEVICE_ID;
        public static final Action FIND_AN_INVESTMENT;
        public static final Action FIND_INVESTMENT;
        public static final Action FINISH_TYPING;
        public static final Action FOCUS_BUY_TAB;
        public static final Action FOCUS_SEARCH_BAR;
        public static final Action FOCUS_SELL_TAB;
        public static final Action FOLLOW_ROBINHOOD_LIST;
        public static final Action FOLLOW_USER;
        public static final Action FORGOT_EMAIL;
        public static final Action FORGOT_EMAIL_PASSWORD;
        public static final Action FORGOT_PASSWORD;
        public static final Action FROM_ACCOUNT_DEFAULT;
        public static final Action FUND;
        public static final Action FUTURES_DETAIL_VIEW_PICTURE_IN_PICTURE;
        public static final Action GET_ACCESS;
        public static final Action GOLD_UPGRADE_SUCCESS;
        public static final Action GOLD_UPSELL_UPGRADE;
        public static final Action GROUP_BY;
        public static final Action HALF_EXPAND;
        public static final Action HELP_ME_PICK;
        public static final Action HIDE_OPTION_CHAIN_STOCK_CHART;
        public static final Action HIDE_PASSWORD;
        public static final Action IAV_SELECT_BANK_ACCOUNT;
        public static final Action IMPORT;
        public static final Action IMPORT_NC_WALLET;
        public static final Action INCOMING_WIRE;
        public static final Action INITIATE_COPY_TRADE;
        public static final Action INITIATE_ESTATE_FLOW;
        public static final Action INITIATE_TAX_FLOW;
        public static final Action INSTANT_UPSELL_HELP_ARTICLE;
        public static final Action INVITE;
        public static final Action INVITE_CONTACTS;
        public static final Action INVITE_MORE_FRIENDS;
        public static final Action JOIN_WAITLIST;
        public static final Action KEEP_ME_LOGGED_IN;
        public static final Action LADDER_CANCEL_ORDER;
        public static final Action LADDER_DRAG_TO_MODIFY_START;
        public static final Action LADDER_MODIFY_ORDER;
        public static final Action LADDER_SELECT_BULK_PENDING_ORDERS;
        public static final Action LADDER_SWIPE_TO_DELETE_START;
        public static final Action LEARN_MORE;
        public static final Action LIKE;
        public static final Action LIKE_COMMENT;
        public static final Action LOGIN;
        public static final Action LOGOUT;
        public static final Action LOOKING_FOR_FACE;
        public static final Action MANAGE_DAPP_CONNECTION;
        public static final Action MANAGE_PAYCHECK_INVESTMENTS;
        public static final Action MANAGE_VISIBILITY;
        public static final Action MARGIN_CALL_SUMMARY_TO_ORDER_DATA_MISMATCH;
        public static final Action MARGIN_UPGRADE_SELECT_GOLD_INTEREST_RATE;
        public static final Action MARGIN_UPGRADE_SELECT_REGULAR_INTEREST_RATE;
        public static final Action MARKETING_EMAILS_OPT_IN;
        public static final Action MARKETING_EMAILS_OPT_OUT;
        public static final Action MICROGRAM_INSTALL;
        public static final Action MISSING_DEVICE_APPROVAL_NOTIFICATION;
        public static final Action MULTILEG_CANCEL;
        public static final Action MULTILEG_CLEAR;
        public static final Action MULTILEG_SELECT;
        public static final Action MUTE;
        public static final Action NEED_HELP;
        public static final Action OFFER_PRIMARY_CTA;
        public static final Action OFFER_SECONDARY_CTA;
        public static final Action OMNISCAN;
        public static final Action ONBOARDING_COMPLETE;
        public static final Action OPEN_FAQ;
        public static final Action OPEN_POSITION;
        public static final Action OPEN_POST_MENU;
        public static final Action OPEN_RH_MAIN_APP;
        public static final Action OPEN_SHORTCUTS_MODAL;
        public static final Action OPEN_TAKEOVER;
        public static final Action OPEN_URL;
        public static final Action OPTION_CHAIN_LEGACY_STALLING;
        public static final Action OPTION_CHAIN_NAPA_STALLING;
        public static final Action OPTION_CHAIN_SWITCH_TO_BUY;
        public static final Action OPTION_CHAIN_SWITCH_TO_CALL;
        public static final Action OPTION_CHAIN_SWITCH_TO_PUT;
        public static final Action OPTION_CHAIN_SWITCH_TO_SELL;
        public static final Action OPTION_WATCHLIST_CHART_SCRUB;
        public static final Action PAST;
        public static final Action PASTE;
        public static final Action PAUSE;
        public static final Action PAUSE_RECURRING_INVESTMENT;
        public static final Action PAY;
        public static final Action PAY_BY_EMAIL;
        public static final Action PAY_BY_PHONE;
        public static final Action PLACE_LIMIT_ORDER;
        public static final Action PLACE_MARKET_ORDER;
        public static final Action PLACE_STOP_MARKET_ORDER;
        public static final Action PLAY;
        public static final Action POST_TRANSFER_UPSELL;
        public static final Action PRIMARY_CTA;
        public static final Action PROCESSING_SELFIE;
        public static final Action PULL_TO_REFRESH;
        public static final Action QUICK_TRADE_BUY;
        public static final Action QUICK_TRADE_SELL;
        public static final Action QUICK_TRADE_SHORT;
        public static final Action REARRANGE_OPTION_WATCHLIST;
        public static final Action RECEIVE;
        public static final Action RECORD_VOICE;
        public static final Action RECOVER_NC_WALLET;
        public static final Action RECS_RECURRING_KEEP_LAST_ORDER;
        public static final Action RECS_RECURRING_START_FROM_SCRATCH;
        public static final Action RECURRING_ORDER_ERROR;
        public static final Action RECURRING_ORDER_SUCCESS;
        public static final Action RECURRING_SELECT_BROKERAGE_CASH;
        public static final Action RECURRING_SELECT_INVESTMENTS;
        public static final Action RECURRING_SELECT_RETIREMENT_SIGN_UP;
        public static final Action RECURRING_SELECT_ROTH_IRA;
        public static final Action RECURRING_SELECT_TRADITIONAL_IRA;
        public static final Action REFRESH;
        public static final Action REJECT_DAPP;
        public static final Action RELOAD_LOGIN_AFTER_ERROR;
        public static final Action REMIND;
        public static final Action REMOVE_ALL_DEVICES;
        public static final Action REMOVE_ALL_DEVICES_CONFIRM;
        public static final Action REMOVE_BENEFICIARY;
        public static final Action REMOVE_DEVICE;
        public static final Action REMOVE_FROM_BASKET;
        public static final Action REMOVE_FROM_LIST;
        public static final Action REMOVE_INDICATOR;
        public static final Action REMOVE_SCRUB;
        public static final Action REMOVE_WALLET;
        public static final Action REMOVE_WIDGET;
        public static final Action REPLACE_ORDER;
        public static final Action REPLAY;
        public static final Action REPORT;
        public static final Action REQUEST;
        public static final Action REQUEST_CX_CALL;
        public static final Action REQUEUE_CX_CALL;
        public static final Action RESCHEDULE_APPOINTMENT;
        public static final Action RESEND_CHALLENGE;
        public static final Action RESEND_LINK;
        public static final Action RESEND_SMS_CODE;
        public static final Action RESET_PASSWORD;
        public static final Action RESURRECTION_TAKEOVER_UPSELL;
        public static final Action RETRY;
        public static final Action RETRY_SETUP_PIN;
        public static final Action REVIEW;
        public static final Action REVIEW_INVESTOR_PROFILE;
        public static final Action REVIEW_QUEUED_DEPOSIT;
        public static final Action REVIEW_TRANSFER;
        public static final Action RHY_MIGRATION_AGREE;
        public static final Action RHY_MIGRATION_CONFIRM_ADDRESS;
        public static final Action RHY_MIGRATION_EDIT_ADDRESS;
        public static final Action RHY_MIGRATION_FEATURE_INTRO_OPEN_ACCOUNT;
        public static final Action RHY_MIGRATION_OPEN_ACCOUNT_CONTINUE;
        public static final Action RHY_MIGRATION_OPEN_ACCOUNT_TIMEOUT_DONE;
        public static final Action RHY_MIGRATION_WHATS_CHANGING;
        public static final Action RHY_TURBOTAX_ACCOUNT_OPENED;
        public static final Action RHY_TURBOTAX_VISIT_NON_RHY;
        public static final Action RHY_TURBOTAX_VISIT_RHY;
        public static final Action RH_CORE_FUNDING_RETURN;
        public static final Action RH_GOLD_OFFER;
        public static final Action SAVE;
        public static final Action SCHEDULE_APPOINTMENT;
        public static final Action SCHEDULE_AUTOMATIC_DEPOSIT;
        public static final Action SCROLL_FEED;
        public static final Action SCROLL_HORIZONTALLY;
        public static final Action SCRUB;
        public static final Action SCRUB_CANDLESTICK_CHART;
        public static final Action SCRUB_GRAPH;
        public static final Action SCRUB_LINE_CHART;
        public static final Action SEARCH_DD_SWITCHER_COMPANY;
        public static final Action SEARCH_SHOW_MORE_CRYPTOS;
        public static final Action SECONDARY_CTA;
        public static final Action SEE_DAPP_CONNECTIONS;
        public static final Action SEFLIE_DID_FINISH_RECORDING_TO_CALLED;
        public static final Action SELECT;
        public static final Action SELECT_ACCOUNT;
        public static final Action SELECT_BACKUP_PAYMENT_METHOD;
        public static final Action SELECT_CALL_SCHEDULE_OPTION;
        public static final Action SELECT_CURRENCY;
        public static final Action SELECT_DD_SWITCHER_COMPANY;
        public static final Action SELECT_DD_SWITCHER_PARTIAL_AMOUNT;
        public static final Action SELECT_DD_SWITCHER_PAYROLL;
        public static final Action SELECT_DOLLAR_AMOUNT;
        public static final Action SELECT_FREQUENCY;
        public static final Action SELECT_LICENSED;
        public static final Action SELECT_LICENSE_STATUS;
        public static final Action SELECT_NOT_LICENSED;
        public static final Action SELECT_ORDER_KIND;
        public static final Action SELECT_ORDER_TYPE;
        public static final Action SELECT_PAYMENT_METHOD;
        public static final Action SELECT_PERCENTAGE_AMOUNT;
        public static final Action SELECT_PERFORMANCE_CHART_VIEW;
        public static final Action SELECT_RECURRING_FREQUENCY;
        public static final Action SELECT_SUPPORT_CHANNEL;
        public static final Action SELECT_TOKEN;
        public static final Action SELECT_TRADE_TO_POST;
        public static final Action SELECT_VIEW_ONLY_STATUS;
        public static final Action SELFIE_CAMERA_BLOCKED;
        public static final Action SELFIE_CAMERA_NOT_AUTHORIZED;
        public static final Action SELFIE_CAPTURE_BROADCASTER_INIT;
        public static final Action SELFIE_CAPTURE_HELPERS_INIT;
        public static final Action SELFIE_CAPTURE_MANAGERS_INIT;
        public static final Action SELFIE_CAPTURE_RETRY;
        public static final Action SELFIE_DID_FINISH_PROCESSING_PHOTO_CALLED;
        public static final Action SELFIE_DID_START_RECORDING_TO_CALLED;
        public static final Action SELFIE_ENVIRONMENT_DARK;
        public static final Action SELFIE_EXCEEDED_MAX_RETRIES;
        public static final Action SELFIE_FACE_NOT_STRAIGHT;
        public static final Action SELFIE_FACE_TOO_CLOSE;
        public static final Action SELFIE_FACE_TOO_FAR;
        public static final Action SELFIE_GLARE_DETECTED;
        public static final Action SELFIE_MULTIPLE_FACES_DETECTED;
        public static final Action SELFIE_PHOTO_CAPTURE_CALLED;
        public static final Action SELFIE_START_RECORDING_CALLED;
        public static final Action SELFIE_STOP_RECORDING_CALLED;
        public static final Action SELFIE_UPLOAD_SUCCESS;
        public static final Action SELFIE_VERIFICATION_FAILED;
        public static final Action SELFIE_VERIFICATION_SUCCESS;
        public static final Action SELL;
        public static final Action SEND;
        public static final Action SET_CONVERSION_AMOUNT;
        public static final Action SET_MARGIN_LIMIT;
        public static final Action SET_RECURRING_AMOUNT;
        public static final Action SET_RECURRING_NEXT_ORDER_DATE;
        public static final Action SET_RECURRING_START_DATE;
        public static final Action SET_UP_DIRECT_DEPOSIT;
        public static final Action SET_UP_IRA;
        public static final Action SET_UP_MOBILE_WALLET;
        public static final Action SHARE;
        public static final Action SHARE_LINK;
        public static final Action SHARE_TO_TWITTER;
        public static final Action SHOW_DROPDOWN;
        public static final Action SHOW_PASSWORD;
        public static final Action SHOW_TOKEN_ACTIVITY;
        public static final Action SHOW_TXN_DETAIL;
        public static final Action SIGN;
        public static final Action SIGN_UP;
        public static final Action SKIP;
        public static final Action SKIP_BACKWARD;
        public static final Action SKIP_FORWARD;
        public static final Action SKIP_RECURRING_DEPOSIT;
        public static final Action SKIP_ROUNDUP_ORDER;
        public static final Action SLIP_ONBOARDING_CLICK_FAQS;
        public static final Action SOCIAL_GET_STARTED;
        public static final Action SORT_ASCENDING;
        public static final Action SORT_DESCENDING;
        public static final Action SORT_OPTION_WATCHLIST;
        public static final Action SORT_RESET;
        public static final Action START_DD_SWITCHER_AUTHENTICATION;
        public static final Action START_NEW_INQUIRY;
        public static final Action START_TYPING;
        public static final Action SUBMIT;
        public static final Action SUBMIT_COMMENT;
        public static final Action SUBMIT_FEEDBACK;
        public static final Action SUBMIT_INVEST_FLOW_ORDER;
        public static final Action SUBMIT_ORDER;
        public static final Action SUBMIT_POST;
        public static final Action SUBMIT_QUEUED_DEPOSIT;
        public static final Action SUBMIT_RECOMMENDATION_ORDER;
        public static final Action SUBMIT_RECURRING_ORDER;
        public static final Action SUBMIT_TRANSFER;
        public static final Action SWAP_INPUTS;
        public static final Action SWIPE_COMPLETED;
        public static final Action SWIPE_INITIATED;
        public static final Action SWITCH_TAB;
        public static final Action TAP_ETP_ITEM;
        public static final Action TAP_OPTION_INSTRUMENT_PRIMARY_BUTTON;
        public static final Action TAP_OPTION_INSTRUMENT_ROW;
        public static final Action TAP_OPTION_INSTRUMENT_SECONDARY_BUTTON;
        public static final Action TAP_RHY_MIGRATION_FUNDING_AMOUNT;
        public static final Action TAP_RHY_REFERRALS_FUNDING_AMOUNT;
        public static final Action TEXT_SENT;
        public static final Action TIMEOUT;
        public static final Action TOGGLE_COIN_EXPLORE;
        public static final Action TOGGLE_DISPLAY_TYPE;
        public static final Action TOGGLE_ETP_COMPOSITION_VIEW;
        public static final Action TOGGLE_GRAPH_LINE_CANDLESTICKS;
        public static final Action TOGGLE_OFF;
        public static final Action TOGGLE_ON;
        public static final Action TOGGLE_PRICE_CHART_TYPE;
        public static final Action TO_ACCOUNT_TYPE;
        public static final Action TRADE;
        public static final Action TRADE_BAR_BUY;
        public static final Action TRADE_BAR_SELL;
        public static final Action TRADE_BAR_VIEW_ALL_OPTIONS;
        public static final Action TRANSFER_FROM_ROBINHOOD;
        public static final Action TURN_ON_NOTIFICATION;
        public static final Action TYPE_SEARCH_QUERY;
        public static final Action UNDO;
        public static final Action UNFOLLOW_ROBINHOOD_LIST;
        public static final Action UNFOLLOW_USER;
        public static final Action UNLIKE;
        public static final Action UNLIKE_COMMENT;
        public static final Action UNMUTE;
        public static final Action UPDATE_LIST_ITEMS;
        public static final Action UPDATE_PASSWORD;
        public static final Action UPDATE_PAYMENT_METHOD;
        public static final Action UPDATE_TWO_FACTOR_AUTHENTICATION;
        public static final Action UPDATE_USERS_POSITION_SORT;
        public static final Action UPDATE_VOICE_VERIFICATION;
        public static final Action UPGRADE_TO_CASH_CARD;
        public static final Action UPLOAD_PROFILE_IMAGE;
        public static final Action VERIFIED_EMAIL;
        public static final Action VERIFY_EMAIL;
        public static final Action VERIFY_ID_INSTANTLY;
        public static final Action VERIFY_ID_MANUALLY;
        public static final Action VERIFY_PHONE;
        public static final Action VIEW_ACATS_IN_TRANSFER;
        public static final Action VIEW_ACTIVITY_FEED;
        public static final Action VIEW_ACTIVITY_HISTORY;
        public static final Action VIEW_ADD_TO_LIST_BOTTOM_SHEET;
        public static final Action VIEW_ADVANCED_CHARTS;
        public static final Action VIEW_ALL;
        public static final Action VIEW_ALL_OFFERS;
        public static final Action VIEW_APPOINTMENT;
        public static final Action VIEW_ASSET_DETAIL_PAGE;
        public static final Action VIEW_BACKUPS;
        public static final Action VIEW_BANK_LINKING;
        public static final Action VIEW_BEAR_RATING;
        public static final Action VIEW_BENEFICIARY_DETAIL;
        public static final Action VIEW_BROWSE_NEWSFEED_THEATRE;
        public static final Action VIEW_BULL_RATING;
        public static final Action VIEW_CALENDAR_DATE_PICKER;
        public static final Action VIEW_CASH_BALANCES_DETAILS_PAGE;
        public static final Action VIEW_COMBO_ORDER_DETAIL;
        public static final Action VIEW_COMMENT_LIKE_COUNT;
        public static final Action VIEW_COPY_TRADE_LIST;
        public static final Action VIEW_CRYPTO_DETAIL_PAGE;
        public static final Action VIEW_CRYPTO_GIFT_HISTORY;
        public static final Action VIEW_CRYPTO_LIST_PAGE;
        public static final Action VIEW_CRYPTO_NEWSFEED;
        public static final Action VIEW_CRYPTO_SIGNUP_NOTICE;
        public static final Action VIEW_CX_CALL_STATUS;
        public static final Action VIEW_CX_CHATBOT;
        public static final Action VIEW_CX_CHAT_THREAD;
        public static final Action VIEW_CX_CONTACT_US_FLOW;
        public static final Action VIEW_CX_EMAIL_SUPPORT;
        public static final Action VIEW_DD_ACCOUNT_INFO;
        public static final Action VIEW_DD_CONFIRM_EMPLOYER;
        public static final Action VIEW_DD_CONGRATULATIONS;
        public static final Action VIEW_DD_INTRO;
        public static final Action VIEW_DD_PARTIAL_PAYCHECK;
        public static final Action VIEW_DD_PREFILLED_INTRO;
        public static final Action VIEW_DD_SETUP;
        public static final Action VIEW_DD_SETUP_CHOICE;
        public static final Action VIEW_DD_SIGNATURE;
        public static final Action VIEW_DD_SIGNED_FORM;
        public static final Action VIEW_DD_SWITCHER_AUTHENTICATION;
        public static final Action VIEW_DD_SWITCHER_AUTHENTICATION_ERROR;
        public static final Action VIEW_DD_SWITCHER_AUTHENTICATION_MFA;
        public static final Action VIEW_DD_SWITCHER_AUTHENTICATION_SUCCESS;
        public static final Action VIEW_DD_SWITCHER_FORGOT_CREDENTIALS;
        public static final Action VIEW_DD_SWITCHER_SEARCH_COMPANY;
        public static final Action VIEW_DD_SWITCHER_SEARCH_PAYROLL;
        public static final Action VIEW_DD_UNSIGNED_FORM;
        public static final Action VIEW_DD_UPDATE_EMPLOYER;
        public static final Action VIEW_DEEPLINK;
        public static final Action VIEW_DIRECT_DEPOSIT;
        public static final Action VIEW_EARNINGS_CALL;
        public static final Action VIEW_EDIT_CALL_SCHEDULE;
        public static final Action VIEW_EDIT_PHONE_NUMBER;
        public static final Action VIEW_EDUCATION_HOME;
        public static final Action VIEW_EDUCATION_TOUR;
        public static final Action VIEW_EQUITY_TRADING_LADDER;
        public static final Action VIEW_EVENT_CONTRACT_DETAIL_PAGE;
        public static final Action VIEW_EXERCISE_OPTION_FLOW;
        public static final Action VIEW_EXPANDED_LIST_CAROUSEL;
        public static final Action VIEW_FEEDBACK_BOTTOM_SHEET;
        public static final Action VIEW_FOLLOWERS;
        public static final Action VIEW_FOLLOWING;
        public static final Action VIEW_FUNDING;
        public static final Action VIEW_FUTURES_DETAIL_PAGE;
        public static final Action VIEW_FX_ORDER_DETAILS;
        public static final Action VIEW_GOLD_BILLING_DISCLOSURES_STATEMENT;
        public static final Action VIEW_GOLD_UPGRADE;
        public static final Action VIEW_HISTORY_ITEM;
        public static final Action VIEW_HOME;
        public static final Action VIEW_HOW_CASH_IS_CALCULATED;
        public static final Action VIEW_INBOX;
        public static final Action VIEW_LEARNING_LESSON;
        public static final Action VIEW_LIKES;
        public static final Action VIEW_LIMIT_HUB;
        public static final Action VIEW_LIST_DISCOVERY_HUB;
        public static final Action VIEW_LOGIN;
        public static final Action VIEW_MARGIN_UPGRADE_DISCLOSURE_STATEMENT;
        public static final Action VIEW_MCW_CONVERT_CURRENCY_FLOW;
        public static final Action VIEW_MCW_DEPOSIT_FLOW;
        public static final Action VIEW_NEWSFEED_DISCLOSURE;
        public static final Action VIEW_NEWSFEED_PAGE;
        public static final Action VIEW_NEWS_ARTICLE;
        public static final Action VIEW_OPTIONS_STATISTICS_BOTTOM_SHEET;
        public static final Action VIEW_OPTION_AGGREGATE_DETAIL_PAGE;
        public static final Action VIEW_OPTION_CHAIN;
        public static final Action VIEW_OPTION_CHAIN_SETTINGS;
        public static final Action VIEW_OPTION_CHAIN_STOCK_CHART;
        public static final Action VIEW_OPTION_FEE_RATE;
        public static final Action VIEW_OPTION_INSTRUMENT_QUOTE_DETAIL;
        public static final Action VIEW_OPTION_ORDER;
        public static final Action VIEW_OPTION_ORDER_DETAIL;
        public static final Action VIEW_OPTION_ORDER_FORM;
        public static final Action VIEW_OPTION_STRATEGY_DETAIL;
        public static final Action VIEW_OPTION_TYPE;
        public static final Action VIEW_OPTION_UPGRADE_FLOW;
        public static final Action VIEW_OPTION_WATCHLIST_ABOUT;
        public static final Action VIEW_OPTION_WATCHLIST_HUB;
        public static final Action VIEW_ORDER_TYPES;
        public static final Action VIEW_PAYCHECK_HUB;
        public static final Action VIEW_PDP;
        public static final Action VIEW_PERFORMANCE_CHART_MANUAL;
        public static final Action VIEW_PICTURE_IN_PICTURE;
        public static final Action VIEW_PNL_HUB;
        public static final Action VIEW_POSTS_ABOUT_INSTRUMENT;
        public static final Action VIEW_POST_DETAIL_PAGE;
        public static final Action VIEW_PROCESSING_TIMES;
        public static final Action VIEW_PROFILE;
        public static final Action VIEW_PROSPECTUS;
        public static final Action VIEW_RECENT_SEARCH_ITEM;
        public static final Action VIEW_RECURRING_DETAILS;
        public static final Action VIEW_RECURRING_FIND_INVESTMENT;
        public static final Action VIEW_RECURRING_HUB;
        public static final Action VIEW_REFERRAL_OFFER;
        public static final Action VIEW_RETIREMENT_OPTIONS_DISCLOSURES;
        public static final Action VIEW_RHY_MIGRATION_CASHBACK_UPSELL;
        public static final Action VIEW_RHY_MIGRATION_EARLY_DD_UPSELL;
        public static final Action VIEW_RHY_MIGRATION_ROUNDUP_UPSELL;
        public static final Action VIEW_RHY_MIGRATION_SYP_UPSELL;
        public static final Action VIEW_RHY_SETTINGS;
        public static final Action VIEW_ROBINHOOD_LIST_DETAIL_PAGE;
        public static final Action VIEW_ROUNDUP_AMOUNT_FAQ;
        public static final Action VIEW_ROUNDUP_REWARD;
        public static final Action VIEW_ROUNDUP_SET_ASIDE_FAQ;
        public static final Action VIEW_SAFETY_LABEL_LESSON;
        public static final Action VIEW_SEARCH;
        public static final Action VIEW_SEARCH_RESULT;
        public static final Action VIEW_SEND_CHECK;
        public static final Action VIEW_SETTINGS;
        public static final Action VIEW_SIP_DISCLOSURE;
        public static final Action VIEW_SOCIAL_FEED;
        public static final Action VIEW_STAKING;
        public static final Action VIEW_STOCK_DETAIL_PAGE;
        public static final Action VIEW_STOCK_NEWSFEED;
        public static final Action VIEW_STRATEGY_BUILDER;
        public static final Action VIEW_STRATEGY_BUILDER_NUX;
        public static final Action VIEW_STRATEGY_CHAIN;
        public static final Action VIEW_STRATEGY_CHAIN_BOTTOM_SHEET;
        public static final Action VIEW_STRATEGY_CHAIN_DISCLOSURE;
        public static final Action VIEW_SUITABILITY_NOTICE;
        public static final Action VIEW_TOKEN_LIST;
        public static final Action VIEW_TRADE_CONFIRMATION;
        public static final Action VIEW_TRANSFER_DETAILS;
        public static final Action VIEW_TRANSFER_MONEY;
        public static final Action VIEW_USER_AGREEMENT;
        public static final Action VIEW_USER_LIST_DETAIL_PAGE;
        public static final Action VIEW_VIRTUAL_CARD;
        public static final Action VOTE;
        public static final Action WITHDRAW_MONEY;
        public static final Action ZOOM;
        private final int value;

        private static final /* synthetic */ Action[] $values() {
            return new Action[]{ACTION_UNSPECIFIED, APPROVE, DISMISS, UNDO, SAVE, CONTINUE, SKIP, EXPAND, COLLAPSE, APPLY_FILTERS, CLEAR_FILTERS, SUBMIT_FEEDBACK, OPEN_URL, BACK, SELECT, DESELECT, LEARN_MORE, SUBMIT, EDIT, SEND, RECEIVE, COPY, ENTER_TRANSFER_ADDRESS, PRIMARY_CTA, VOTE, SHARE, DONE, JOIN_WAITLIST, VIEW_INBOX, VIEW_SEARCH, REMOVE_SCRUB, LOGOUT, SECONDARY_CTA, KEEP_ME_LOGGED_IN, OMNISCAN, IMPORT, CANCEL, CLEAR_STALE_DATA, VIEW_USER_AGREEMENT, TOGGLE_ON, TOGGLE_OFF, OPEN_SHORTCUTS_MODAL, FOCUS_BUY_TAB, FOCUS_SEARCH_BAR, FOCUS_SELL_TAB, SORT_ASCENDING, SORT_DESCENDING, SORT_RESET, DOWNLOAD, RELOAD_LOGIN_AFTER_ERROR, OPEN_FAQ, DELETE, PAY, REQUEST, VIEW_PROFILE, PAY_BY_PHONE, PAY_BY_EMAIL, DENY, TIMEOUT, ACCEPT, DECLINE, REMIND, FUND, BUY, TEXT_SENT, EMAIL_SENT, CONFIRM_PIN, RETRY_SETUP_PIN, COMPLETE_SETUP_PIN, ANIMATION, CHALLENGE_FALLBACK, MANAGE_VISIBILITY, SELL, OPEN_POSITION, CLOSE_POSITION, CONFIRM, ADD_WIDGET, REMOVE_WIDGET, ZOOM, REPORT, MICROGRAM_INSTALL, VIEW_ALL, FROM_ACCOUNT_DEFAULT, TO_ACCOUNT_TYPE, PLACE_MARKET_ORDER, PLACE_LIMIT_ORDER, PLACE_STOP_MARKET_ORDER, START_TYPING, FINISH_TYPING, SWIPE_INITIATED, SWIPE_COMPLETED, HALF_EXPAND, SCROLL_HORIZONTALLY, OPEN_RH_MAIN_APP, CHANGE_COUNTRY_CODE, RETRY, REFRESH, FETCH, TYPE_SEARCH_QUERY, VIEW_SEARCH_RESULT, CANCEL_SEARCH_QUERY, CLEAR_SEARCH_QUERY, SEARCH_SHOW_MORE_CRYPTOS, VIEW_RECENT_SEARCH_ITEM, PLAY, PAUSE, SKIP_FORWARD, SKIP_BACKWARD, REPLAY, MUTE, UNMUTE, SCRUB, REQUEST_CX_CALL, REQUEUE_CX_CALL, CANCEL_CX_CALL, CONTACT_SIGN_IN, SELECT_CALL_SCHEDULE_OPTION, VIEW_EDIT_CALL_SCHEDULE, RECORD_VOICE, BEGIN_SELFIE_VERIFICATION, VIEW_LOGIN, VIEW_SETTINGS, UPDATE_VOICE_VERIFICATION, NEED_HELP, VIEW_CX_CHAT_THREAD, END_CX_CHAT, END_CX_CHAT_CONFIRM, START_NEW_INQUIRY, VIEW_DEEPLINK, CHAT_ACTION, CHATBOT_ACTION, VIEW_CX_CHATBOT, CANCEL_APPOINTMENT, RESCHEDULE_APPOINTMENT, SCHEDULE_APPOINTMENT, COMPLETE_DD_FLOW, START_DD_SWITCHER_AUTHENTICATION, COMPLETE_DD_SWITCHER, SELECT_DD_SWITCHER_COMPANY, SELECT_DD_SWITCHER_PAYROLL, SELECT_DD_SWITCHER_PARTIAL_AMOUNT, SEARCH_DD_SWITCHER_COMPANY, CREATE_NEW_LIST, FOLLOW_ROBINHOOD_LIST, UNFOLLOW_ROBINHOOD_LIST, UPDATE_LIST_ITEMS, TAP_OPTION_INSTRUMENT_ROW, TAP_OPTION_INSTRUMENT_PRIMARY_BUTTON, TAP_OPTION_INSTRUMENT_SECONDARY_BUTTON, MULTILEG_SELECT, MULTILEG_CANCEL, MULTILEG_CLEAR, TRADE, REVIEW, VIEW_OPTION_CHAIN_STOCK_CHART, HIDE_OPTION_CHAIN_STOCK_CHART, VIEW_OPTION_CHAIN, VIEW_EXERCISE_OPTION_FLOW, VIEW_OPTION_WATCHLIST_HUB, VIEW_OPTION_STRATEGY_DETAIL, SORT_OPTION_WATCHLIST, REARRANGE_OPTION_WATCHLIST, OPTION_WATCHLIST_CHART_SCRUB, VIEW_OPTION_ORDER, VIEW_OPTION_WATCHLIST_ABOUT, CHANGE_PRIMARY_OPTION_CHART_LINE, VIEW_OPTION_TYPE, CONFIRM_OPTION_ATTESTATION, DENY_OPTION_ATTESTATION, OPTION_CHAIN_LEGACY_STALLING, OPTION_CHAIN_NAPA_STALLING, VIEW_OPTION_CHAIN_SETTINGS, VIEW_STRATEGY_BUILDER_NUX, VIEW_STRATEGY_CHAIN, VIEW_STRATEGY_CHAIN_DISCLOSURE, VIEW_OPTION_ORDER_FORM, VIEW_OPTIONS_STATISTICS_BOTTOM_SHEET, VIEW_STRATEGY_CHAIN_BOTTOM_SHEET, VIEW_STRATEGY_BUILDER, VIEW_RETIREMENT_OPTIONS_DISCLOSURES, VIEW_OPTION_INSTRUMENT_QUOTE_DETAIL, VIEW_OPTION_ORDER_DETAIL, VIEW_OPTION_FEE_RATE, OPTION_CHAIN_SWITCH_TO_BUY, OPTION_CHAIN_SWITCH_TO_SELL, OPTION_CHAIN_SWITCH_TO_CALL, OPTION_CHAIN_SWITCH_TO_PUT, ENABLE_OPTIONS_TRADING, VIEW_OPTION_UPGRADE_FLOW, ENTER_RECURRING_CREATION, SELECT_RECURRING_FREQUENCY, SET_RECURRING_START_DATE, SELECT_PAYMENT_METHOD, ADD_PAYMENT_METHOD, ADD_PAYMENT_METHOD_SUCCESS, SET_RECURRING_AMOUNT, VIEW_RECURRING_HUB, VIEW_RECURRING_FIND_INVESTMENT, VIEW_RECURRING_DETAILS, SET_RECURRING_NEXT_ORDER_DATE, EDIT_RECURRING_ORDER_DATE, DELETE_RECURRING_INVESTMENT, EDIT_RECURRING_INVESTMENT, PAUSE_RECURRING_INVESTMENT, SET_UP_DIRECT_DEPOSIT, SELECT_DOLLAR_AMOUNT, SELECT_PERCENTAGE_AMOUNT, CANCEL_RECURRING_CREATION, SELECT_BACKUP_PAYMENT_METHOD, ALREADY_SET_UP_DIRECT_DEPOSIT, RECURRING_SELECT_INVESTMENTS, RECURRING_SELECT_BROKERAGE_CASH, RECS_RECURRING_KEEP_LAST_ORDER, RECS_RECURRING_START_FROM_SCRATCH, RECURRING_SELECT_ROTH_IRA, RECURRING_SELECT_TRADITIONAL_IRA, RECURRING_SELECT_RETIREMENT_SIGN_UP, VIEW_ADVANCED_CHARTS, CHANGE_CHART_SPAN, TOGGLE_PRICE_CHART_TYPE, EDIT_INDICATOR, REMOVE_INDICATOR, CREATE_INDICATOR, REVIEW_INVESTOR_PROFILE, CANCEL_ORDER, REPLACE_ORDER, VIEW_TRADE_CONFIRMATION, CONVERT_TO_LIMIT_ORDER, GOLD_UPSELL_UPGRADE, VIEW_EARNINGS_CALL, VIEW_SIP_DISCLOSURE, EQUITY_SELECT_ORDER_KIND, EQUITY_SUBMIT_ORDER, EQUITY_ORDER_SUCCESS, EQUITY_ORDER_FAILURE, VIEW_ORDER_TYPES, SELECT_ORDER_TYPE, SUBMIT_ORDER, VIEW_NEWS_ARTICLE, VIEW_BROWSE_NEWSFEED_THEATRE, VIEW_STOCK_NEWSFEED, VIEW_FEEDBACK_BOTTOM_SHEET, VIEW_CRYPTO_NEWSFEED, VIEW_NEWSFEED_DISCLOSURE, VIEW_NEWSFEED_PAGE, VIEW_CX_CALL_STATUS, VIEW_CX_EMAIL_SUPPORT, VIEW_CX_CONTACT_US_FLOW, VIEW_DD_INTRO, VIEW_DD_SETUP_CHOICE, VIEW_DD_ACCOUNT_INFO, VIEW_DD_PREFILLED_INTRO, VIEW_DD_CONFIRM_EMPLOYER, VIEW_DD_UPDATE_EMPLOYER, VIEW_DD_UNSIGNED_FORM, VIEW_DD_SIGNATURE, VIEW_DD_SIGNED_FORM, VIEW_DD_CONGRATULATIONS, VIEW_DD_SWITCHER_SEARCH_COMPANY, VIEW_DD_SWITCHER_SEARCH_PAYROLL, VIEW_DD_SWITCHER_AUTHENTICATION, VIEW_DD_SWITCHER_AUTHENTICATION_SUCCESS, VIEW_DD_SWITCHER_AUTHENTICATION_ERROR, VIEW_DD_SWITCHER_AUTHENTICATION_MFA, VIEW_DD_SWITCHER_FORGOT_CREDENTIALS, VIEW_DD_PARTIAL_PAYCHECK, VIEW_DIRECT_DEPOSIT, VIEW_PAYCHECK_HUB, CREATE_PAYCHECK_INVESTMENT, MANAGE_PAYCHECK_INVESTMENTS, CANCEL_DISPUTE, VIEW_HOME, VIEW_STOCK_DETAIL_PAGE, VIEW_CRYPTO_DETAIL_PAGE, FIND_INVESTMENT, REMOVE_FROM_BASKET, ADD_TO_BASKET, SUBMIT_INVEST_FLOW_ORDER, EDIT_BASKET, FIND_AN_INVESTMENT, UPDATE_PAYMENT_METHOD, ENABLE_ALERT, DISABLE_ALERT, SELECT_PERFORMANCE_CHART_VIEW, VIEW_PERFORMANCE_CHART_MANUAL, SET_UP_IRA, UPDATE_USERS_POSITION_SORT, VIEW_LIST_DISCOVERY_HUB, VIEW_ROBINHOOD_LIST_DETAIL_PAGE, VIEW_EXPANDED_LIST_CAROUSEL, VIEW_ADD_TO_LIST_BOTTOM_SHEET, VIEW_CALENDAR_DATE_PICKER, VIEW_EDIT_PHONE_NUMBER, TURN_ON_NOTIFICATION, EDIT_INVESTMENT_PROFILE, DELETE_ALERT, VIEW_LEARNING_LESSON, ANSWER_QUESTION, VIEW_SAFETY_LABEL_LESSON, VIEW_EDUCATION_TOUR, VIEW_EDUCATION_HOME, VIEW_PROCESSING_TIMES, CANCEL_TRANSFER, VIEW_TRANSFER_DETAILS, VIEW_FUNDING, VIEW_BANK_LINKING, VIEW_GOLD_UPGRADE, IAV_SELECT_BANK_ACCOUNT, REVIEW_QUEUED_DEPOSIT, SUBMIT_QUEUED_DEPOSIT, REVIEW_TRANSFER, SUBMIT_TRANSFER, ENTER_TRANSFER_AMOUNT, SELECT_ACCOUNT, SELECT_FREQUENCY, SCHEDULE_AUTOMATIC_DEPOSIT, WITHDRAW_MONEY, VIEW_TRANSFER_MONEY, SKIP_RECURRING_DEPOSIT, VIEW_LIMIT_HUB, INCOMING_WIRE, VIEW_DD_SETUP, APPLE_PAY_LINKING, POST_TRANSFER_UPSELL, ENTER_REDEMPTION_FLOW, CLAIM_STOCK_BEGIN, CLAIM_CHOSEN_STOCK, HELP_ME_PICK, CLAIM_REWARD, DECLINE_REWARD, CONFIRM_DECLINE_REWARD, CANCEL_DECLINE_REWARD, EARN_REWARDS, VIEW_ALL_OFFERS, ENTER_REFERRAL_FLOW, INVITE_CONTACTS, SHARE_LINK, PAST, INVITE, INVITE_MORE_FRIENDS, OFFER_PRIMARY_CTA, OFFER_SECONDARY_CTA, SHARE_TO_TWITTER, FELIX_CLOSE_EXPERIENCE, FELIX_SCREENSHOT, FELIX_CLICK_DONE, FELIX_VIEW_OUTRO_LINK, FELIX_VIEW_OUTRO_ANIMATION, VIEW_PROSPECTUS, TOGGLE_GRAPH_LINE_CANDLESTICKS, CHANGE_GRAPH_INTERVAL, SCRUB_GRAPH, TOGGLE_ETP_COMPOSITION_VIEW, TAP_ETP_ITEM, VIEW_BEAR_RATING, VIEW_BULL_RATING, SCRUB_CANDLESTICK_CHART, SCRUB_LINE_CHART, TRADE_BAR_VIEW_ALL_OPTIONS, TRADE_BAR_BUY, TRADE_BAR_SELL, LOGIN, FORGOT_PASSWORD, UPDATE_PASSWORD, VERIFY_EMAIL, VERIFY_PHONE, UPDATE_TWO_FACTOR_AUTHENTICATION, COPY_BACKUP_CODE, RESEND_SMS_CODE, RESEND_CHALLENGE, MISSING_DEVICE_APPROVAL_NOTIFICATION, REMOVE_ALL_DEVICES, REMOVE_DEVICE, REMOVE_ALL_DEVICES_CONFIRM, RESET_PASSWORD, FORGOT_EMAIL_PASSWORD, ACCESS_TO_SOMEONE_ELSES_ACCOUNT, VERIFIED_EMAIL, RESEND_LINK, FORGOT_EMAIL, LOOKING_FOR_FACE, FACE_BLURRY, FACE_NOT_DETECTED, FACE_DETECTED_CAPTURING, PROCESSING_SELFIE, SELFIE_VERIFICATION_SUCCESS, SELFIE_VERIFICATION_FAILED, SELFIE_UPLOAD_SUCCESS, SELFIE_CAMERA_NOT_AUTHORIZED, SELFIE_ENVIRONMENT_DARK, SELFIE_CAMERA_BLOCKED, SELFIE_EXCEEDED_MAX_RETRIES, SELFIE_CAPTURE_RETRY, SELFIE_GLARE_DETECTED, SELFIE_FACE_NOT_STRAIGHT, SELFIE_FACE_TOO_FAR, SELFIE_FACE_TOO_CLOSE, SELFIE_MULTIPLE_FACES_DETECTED, VIEW_RHY_MIGRATION_ROUNDUP_UPSELL, VIEW_RHY_MIGRATION_CASHBACK_UPSELL, VIEW_RHY_MIGRATION_EARLY_DD_UPSELL, VIEW_RHY_MIGRATION_SYP_UPSELL, RHY_TURBOTAX_ACCOUNT_OPENED, RHY_TURBOTAX_VISIT_NON_RHY, RHY_TURBOTAX_VISIT_RHY, RHY_MIGRATION_FEATURE_INTRO_OPEN_ACCOUNT, RHY_MIGRATION_AGREE, RHY_MIGRATION_CONFIRM_ADDRESS, RHY_MIGRATION_OPEN_ACCOUNT_CONTINUE, RHY_MIGRATION_OPEN_ACCOUNT_TIMEOUT_DONE, RHY_MIGRATION_WHATS_CHANGING, RHY_MIGRATION_EDIT_ADDRESS, EXIT_RECS_FLOW, SUBMIT_RECOMMENDATION_ORDER, GET_ACCESS, VIEW_ASSET_DETAIL_PAGE, ADD_TO_LIST, REMOVE_FROM_LIST, SUBMIT_RECURRING_ORDER, RECURRING_ORDER_SUCCESS, RECURRING_ORDER_ERROR, SELECT_ORDER_KIND, ACATS_IN_NAME_NOT_MATCHING, CONTACT_SUPPORT, EXIT_ACATS_IN_FLOW, ACATS_IN_CANT_FIND_BROKERAGE, VIEW_ACATS_IN_TRANSFER, CONFIRM_GIFT, CANCEL_GIFT, CLAIM_GIFT, CLAIM_GIFT_DONE, VIEW_CRYPTO_GIFT_HISTORY, CREATE_CRYPTO_GIFT, CANCEL_CRYPTO_GIFT, ADD_BENEFICIARY, EDIT_BENEFICIARY, REMOVE_BENEFICIARY, VIEW_BENEFICIARY_DETAIL, VIEW_ROUNDUP_REWARD, VIEW_HISTORY_ITEM, VIEW_SEND_CHECK, VIEW_RHY_SETTINGS, ENABLE_EARLY_PAY, DISABLE_EARLY_PAY, VIEW_ROUNDUP_AMOUNT_FAQ, VIEW_ROUNDUP_SET_ASIDE_FAQ, SKIP_ROUNDUP_ORDER, VIEW_CRYPTO_SIGNUP_NOTICE, VIEW_SUITABILITY_NOTICE, TAP_RHY_MIGRATION_FUNDING_AMOUNT, SET_UP_MOBILE_WALLET, UPGRADE_TO_CASH_CARD, SLIP_ONBOARDING_CLICK_FAQS, ENABLE_SLIP_STOCK_INTEREST, DISABLE_SLIP_STOCK_INTEREST, ENABLE_CASH_SWEEP, DISABLE_CASH_SWEEP, ADD_ACCOUNT, DEBIT_CARD_LINKING, BANK_LINKING, DEPOSIT_MONEY, DEBIT_CARD_LINKING_PRECHECK, MARGIN_UPGRADE_SELECT_GOLD_INTEREST_RATE, MARGIN_UPGRADE_SELECT_REGULAR_INTEREST_RATE, VIEW_MARGIN_UPGRADE_DISCLOSURE_STATEMENT, SET_MARGIN_LIMIT, COVER_MARGIN_CALL_DEPOSIT_FUNDS, COVER_MARGIN_CALL_SELL_STOCKS, INSTANT_UPSELL_HELP_ARTICLE, ENABLE_MARGIN_INVESTING, SIGN_UP, CREATE_LOGIN, HIDE_PASSWORD, SHOW_PASSWORD, COMPLETE_USER_CREATION, APP_TRACKING_TRANSPARENCY_ALLOW, APP_TRACKING_TRANSPARENCY_DENY, VERIFY_ID_INSTANTLY, VERIFY_ID_MANUALLY, MARKETING_EMAILS_OPT_IN, MARKETING_EMAILS_OPT_OUT, RESURRECTION_TAKEOVER_UPSELL, ACCOUNT_STATE_CHANGED, SIGN, REJECT_DAPP, ALLOW_DAPP, CONFIRM_DAPP_TXN, VIEW_BACKUPS, VIEW_ACTIVITY_HISTORY, PASTE, SHOW_TOKEN_ACTIVITY, DEPOSIT_TOKEN, DELETE_BACKUP, CREATE_NC_WALLET, IMPORT_NC_WALLET, RECOVER_NC_WALLET, ENROLL_BIOMETRIC_AUTHENTICATION, ENROLL_PIN, VIEW_TOKEN_LIST, SELECT_TOKEN, RH_CORE_FUNDING_RETURN, DISCONNECT_ALL, SHOW_TXN_DETAIL, CONFIRM_DISCONNECT, DISCONNECT, TRANSFER_FROM_ROBINHOOD, REMOVE_WALLET, SEE_DAPP_CONNECTIONS, MANAGE_DAPP_CONNECTION, TOGGLE_COIN_EXPLORE, VIEW_CRYPTO_LIST_PAGE, BEGIN_CRYPTO_TRANSFER, BEGIN_TRANSFER_CRYPTO, BEGIN_CRYPTO_DEPOSIT, VIEW_STAKING, ENTER_RH_CONNECT_FLOW, ENTER_SARDINE_FLOW, BUY_CRYPTO, DEPOSIT_CRYPTO, CRYPTO_TRANSFER_ENROLLMENT_SUCCESS, VIEW_USER_LIST_DETAIL_PAGE, ASSET_ROW_DISPLAY_VALUE_CHANGED_LAST_PRICE, ASSET_ROW_DISPLAY_VALUE_CHANGED_EQUITY, ASSET_ROW_DISPLAY_VALUE_CHANGED_RETURNS_TODAY, ASSET_ROW_DISPLAY_VALUE_CHANGED_RETURNS_TOTAL, VIEW_OPTION_AGGREGATE_DETAIL_PAGE, VIEW_REFERRAL_OFFER, VIEW_VIRTUAL_CARD, TAP_RHY_REFERRALS_FUNDING_AMOUNT, GOLD_UPGRADE_SUCCESS, VIEW_GOLD_BILLING_DISCLOSURES_STATEMENT, RH_GOLD_OFFER, VIEW_PNL_HUB, GROUP_BY, LADDER_SELECT_BULK_PENDING_ORDERS, LADDER_SWIPE_TO_DELETE_START, LADDER_CANCEL_ORDER, LADDER_DRAG_TO_MODIFY_START, LADDER_MODIFY_ORDER, FUTURES_DETAIL_VIEW_PICTURE_IN_PICTURE, BACKUP_WALLET, BACKUP_TO_ICLOUD, BACKUP_MANUALLY, ENABLE_NOTIFICATION, ONBOARDING_COMPLETE, VIEW_CASH_BALANCES_DETAILS_PAGE, VIEW_MCW_DEPOSIT_FLOW, VIEW_HOW_CASH_IS_CALCULATED, VIEW_MCW_CONVERT_CURRENCY_FLOW, EDIT_COLLATERAL, EDIT_LEVERAGE, EDIT_TP, EDIT_SL, VIEW_PDP, FETCH_VERTIAS_DEVICE_ID, SELFIE_START_RECORDING_CALLED, SELFIE_DID_START_RECORDING_TO_CALLED, SELFIE_STOP_RECORDING_CALLED, SEFLIE_DID_FINISH_RECORDING_TO_CALLED, SELFIE_PHOTO_CAPTURE_CALLED, SELFIE_DID_FINISH_PROCESSING_PHOTO_CALLED, SELECT_CURRENCY, SWAP_INPUTS, SET_CONVERSION_AMOUNT, VIEW_FX_ORDER_DETAILS, SELFIE_CAPTURE_HELPERS_INIT, SELFIE_CAPTURE_MANAGERS_INIT, VIEW_COMBO_ORDER_DETAIL, SELFIE_CAPTURE_BROADCASTER_INIT, OPEN_TAKEOVER, VIEW_FUTURES_DETAIL_PAGE, SHOW_DROPDOWN, SELECT_SUPPORT_CHANNEL, VIEW_EVENT_CONTRACT_DETAIL_PAGE, VIEW_PICTURE_IN_PICTURE, VIEW_EQUITY_TRADING_LADDER, CRYPTO_TRANSFER_ADD_COST_BASIS_LOT_SUCCESS, CRYPTO_TRANSFER_ADD_COST_BASIS_COMPLETED, MARGIN_CALL_SUMMARY_TO_ORDER_DATA_MISMATCH, CONNECT_FOUND_ACCOUNT, VIEW_APPOINTMENT, INITIATE_TAX_FLOW, INITIATE_ESTATE_FLOW, SWITCH_TAB, VIEW_ACTIVITY_FEED, COMPOSE, SELECT_TRADE_TO_POST, VIEW_POST_DETAIL_PAGE, PULL_TO_REFRESH, SCROLL_FEED, TOGGLE_DISPLAY_TYPE, INITIATE_COPY_TRADE, LIKE, UNLIKE, VIEW_LIKES, VIEW_COPY_TRADE_LIST, OPEN_POST_MENU, EDIT_POST, CONFIRM_DELETE_POST, SUBMIT_COMMENT, LIKE_COMMENT, UNLIKE_COMMENT, VIEW_COMMENT_LIKE_COUNT, QUICK_TRADE_BUY, QUICK_TRADE_SELL, QUICK_TRADE_SHORT, FOLLOW_USER, UNFOLLOW_USER, VIEW_FOLLOWERS, VIEW_FOLLOWING, SUBMIT_POST, CANCEL_POST_COMPOSER, SELECT_LICENSE_STATUS, SELECT_VIEW_ONLY_STATUS, ACCEPT_AGREEMENT, VIEW_SOCIAL_FEED, EDIT_PROFILE, UPLOAD_PROFILE_IMAGE, EDIT_USERNAME, EDIT_BIO, ACTIVITY_ITEM_TAP, SOCIAL_GET_STARTED, SELECT_NOT_LICENSED, SELECT_LICENSED, VIEW_POSTS_ABOUT_INSTRUMENT};
        }

        @JvmStatic
        public static final Action fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static EnumEntries<Action> getEntries() {
            return $ENTRIES;
        }

        private Action(String str, int i, int i2) {
            this.value = i2;
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        static {
            final Action action = new Action("ACTION_UNSPECIFIED", 0, 0);
            ACTION_UNSPECIFIED = action;
            APPROVE = new Action("APPROVE", 1, 7);
            DISMISS = new Action("DISMISS", 2, 8);
            UNDO = new Action("UNDO", 3, 10);
            SAVE = new Action("SAVE", 4, 20);
            CONTINUE = new Action("CONTINUE", 5, 33);
            SKIP = new Action("SKIP", 6, 34);
            EXPAND = new Action("EXPAND", 7, 35);
            COLLAPSE = new Action("COLLAPSE", 8, 36);
            APPLY_FILTERS = new Action("APPLY_FILTERS", 9, 37);
            CLEAR_FILTERS = new Action("CLEAR_FILTERS", 10, 38);
            SUBMIT_FEEDBACK = new Action("SUBMIT_FEEDBACK", 11, 52);
            OPEN_URL = new Action("OPEN_URL", 12, 54);
            BACK = new Action("BACK", 13, 65);
            SELECT = new Action("SELECT", 14, 97);
            DESELECT = new Action("DESELECT", 15, 98);
            LEARN_MORE = new Action("LEARN_MORE", 16, 100);
            SUBMIT = new Action("SUBMIT", 17, 101);
            EDIT = new Action("EDIT", 18, EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE);
            SEND = new Action("SEND", 19, EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE);
            RECEIVE = new Action("RECEIVE", 20, EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE);
            COPY = new Action("COPY", 21, EnumC7081g.SDK_ASSET_ICON_PIN_VALUE);
            ENTER_TRANSFER_ADDRESS = new Action("ENTER_TRANSFER_ADDRESS", 22, EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE);
            PRIMARY_CTA = new Action("PRIMARY_CTA", 23, EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE);
            VOTE = new Action("VOTE", 24, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE);
            SHARE = new Action("SHARE", 25, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE);
            DONE = new Action("DONE", 26, EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE);
            JOIN_WAITLIST = new Action("JOIN_WAITLIST", 27, EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE);
            VIEW_INBOX = new Action("VIEW_INBOX", 28, 280);
            VIEW_SEARCH = new Action("VIEW_SEARCH", 29, EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE);
            REMOVE_SCRUB = new Action("REMOVE_SCRUB", 30, EnumC7081g.f2776x87e624cb);
            LOGOUT = new Action("LOGOUT", 31, EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);
            SECONDARY_CTA = new Action("SECONDARY_CTA", 32, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE);
            KEEP_ME_LOGGED_IN = new Action("KEEP_ME_LOGGED_IN", 33, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE);
            OMNISCAN = new Action("OMNISCAN", 34, 344);
            IMPORT = new Action("IMPORT", 35, 345);
            CANCEL = new Action("CANCEL", 36, 355);
            CLEAR_STALE_DATA = new Action("CLEAR_STALE_DATA", 37, 359);
            VIEW_USER_AGREEMENT = new Action("VIEW_USER_AGREEMENT", 38, 364);
            TOGGLE_ON = new Action("TOGGLE_ON", 39, 368);
            TOGGLE_OFF = new Action("TOGGLE_OFF", 40, 369);
            OPEN_SHORTCUTS_MODAL = new Action("OPEN_SHORTCUTS_MODAL", 41, 370);
            FOCUS_BUY_TAB = new Action("FOCUS_BUY_TAB", 42, 371);
            FOCUS_SEARCH_BAR = new Action("FOCUS_SEARCH_BAR", 43, 372);
            FOCUS_SELL_TAB = new Action("FOCUS_SELL_TAB", 44, 373);
            SORT_ASCENDING = new Action("SORT_ASCENDING", 45, 388);
            SORT_DESCENDING = new Action("SORT_DESCENDING", 46, 391);
            SORT_RESET = new Action("SORT_RESET", 47, 392);
            DOWNLOAD = new Action("DOWNLOAD", 48, 405);
            RELOAD_LOGIN_AFTER_ERROR = new Action("RELOAD_LOGIN_AFTER_ERROR", 49, 412);
            OPEN_FAQ = new Action("OPEN_FAQ", 50, 421);
            DELETE = new Action("DELETE", 51, 422);
            PAY = new Action("PAY", 52, 423);
            REQUEST = new Action("REQUEST", 53, 424);
            VIEW_PROFILE = new Action("VIEW_PROFILE", 54, CompanyFinancialsSection.BAR_ANIMATION_DURATION);
            PAY_BY_PHONE = new Action("PAY_BY_PHONE", 55, 426);
            PAY_BY_EMAIL = new Action("PAY_BY_EMAIL", 56, 427);
            DENY = new Action("DENY", 57, 428);
            TIMEOUT = new Action("TIMEOUT", 58, 431);
            ACCEPT = new Action("ACCEPT", 59, 432);
            DECLINE = new Action("DECLINE", 60, 433);
            REMIND = new Action("REMIND", 61, 434);
            FUND = new Action("FUND", 62, 439);
            BUY = new Action("BUY", 63, 442);
            TEXT_SENT = new Action("TEXT_SENT", 64, 444);
            EMAIL_SENT = new Action("EMAIL_SENT", 65, 445);
            CONFIRM_PIN = new Action("CONFIRM_PIN", 66, 446);
            RETRY_SETUP_PIN = new Action("RETRY_SETUP_PIN", 67, 447);
            COMPLETE_SETUP_PIN = new Action("COMPLETE_SETUP_PIN", 68, 448);
            ANIMATION = new Action("ANIMATION", 69, 450);
            CHALLENGE_FALLBACK = new Action("CHALLENGE_FALLBACK", 70, 451);
            MANAGE_VISIBILITY = new Action("MANAGE_VISIBILITY", 71, 459);
            SELL = new Action("SELL", 72, 460);
            OPEN_POSITION = new Action("OPEN_POSITION", 73, 461);
            CLOSE_POSITION = new Action("CLOSE_POSITION", 74, 462);
            CONFIRM = new Action("CONFIRM", 75, 470);
            ADD_WIDGET = new Action("ADD_WIDGET", 76, 471);
            REMOVE_WIDGET = new Action("REMOVE_WIDGET", 77, 472);
            ZOOM = new Action("ZOOM", 78, 476);
            REPORT = new Action("REPORT", 79, 482);
            MICROGRAM_INSTALL = new Action("MICROGRAM_INSTALL", 80, 484);
            VIEW_ALL = new Action("VIEW_ALL", 81, 485);
            FROM_ACCOUNT_DEFAULT = new Action("FROM_ACCOUNT_DEFAULT", 82, 488);
            TO_ACCOUNT_TYPE = new Action("TO_ACCOUNT_TYPE", 83, 489);
            PLACE_MARKET_ORDER = new Action("PLACE_MARKET_ORDER", 84, 490);
            PLACE_LIMIT_ORDER = new Action("PLACE_LIMIT_ORDER", 85, 491);
            PLACE_STOP_MARKET_ORDER = new Action("PLACE_STOP_MARKET_ORDER", 86, 492);
            START_TYPING = new Action("START_TYPING", 87, 506);
            FINISH_TYPING = new Action("FINISH_TYPING", 88, 507);
            SWIPE_INITIATED = new Action("SWIPE_INITIATED", 89, 509);
            SWIPE_COMPLETED = new Action("SWIPE_COMPLETED", 90, 510);
            HALF_EXPAND = new Action("HALF_EXPAND", 91, 525);
            SCROLL_HORIZONTALLY = new Action("SCROLL_HORIZONTALLY", 92, 527);
            OPEN_RH_MAIN_APP = new Action("OPEN_RH_MAIN_APP", 93, 533);
            CHANGE_COUNTRY_CODE = new Action("CHANGE_COUNTRY_CODE", 94, 534);
            RETRY = new Action("RETRY", 95, 9);
            REFRESH = new Action("REFRESH", 96, 91);
            FETCH = new Action("FETCH", 97, 94);
            TYPE_SEARCH_QUERY = new Action("TYPE_SEARCH_QUERY", 98, 128);
            VIEW_SEARCH_RESULT = new Action("VIEW_SEARCH_RESULT", 99, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE);
            CANCEL_SEARCH_QUERY = new Action("CANCEL_SEARCH_QUERY", 100, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE);
            CLEAR_SEARCH_QUERY = new Action("CLEAR_SEARCH_QUERY", 101, 131);
            SEARCH_SHOW_MORE_CRYPTOS = new Action("SEARCH_SHOW_MORE_CRYPTOS", 102, EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE);
            VIEW_RECENT_SEARCH_ITEM = new Action("VIEW_RECENT_SEARCH_ITEM", 103, EnumC7081g.f2781x2ba65ba3);
            PLAY = new Action("PLAY", 104, 44);
            PAUSE = new Action("PAUSE", 105, 45);
            SKIP_FORWARD = new Action("SKIP_FORWARD", 106, 46);
            SKIP_BACKWARD = new Action("SKIP_BACKWARD", 107, 47);
            REPLAY = new Action("REPLAY", 108, 48);
            MUTE = new Action("MUTE", 109, 49);
            UNMUTE = new Action("UNMUTE", 110, 50);
            SCRUB = new Action("SCRUB", 111, 51);
            REQUEST_CX_CALL = new Action("REQUEST_CX_CALL", 112, 11);
            REQUEUE_CX_CALL = new Action("REQUEUE_CX_CALL", 113, 12);
            CANCEL_CX_CALL = new Action("CANCEL_CX_CALL", 114, 13);
            CONTACT_SIGN_IN = new Action("CONTACT_SIGN_IN", 115, 85);
            SELECT_CALL_SCHEDULE_OPTION = new Action("SELECT_CALL_SCHEDULE_OPTION", 116, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE);
            VIEW_EDIT_CALL_SCHEDULE = new Action("VIEW_EDIT_CALL_SCHEDULE", 117, EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE);
            RECORD_VOICE = new Action("RECORD_VOICE", 118, EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE);
            BEGIN_SELFIE_VERIFICATION = new Action("BEGIN_SELFIE_VERIFICATION", 119, 204);
            VIEW_LOGIN = new Action("VIEW_LOGIN", 120, EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE);
            VIEW_SETTINGS = new Action("VIEW_SETTINGS", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE, EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE);
            UPDATE_VOICE_VERIFICATION = new Action("UPDATE_VOICE_VERIFICATION", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE);
            NEED_HELP = new Action("NEED_HELP", 123, EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE);
            VIEW_CX_CHAT_THREAD = new Action("VIEW_CX_CHAT_THREAD", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, 283);
            END_CX_CHAT = new Action("END_CX_CHAT", 125, EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE);
            END_CX_CHAT_CONFIRM = new Action("END_CX_CHAT_CONFIRM", EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE);
            START_NEW_INQUIRY = new Action("START_NEW_INQUIRY", EnumC7081g.SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE, EnumC7081g.f2777x89a9e432);
            VIEW_DEEPLINK = new Action("VIEW_DEEPLINK", 128, EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE);
            CHAT_ACTION = new Action("CHAT_ACTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, 288);
            CHATBOT_ACTION = new Action("CHATBOT_ACTION", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE, 419);
            VIEW_CX_CHATBOT = new Action("VIEW_CX_CHATBOT", 131, 420);
            CANCEL_APPOINTMENT = new Action("CANCEL_APPOINTMENT", EnumC7081g.SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE, 544);
            RESCHEDULE_APPOINTMENT = new Action("RESCHEDULE_APPOINTMENT", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, 545);
            SCHEDULE_APPOINTMENT = new Action("SCHEDULE_APPOINTMENT", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE, 546);
            COMPLETE_DD_FLOW = new Action("COMPLETE_DD_FLOW", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE, 31);
            START_DD_SWITCHER_AUTHENTICATION = new Action("START_DD_SWITCHER_AUTHENTICATION", 136, 56);
            COMPLETE_DD_SWITCHER = new Action("COMPLETE_DD_SWITCHER", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE, 57);
            SELECT_DD_SWITCHER_COMPANY = new Action("SELECT_DD_SWITCHER_COMPANY", EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE, 82);
            SELECT_DD_SWITCHER_PAYROLL = new Action("SELECT_DD_SWITCHER_PAYROLL", EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE, 83);
            SELECT_DD_SWITCHER_PARTIAL_AMOUNT = new Action("SELECT_DD_SWITCHER_PARTIAL_AMOUNT", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE, 84);
            SEARCH_DD_SWITCHER_COMPANY = new Action("SEARCH_DD_SWITCHER_COMPANY", EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE, 96);
            CREATE_NEW_LIST = new Action("CREATE_NEW_LIST", EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE, 32);
            FOLLOW_ROBINHOOD_LIST = new Action("FOLLOW_ROBINHOOD_LIST", EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE, 80);
            UNFOLLOW_ROBINHOOD_LIST = new Action("UNFOLLOW_ROBINHOOD_LIST", 144, 81);
            UPDATE_LIST_ITEMS = new Action("UPDATE_LIST_ITEMS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE, 99);
            TAP_OPTION_INSTRUMENT_ROW = new Action("TAP_OPTION_INSTRUMENT_ROW", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE, 105);
            TAP_OPTION_INSTRUMENT_PRIMARY_BUTTON = new Action("TAP_OPTION_INSTRUMENT_PRIMARY_BUTTON", 147, 106);
            TAP_OPTION_INSTRUMENT_SECONDARY_BUTTON = new Action("TAP_OPTION_INSTRUMENT_SECONDARY_BUTTON", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE, 107);
            MULTILEG_SELECT = new Action("MULTILEG_SELECT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, 108);
            MULTILEG_CANCEL = new Action("MULTILEG_CANCEL", 150, 109);
            MULTILEG_CLEAR = new Action("MULTILEG_CLEAR", 151, 110);
            TRADE = new Action("TRADE", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE, 111);
            REVIEW = new Action("REVIEW", EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE, 112);
            VIEW_OPTION_CHAIN_STOCK_CHART = new Action("VIEW_OPTION_CHAIN_STOCK_CHART", EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE, 120);
            HIDE_OPTION_CHAIN_STOCK_CHART = new Action("HIDE_OPTION_CHAIN_STOCK_CHART", 155, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE);
            VIEW_OPTION_CHAIN = new Action("VIEW_OPTION_CHAIN", 156, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE);
            VIEW_EXERCISE_OPTION_FLOW = new Action("VIEW_EXERCISE_OPTION_FLOW", EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE);
            VIEW_OPTION_WATCHLIST_HUB = new Action("VIEW_OPTION_WATCHLIST_HUB", EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE, 192);
            VIEW_OPTION_STRATEGY_DETAIL = new Action("VIEW_OPTION_STRATEGY_DETAIL", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE);
            SORT_OPTION_WATCHLIST = new Action("SORT_OPTION_WATCHLIST", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE, EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE);
            REARRANGE_OPTION_WATCHLIST = new Action("REARRANGE_OPTION_WATCHLIST", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE);
            OPTION_WATCHLIST_CHART_SCRUB = new Action("OPTION_WATCHLIST_CHART_SCRUB", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE);
            VIEW_OPTION_ORDER = new Action("VIEW_OPTION_ORDER", EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE, EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE);
            VIEW_OPTION_WATCHLIST_ABOUT = new Action("VIEW_OPTION_WATCHLIST_ABOUT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE, 200);
            CHANGE_PRIMARY_OPTION_CHART_LINE = new Action("CHANGE_PRIMARY_OPTION_CHART_LINE", 165, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
            VIEW_OPTION_TYPE = new Action("VIEW_OPTION_TYPE", EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE, 250);
            CONFIRM_OPTION_ATTESTATION = new Action("CONFIRM_OPTION_ATTESTATION", 167, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE);
            DENY_OPTION_ATTESTATION = new Action("DENY_OPTION_ATTESTATION", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE);
            OPTION_CHAIN_LEGACY_STALLING = new Action("OPTION_CHAIN_LEGACY_STALLING", EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE, 255);
            OPTION_CHAIN_NAPA_STALLING = new Action("OPTION_CHAIN_NAPA_STALLING", EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE, 256);
            VIEW_OPTION_CHAIN_SETTINGS = new Action("VIEW_OPTION_CHAIN_SETTINGS", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE);
            VIEW_STRATEGY_BUILDER_NUX = new Action("VIEW_STRATEGY_BUILDER_NUX", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE);
            VIEW_STRATEGY_CHAIN = new Action("VIEW_STRATEGY_CHAIN", EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE);
            VIEW_STRATEGY_CHAIN_DISCLOSURE = new Action("VIEW_STRATEGY_CHAIN_DISCLOSURE", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE, EnumC7081g.f2775xbcb7e6f3);
            VIEW_OPTION_ORDER_FORM = new Action("VIEW_OPTION_ORDER_FORM", EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE);
            VIEW_OPTIONS_STATISTICS_BOTTOM_SHEET = new Action("VIEW_OPTIONS_STATISTICS_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE);
            VIEW_STRATEGY_CHAIN_BOTTOM_SHEET = new Action("VIEW_STRATEGY_CHAIN_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE);
            VIEW_STRATEGY_BUILDER = new Action("VIEW_STRATEGY_BUILDER", EnumC7081g.f2773x8d9721ad, 361);
            VIEW_RETIREMENT_OPTIONS_DISCLOSURES = new Action("VIEW_RETIREMENT_OPTIONS_DISCLOSURES", EnumC7081g.f2780x600b66fe, 374);
            VIEW_OPTION_INSTRUMENT_QUOTE_DETAIL = new Action("VIEW_OPTION_INSTRUMENT_QUOTE_DETAIL", EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, HttpStatusCode.GONE);
            VIEW_OPTION_ORDER_DETAIL = new Action("VIEW_OPTION_ORDER_DETAIL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE, 411);
            VIEW_OPTION_FEE_RATE = new Action("VIEW_OPTION_FEE_RATE", 182, 443);
            OPTION_CHAIN_SWITCH_TO_BUY = new Action("OPTION_CHAIN_SWITCH_TO_BUY", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE, 463);
            OPTION_CHAIN_SWITCH_TO_SELL = new Action("OPTION_CHAIN_SWITCH_TO_SELL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, 464);
            OPTION_CHAIN_SWITCH_TO_CALL = new Action("OPTION_CHAIN_SWITCH_TO_CALL", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE, 465);
            OPTION_CHAIN_SWITCH_TO_PUT = new Action("OPTION_CHAIN_SWITCH_TO_PUT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE, 466);
            ENABLE_OPTIONS_TRADING = new Action("ENABLE_OPTIONS_TRADING", EnumC7081g.SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE, 498);
            VIEW_OPTION_UPGRADE_FLOW = new Action("VIEW_OPTION_UPGRADE_FLOW", 188, 504);
            ENTER_RECURRING_CREATION = new Action("ENTER_RECURRING_CREATION", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE, 66);
            SELECT_RECURRING_FREQUENCY = new Action("SELECT_RECURRING_FREQUENCY", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE, 67);
            SET_RECURRING_START_DATE = new Action("SET_RECURRING_START_DATE", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE, 68);
            SELECT_PAYMENT_METHOD = new Action("SELECT_PAYMENT_METHOD", 192, 69);
            ADD_PAYMENT_METHOD = new Action("ADD_PAYMENT_METHOD", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE, 70);
            ADD_PAYMENT_METHOD_SUCCESS = new Action("ADD_PAYMENT_METHOD_SUCCESS", EnumC7081g.SDK_ASSET_ICON_EXTERNAL_VALUE, 71);
            SET_RECURRING_AMOUNT = new Action("SET_RECURRING_AMOUNT", EnumC7081g.SDK_ASSET_ICON_ALERT_WARNING_VALUE, 72);
            VIEW_RECURRING_HUB = new Action("VIEW_RECURRING_HUB", EnumC7081g.SDK_ASSET_ICON_ARROW_DOWN_VALUE, 77);
            VIEW_RECURRING_FIND_INVESTMENT = new Action("VIEW_RECURRING_FIND_INVESTMENT", EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE, 78);
            VIEW_RECURRING_DETAILS = new Action("VIEW_RECURRING_DETAILS", EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE, 79);
            SET_RECURRING_NEXT_ORDER_DATE = new Action("SET_RECURRING_NEXT_ORDER_DATE", EnumC7081g.SDK_ASSET_ICON_CANCEL_VALUE, 103);
            EDIT_RECURRING_ORDER_DATE = new Action("EDIT_RECURRING_ORDER_DATE", 200, EnumC7081g.SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE);
            DELETE_RECURRING_INVESTMENT = new Action("DELETE_RECURRING_INVESTMENT", 201, EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE);
            EDIT_RECURRING_INVESTMENT = new Action("EDIT_RECURRING_INVESTMENT", 202, 201);
            PAUSE_RECURRING_INVESTMENT = new Action("PAUSE_RECURRING_INVESTMENT", EnumC7081g.SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE, 202);
            SET_UP_DIRECT_DEPOSIT = new Action("SET_UP_DIRECT_DEPOSIT", 204, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE);
            SELECT_DOLLAR_AMOUNT = new Action("SELECT_DOLLAR_AMOUNT", EnumC7081g.SDK_ASSET_ICON_CLIPBOARD_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE);
            SELECT_PERCENTAGE_AMOUNT = new Action("SELECT_PERCENTAGE_AMOUNT", EnumC7081g.SDK_ASSET_ICON_CLOCK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE);
            CANCEL_RECURRING_CREATION = new Action("CANCEL_RECURRING_CREATION", EnumC7081g.SDK_ASSET_ICON_COMMENT_VALUE, 239);
            SELECT_BACKUP_PAYMENT_METHOD = new Action("SELECT_BACKUP_PAYMENT_METHOD", EnumC7081g.SDK_ASSET_ICON_INCOME_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE);
            ALREADY_SET_UP_DIRECT_DEPOSIT = new Action("ALREADY_SET_UP_DIRECT_DEPOSIT", EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE);
            RECURRING_SELECT_INVESTMENTS = new Action("RECURRING_SELECT_INVESTMENTS", EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE, 331);
            RECURRING_SELECT_BROKERAGE_CASH = new Action("RECURRING_SELECT_BROKERAGE_CASH", 211, 332);
            RECS_RECURRING_KEEP_LAST_ORDER = new Action("RECS_RECURRING_KEEP_LAST_ORDER", EnumC7081g.SDK_ASSET_ICON_OVERRIDE_VALUE, 342);
            RECS_RECURRING_START_FROM_SCRATCH = new Action("RECS_RECURRING_START_FROM_SCRATCH", EnumC7081g.SDK_ASSET_ICON_PAUSE_VALUE, 343);
            RECURRING_SELECT_ROTH_IRA = new Action("RECURRING_SELECT_ROTH_IRA", EnumC7081g.SDK_ASSET_ICON_PIN_VALUE, 416);
            RECURRING_SELECT_TRADITIONAL_IRA = new Action("RECURRING_SELECT_TRADITIONAL_IRA", EnumC7081g.SDK_ASSET_ICON_PRODUCT_IDV_VALUE, 417);
            RECURRING_SELECT_RETIREMENT_SIGN_UP = new Action("RECURRING_SELECT_RETIREMENT_SIGN_UP", EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE, 418);
            VIEW_ADVANCED_CHARTS = new Action("VIEW_ADVANCED_CHARTS", EnumC7081g.SDK_ASSET_ICON_PROGRESS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE);
            CHANGE_CHART_SPAN = new Action("CHANGE_CHART_SPAN", EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE);
            TOGGLE_PRICE_CHART_TYPE = new Action("TOGGLE_PRICE_CHART_TYPE", EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE);
            EDIT_INDICATOR = new Action("EDIT_INDICATOR", EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE);
            REMOVE_INDICATOR = new Action("REMOVE_INDICATOR", EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE, 316);
            CREATE_INDICATOR = new Action("CREATE_INDICATOR", EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE);
            REVIEW_INVESTOR_PROFILE = new Action("REVIEW_INVESTOR_PROFILE", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 382);
            CANCEL_ORDER = new Action("CANCEL_ORDER", 224, 407);
            REPLACE_ORDER = new Action("REPLACE_ORDER", 225, 408);
            VIEW_TRADE_CONFIRMATION = new Action("VIEW_TRADE_CONFIRMATION", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE, 409);
            CONVERT_TO_LIMIT_ORDER = new Action("CONVERT_TO_LIMIT_ORDER", EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE, 429);
            GOLD_UPSELL_UPGRADE = new Action("GOLD_UPSELL_UPGRADE", EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE, 437);
            VIEW_EARNINGS_CALL = new Action("VIEW_EARNINGS_CALL", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE, 508);
            VIEW_SIP_DISCLOSURE = new Action("VIEW_SIP_DISCLOSURE", EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE, 547);
            EQUITY_SELECT_ORDER_KIND = new Action("EQUITY_SELECT_ORDER_KIND", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE, 86);
            EQUITY_SUBMIT_ORDER = new Action("EQUITY_SUBMIT_ORDER", EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, 87);
            EQUITY_ORDER_SUCCESS = new Action("EQUITY_ORDER_SUCCESS", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE, 88);
            EQUITY_ORDER_FAILURE = new Action("EQUITY_ORDER_FAILURE", EnumC7081g.SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE, 89);
            VIEW_ORDER_TYPES = new Action("VIEW_ORDER_TYPES", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE);
            SELECT_ORDER_TYPE = new Action("SELECT_ORDER_TYPE", EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE);
            SUBMIT_ORDER = new Action("SUBMIT_ORDER", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE, EnumC7081g.SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE);
            VIEW_NEWS_ARTICLE = new Action("VIEW_NEWS_ARTICLE", EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE, 41);
            VIEW_BROWSE_NEWSFEED_THEATRE = new Action("VIEW_BROWSE_NEWSFEED_THEATRE", 239, 42);
            VIEW_STOCK_NEWSFEED = new Action("VIEW_STOCK_NEWSFEED", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, 43);
            VIEW_FEEDBACK_BOTTOM_SHEET = new Action("VIEW_FEEDBACK_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE, 53);
            VIEW_CRYPTO_NEWSFEED = new Action("VIEW_CRYPTO_NEWSFEED", EnumC7081g.f2778x3356acf6, 55);
            VIEW_NEWSFEED_DISCLOSURE = new Action("VIEW_NEWSFEED_DISCLOSURE", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE);
            VIEW_NEWSFEED_PAGE = new Action("VIEW_NEWSFEED_PAGE", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE, 390);
            VIEW_CX_CALL_STATUS = new Action("VIEW_CX_CALL_STATUS", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE, 14);
            VIEW_CX_EMAIL_SUPPORT = new Action("VIEW_CX_EMAIL_SUPPORT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE, 15);
            VIEW_CX_CONTACT_US_FLOW = new Action("VIEW_CX_CONTACT_US_FLOW", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE, 16);
            VIEW_DD_INTRO = new Action("VIEW_DD_INTRO", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE, 21);
            VIEW_DD_SETUP_CHOICE = new Action("VIEW_DD_SETUP_CHOICE", EnumC7081g.f2779x59907a3d, 22);
            VIEW_DD_ACCOUNT_INFO = new Action("VIEW_DD_ACCOUNT_INFO", 250, 23);
            VIEW_DD_PREFILLED_INTRO = new Action("VIEW_DD_PREFILLED_INTRO", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE, 24);
            VIEW_DD_CONFIRM_EMPLOYER = new Action("VIEW_DD_CONFIRM_EMPLOYER", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, 25);
            VIEW_DD_UPDATE_EMPLOYER = new Action("VIEW_DD_UPDATE_EMPLOYER", EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE, 26);
            VIEW_DD_UNSIGNED_FORM = new Action("VIEW_DD_UNSIGNED_FORM", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE, 27);
            VIEW_DD_SIGNATURE = new Action("VIEW_DD_SIGNATURE", 255, 28);
            VIEW_DD_SIGNED_FORM = new Action("VIEW_DD_SIGNED_FORM", 256, 29);
            VIEW_DD_CONGRATULATIONS = new Action("VIEW_DD_CONGRATULATIONS", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE, 30);
            VIEW_DD_SWITCHER_SEARCH_COMPANY = new Action("VIEW_DD_SWITCHER_SEARCH_COMPANY", EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE, 58);
            VIEW_DD_SWITCHER_SEARCH_PAYROLL = new Action("VIEW_DD_SWITCHER_SEARCH_PAYROLL", EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE, 59);
            VIEW_DD_SWITCHER_AUTHENTICATION = new Action("VIEW_DD_SWITCHER_AUTHENTICATION", EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE, 60);
            VIEW_DD_SWITCHER_AUTHENTICATION_SUCCESS = new Action("VIEW_DD_SWITCHER_AUTHENTICATION_SUCCESS", EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE, 61);
            VIEW_DD_SWITCHER_AUTHENTICATION_ERROR = new Action("VIEW_DD_SWITCHER_AUTHENTICATION_ERROR", EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE, 62);
            VIEW_DD_SWITCHER_AUTHENTICATION_MFA = new Action("VIEW_DD_SWITCHER_AUTHENTICATION_MFA", EnumC7081g.SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE, 63);
            VIEW_DD_SWITCHER_FORGOT_CREDENTIALS = new Action("VIEW_DD_SWITCHER_FORGOT_CREDENTIALS", EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE, 64);
            VIEW_DD_PARTIAL_PAYCHECK = new Action("VIEW_DD_PARTIAL_PAYCHECK", EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE);
            VIEW_DIRECT_DEPOSIT = new Action("VIEW_DIRECT_DEPOSIT", EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE);
            VIEW_PAYCHECK_HUB = new Action("VIEW_PAYCHECK_HUB", EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE, EnumC7081g.SDK_ASSET_HEADER_SHIELD_VALUE);
            CREATE_PAYCHECK_INVESTMENT = new Action("CREATE_PAYCHECK_INVESTMENT", EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE);
            MANAGE_PAYCHECK_INVESTMENTS = new Action("MANAGE_PAYCHECK_INVESTMENTS", EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE, EnumC7081g.SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE);
            CANCEL_DISPUTE = new Action("CANCEL_DISPUTE", EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE, 102);
            VIEW_HOME = new Action("VIEW_HOME", 271, 6);
            VIEW_STOCK_DETAIL_PAGE = new Action("VIEW_STOCK_DETAIL_PAGE", EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE, 39);
            VIEW_CRYPTO_DETAIL_PAGE = new Action("VIEW_CRYPTO_DETAIL_PAGE", EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE, 40);
            FIND_INVESTMENT = new Action("FIND_INVESTMENT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE);
            REMOVE_FROM_BASKET = new Action("REMOVE_FROM_BASKET", EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE, EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE);
            ADD_TO_BASKET = new Action("ADD_TO_BASKET", EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE);
            SUBMIT_INVEST_FLOW_ORDER = new Action("SUBMIT_INVEST_FLOW_ORDER", EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE);
            EDIT_BASKET = new Action("EDIT_BASKET", EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE);
            FIND_AN_INVESTMENT = new Action("FIND_AN_INVESTMENT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE, 300);
            UPDATE_PAYMENT_METHOD = new Action("UPDATE_PAYMENT_METHOD", 280, EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE);
            ENABLE_ALERT = new Action("ENABLE_ALERT", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_VALUE, 340);
            DISABLE_ALERT = new Action("DISABLE_ALERT", EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE, 341);
            SELECT_PERFORMANCE_CHART_VIEW = new Action("SELECT_PERFORMANCE_CHART_VIEW", 283, 365);
            VIEW_PERFORMANCE_CHART_MANUAL = new Action("VIEW_PERFORMANCE_CHART_MANUAL", EnumC7081g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE, 366);
            SET_UP_IRA = new Action("SET_UP_IRA", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE, 415);
            UPDATE_USERS_POSITION_SORT = new Action("UPDATE_USERS_POSITION_SORT", EnumC7081g.f2777x89a9e432, 449);
            VIEW_LIST_DISCOVERY_HUB = new Action("VIEW_LIST_DISCOVERY_HUB", EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE, 2);
            VIEW_ROBINHOOD_LIST_DETAIL_PAGE = new Action("VIEW_ROBINHOOD_LIST_DETAIL_PAGE", 288, 3);
            VIEW_EXPANDED_LIST_CAROUSEL = new Action("VIEW_EXPANDED_LIST_CAROUSEL", EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, 4);
            VIEW_ADD_TO_LIST_BOTTOM_SHEET = new Action("VIEW_ADD_TO_LIST_BOTTOM_SHEET", EnumC7081g.SDK_ASSET_ILLUSTRATION_NOTE_VALUE, 17);
            VIEW_CALENDAR_DATE_PICKER = new Action("VIEW_CALENDAR_DATE_PICKER", EnumC7081g.f2776x87e624cb, 104);
            VIEW_EDIT_PHONE_NUMBER = new Action("VIEW_EDIT_PHONE_NUMBER", EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE, 5);
            TURN_ON_NOTIFICATION = new Action("TURN_ON_NOTIFICATION", EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE);
            EDIT_INVESTMENT_PROFILE = new Action("EDIT_INVESTMENT_PROFILE", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE);
            DELETE_ALERT = new Action("DELETE_ALERT", EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE, 383);
            VIEW_LEARNING_LESSON = new Action("VIEW_LEARNING_LESSON", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_VALUE, 90);
            ANSWER_QUESTION = new Action("ANSWER_QUESTION", EnumC7081g.SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE, 119);
            VIEW_SAFETY_LABEL_LESSON = new Action("VIEW_SAFETY_LABEL_LESSON", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_VALUE, 147);
            VIEW_EDUCATION_TOUR = new Action("VIEW_EDUCATION_TOUR", EnumC7081g.SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE);
            VIEW_EDUCATION_HOME = new Action("VIEW_EDUCATION_HOME", 300, EnumC7081g.SDK_ASSET_ICON_PLAID_LOGO_VALUE);
            VIEW_PROCESSING_TIMES = new Action("VIEW_PROCESSING_TIMES", EnumC7081g.SDK_ASSET_CASH_ICON_CIRCLE_VALUE, 92);
            CANCEL_TRANSFER = new Action("CANCEL_TRANSFER", 302, 93);
            VIEW_TRANSFER_DETAILS = new Action("VIEW_TRANSFER_DETAILS", EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE, 95);
            VIEW_FUNDING = new Action("VIEW_FUNDING", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE, 118);
            VIEW_BANK_LINKING = new Action("VIEW_BANK_LINKING", EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE);
            VIEW_GOLD_UPGRADE = new Action("VIEW_GOLD_UPGRADE", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE);
            IAV_SELECT_BANK_ACCOUNT = new Action("IAV_SELECT_BANK_ACCOUNT", EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE, 113);
            REVIEW_QUEUED_DEPOSIT = new Action("REVIEW_QUEUED_DEPOSIT", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE, 114);
            SUBMIT_QUEUED_DEPOSIT = new Action("SUBMIT_QUEUED_DEPOSIT", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE, 115);
            REVIEW_TRANSFER = new Action("REVIEW_TRANSFER", EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE, 116);
            SUBMIT_TRANSFER = new Action("SUBMIT_TRANSFER", EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE, 117);
            ENTER_TRANSFER_AMOUNT = new Action("ENTER_TRANSFER_AMOUNT", EnumC7081g.f2774x74902ae0, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE);
            SELECT_ACCOUNT = new Action("SELECT_ACCOUNT", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE);
            SELECT_FREQUENCY = new Action("SELECT_FREQUENCY", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE, EnumC7081g.SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE);
            SCHEDULE_AUTOMATIC_DEPOSIT = new Action("SCHEDULE_AUTOMATIC_DEPOSIT", EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE);
            WITHDRAW_MONEY = new Action("WITHDRAW_MONEY", 316, EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE);
            VIEW_TRANSFER_MONEY = new Action("VIEW_TRANSFER_MONEY", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE, 387);
            SKIP_RECURRING_DEPOSIT = new Action("SKIP_RECURRING_DEPOSIT", EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE, 430);
            VIEW_LIMIT_HUB = new Action("VIEW_LIMIT_HUB", EnumC7081g.f2781x2ba65ba3, 435);
            INCOMING_WIRE = new Action("INCOMING_WIRE", EnumC7081g.SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE, 436);
            VIEW_DD_SETUP = new Action("VIEW_DD_SETUP", EnumC7081g.SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE, 467);
            APPLE_PAY_LINKING = new Action("APPLE_PAY_LINKING", EnumC7081g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE, 469);
            POST_TRANSFER_UPSELL = new Action("POST_TRANSFER_UPSELL", EnumC7081g.f2775xbcb7e6f3, 481);
            ENTER_REDEMPTION_FLOW = new Action("ENTER_REDEMPTION_FLOW", EnumC7081g.SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE);
            CLAIM_STOCK_BEGIN = new Action("CLAIM_STOCK_BEGIN", EnumC7081g.SDK_ASSET_ICON_REPORT_VALUE, 123);
            CLAIM_CHOSEN_STOCK = new Action("CLAIM_CHOSEN_STOCK", EnumC7081g.SDK_ASSET_ICON_STEP_COMPLETE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            HELP_ME_PICK = new Action("HELP_ME_PICK", EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE, 125);
            CLAIM_REWARD = new Action("CLAIM_REWARD", EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE);
            DECLINE_REWARD = new Action("DECLINE_REWARD", EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE, EnumC7081g.SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE);
            CONFIRM_DECLINE_REWARD = new Action("CONFIRM_DECLINE_REWARD", 330, EnumC7081g.SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE);
            CANCEL_DECLINE_REWARD = new Action("CANCEL_DECLINE_REWARD", 331, EnumC7081g.SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE);
            EARN_REWARDS = new Action("EARN_REWARDS", 332, 271);
            VIEW_ALL_OFFERS = new Action("VIEW_ALL_OFFERS", 333, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE);
            ENTER_REFERRAL_FLOW = new Action("ENTER_REFERRAL_FLOW", 334, EnumC7081g.SDK_ASSET_HEADER_CARD_COLLECT_VALUE);
            INVITE_CONTACTS = new Action("INVITE_CONTACTS", 335, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE);
            SHARE_LINK = new Action("SHARE_LINK", WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE);
            PAST = new Action("PAST", 337, EnumC7081g.SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE);
            INVITE = new Action("INVITE", 338, EnumC7081g.SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE);
            INVITE_MORE_FRIENDS = new Action("INVITE_MORE_FRIENDS", 339, EnumC7081g.SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE);
            OFFER_PRIMARY_CTA = new Action("OFFER_PRIMARY_CTA", 340, EnumC7081g.f2773x8d9721ad);
            OFFER_SECONDARY_CTA = new Action("OFFER_SECONDARY_CTA", 341, EnumC7081g.f2780x600b66fe);
            SHARE_TO_TWITTER = new Action("SHARE_TO_TWITTER", 342, 339);
            FELIX_CLOSE_EXPERIENCE = new Action("FELIX_CLOSE_EXPERIENCE", 343, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE);
            FELIX_SCREENSHOT = new Action("FELIX_SCREENSHOT", 344, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE);
            FELIX_CLICK_DONE = new Action("FELIX_CLICK_DONE", 345, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE);
            FELIX_VIEW_OUTRO_LINK = new Action("FELIX_VIEW_OUTRO_LINK", 346, 136);
            FELIX_VIEW_OUTRO_ANIMATION = new Action("FELIX_VIEW_OUTRO_ANIMATION", 347, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE);
            VIEW_PROSPECTUS = new Action("VIEW_PROSPECTUS", 348, 144);
            TOGGLE_GRAPH_LINE_CANDLESTICKS = new Action("TOGGLE_GRAPH_LINE_CANDLESTICKS", 349, EnumC7081g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE);
            CHANGE_GRAPH_INTERVAL = new Action("CHANGE_GRAPH_INTERVAL", 350, 150);
            SCRUB_GRAPH = new Action("SCRUB_GRAPH", 351, 151);
            TOGGLE_ETP_COMPOSITION_VIEW = new Action("TOGGLE_ETP_COMPOSITION_VIEW", 352, 156);
            TAP_ETP_ITEM = new Action("TAP_ETP_ITEM", 353, EnumC7081g.SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE);
            VIEW_BEAR_RATING = new Action("VIEW_BEAR_RATING", 354, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE);
            VIEW_BULL_RATING = new Action("VIEW_BULL_RATING", 355, 182);
            SCRUB_CANDLESTICK_CHART = new Action("SCRUB_CANDLESTICK_CHART", 356, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE);
            SCRUB_LINE_CHART = new Action("SCRUB_LINE_CHART", 357, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE);
            TRADE_BAR_VIEW_ALL_OPTIONS = new Action("TRADE_BAR_VIEW_ALL_OPTIONS", 358, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE);
            TRADE_BAR_BUY = new Action("TRADE_BAR_BUY", 359, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE);
            TRADE_BAR_SELL = new Action("TRADE_BAR_SELL", 360, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE);
            LOGIN = new Action("LOGIN", 361, EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE);
            FORGOT_PASSWORD = new Action("FORGOT_PASSWORD", 362, 155);
            UPDATE_PASSWORD = new Action("UPDATE_PASSWORD", 363, EnumC7081g.SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE);
            VERIFY_EMAIL = new Action("VERIFY_EMAIL", 364, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE);
            VERIFY_PHONE = new Action("VERIFY_PHONE", 365, 165);
            UPDATE_TWO_FACTOR_AUTHENTICATION = new Action("UPDATE_TWO_FACTOR_AUTHENTICATION", 366, EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE);
            COPY_BACKUP_CODE = new Action("COPY_BACKUP_CODE", 367, 167);
            RESEND_SMS_CODE = new Action("RESEND_SMS_CODE", 368, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE);
            RESEND_CHALLENGE = new Action("RESEND_CHALLENGE", 369, EnumC7081g.SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE);
            MISSING_DEVICE_APPROVAL_NOTIFICATION = new Action("MISSING_DEVICE_APPROVAL_NOTIFICATION", 370, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE);
            REMOVE_ALL_DEVICES = new Action("REMOVE_ALL_DEVICES", 371, EnumC7081g.SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE);
            REMOVE_DEVICE = new Action("REMOVE_DEVICE", 372, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_VALUE);
            REMOVE_ALL_DEVICES_CONFIRM = new Action("REMOVE_ALL_DEVICES_CONFIRM", 373, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            RESET_PASSWORD = new Action("RESET_PASSWORD", 374, EnumC7081g.SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE);
            FORGOT_EMAIL_PASSWORD = new Action("FORGOT_EMAIL_PASSWORD", 375, 500);
            ACCESS_TO_SOMEONE_ELSES_ACCOUNT = new Action("ACCESS_TO_SOMEONE_ELSES_ACCOUNT", 376, 501);
            VERIFIED_EMAIL = new Action("VERIFIED_EMAIL", 377, com.withpersona.sdk2.inquiry.network.core.HttpStatusCode.BAD_GATEWAY_502);
            RESEND_LINK = new Action("RESEND_LINK", 378, 503);
            FORGOT_EMAIL = new Action("FORGOT_EMAIL", 379, 505);
            LOOKING_FOR_FACE = new Action("LOOKING_FOR_FACE", 380, 511);
            FACE_BLURRY = new Action("FACE_BLURRY", 381, 512);
            FACE_NOT_DETECTED = new Action("FACE_NOT_DETECTED", 382, 513);
            FACE_DETECTED_CAPTURING = new Action("FACE_DETECTED_CAPTURING", 383, 514);
            PROCESSING_SELFIE = new Action("PROCESSING_SELFIE", 384, 515);
            SELFIE_VERIFICATION_SUCCESS = new Action("SELFIE_VERIFICATION_SUCCESS", 385, WaitlistAnimationConstants.RIGHT_YAW_END);
            SELFIE_VERIFICATION_FAILED = new Action("SELFIE_VERIFICATION_FAILED", 386, 517);
            SELFIE_UPLOAD_SUCCESS = new Action("SELFIE_UPLOAD_SUCCESS", 387, 518);
            SELFIE_CAMERA_NOT_AUTHORIZED = new Action("SELFIE_CAMERA_NOT_AUTHORIZED", 388, 519);
            SELFIE_ENVIRONMENT_DARK = new Action("SELFIE_ENVIRONMENT_DARK", 389, 520);
            SELFIE_CAMERA_BLOCKED = new Action("SELFIE_CAMERA_BLOCKED", 390, HttpStatusCode.DOWNTIME_ERROR);
            SELFIE_EXCEEDED_MAX_RETRIES = new Action("SELFIE_EXCEEDED_MAX_RETRIES", 391, 523);
            SELFIE_CAPTURE_RETRY = new Action("SELFIE_CAPTURE_RETRY", 392, 524);
            SELFIE_GLARE_DETECTED = new Action("SELFIE_GLARE_DETECTED", 393, 526);
            SELFIE_FACE_NOT_STRAIGHT = new Action("SELFIE_FACE_NOT_STRAIGHT", 394, 529);
            SELFIE_FACE_TOO_FAR = new Action("SELFIE_FACE_TOO_FAR", 395, 530);
            SELFIE_FACE_TOO_CLOSE = new Action("SELFIE_FACE_TOO_CLOSE", WaitlistAnimationConstants.LEFT_YAW_START, 531);
            SELFIE_MULTIPLE_FACES_DETECTED = new Action("SELFIE_MULTIPLE_FACES_DETECTED", 397, 532);
            VIEW_RHY_MIGRATION_ROUNDUP_UPSELL = new Action("VIEW_RHY_MIGRATION_ROUNDUP_UPSELL", 398, 398);
            VIEW_RHY_MIGRATION_CASHBACK_UPSELL = new Action("VIEW_RHY_MIGRATION_CASHBACK_UPSELL", 399, 399);
            VIEW_RHY_MIGRATION_EARLY_DD_UPSELL = new Action("VIEW_RHY_MIGRATION_EARLY_DD_UPSELL", 400, 400);
            VIEW_RHY_MIGRATION_SYP_UPSELL = new Action("VIEW_RHY_MIGRATION_SYP_UPSELL", 401, 401);
            RHY_TURBOTAX_ACCOUNT_OPENED = new Action("RHY_TURBOTAX_ACCOUNT_OPENED", 402, 402);
            RHY_TURBOTAX_VISIT_NON_RHY = new Action("RHY_TURBOTAX_VISIT_NON_RHY", HttpStatusCode.FORBIDDEN, HttpStatusCode.FORBIDDEN);
            RHY_TURBOTAX_VISIT_RHY = new Action("RHY_TURBOTAX_VISIT_RHY", 404, 404);
            RHY_MIGRATION_FEATURE_INTRO_OPEN_ACCOUNT = new Action("RHY_MIGRATION_FEATURE_INTRO_OPEN_ACCOUNT", 405, EnumC7081g.SDK_ASSET_ILLUSTRATION_WALLET_VALUE);
            RHY_MIGRATION_AGREE = new Action("RHY_MIGRATION_AGREE", 406, EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_VALUE);
            RHY_MIGRATION_CONFIRM_ADDRESS = new Action("RHY_MIGRATION_CONFIRM_ADDRESS", 407, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            RHY_MIGRATION_OPEN_ACCOUNT_CONTINUE = new Action("RHY_MIGRATION_OPEN_ACCOUNT_CONTINUE", 408, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE);
            RHY_MIGRATION_OPEN_ACCOUNT_TIMEOUT_DONE = new Action("RHY_MIGRATION_OPEN_ACCOUNT_TIMEOUT_DONE", 409, EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE);
            RHY_MIGRATION_WHATS_CHANGING = new Action("RHY_MIGRATION_WHATS_CHANGING", HttpStatusCode.GONE, EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE);
            RHY_MIGRATION_EDIT_ADDRESS = new Action("RHY_MIGRATION_EDIT_ADDRESS", 411, EnumC7081g.SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE);
            EXIT_RECS_FLOW = new Action("EXIT_RECS_FLOW", 412, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE);
            SUBMIT_RECOMMENDATION_ORDER = new Action("SUBMIT_RECOMMENDATION_ORDER", 413, 188);
            GET_ACCESS = new Action("GET_ACCESS", 414, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE);
            VIEW_ASSET_DETAIL_PAGE = new Action("VIEW_ASSET_DETAIL_PAGE", 415, 1);
            ADD_TO_LIST = new Action("ADD_TO_LIST", 416, 18);
            REMOVE_FROM_LIST = new Action("REMOVE_FROM_LIST", 417, 19);
            SUBMIT_RECURRING_ORDER = new Action("SUBMIT_RECURRING_ORDER", 418, 73);
            RECURRING_ORDER_SUCCESS = new Action("RECURRING_ORDER_SUCCESS", 419, 74);
            RECURRING_ORDER_ERROR = new Action("RECURRING_ORDER_ERROR", 420, 75);
            SELECT_ORDER_KIND = new Action("SELECT_ORDER_KIND", 421, 76);
            ACATS_IN_NAME_NOT_MATCHING = new Action("ACATS_IN_NAME_NOT_MATCHING", 422, EnumC7081g.SDK_ASSET_ICON_INCOMPLETE_VALUE);
            CONTACT_SUPPORT = new Action("CONTACT_SUPPORT", 423, EnumC7081g.SDK_ASSET_ICON_NEW_WINDOW_VALUE);
            EXIT_ACATS_IN_FLOW = new Action("EXIT_ACATS_IN_FLOW", 424, 211);
            ACATS_IN_CANT_FIND_BROKERAGE = new Action("ACATS_IN_CANT_FIND_BROKERAGE", CompanyFinancialsSection.BAR_ANIMATION_DURATION, 375);
            VIEW_ACATS_IN_TRANSFER = new Action("VIEW_ACATS_IN_TRANSFER", 426, 376);
            CONFIRM_GIFT = new Action("CONFIRM_GIFT", 427, EnumC7081g.SDK_ASSET_ICON_QUESTION_VALUE);
            CANCEL_GIFT = new Action("CANCEL_GIFT", 428, EnumC7081g.SDK_ASSET_ICON_REJECTED_REC_VALUE);
            CLAIM_GIFT = new Action("CLAIM_GIFT", 429, EnumC7081g.SDK_ASSET_ICON_SHIELD_CAUTION_VALUE);
            CLAIM_GIFT_DONE = new Action("CLAIM_GIFT_DONE", 430, EnumC7081g.SDK_ASSET_ICON_SUBMIT_VALUE);
            VIEW_CRYPTO_GIFT_HISTORY = new Action("VIEW_CRYPTO_GIFT_HISTORY", 431, EnumC7081g.SDK_ASSET_ICON_SUBTRACT_VALUE);
            CREATE_CRYPTO_GIFT = new Action("CREATE_CRYPTO_GIFT", 432, 224);
            CANCEL_CRYPTO_GIFT = new Action("CANCEL_CRYPTO_GIFT", 433, 225);
            ADD_BENEFICIARY = new Action("ADD_BENEFICIARY", 434, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE);
            EDIT_BENEFICIARY = new Action("EDIT_BENEFICIARY", 435, EnumC7081g.f2778x3356acf6);
            REMOVE_BENEFICIARY = new Action("REMOVE_BENEFICIARY", 436, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE);
            VIEW_BENEFICIARY_DETAIL = new Action("VIEW_BENEFICIARY_DETAIL", 437, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE);
            VIEW_ROUNDUP_REWARD = new Action("VIEW_ROUNDUP_REWARD", 438, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE);
            VIEW_HISTORY_ITEM = new Action("VIEW_HISTORY_ITEM", 439, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE);
            VIEW_SEND_CHECK = new Action("VIEW_SEND_CHECK", 440, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE);
            VIEW_RHY_SETTINGS = new Action("VIEW_RHY_SETTINGS", 441, EnumC7081g.f2779x59907a3d);
            ENABLE_EARLY_PAY = new Action("ENABLE_EARLY_PAY", 442, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE);
            DISABLE_EARLY_PAY = new Action("DISABLE_EARLY_PAY", 443, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            VIEW_ROUNDUP_AMOUNT_FAQ = new Action("VIEW_ROUNDUP_AMOUNT_FAQ", 444, EnumC7081g.SDK_ASSET_HEADER_BOLT_VALUE);
            VIEW_ROUNDUP_SET_ASIDE_FAQ = new Action("VIEW_ROUNDUP_SET_ASIDE_FAQ", 445, EnumC7081g.SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE);
            SKIP_ROUNDUP_ORDER = new Action("SKIP_ROUNDUP_ORDER", 446, EnumC7081g.SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE);
            VIEW_CRYPTO_SIGNUP_NOTICE = new Action("VIEW_CRYPTO_SIGNUP_NOTICE", 447, EnumC7081g.SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE);
            VIEW_SUITABILITY_NOTICE = new Action("VIEW_SUITABILITY_NOTICE", 448, EnumC7081g.SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE);
            TAP_RHY_MIGRATION_FUNDING_AMOUNT = new Action("TAP_RHY_MIGRATION_FUNDING_AMOUNT", 449, 384);
            SET_UP_MOBILE_WALLET = new Action("SET_UP_MOBILE_WALLET", 450, 385);
            UPGRADE_TO_CASH_CARD = new Action("UPGRADE_TO_CASH_CARD", 451, 386);
            SLIP_ONBOARDING_CLICK_FAQS = new Action("SLIP_ONBOARDING_CLICK_FAQS", 452, EnumC7081g.SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE);
            ENABLE_SLIP_STOCK_INTEREST = new Action("ENABLE_SLIP_STOCK_INTEREST", 453, EnumC7081g.SDK_ASSET_HEADER_REPORT_SHARED_VALUE);
            DISABLE_SLIP_STOCK_INTEREST = new Action("DISABLE_SLIP_STOCK_INTEREST", 454, EnumC7081g.SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE);
            ENABLE_CASH_SWEEP = new Action("ENABLE_CASH_SWEEP", 455, EnumC7081g.SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE);
            DISABLE_CASH_SWEEP = new Action("DISABLE_CASH_SWEEP", WaitlistAnimationConstants.MIDDLE_YAW_FRAME, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE);
            ADD_ACCOUNT = new Action("ADD_ACCOUNT", 457, EnumC7081g.SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE);
            DEBIT_CARD_LINKING = new Action("DEBIT_CARD_LINKING", 458, EnumC7081g.SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE);
            BANK_LINKING = new Action("BANK_LINKING", 459, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE);
            DEPOSIT_MONEY = new Action("DEPOSIT_MONEY", 460, EnumC7081g.SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE);
            DEBIT_CARD_LINKING_PRECHECK = new Action("DEBIT_CARD_LINKING_PRECHECK", 461, 406);
            MARGIN_UPGRADE_SELECT_GOLD_INTEREST_RATE = new Action("MARGIN_UPGRADE_SELECT_GOLD_INTEREST_RATE", 462, 302);
            MARGIN_UPGRADE_SELECT_REGULAR_INTEREST_RATE = new Action("MARGIN_UPGRADE_SELECT_REGULAR_INTEREST_RATE", 463, EnumC7081g.SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE);
            VIEW_MARGIN_UPGRADE_DISCLOSURE_STATEMENT = new Action("VIEW_MARGIN_UPGRADE_DISCLOSURE_STATEMENT", 464, EnumC7081g.SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE);
            SET_MARGIN_LIMIT = new Action("SET_MARGIN_LIMIT", 465, EnumC7081g.SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE);
            COVER_MARGIN_CALL_DEPOSIT_FUNDS = new Action("COVER_MARGIN_CALL_DEPOSIT_FUNDS", 466, 413);
            COVER_MARGIN_CALL_SELL_STOCKS = new Action("COVER_MARGIN_CALL_SELL_STOCKS", 467, 414);
            INSTANT_UPSELL_HELP_ARTICLE = new Action("INSTANT_UPSELL_HELP_ARTICLE", 468, 452);
            ENABLE_MARGIN_INVESTING = new Action("ENABLE_MARGIN_INVESTING", 469, 499);
            SIGN_UP = new Action("SIGN_UP", 470, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE);
            CREATE_LOGIN = new Action("CREATE_LOGIN", 471, EnumC7081g.SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE);
            HIDE_PASSWORD = new Action("HIDE_PASSWORD", 472, EnumC7081g.SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE);
            SHOW_PASSWORD = new Action("SHOW_PASSWORD", 473, EnumC7081g.f2774x74902ae0);
            COMPLETE_USER_CREATION = new Action("COMPLETE_USER_CREATION", 474, EnumC7081g.SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE);
            APP_TRACKING_TRANSPARENCY_ALLOW = new Action("APP_TRACKING_TRANSPARENCY_ALLOW", 475, 453);
            APP_TRACKING_TRANSPARENCY_DENY = new Action("APP_TRACKING_TRANSPARENCY_DENY", 476, 454);
            VERIFY_ID_INSTANTLY = new Action("VERIFY_ID_INSTANTLY", 477, 455);
            VERIFY_ID_MANUALLY = new Action("VERIFY_ID_MANUALLY", 478, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
            MARKETING_EMAILS_OPT_IN = new Action("MARKETING_EMAILS_OPT_IN", 479, 457);
            MARKETING_EMAILS_OPT_OUT = new Action("MARKETING_EMAILS_OPT_OUT", 480, 458);
            RESURRECTION_TAKEOVER_UPSELL = new Action("RESURRECTION_TAKEOVER_UPSELL", 481, 483);
            ACCOUNT_STATE_CHANGED = new Action("ACCOUNT_STATE_CHANGED", 482, 548);
            SIGN = new Action("SIGN", 483, EnumC7081g.SDK_ASSET_ICON_UPLOAD_VALUE);
            REJECT_DAPP = new Action("REJECT_DAPP", 484, EnumC7081g.SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE);
            ALLOW_DAPP = new Action("ALLOW_DAPP", 485, EnumC7081g.SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE);
            CONFIRM_DAPP_TXN = new Action("CONFIRM_DAPP_TXN", 486, 330);
            VIEW_BACKUPS = new Action("VIEW_BACKUPS", 487, 333);
            VIEW_ACTIVITY_HISTORY = new Action("VIEW_ACTIVITY_HISTORY", 488, 334);
            PASTE = new Action("PASTE", 489, 335);
            SHOW_TOKEN_ACTIVITY = new Action("SHOW_TOKEN_ACTIVITY", 490, WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END);
            DEPOSIT_TOKEN = new Action("DEPOSIT_TOKEN", 491, 337);
            DELETE_BACKUP = new Action("DELETE_BACKUP", 492, 338);
            CREATE_NC_WALLET = new Action("CREATE_NC_WALLET", 493, 346);
            IMPORT_NC_WALLET = new Action("IMPORT_NC_WALLET", 494, 347);
            RECOVER_NC_WALLET = new Action("RECOVER_NC_WALLET", 495, 348);
            ENROLL_BIOMETRIC_AUTHENTICATION = new Action("ENROLL_BIOMETRIC_AUTHENTICATION", 496, 349);
            ENROLL_PIN = new Action("ENROLL_PIN", 497, 350);
            VIEW_TOKEN_LIST = new Action("VIEW_TOKEN_LIST", 498, 351);
            SELECT_TOKEN = new Action("SELECT_TOKEN", 499, 352);
            RH_CORE_FUNDING_RETURN = new Action("RH_CORE_FUNDING_RETURN", 500, 353);
            DISCONNECT_ALL = new Action("DISCONNECT_ALL", 501, 354);
            SHOW_TXN_DETAIL = new Action("SHOW_TXN_DETAIL", com.withpersona.sdk2.inquiry.network.core.HttpStatusCode.BAD_GATEWAY_502, 356);
            CONFIRM_DISCONNECT = new Action("CONFIRM_DISCONNECT", 503, 357);
            DISCONNECT = new Action("DISCONNECT", 504, 358);
            TRANSFER_FROM_ROBINHOOD = new Action("TRANSFER_FROM_ROBINHOOD", 505, 360);
            REMOVE_WALLET = new Action("REMOVE_WALLET", 506, 362);
            SEE_DAPP_CONNECTIONS = new Action("SEE_DAPP_CONNECTIONS", 507, 363);
            MANAGE_DAPP_CONNECTION = new Action("MANAGE_DAPP_CONNECTION", 508, 367);
            TOGGLE_COIN_EXPLORE = new Action("TOGGLE_COIN_EXPLORE", 509, 377);
            VIEW_CRYPTO_LIST_PAGE = new Action("VIEW_CRYPTO_LIST_PAGE", 510, 378);
            BEGIN_CRYPTO_TRANSFER = new Action("BEGIN_CRYPTO_TRANSFER", 511, 379);
            BEGIN_TRANSFER_CRYPTO = new Action("BEGIN_TRANSFER_CRYPTO", 512, 380);
            BEGIN_CRYPTO_DEPOSIT = new Action("BEGIN_CRYPTO_DEPOSIT", 513, 381);
            VIEW_STAKING = new Action("VIEW_STAKING", 514, 473);
            ENTER_RH_CONNECT_FLOW = new Action("ENTER_RH_CONNECT_FLOW", 515, 477);
            ENTER_SARDINE_FLOW = new Action("ENTER_SARDINE_FLOW", WaitlistAnimationConstants.RIGHT_YAW_END, 478);
            BUY_CRYPTO = new Action("BUY_CRYPTO", 517, 479);
            DEPOSIT_CRYPTO = new Action("DEPOSIT_CRYPTO", 518, 480);
            CRYPTO_TRANSFER_ENROLLMENT_SUCCESS = new Action("CRYPTO_TRANSFER_ENROLLMENT_SUCCESS", 519, 487);
            VIEW_USER_LIST_DETAIL_PAGE = new Action("VIEW_USER_LIST_DETAIL_PAGE", 520, 389);
            ASSET_ROW_DISPLAY_VALUE_CHANGED_LAST_PRICE = new Action("ASSET_ROW_DISPLAY_VALUE_CHANGED_LAST_PRICE", HttpStatusCode.DOWNTIME_ERROR, 393);
            ASSET_ROW_DISPLAY_VALUE_CHANGED_EQUITY = new Action("ASSET_ROW_DISPLAY_VALUE_CHANGED_EQUITY", 522, 394);
            ASSET_ROW_DISPLAY_VALUE_CHANGED_RETURNS_TODAY = new Action("ASSET_ROW_DISPLAY_VALUE_CHANGED_RETURNS_TODAY", 523, 395);
            ASSET_ROW_DISPLAY_VALUE_CHANGED_RETURNS_TOTAL = new Action("ASSET_ROW_DISPLAY_VALUE_CHANGED_RETURNS_TOTAL", 524, WaitlistAnimationConstants.LEFT_YAW_START);
            VIEW_OPTION_AGGREGATE_DETAIL_PAGE = new Action("VIEW_OPTION_AGGREGATE_DETAIL_PAGE", 525, 397);
            VIEW_REFERRAL_OFFER = new Action("VIEW_REFERRAL_OFFER", 526, 438);
            VIEW_VIRTUAL_CARD = new Action("VIEW_VIRTUAL_CARD", 527, 440);
            TAP_RHY_REFERRALS_FUNDING_AMOUNT = new Action("TAP_RHY_REFERRALS_FUNDING_AMOUNT", 528, 441);
            GOLD_UPGRADE_SUCCESS = new Action("GOLD_UPGRADE_SUCCESS", 529, 468);
            VIEW_GOLD_BILLING_DISCLOSURES_STATEMENT = new Action("VIEW_GOLD_BILLING_DISCLOSURES_STATEMENT", 530, 486);
            RH_GOLD_OFFER = new Action("RH_GOLD_OFFER", 531, 528);
            VIEW_PNL_HUB = new Action("VIEW_PNL_HUB", 532, 474);
            GROUP_BY = new Action("GROUP_BY", 533, 475);
            LADDER_SELECT_BULK_PENDING_ORDERS = new Action("LADDER_SELECT_BULK_PENDING_ORDERS", 534, 493);
            LADDER_SWIPE_TO_DELETE_START = new Action("LADDER_SWIPE_TO_DELETE_START", 535, 494);
            LADDER_CANCEL_ORDER = new Action("LADDER_CANCEL_ORDER", 536, 495);
            LADDER_DRAG_TO_MODIFY_START = new Action("LADDER_DRAG_TO_MODIFY_START", 537, 496);
            LADDER_MODIFY_ORDER = new Action("LADDER_MODIFY_ORDER", 538, 497);
            FUTURES_DETAIL_VIEW_PICTURE_IN_PICTURE = new Action("FUTURES_DETAIL_VIEW_PICTURE_IN_PICTURE", 539, 522);
            BACKUP_WALLET = new Action("BACKUP_WALLET", 540, 535);
            BACKUP_TO_ICLOUD = new Action("BACKUP_TO_ICLOUD", 541, 536);
            BACKUP_MANUALLY = new Action("BACKUP_MANUALLY", 542, 537);
            ENABLE_NOTIFICATION = new Action("ENABLE_NOTIFICATION", 543, 538);
            ONBOARDING_COMPLETE = new Action("ONBOARDING_COMPLETE", 544, 539);
            VIEW_CASH_BALANCES_DETAILS_PAGE = new Action("VIEW_CASH_BALANCES_DETAILS_PAGE", 545, 540);
            VIEW_MCW_DEPOSIT_FLOW = new Action("VIEW_MCW_DEPOSIT_FLOW", 546, 541);
            VIEW_HOW_CASH_IS_CALCULATED = new Action("VIEW_HOW_CASH_IS_CALCULATED", 547, 542);
            VIEW_MCW_CONVERT_CURRENCY_FLOW = new Action("VIEW_MCW_CONVERT_CURRENCY_FLOW", 548, 543);
            EDIT_COLLATERAL = new Action("EDIT_COLLATERAL", 549, 549);
            EDIT_LEVERAGE = new Action("EDIT_LEVERAGE", 550, 550);
            EDIT_TP = new Action("EDIT_TP", 551, 551);
            EDIT_SL = new Action("EDIT_SL", RhRoomDatabase.MIGRATION_START_VER, RhRoomDatabase.MIGRATION_START_VER);
            VIEW_PDP = new Action("VIEW_PDP", 553, 553);
            FETCH_VERTIAS_DEVICE_ID = new Action("FETCH_VERTIAS_DEVICE_ID", 554, 554);
            SELFIE_START_RECORDING_CALLED = new Action("SELFIE_START_RECORDING_CALLED", 555, 555);
            SELFIE_DID_START_RECORDING_TO_CALLED = new Action("SELFIE_DID_START_RECORDING_TO_CALLED", 556, 556);
            SELFIE_STOP_RECORDING_CALLED = new Action("SELFIE_STOP_RECORDING_CALLED", 557, 557);
            SEFLIE_DID_FINISH_RECORDING_TO_CALLED = new Action("SEFLIE_DID_FINISH_RECORDING_TO_CALLED", 558, 558);
            SELFIE_PHOTO_CAPTURE_CALLED = new Action("SELFIE_PHOTO_CAPTURE_CALLED", 559, 559);
            SELFIE_DID_FINISH_PROCESSING_PHOTO_CALLED = new Action("SELFIE_DID_FINISH_PROCESSING_PHOTO_CALLED", 560, 560);
            SELECT_CURRENCY = new Action("SELECT_CURRENCY", 561, 561);
            SWAP_INPUTS = new Action("SWAP_INPUTS", 562, 562);
            SET_CONVERSION_AMOUNT = new Action("SET_CONVERSION_AMOUNT", 563, 563);
            VIEW_FX_ORDER_DETAILS = new Action("VIEW_FX_ORDER_DETAILS", 564, 564);
            SELFIE_CAPTURE_HELPERS_INIT = new Action("SELFIE_CAPTURE_HELPERS_INIT", 565, 565);
            SELFIE_CAPTURE_MANAGERS_INIT = new Action("SELFIE_CAPTURE_MANAGERS_INIT", 566, 566);
            VIEW_COMBO_ORDER_DETAIL = new Action("VIEW_COMBO_ORDER_DETAIL", 567, 567);
            SELFIE_CAPTURE_BROADCASTER_INIT = new Action("SELFIE_CAPTURE_BROADCASTER_INIT", 568, 568);
            OPEN_TAKEOVER = new Action("OPEN_TAKEOVER", 569, 569);
            VIEW_FUTURES_DETAIL_PAGE = new Action("VIEW_FUTURES_DETAIL_PAGE", 570, 570);
            SHOW_DROPDOWN = new Action("SHOW_DROPDOWN", 571, 571);
            SELECT_SUPPORT_CHANNEL = new Action("SELECT_SUPPORT_CHANNEL", 572, 572);
            VIEW_EVENT_CONTRACT_DETAIL_PAGE = new Action("VIEW_EVENT_CONTRACT_DETAIL_PAGE", 573, 573);
            VIEW_PICTURE_IN_PICTURE = new Action("VIEW_PICTURE_IN_PICTURE", 574, 574);
            VIEW_EQUITY_TRADING_LADDER = new Action("VIEW_EQUITY_TRADING_LADDER", CompanyFinancialsSection.LINE_REVEAL_ANIMATION_DURATION, CompanyFinancialsSection.LINE_REVEAL_ANIMATION_DURATION);
            CRYPTO_TRANSFER_ADD_COST_BASIS_LOT_SUCCESS = new Action("CRYPTO_TRANSFER_ADD_COST_BASIS_LOT_SUCCESS", 576, 576);
            CRYPTO_TRANSFER_ADD_COST_BASIS_COMPLETED = new Action("CRYPTO_TRANSFER_ADD_COST_BASIS_COMPLETED", 577, 577);
            MARGIN_CALL_SUMMARY_TO_ORDER_DATA_MISMATCH = new Action("MARGIN_CALL_SUMMARY_TO_ORDER_DATA_MISMATCH", 578, 578);
            CONNECT_FOUND_ACCOUNT = new Action("CONNECT_FOUND_ACCOUNT", 579, 579);
            VIEW_APPOINTMENT = new Action("VIEW_APPOINTMENT", 580, 580);
            INITIATE_TAX_FLOW = new Action("INITIATE_TAX_FLOW", 581, 581);
            INITIATE_ESTATE_FLOW = new Action("INITIATE_ESTATE_FLOW", 582, 582);
            SWITCH_TAB = new Action("SWITCH_TAB", 583, 583);
            VIEW_ACTIVITY_FEED = new Action("VIEW_ACTIVITY_FEED", 584, 584);
            COMPOSE = new Action("COMPOSE", 585, 585);
            SELECT_TRADE_TO_POST = new Action("SELECT_TRADE_TO_POST", 586, 586);
            VIEW_POST_DETAIL_PAGE = new Action("VIEW_POST_DETAIL_PAGE", 587, 587);
            PULL_TO_REFRESH = new Action("PULL_TO_REFRESH", 588, 588);
            SCROLL_FEED = new Action("SCROLL_FEED", 589, 589);
            TOGGLE_DISPLAY_TYPE = new Action("TOGGLE_DISPLAY_TYPE", 590, 590);
            INITIATE_COPY_TRADE = new Action("INITIATE_COPY_TRADE", 591, 591);
            LIKE = new Action("LIKE", 592, 592);
            UNLIKE = new Action("UNLIKE", 593, 593);
            VIEW_LIKES = new Action("VIEW_LIKES", 594, 594);
            VIEW_COPY_TRADE_LIST = new Action("VIEW_COPY_TRADE_LIST", 595, 595);
            OPEN_POST_MENU = new Action("OPEN_POST_MENU", 596, 596);
            EDIT_POST = new Action("EDIT_POST", 597, 597);
            CONFIRM_DELETE_POST = new Action("CONFIRM_DELETE_POST", 598, 598);
            SUBMIT_COMMENT = new Action("SUBMIT_COMMENT", 599, 599);
            LIKE_COMMENT = new Action("LIKE_COMMENT", 600, 600);
            UNLIKE_COMMENT = new Action("UNLIKE_COMMENT", 601, 601);
            VIEW_COMMENT_LIKE_COUNT = new Action("VIEW_COMMENT_LIKE_COUNT", 602, 602);
            QUICK_TRADE_BUY = new Action("QUICK_TRADE_BUY", 603, 603);
            QUICK_TRADE_SELL = new Action("QUICK_TRADE_SELL", 604, 604);
            QUICK_TRADE_SHORT = new Action("QUICK_TRADE_SHORT", 605, 605);
            FOLLOW_USER = new Action("FOLLOW_USER", 606, 606);
            UNFOLLOW_USER = new Action("UNFOLLOW_USER", 607, 607);
            VIEW_FOLLOWERS = new Action("VIEW_FOLLOWERS", 608, 608);
            VIEW_FOLLOWING = new Action("VIEW_FOLLOWING", 609, 609);
            SUBMIT_POST = new Action("SUBMIT_POST", 610, 610);
            CANCEL_POST_COMPOSER = new Action("CANCEL_POST_COMPOSER", 611, 611);
            SELECT_LICENSE_STATUS = new Action("SELECT_LICENSE_STATUS", 612, 612);
            SELECT_VIEW_ONLY_STATUS = new Action("SELECT_VIEW_ONLY_STATUS", 613, 613);
            ACCEPT_AGREEMENT = new Action("ACCEPT_AGREEMENT", 614, 614);
            VIEW_SOCIAL_FEED = new Action("VIEW_SOCIAL_FEED", 615, 615);
            EDIT_PROFILE = new Action("EDIT_PROFILE", 616, 616);
            UPLOAD_PROFILE_IMAGE = new Action("UPLOAD_PROFILE_IMAGE", 617, 617);
            EDIT_USERNAME = new Action("EDIT_USERNAME", 618, 618);
            EDIT_BIO = new Action("EDIT_BIO", 619, 619);
            ACTIVITY_ITEM_TAP = new Action("ACTIVITY_ITEM_TAP", 620, 620);
            SOCIAL_GET_STARTED = new Action("SOCIAL_GET_STARTED", 621, 621);
            SELECT_NOT_LICENSED = new Action("SELECT_NOT_LICENSED", 622, 622);
            SELECT_LICENSED = new Action("SELECT_LICENSED", 623, 623);
            VIEW_POSTS_ABOUT_INSTRUMENT = new Action("VIEW_POSTS_ABOUT_INSTRUMENT", 624, 624);
            Action[] actionArr$values = $values();
            $VALUES = actionArr$values;
            $ENTRIES = EnumEntries2.enumEntries(actionArr$values);
            INSTANCE = new Companion(null);
            final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Action.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<Action>(orCreateKotlinClass, syntax, action) { // from class: com.robinhood.rosetta.eventlogging.UserInteractionEventData$Action$Companion$ADAPTER$1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.squareup.wire.EnumAdapter
                public UserInteractionEventData.Action fromValue(int value) {
                    return UserInteractionEventData.Action.INSTANCE.fromValue(value);
                }
            };
        }

        /* compiled from: UserInteractionEventData.kt */
        @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "fromValue", "value", "", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            @JvmStatic
            public final Action fromValue(int value) {
                switch (value) {
                    case 0:
                        return Action.ACTION_UNSPECIFIED;
                    case 1:
                        return Action.VIEW_ASSET_DETAIL_PAGE;
                    case 2:
                        return Action.VIEW_LIST_DISCOVERY_HUB;
                    case 3:
                        return Action.VIEW_ROBINHOOD_LIST_DETAIL_PAGE;
                    case 4:
                        return Action.VIEW_EXPANDED_LIST_CAROUSEL;
                    case 5:
                        return Action.VIEW_EDIT_PHONE_NUMBER;
                    case 6:
                        return Action.VIEW_HOME;
                    case 7:
                        return Action.APPROVE;
                    case 8:
                        return Action.DISMISS;
                    case 9:
                        return Action.RETRY;
                    case 10:
                        return Action.UNDO;
                    case 11:
                        return Action.REQUEST_CX_CALL;
                    case 12:
                        return Action.REQUEUE_CX_CALL;
                    case 13:
                        return Action.CANCEL_CX_CALL;
                    case 14:
                        return Action.VIEW_CX_CALL_STATUS;
                    case 15:
                        return Action.VIEW_CX_EMAIL_SUPPORT;
                    case 16:
                        return Action.VIEW_CX_CONTACT_US_FLOW;
                    case 17:
                        return Action.VIEW_ADD_TO_LIST_BOTTOM_SHEET;
                    case 18:
                        return Action.ADD_TO_LIST;
                    case 19:
                        return Action.REMOVE_FROM_LIST;
                    case 20:
                        return Action.SAVE;
                    case 21:
                        return Action.VIEW_DD_INTRO;
                    case 22:
                        return Action.VIEW_DD_SETUP_CHOICE;
                    case 23:
                        return Action.VIEW_DD_ACCOUNT_INFO;
                    case 24:
                        return Action.VIEW_DD_PREFILLED_INTRO;
                    case 25:
                        return Action.VIEW_DD_CONFIRM_EMPLOYER;
                    case 26:
                        return Action.VIEW_DD_UPDATE_EMPLOYER;
                    case 27:
                        return Action.VIEW_DD_UNSIGNED_FORM;
                    case 28:
                        return Action.VIEW_DD_SIGNATURE;
                    case 29:
                        return Action.VIEW_DD_SIGNED_FORM;
                    case 30:
                        return Action.VIEW_DD_CONGRATULATIONS;
                    case 31:
                        return Action.COMPLETE_DD_FLOW;
                    case 32:
                        return Action.CREATE_NEW_LIST;
                    case 33:
                        return Action.CONTINUE;
                    case 34:
                        return Action.SKIP;
                    case 35:
                        return Action.EXPAND;
                    case 36:
                        return Action.COLLAPSE;
                    case 37:
                        return Action.APPLY_FILTERS;
                    case 38:
                        return Action.CLEAR_FILTERS;
                    case 39:
                        return Action.VIEW_STOCK_DETAIL_PAGE;
                    case 40:
                        return Action.VIEW_CRYPTO_DETAIL_PAGE;
                    case 41:
                        return Action.VIEW_NEWS_ARTICLE;
                    case 42:
                        return Action.VIEW_BROWSE_NEWSFEED_THEATRE;
                    case 43:
                        return Action.VIEW_STOCK_NEWSFEED;
                    case 44:
                        return Action.PLAY;
                    case 45:
                        return Action.PAUSE;
                    case 46:
                        return Action.SKIP_FORWARD;
                    case 47:
                        return Action.SKIP_BACKWARD;
                    case 48:
                        return Action.REPLAY;
                    case 49:
                        return Action.MUTE;
                    case 50:
                        return Action.UNMUTE;
                    case 51:
                        return Action.SCRUB;
                    case 52:
                        return Action.SUBMIT_FEEDBACK;
                    case 53:
                        return Action.VIEW_FEEDBACK_BOTTOM_SHEET;
                    case 54:
                        return Action.OPEN_URL;
                    case 55:
                        return Action.VIEW_CRYPTO_NEWSFEED;
                    case 56:
                        return Action.START_DD_SWITCHER_AUTHENTICATION;
                    case 57:
                        return Action.COMPLETE_DD_SWITCHER;
                    case 58:
                        return Action.VIEW_DD_SWITCHER_SEARCH_COMPANY;
                    case 59:
                        return Action.VIEW_DD_SWITCHER_SEARCH_PAYROLL;
                    case 60:
                        return Action.VIEW_DD_SWITCHER_AUTHENTICATION;
                    case 61:
                        return Action.VIEW_DD_SWITCHER_AUTHENTICATION_SUCCESS;
                    case 62:
                        return Action.VIEW_DD_SWITCHER_AUTHENTICATION_ERROR;
                    case 63:
                        return Action.VIEW_DD_SWITCHER_AUTHENTICATION_MFA;
                    case 64:
                        return Action.VIEW_DD_SWITCHER_FORGOT_CREDENTIALS;
                    case 65:
                        return Action.BACK;
                    case 66:
                        return Action.ENTER_RECURRING_CREATION;
                    case 67:
                        return Action.SELECT_RECURRING_FREQUENCY;
                    case SDK_ASSET_ICON_HOME_VALUE:
                        return Action.SET_RECURRING_START_DATE;
                    case 69:
                        return Action.SELECT_PAYMENT_METHOD;
                    case 70:
                        return Action.ADD_PAYMENT_METHOD;
                    case SDK_ASSET_ICON_GUIDE_VALUE:
                        return Action.ADD_PAYMENT_METHOD_SUCCESS;
                    case SDK_ASSET_ICON_GLOBE_VALUE:
                        return Action.SET_RECURRING_AMOUNT;
                    case 73:
                        return Action.SUBMIT_RECURRING_ORDER;
                    case 74:
                        return Action.RECURRING_ORDER_SUCCESS;
                    case 75:
                        return Action.RECURRING_ORDER_ERROR;
                    case 76:
                        return Action.SELECT_ORDER_KIND;
                    case 77:
                        return Action.VIEW_RECURRING_HUB;
                    case 78:
                        return Action.VIEW_RECURRING_FIND_INVESTMENT;
                    case 79:
                        return Action.VIEW_RECURRING_DETAILS;
                    case 80:
                        return Action.FOLLOW_ROBINHOOD_LIST;
                    case 81:
                        return Action.UNFOLLOW_ROBINHOOD_LIST;
                    case 82:
                        return Action.SELECT_DD_SWITCHER_COMPANY;
                    case 83:
                        return Action.SELECT_DD_SWITCHER_PAYROLL;
                    case 84:
                        return Action.SELECT_DD_SWITCHER_PARTIAL_AMOUNT;
                    case 85:
                        return Action.CONTACT_SIGN_IN;
                    case 86:
                        return Action.EQUITY_SELECT_ORDER_KIND;
                    case 87:
                        return Action.EQUITY_SUBMIT_ORDER;
                    case 88:
                        return Action.EQUITY_ORDER_SUCCESS;
                    case 89:
                        return Action.EQUITY_ORDER_FAILURE;
                    case 90:
                        return Action.VIEW_LEARNING_LESSON;
                    case 91:
                        return Action.REFRESH;
                    case 92:
                        return Action.VIEW_PROCESSING_TIMES;
                    case 93:
                        return Action.CANCEL_TRANSFER;
                    case 94:
                        return Action.FETCH;
                    case 95:
                        return Action.VIEW_TRANSFER_DETAILS;
                    case 96:
                        return Action.SEARCH_DD_SWITCHER_COMPANY;
                    case 97:
                        return Action.SELECT;
                    case 98:
                        return Action.DESELECT;
                    case 99:
                        return Action.UPDATE_LIST_ITEMS;
                    case 100:
                        return Action.LEARN_MORE;
                    case 101:
                        return Action.SUBMIT;
                    case 102:
                        return Action.CANCEL_DISPUTE;
                    case 103:
                        return Action.SET_RECURRING_NEXT_ORDER_DATE;
                    case 104:
                        return Action.VIEW_CALENDAR_DATE_PICKER;
                    case 105:
                        return Action.TAP_OPTION_INSTRUMENT_ROW;
                    case 106:
                        return Action.TAP_OPTION_INSTRUMENT_PRIMARY_BUTTON;
                    case 107:
                        return Action.TAP_OPTION_INSTRUMENT_SECONDARY_BUTTON;
                    case 108:
                        return Action.MULTILEG_SELECT;
                    case 109:
                        return Action.MULTILEG_CANCEL;
                    case 110:
                        return Action.MULTILEG_CLEAR;
                    case 111:
                        return Action.TRADE;
                    case 112:
                        return Action.REVIEW;
                    case 113:
                        return Action.IAV_SELECT_BANK_ACCOUNT;
                    case 114:
                        return Action.REVIEW_QUEUED_DEPOSIT;
                    case 115:
                        return Action.SUBMIT_QUEUED_DEPOSIT;
                    case 116:
                        return Action.REVIEW_TRANSFER;
                    case 117:
                        return Action.SUBMIT_TRANSFER;
                    case 118:
                        return Action.VIEW_FUNDING;
                    case 119:
                        return Action.ANSWER_QUESTION;
                    case 120:
                        return Action.VIEW_OPTION_CHAIN_STOCK_CHART;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_SWITCH_VALUE:
                        return Action.HIDE_OPTION_CHAIN_STOCK_CHART;
                    case SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE:
                        return Action.ENTER_REDEMPTION_FLOW;
                    case 123:
                        return Action.CLAIM_STOCK_BEGIN;
                    case SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE:
                        return Action.CLAIM_CHOSEN_STOCK;
                    case 125:
                        return Action.HELP_ME_PICK;
                    case SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE:
                        return Action.SELECT_CALL_SCHEDULE_OPTION;
                    case SDK_ASSET_ILLUSTRATION_BRIEFCASE_VALUE:
                        return Action.VIEW_EDIT_CALL_SCHEDULE;
                    case 128:
                        return Action.TYPE_SEARCH_QUERY;
                    case SDK_ASSET_ILLUSTRATION_FORM_VALUE:
                        return Action.VIEW_SEARCH_RESULT;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE:
                        return Action.CANCEL_SEARCH_QUERY;
                    case 131:
                        return Action.CLEAR_SEARCH_QUERY;
                    case SDK_ASSET_ILLUSTRATION_IN_CONTROL_VALUE:
                        return Action.SEARCH_SHOW_MORE_CRYPTOS;
                    case SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE:
                        return Action.FELIX_CLOSE_EXPERIENCE;
                    case SDK_ASSET_ILLUSTRATION_DEV_LOGS_VALUE:
                        return Action.FELIX_SCREENSHOT;
                    case SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE:
                        return Action.FELIX_CLICK_DONE;
                    case 136:
                        return Action.FELIX_VIEW_OUTRO_LINK;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_CIRCLE_VALUE:
                        return Action.FELIX_VIEW_OUTRO_ANIMATION;
                    case SDK_ASSET_ILLUSTRATION_SHARE_YOUR_DATA_VALUE:
                        return Action.VIEW_DD_PARTIAL_PAYCHECK;
                    case SDK_ASSET_ILLUSTRATION_SPOT_PX_FEATURE_01_VALUE:
                        return Action.EDIT_RECURRING_ORDER_DATE;
                    case SDK_ASSET_ICON_ALERT_ERROR_RED_VALUE:
                        return Action.CLAIM_REWARD;
                    case SDK_ASSET_CONNECTIVITY_DOWN_ILLUSTRATION_VALUE:
                        return Action.DECLINE_REWARD;
                    case SDK_ASSET_CONNECTIVITY_WARNING_ILLUSTRATION_VALUE:
                        return Action.CONFIRM_DECLINE_REWARD;
                    case SDK_ASSET_ICON_ALERT_ERROR_BLACK_VALUE:
                        return Action.CANCEL_DECLINE_REWARD;
                    case 144:
                        return Action.VIEW_PROSPECTUS;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE:
                        return Action.VIEW_OPTION_CHAIN;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_PERSON_VALUE:
                        return Action.VIEW_EXERCISE_OPTION_FLOW;
                    case 147:
                        return Action.VIEW_SAFETY_LABEL_LESSON;
                    case SDK_ASSET_ICON_CHECKMARK_GREEN_SQUARE_CASH_VALUE:
                        return Action.VIEW_NEWSFEED_DISCLOSURE;
                    case SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE:
                        return Action.TOGGLE_GRAPH_LINE_CANDLESTICKS;
                    case 150:
                        return Action.CHANGE_GRAPH_INTERVAL;
                    case 151:
                        return Action.SCRUB_GRAPH;
                    case SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE:
                        return Action.VIEW_ORDER_TYPES;
                    case SDK_ASSET_ILLUSTRATION_SQUARE_CASH_GENERIC_INSTITUTION_VALUE:
                        return Action.SELECT_ORDER_TYPE;
                    case SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE:
                        return Action.LOGIN;
                    case 155:
                        return Action.FORGOT_PASSWORD;
                    case 156:
                        return Action.TOGGLE_ETP_COMPOSITION_VIEW;
                    case SDK_ASSET_ILLUSTRATION_FALLBACK_INSTITUTION_VALUE:
                        return Action.TAP_ETP_ITEM;
                    case SDK_ASSET_ILLUSTRATION_WALLET_VALUE:
                        return Action.RHY_MIGRATION_FEATURE_INTRO_OPEN_ACCOUNT;
                    case SDK_ASSET_ILLUSTRATION_INCOME_VALUE:
                        return Action.RHY_MIGRATION_AGREE;
                    case SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE:
                        return Action.RHY_MIGRATION_CONFIRM_ADDRESS;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_VALUE:
                        return Action.RHY_MIGRATION_OPEN_ACCOUNT_CONTINUE;
                    case SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE:
                        return Action.RHY_MIGRATION_OPEN_ACCOUNT_TIMEOUT_DONE;
                    case SDK_ASSET_ILLUSTRATION_PAYWITHPLAID_LOGO_VALUE:
                        return Action.UPDATE_PASSWORD;
                    case SDK_ASSET_ILLUSTRATION_SIGNIN_HEADER_VALUE:
                        return Action.VERIFY_EMAIL;
                    case 165:
                        return Action.VERIFY_PHONE;
                    case SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE:
                        return Action.UPDATE_TWO_FACTOR_AUTHENTICATION;
                    case 167:
                        return Action.COPY_BACKUP_CODE;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_VALUE:
                        return Action.RESEND_SMS_CODE;
                    case SDK_ASSET_HEADER_CARD_COLLECT_VALUE:
                        return Action.ENTER_REFERRAL_FLOW;
                    case SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE:
                        return Action.INVITE_CONTACTS;
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_VALUE:
                        return Action.SHARE_LINK;
                    case SDK_ASSET_ILLUSTRATION_CONSENT_HEADER_WEB3_DARK_APPEARANCE_VALUE:
                        return Action.PAST;
                    case SDK_ASSET_HEADER_FINAL_ERROR_DARK_APPEARANCE_VALUE:
                        return Action.INVITE;
                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_VALUE:
                        return Action.INVITE_MORE_FRIENDS;
                    case SDK_ASSET_ILLUSTRATION_NETWORK_SWITCH_DARK_APPEARANCE_VALUE:
                        return Action.ENTER_TRANSFER_AMOUNT;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_DARK_APPEARANCE_VALUE:
                        return Action.SELECT_ACCOUNT;
                    case SDK_ASSET_HEADER_FINAL_SUCCESS_DARK_APPEARANCE_VALUE:
                        return Action.SELECT_FREQUENCY;
                    case f2773x8d9721ad:
                        return Action.OFFER_PRIMARY_CTA;
                    case f2780x600b66fe:
                        return Action.OFFER_SECONDARY_CTA;
                    case SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE:
                        return Action.RHY_MIGRATION_WHATS_CHANGING;
                    case SDK_ASSET_ILLUSTRATION_PLAID_REVIEW_CONNECTION_VALUE:
                        return Action.VIEW_BEAR_RATING;
                    case 182:
                        return Action.VIEW_BULL_RATING;
                    case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_VALUE:
                        return Action.SCRUB_CANDLESTICK_CHART;
                    case SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE:
                        return Action.SCRUB_LINE_CHART;
                    case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_VALUE:
                        return Action.EXIT_RECS_FLOW;
                    case SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE:
                        return Action.VIEW_BANK_LINKING;
                    case SDK_ASSET_ILLUSTRATION_ATOMIC_LOGO_VALUE:
                        return Action.EDIT;
                    case 188:
                        return Action.SUBMIT_RECOMMENDATION_ORDER;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_2_VALUE:
                        return Action.GET_ACCESS;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_1_NEW_VALUE:
                        return Action.RHY_MIGRATION_EDIT_ADDRESS;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_2_NEW_VALUE:
                        return Action.VIEW_EDUCATION_TOUR;
                    case 192:
                        return Action.VIEW_OPTION_WATCHLIST_HUB;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_2_VALUE:
                        return Action.VIEW_OPTION_STRATEGY_DETAIL;
                    case SDK_ASSET_ICON_EXTERNAL_VALUE:
                        return Action.SORT_OPTION_WATCHLIST;
                    case SDK_ASSET_ICON_ALERT_WARNING_VALUE:
                        return Action.REARRANGE_OPTION_WATCHLIST;
                    case SDK_ASSET_ICON_ARROW_DOWN_VALUE:
                        return Action.OPTION_WATCHLIST_CHART_SCRUB;
                    case SDK_ASSET_ICON_ARROW_RIGHT_DOWN_VALUE:
                        return Action.SUBMIT_ORDER;
                    case SDK_ASSET_ICON_ARROW_UP_VALUE:
                        return Action.DELETE_RECURRING_INVESTMENT;
                    case SDK_ASSET_ICON_CANCEL_VALUE:
                        return Action.VIEW_OPTION_ORDER;
                    case 200:
                        return Action.VIEW_OPTION_WATCHLIST_ABOUT;
                    case 201:
                        return Action.EDIT_RECURRING_INVESTMENT;
                    case 202:
                        return Action.PAUSE_RECURRING_INVESTMENT;
                    case SDK_ASSET_ICON_CHEVRON_RIGHT_DOUBLE_S2_VALUE:
                        return Action.RECORD_VOICE;
                    case 204:
                        return Action.BEGIN_SELFIE_VERIFICATION;
                    case SDK_ASSET_ICON_CLIPBOARD_VALUE:
                        return Action.VIEW_LOGIN;
                    case SDK_ASSET_ICON_CLOCK_VALUE:
                        return Action.VIEW_SETTINGS;
                    case SDK_ASSET_ICON_COMMENT_VALUE:
                        return Action.UPDATE_VOICE_VERIFICATION;
                    case SDK_ASSET_ICON_INCOME_VALUE:
                        return Action.NEED_HELP;
                    case SDK_ASSET_ICON_INCOMPLETE_VALUE:
                        return Action.ACATS_IN_NAME_NOT_MATCHING;
                    case SDK_ASSET_ICON_NEW_WINDOW_VALUE:
                        return Action.CONTACT_SUPPORT;
                    case 211:
                        return Action.EXIT_ACATS_IN_FLOW;
                    case SDK_ASSET_ICON_OVERRIDE_VALUE:
                        return Action.SEND;
                    case SDK_ASSET_ICON_PAUSE_VALUE:
                        return Action.RECEIVE;
                    case SDK_ASSET_ICON_PIN_VALUE:
                        return Action.COPY;
                    case SDK_ASSET_ICON_PRODUCT_IDV_VALUE:
                        return Action.ENTER_TRANSFER_ADDRESS;
                    case SDK_ASSET_ICON_PRODUCT_MONITOR_VALUE:
                        return Action.VIEW_GOLD_UPGRADE;
                    case SDK_ASSET_ICON_PROGRESS_VALUE:
                        return Action.PRIMARY_CTA;
                    case SDK_ASSET_ICON_QUESTION_VALUE:
                        return Action.CONFIRM_GIFT;
                    case SDK_ASSET_ICON_REJECTED_REC_VALUE:
                        return Action.CANCEL_GIFT;
                    case SDK_ASSET_ICON_SHIELD_CAUTION_VALUE:
                        return Action.CLAIM_GIFT;
                    case SDK_ASSET_ICON_SUBMIT_VALUE:
                        return Action.CLAIM_GIFT_DONE;
                    case SDK_ASSET_ICON_SUBTRACT_VALUE:
                        return Action.VIEW_CRYPTO_GIFT_HISTORY;
                    case SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE:
                        return Action.CHANGE_PRIMARY_OPTION_CHART_LINE;
                    case 224:
                        return Action.CREATE_CRYPTO_GIFT;
                    case 225:
                        return Action.CANCEL_CRYPTO_GIFT;
                    case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_01_CIRCLE_VALUE:
                        return Action.VOTE;
                    case SDK_ASSET_ILLUSTRATION_BALANCE_BEAM_02_CIRCLE_VALUE:
                        return Action.RESEND_CHALLENGE;
                    case SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE:
                        return Action.TURN_ON_NOTIFICATION;
                    case SDK_ASSET_ILLUSTRATION_DEBITCARD_OVERLAY_INSTITUTION_VALUE:
                        return Action.MISSING_DEVICE_APPROVAL_NOTIFICATION;
                    case SDK_ASSET_ILLUSTRATION_EMPTY_SVG_VALUE:
                        return Action.REMOVE_ALL_DEVICES;
                    case SDK_ASSET_ILLUSTRATION_EXIT_VALUE:
                        return Action.REMOVE_DEVICE;
                    case SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE:
                        return Action.REMOVE_ALL_DEVICES_CONFIRM;
                    case SDK_ASSET_ILLUSTRATION_INFOCARD_BANKSTATEMENT_VALUE:
                        return Action.SHARE;
                    case SDK_ASSET_ILLUSTRATION_INFOCARD_PAYSTUB_VALUE:
                        return Action.DONE;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_LINK_CIRCLE_VALUE:
                        return Action.RESET_PASSWORD;
                    case SDK_ASSET_ILLUSTRATION_INSTITUTION_TRANSFER_CIRCLE_VALUE:
                        return Action.SET_UP_DIRECT_DEPOSIT;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_01_VALUE:
                        return Action.SELECT_DOLLAR_AMOUNT;
                    case SDK_ASSET_ILLUSTRATION_MD_ERROR_ATTEMPT_02_VALUE:
                        return Action.SELECT_PERCENTAGE_AMOUNT;
                    case 239:
                        return Action.CANCEL_RECURRING_CREATION;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE:
                        return Action.SELECT_BACKUP_PAYMENT_METHOD;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE:
                        return Action.ADD_BENEFICIARY;
                    case f2778x3356acf6:
                        return Action.EDIT_BENEFICIARY;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE:
                        return Action.REMOVE_BENEFICIARY;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_01_VALUE:
                        return Action.VIEW_BENEFICIARY_DETAIL;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_BALANCE_BEAM_02_VALUE:
                        return Action.VIEW_ROUNDUP_REWARD;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_FIRST_DEPOSIT_VALUE:
                        return Action.VIEW_HISTORY_ITEM;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_LINK_VALUE:
                        return Action.VIEW_DIRECT_DEPOSIT;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_INSTITUTION_TRANSFER_VALUE:
                        return Action.VIEW_SEND_CHECK;
                    case f2779x59907a3d:
                        return Action.VIEW_RHY_SETTINGS;
                    case 250:
                        return Action.VIEW_OPTION_TYPE;
                    case SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_SECOND_DEPOSIT_VALUE:
                        return Action.CONFIRM_OPTION_ATTESTATION;
                    case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE:
                        return Action.DENY_OPTION_ATTESTATION;
                    case SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_SEARCH_CIRCLE_VALUE:
                        return Action.ENABLE_EARLY_PAY;
                    case SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE:
                        return Action.DISABLE_EARLY_PAY;
                    case 255:
                        return Action.OPTION_CHAIN_LEGACY_STALLING;
                    case 256:
                        return Action.OPTION_CHAIN_NAPA_STALLING;
                    case SDK_ASSET_ICON_LIGHTNING_WHITE_VALUE:
                        return Action.ALREADY_SET_UP_DIRECT_DEPOSIT;
                    case SDK_ASSET_HEADER_BOLT_VALUE:
                        return Action.VIEW_ROUNDUP_AMOUNT_FAQ;
                    case SDK_ASSET_HEADER_FINAL_ENROLLMENT_SUCCESS_VALUE:
                        return Action.VIEW_ROUNDUP_SET_ASIDE_FAQ;
                    case SDK_ASSET_HEADER_FINAL_FAULTY_DATA_VALUE:
                        return Action.SKIP_ROUNDUP_ORDER;
                    case SDK_ASSET_ILLUSTRATION_SEND_DEPOSIT_AUTHORIZATION_HEADER_VALUE:
                        return Action.VIEW_CRYPTO_SIGNUP_NOTICE;
                    case SDK_ASSET_ILLUSTRATION_WAIT_SOME_TIME_VALUE:
                        return Action.VIEW_SUITABILITY_NOTICE;
                    case SDK_ASSET_ICON_SEARCH_WITH_BORDER_VALUE:
                        return Action.JOIN_WAITLIST;
                    case SDK_ASSET_ICON_PLAID_LOGO_VALUE:
                        return Action.VIEW_EDUCATION_HOME;
                    case SDK_ASSET_HEADER_SHIELD_VALUE:
                        return Action.VIEW_PAYCHECK_HUB;
                    case SDK_ASSET_ILLUSTRATION_CRA_OVERLAY_ACCOUNT_VALUE:
                        return Action.CREATE_PAYCHECK_INVESTMENT;
                    case SDK_ASSET_HEADER_LOGOLESS_CHECKINGS_SAVINGS_VALUE:
                        return Action.MANAGE_PAYCHECK_INVESTMENTS;
                    case SDK_ASSET_HEADER_ENABLE_TRANSFERS_VALUE:
                        return Action.SLIP_ONBOARDING_CLICK_FAQS;
                    case SDK_ASSET_HEADER_REPORT_SHARED_VALUE:
                        return Action.ENABLE_SLIP_STOCK_INTEREST;
                    case SDK_ASSET_HEADER_RTP_AUTHORIZE_MICRODEPOSITS_VALUE:
                        return Action.DISABLE_SLIP_STOCK_INTEREST;
                    case 271:
                        return Action.EARN_REWARDS;
                    case SDK_ASSET_ILLUSTRATION_USER_BRUSHSTROKE_VALUE:
                        return Action.ENABLE_CASH_SWEEP;
                    case SDK_ASSET_ILLUSTRATION_ACCOUNT_BRUSHSTROKE_VALUE:
                        return Action.DISABLE_CASH_SWEEP;
                    case SDK_ASSET_ILLUSTRATION_SUCCESS_BRUSHSTROKE_VALUE:
                        return Action.VIEW_OPTION_CHAIN_SETTINGS;
                    case SDK_ASSET_ILLUSTRATION_WARNING_EXIT_SPOT_SOLID_VALUE:
                        return Action.ADD_ACCOUNT;
                    case SDK_ASSET_ILLUSTRATION_REPORT_CIRCLE_SOLID_VALUE:
                        return Action.DEBIT_CARD_LINKING;
                    case SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE:
                        return Action.BANK_LINKING;
                    case SDK_ASSET_INSTITUTION_CIRCLE_SOLID_VALUE:
                        return Action.DEPOSIT_MONEY;
                    case SDK_ASSET_ILLUSTRATION_SUCCESS_CIRCLE_SOLID_VALUE:
                        return Action.FIND_INVESTMENT;
                    case 280:
                        return Action.VIEW_INBOX;
                    case SDK_ASSET_ILLUSTRATION_BANK_VALUE:
                        return Action.VIEW_SEARCH;
                    case SDK_ASSET_ILLUSTRATION_BANK_DARK_APPEARANCE_VALUE:
                        return Action.SCHEDULE_AUTOMATIC_DEPOSIT;
                    case 283:
                        return Action.VIEW_CX_CHAT_THREAD;
                    case SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE:
                        return Action.END_CX_CHAT;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_SMALL_VALUE:
                        return Action.END_CX_CHAT_CONFIRM;
                    case f2777x89a9e432:
                        return Action.START_NEW_INQUIRY;
                    case SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE:
                        return Action.VIEW_DEEPLINK;
                    case 288:
                        return Action.CHAT_ACTION;
                    case SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE:
                        return Action.VIEW_ADVANCED_CHARTS;
                    case SDK_ASSET_ILLUSTRATION_NOTE_VALUE:
                        return Action.CHANGE_CHART_SPAN;
                    case f2776x87e624cb:
                        return Action.REMOVE_SCRUB;
                    case SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE:
                        return Action.LOGOUT;
                    case SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE:
                        return Action.TRADE_BAR_VIEW_ALL_OPTIONS;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE:
                        return Action.TRADE_BAR_BUY;
                    case SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_DARK_APPEARANCE_VALUE:
                        return Action.TRADE_BAR_SELL;
                    case SDK_ASSET_LOADING_INDICATOR_VALUE:
                        return Action.REMOVE_FROM_BASKET;
                    case SDK_ASSET_LOADING_INDICATOR_SUCCESS_VALUE:
                        return Action.ADD_TO_BASKET;
                    case SDK_ASSET_BANK_ICON_CIRCLE_VALUE:
                        return Action.SUBMIT_INVEST_FLOW_ORDER;
                    case SDK_ASSET_ILLUSTRATION_GREEN_CIRCLED_CHECKMARK_VALUE:
                        return Action.EDIT_BASKET;
                    case 300:
                        return Action.FIND_AN_INVESTMENT;
                    case SDK_ASSET_CASH_ICON_CIRCLE_VALUE:
                        return Action.UPDATE_PAYMENT_METHOD;
                    case 302:
                        return Action.MARGIN_UPGRADE_SELECT_GOLD_INTEREST_RATE;
                    case SDK_ASSET_ANIMATION_MOBILE_AUTH_LOADING_DARK_APPEARANCE_VALUE:
                        return Action.MARGIN_UPGRADE_SELECT_REGULAR_INTEREST_RATE;
                    case SDK_ASSET_ICON_INLINE_LIGHTNING_VALUE:
                        return Action.VIEW_ALL_OFFERS;
                    case SDK_ASSET_ICON_INLINE_LIGHTNING_DARK_APPEARANCE_VALUE:
                        return Action.VIEW_MARGIN_UPGRADE_DISCLOSURE_STATEMENT;
                    case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_VALUE:
                        return Action.SET_MARGIN_LIMIT;
                    case SDK_ASSET_ILLUSTRATION_CLIPBOARD_CIRCLE_DARK_APPEARANCE_VALUE:
                        return Action.EDIT_INVESTMENT_PROFILE;
                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_VALUE:
                        return Action.SECONDARY_CTA;
                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_DARK_APPEARANCE_VALUE:
                        return Action.SIGN_UP;
                    case SDK_ASSET_PLAID_LOGO_LOADING_INDICATOR_SUCCESS_VALUE:
                        return Action.CREATE_LOGIN;
                    case SDK_ASSET_ILLUSTRATION_FACE_BIOMETRIC_PASSKEY_VALUE:
                        return Action.HIDE_PASSWORD;
                    case f2774x74902ae0:
                        return Action.SHOW_PASSWORD;
                    case SDK_ASSET_ICON_CHECKMARK_FILLED_BLUE_VALUE:
                        return Action.COMPLETE_USER_CREATION;
                    case SDK_ASSET_ICON_CHECKMARK_GRAY_VALUE:
                        return Action.TOGGLE_PRICE_CHART_TYPE;
                    case SDK_ASSET_ILLUSTRATION_SECURE_DATA_VALUE:
                        return Action.EDIT_INDICATOR;
                    case 316:
                        return Action.REMOVE_INDICATOR;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_VALUE:
                        return Action.CREATE_INDICATOR;
                    case SDK_ASSET_ILLUSTRATION_CONSUMER_REPORT_DARK_APPEARANCE_VALUE:
                        return Action.KEEP_ME_LOGGED_IN;
                    case f2781x2ba65ba3:
                        return Action.VIEW_RECENT_SEARCH_ITEM;
                    case SDK_ASSET_ILLUSTRATION_ALERT_WARNING_YELLOW_VALUE:
                        return Action.VIEW_STRATEGY_BUILDER_NUX;
                    case SDK_ASSET_BANK_ICON_CIRCLE_LIGHT_VALUE:
                        return Action.WITHDRAW_MONEY;
                    case SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE:
                        return Action.VIEW_STRATEGY_CHAIN;
                    case f2775xbcb7e6f3:
                        return Action.VIEW_STRATEGY_CHAIN_DISCLOSURE;
                    case SDK_ASSET_ICON_CHECKMARK_WITH_CIRCLE_VALUE:
                        return Action.VIEW_OPTION_ORDER_FORM;
                    case SDK_ASSET_ICON_REPORT_VALUE:
                        return Action.VIEW_OPTIONS_STATISTICS_BOTTOM_SHEET;
                    case SDK_ASSET_ICON_STEP_COMPLETE_VALUE:
                        return Action.VIEW_STRATEGY_CHAIN_BOTTOM_SHEET;
                    case SDK_ASSET_ICON_UPLOAD_VALUE:
                        return Action.SIGN;
                    case SDK_ASSET_HEADER_CONNECT_WITH_PLAID_DARK_APPEARANCE_VALUE:
                        return Action.REJECT_DAPP;
                    case SDK_ASSET_ICON_LIGHTNING_FILLED_BLUE_VALUE:
                        return Action.ALLOW_DAPP;
                    case 330:
                        return Action.CONFIRM_DAPP_TXN;
                    case 331:
                        return Action.RECURRING_SELECT_INVESTMENTS;
                    case 332:
                        return Action.RECURRING_SELECT_BROKERAGE_CASH;
                    case 333:
                        return Action.VIEW_BACKUPS;
                    case 334:
                        return Action.VIEW_ACTIVITY_HISTORY;
                    case 335:
                        return Action.PASTE;
                    case WaitlistAnimationConstants.IN_WAITLIST_ANIMATION_END /* 336 */:
                        return Action.SHOW_TOKEN_ACTIVITY;
                    case 337:
                        return Action.DEPOSIT_TOKEN;
                    case 338:
                        return Action.DELETE_BACKUP;
                    case 339:
                        return Action.SHARE_TO_TWITTER;
                    case 340:
                        return Action.ENABLE_ALERT;
                    case 341:
                        return Action.DISABLE_ALERT;
                    case 342:
                        return Action.RECS_RECURRING_KEEP_LAST_ORDER;
                    case 343:
                        return Action.RECS_RECURRING_START_FROM_SCRATCH;
                    case 344:
                        return Action.OMNISCAN;
                    case 345:
                        return Action.IMPORT;
                    case 346:
                        return Action.CREATE_NC_WALLET;
                    case 347:
                        return Action.IMPORT_NC_WALLET;
                    case 348:
                        return Action.RECOVER_NC_WALLET;
                    case 349:
                        return Action.ENROLL_BIOMETRIC_AUTHENTICATION;
                    case 350:
                        return Action.ENROLL_PIN;
                    case 351:
                        return Action.VIEW_TOKEN_LIST;
                    case 352:
                        return Action.SELECT_TOKEN;
                    case 353:
                        return Action.RH_CORE_FUNDING_RETURN;
                    case 354:
                        return Action.DISCONNECT_ALL;
                    case 355:
                        return Action.CANCEL;
                    case 356:
                        return Action.SHOW_TXN_DETAIL;
                    case 357:
                        return Action.CONFIRM_DISCONNECT;
                    case 358:
                        return Action.DISCONNECT;
                    case 359:
                        return Action.CLEAR_STALE_DATA;
                    case 360:
                        return Action.TRANSFER_FROM_ROBINHOOD;
                    case 361:
                        return Action.VIEW_STRATEGY_BUILDER;
                    case 362:
                        return Action.REMOVE_WALLET;
                    case 363:
                        return Action.SEE_DAPP_CONNECTIONS;
                    case 364:
                        return Action.VIEW_USER_AGREEMENT;
                    case 365:
                        return Action.SELECT_PERFORMANCE_CHART_VIEW;
                    case 366:
                        return Action.VIEW_PERFORMANCE_CHART_MANUAL;
                    case 367:
                        return Action.MANAGE_DAPP_CONNECTION;
                    case 368:
                        return Action.TOGGLE_ON;
                    case 369:
                        return Action.TOGGLE_OFF;
                    case 370:
                        return Action.OPEN_SHORTCUTS_MODAL;
                    case 371:
                        return Action.FOCUS_BUY_TAB;
                    case 372:
                        return Action.FOCUS_SEARCH_BAR;
                    case 373:
                        return Action.FOCUS_SELL_TAB;
                    case 374:
                        return Action.VIEW_RETIREMENT_OPTIONS_DISCLOSURES;
                    case 375:
                        return Action.ACATS_IN_CANT_FIND_BROKERAGE;
                    case 376:
                        return Action.VIEW_ACATS_IN_TRANSFER;
                    case 377:
                        return Action.TOGGLE_COIN_EXPLORE;
                    case 378:
                        return Action.VIEW_CRYPTO_LIST_PAGE;
                    case 379:
                        return Action.BEGIN_CRYPTO_TRANSFER;
                    case 380:
                        return Action.BEGIN_TRANSFER_CRYPTO;
                    case 381:
                        return Action.BEGIN_CRYPTO_DEPOSIT;
                    case 382:
                        return Action.REVIEW_INVESTOR_PROFILE;
                    case 383:
                        return Action.DELETE_ALERT;
                    case 384:
                        return Action.TAP_RHY_MIGRATION_FUNDING_AMOUNT;
                    case 385:
                        return Action.SET_UP_MOBILE_WALLET;
                    case 386:
                        return Action.UPGRADE_TO_CASH_CARD;
                    case 387:
                        return Action.VIEW_TRANSFER_MONEY;
                    case 388:
                        return Action.SORT_ASCENDING;
                    case 389:
                        return Action.VIEW_USER_LIST_DETAIL_PAGE;
                    case 390:
                        return Action.VIEW_NEWSFEED_PAGE;
                    case 391:
                        return Action.SORT_DESCENDING;
                    case 392:
                        return Action.SORT_RESET;
                    case 393:
                        return Action.ASSET_ROW_DISPLAY_VALUE_CHANGED_LAST_PRICE;
                    case 394:
                        return Action.ASSET_ROW_DISPLAY_VALUE_CHANGED_EQUITY;
                    case 395:
                        return Action.ASSET_ROW_DISPLAY_VALUE_CHANGED_RETURNS_TODAY;
                    case WaitlistAnimationConstants.LEFT_YAW_START /* 396 */:
                        return Action.ASSET_ROW_DISPLAY_VALUE_CHANGED_RETURNS_TOTAL;
                    case 397:
                        return Action.VIEW_OPTION_AGGREGATE_DETAIL_PAGE;
                    case 398:
                        return Action.VIEW_RHY_MIGRATION_ROUNDUP_UPSELL;
                    case 399:
                        return Action.VIEW_RHY_MIGRATION_CASHBACK_UPSELL;
                    case 400:
                        return Action.VIEW_RHY_MIGRATION_EARLY_DD_UPSELL;
                    case 401:
                        return Action.VIEW_RHY_MIGRATION_SYP_UPSELL;
                    case 402:
                        return Action.RHY_TURBOTAX_ACCOUNT_OPENED;
                    case HttpStatusCode.FORBIDDEN /* 403 */:
                        return Action.RHY_TURBOTAX_VISIT_NON_RHY;
                    case 404:
                        return Action.RHY_TURBOTAX_VISIT_RHY;
                    case 405:
                        return Action.DOWNLOAD;
                    case 406:
                        return Action.DEBIT_CARD_LINKING_PRECHECK;
                    case 407:
                        return Action.CANCEL_ORDER;
                    case 408:
                        return Action.REPLACE_ORDER;
                    case 409:
                        return Action.VIEW_TRADE_CONFIRMATION;
                    case HttpStatusCode.GONE /* 410 */:
                        return Action.VIEW_OPTION_INSTRUMENT_QUOTE_DETAIL;
                    case 411:
                        return Action.VIEW_OPTION_ORDER_DETAIL;
                    case 412:
                        return Action.RELOAD_LOGIN_AFTER_ERROR;
                    case 413:
                        return Action.COVER_MARGIN_CALL_DEPOSIT_FUNDS;
                    case 414:
                        return Action.COVER_MARGIN_CALL_SELL_STOCKS;
                    case 415:
                        return Action.SET_UP_IRA;
                    case 416:
                        return Action.RECURRING_SELECT_ROTH_IRA;
                    case 417:
                        return Action.RECURRING_SELECT_TRADITIONAL_IRA;
                    case 418:
                        return Action.RECURRING_SELECT_RETIREMENT_SIGN_UP;
                    case 419:
                        return Action.CHATBOT_ACTION;
                    case 420:
                        return Action.VIEW_CX_CHATBOT;
                    case 421:
                        return Action.OPEN_FAQ;
                    case 422:
                        return Action.DELETE;
                    case 423:
                        return Action.PAY;
                    case 424:
                        return Action.REQUEST;
                    case CompanyFinancialsSection.BAR_ANIMATION_DURATION /* 425 */:
                        return Action.VIEW_PROFILE;
                    case 426:
                        return Action.PAY_BY_PHONE;
                    case 427:
                        return Action.PAY_BY_EMAIL;
                    case 428:
                        return Action.DENY;
                    case 429:
                        return Action.CONVERT_TO_LIMIT_ORDER;
                    case 430:
                        return Action.SKIP_RECURRING_DEPOSIT;
                    case 431:
                        return Action.TIMEOUT;
                    case 432:
                        return Action.ACCEPT;
                    case 433:
                        return Action.DECLINE;
                    case 434:
                        return Action.REMIND;
                    case 435:
                        return Action.VIEW_LIMIT_HUB;
                    case 436:
                        return Action.INCOMING_WIRE;
                    case 437:
                        return Action.GOLD_UPSELL_UPGRADE;
                    case 438:
                        return Action.VIEW_REFERRAL_OFFER;
                    case 439:
                        return Action.FUND;
                    case 440:
                        return Action.VIEW_VIRTUAL_CARD;
                    case 441:
                        return Action.TAP_RHY_REFERRALS_FUNDING_AMOUNT;
                    case 442:
                        return Action.BUY;
                    case 443:
                        return Action.VIEW_OPTION_FEE_RATE;
                    case 444:
                        return Action.TEXT_SENT;
                    case 445:
                        return Action.EMAIL_SENT;
                    case 446:
                        return Action.CONFIRM_PIN;
                    case 447:
                        return Action.RETRY_SETUP_PIN;
                    case 448:
                        return Action.COMPLETE_SETUP_PIN;
                    case 449:
                        return Action.UPDATE_USERS_POSITION_SORT;
                    case 450:
                        return Action.ANIMATION;
                    case 451:
                        return Action.CHALLENGE_FALLBACK;
                    case 452:
                        return Action.INSTANT_UPSELL_HELP_ARTICLE;
                    case 453:
                        return Action.APP_TRACKING_TRANSPARENCY_ALLOW;
                    case 454:
                        return Action.APP_TRACKING_TRANSPARENCY_DENY;
                    case 455:
                        return Action.VERIFY_ID_INSTANTLY;
                    case WaitlistAnimationConstants.MIDDLE_YAW_FRAME /* 456 */:
                        return Action.VERIFY_ID_MANUALLY;
                    case 457:
                        return Action.MARKETING_EMAILS_OPT_IN;
                    case 458:
                        return Action.MARKETING_EMAILS_OPT_OUT;
                    case 459:
                        return Action.MANAGE_VISIBILITY;
                    case 460:
                        return Action.SELL;
                    case 461:
                        return Action.OPEN_POSITION;
                    case 462:
                        return Action.CLOSE_POSITION;
                    case 463:
                        return Action.OPTION_CHAIN_SWITCH_TO_BUY;
                    case 464:
                        return Action.OPTION_CHAIN_SWITCH_TO_SELL;
                    case 465:
                        return Action.OPTION_CHAIN_SWITCH_TO_CALL;
                    case 466:
                        return Action.OPTION_CHAIN_SWITCH_TO_PUT;
                    case 467:
                        return Action.VIEW_DD_SETUP;
                    case 468:
                        return Action.GOLD_UPGRADE_SUCCESS;
                    case 469:
                        return Action.APPLE_PAY_LINKING;
                    case 470:
                        return Action.CONFIRM;
                    case 471:
                        return Action.ADD_WIDGET;
                    case 472:
                        return Action.REMOVE_WIDGET;
                    case 473:
                        return Action.VIEW_STAKING;
                    case 474:
                        return Action.VIEW_PNL_HUB;
                    case 475:
                        return Action.GROUP_BY;
                    case 476:
                        return Action.ZOOM;
                    case 477:
                        return Action.ENTER_RH_CONNECT_FLOW;
                    case 478:
                        return Action.ENTER_SARDINE_FLOW;
                    case 479:
                        return Action.BUY_CRYPTO;
                    case 480:
                        return Action.DEPOSIT_CRYPTO;
                    case 481:
                        return Action.POST_TRANSFER_UPSELL;
                    case 482:
                        return Action.REPORT;
                    case 483:
                        return Action.RESURRECTION_TAKEOVER_UPSELL;
                    case 484:
                        return Action.MICROGRAM_INSTALL;
                    case 485:
                        return Action.VIEW_ALL;
                    case 486:
                        return Action.VIEW_GOLD_BILLING_DISCLOSURES_STATEMENT;
                    case 487:
                        return Action.CRYPTO_TRANSFER_ENROLLMENT_SUCCESS;
                    case 488:
                        return Action.FROM_ACCOUNT_DEFAULT;
                    case 489:
                        return Action.TO_ACCOUNT_TYPE;
                    case 490:
                        return Action.PLACE_MARKET_ORDER;
                    case 491:
                        return Action.PLACE_LIMIT_ORDER;
                    case 492:
                        return Action.PLACE_STOP_MARKET_ORDER;
                    case 493:
                        return Action.LADDER_SELECT_BULK_PENDING_ORDERS;
                    case 494:
                        return Action.LADDER_SWIPE_TO_DELETE_START;
                    case 495:
                        return Action.LADDER_CANCEL_ORDER;
                    case 496:
                        return Action.LADDER_DRAG_TO_MODIFY_START;
                    case 497:
                        return Action.LADDER_MODIFY_ORDER;
                    case 498:
                        return Action.ENABLE_OPTIONS_TRADING;
                    case 499:
                        return Action.ENABLE_MARGIN_INVESTING;
                    case 500:
                        return Action.FORGOT_EMAIL_PASSWORD;
                    case 501:
                        return Action.ACCESS_TO_SOMEONE_ELSES_ACCOUNT;
                    case com.withpersona.sdk2.inquiry.network.core.HttpStatusCode.BAD_GATEWAY_502 /* 502 */:
                        return Action.VERIFIED_EMAIL;
                    case 503:
                        return Action.RESEND_LINK;
                    case 504:
                        return Action.VIEW_OPTION_UPGRADE_FLOW;
                    case 505:
                        return Action.FORGOT_EMAIL;
                    case 506:
                        return Action.START_TYPING;
                    case 507:
                        return Action.FINISH_TYPING;
                    case 508:
                        return Action.VIEW_EARNINGS_CALL;
                    case 509:
                        return Action.SWIPE_INITIATED;
                    case 510:
                        return Action.SWIPE_COMPLETED;
                    case 511:
                        return Action.LOOKING_FOR_FACE;
                    case 512:
                        return Action.FACE_BLURRY;
                    case 513:
                        return Action.FACE_NOT_DETECTED;
                    case 514:
                        return Action.FACE_DETECTED_CAPTURING;
                    case 515:
                        return Action.PROCESSING_SELFIE;
                    case WaitlistAnimationConstants.RIGHT_YAW_END /* 516 */:
                        return Action.SELFIE_VERIFICATION_SUCCESS;
                    case 517:
                        return Action.SELFIE_VERIFICATION_FAILED;
                    case 518:
                        return Action.SELFIE_UPLOAD_SUCCESS;
                    case 519:
                        return Action.SELFIE_CAMERA_NOT_AUTHORIZED;
                    case 520:
                        return Action.SELFIE_ENVIRONMENT_DARK;
                    case HttpStatusCode.DOWNTIME_ERROR /* 521 */:
                        return Action.SELFIE_CAMERA_BLOCKED;
                    case 522:
                        return Action.FUTURES_DETAIL_VIEW_PICTURE_IN_PICTURE;
                    case 523:
                        return Action.SELFIE_EXCEEDED_MAX_RETRIES;
                    case 524:
                        return Action.SELFIE_CAPTURE_RETRY;
                    case 525:
                        return Action.HALF_EXPAND;
                    case 526:
                        return Action.SELFIE_GLARE_DETECTED;
                    case 527:
                        return Action.SCROLL_HORIZONTALLY;
                    case 528:
                        return Action.RH_GOLD_OFFER;
                    case 529:
                        return Action.SELFIE_FACE_NOT_STRAIGHT;
                    case 530:
                        return Action.SELFIE_FACE_TOO_FAR;
                    case 531:
                        return Action.SELFIE_FACE_TOO_CLOSE;
                    case 532:
                        return Action.SELFIE_MULTIPLE_FACES_DETECTED;
                    case 533:
                        return Action.OPEN_RH_MAIN_APP;
                    case 534:
                        return Action.CHANGE_COUNTRY_CODE;
                    case 535:
                        return Action.BACKUP_WALLET;
                    case 536:
                        return Action.BACKUP_TO_ICLOUD;
                    case 537:
                        return Action.BACKUP_MANUALLY;
                    case 538:
                        return Action.ENABLE_NOTIFICATION;
                    case 539:
                        return Action.ONBOARDING_COMPLETE;
                    case 540:
                        return Action.VIEW_CASH_BALANCES_DETAILS_PAGE;
                    case 541:
                        return Action.VIEW_MCW_DEPOSIT_FLOW;
                    case 542:
                        return Action.VIEW_HOW_CASH_IS_CALCULATED;
                    case 543:
                        return Action.VIEW_MCW_CONVERT_CURRENCY_FLOW;
                    case 544:
                        return Action.CANCEL_APPOINTMENT;
                    case 545:
                        return Action.RESCHEDULE_APPOINTMENT;
                    case 546:
                        return Action.SCHEDULE_APPOINTMENT;
                    case 547:
                        return Action.VIEW_SIP_DISCLOSURE;
                    case 548:
                        return Action.ACCOUNT_STATE_CHANGED;
                    case 549:
                        return Action.EDIT_COLLATERAL;
                    case 550:
                        return Action.EDIT_LEVERAGE;
                    case 551:
                        return Action.EDIT_TP;
                    case RhRoomDatabase.MIGRATION_START_VER /* 552 */:
                        return Action.EDIT_SL;
                    case 553:
                        return Action.VIEW_PDP;
                    case 554:
                        return Action.FETCH_VERTIAS_DEVICE_ID;
                    case 555:
                        return Action.SELFIE_START_RECORDING_CALLED;
                    case 556:
                        return Action.SELFIE_DID_START_RECORDING_TO_CALLED;
                    case 557:
                        return Action.SELFIE_STOP_RECORDING_CALLED;
                    case 558:
                        return Action.SEFLIE_DID_FINISH_RECORDING_TO_CALLED;
                    case 559:
                        return Action.SELFIE_PHOTO_CAPTURE_CALLED;
                    case 560:
                        return Action.SELFIE_DID_FINISH_PROCESSING_PHOTO_CALLED;
                    case 561:
                        return Action.SELECT_CURRENCY;
                    case 562:
                        return Action.SWAP_INPUTS;
                    case 563:
                        return Action.SET_CONVERSION_AMOUNT;
                    case 564:
                        return Action.VIEW_FX_ORDER_DETAILS;
                    case 565:
                        return Action.SELFIE_CAPTURE_HELPERS_INIT;
                    case 566:
                        return Action.SELFIE_CAPTURE_MANAGERS_INIT;
                    case 567:
                        return Action.VIEW_COMBO_ORDER_DETAIL;
                    case 568:
                        return Action.SELFIE_CAPTURE_BROADCASTER_INIT;
                    case 569:
                        return Action.OPEN_TAKEOVER;
                    case 570:
                        return Action.VIEW_FUTURES_DETAIL_PAGE;
                    case 571:
                        return Action.SHOW_DROPDOWN;
                    case 572:
                        return Action.SELECT_SUPPORT_CHANNEL;
                    case 573:
                        return Action.VIEW_EVENT_CONTRACT_DETAIL_PAGE;
                    case 574:
                        return Action.VIEW_PICTURE_IN_PICTURE;
                    case CompanyFinancialsSection.LINE_REVEAL_ANIMATION_DURATION /* 575 */:
                        return Action.VIEW_EQUITY_TRADING_LADDER;
                    case 576:
                        return Action.CRYPTO_TRANSFER_ADD_COST_BASIS_LOT_SUCCESS;
                    case 577:
                        return Action.CRYPTO_TRANSFER_ADD_COST_BASIS_COMPLETED;
                    case 578:
                        return Action.MARGIN_CALL_SUMMARY_TO_ORDER_DATA_MISMATCH;
                    case 579:
                        return Action.CONNECT_FOUND_ACCOUNT;
                    case 580:
                        return Action.VIEW_APPOINTMENT;
                    case 581:
                        return Action.INITIATE_TAX_FLOW;
                    case 582:
                        return Action.INITIATE_ESTATE_FLOW;
                    case 583:
                        return Action.SWITCH_TAB;
                    case 584:
                        return Action.VIEW_ACTIVITY_FEED;
                    case 585:
                        return Action.COMPOSE;
                    case 586:
                        return Action.SELECT_TRADE_TO_POST;
                    case 587:
                        return Action.VIEW_POST_DETAIL_PAGE;
                    case 588:
                        return Action.PULL_TO_REFRESH;
                    case 589:
                        return Action.SCROLL_FEED;
                    case 590:
                        return Action.TOGGLE_DISPLAY_TYPE;
                    case 591:
                        return Action.INITIATE_COPY_TRADE;
                    case 592:
                        return Action.LIKE;
                    case 593:
                        return Action.UNLIKE;
                    case 594:
                        return Action.VIEW_LIKES;
                    case 595:
                        return Action.VIEW_COPY_TRADE_LIST;
                    case 596:
                        return Action.OPEN_POST_MENU;
                    case 597:
                        return Action.EDIT_POST;
                    case 598:
                        return Action.CONFIRM_DELETE_POST;
                    case 599:
                        return Action.SUBMIT_COMMENT;
                    case 600:
                        return Action.LIKE_COMMENT;
                    case 601:
                        return Action.UNLIKE_COMMENT;
                    case 602:
                        return Action.VIEW_COMMENT_LIKE_COUNT;
                    case 603:
                        return Action.QUICK_TRADE_BUY;
                    case 604:
                        return Action.QUICK_TRADE_SELL;
                    case 605:
                        return Action.QUICK_TRADE_SHORT;
                    case 606:
                        return Action.FOLLOW_USER;
                    case 607:
                        return Action.UNFOLLOW_USER;
                    case 608:
                        return Action.VIEW_FOLLOWERS;
                    case 609:
                        return Action.VIEW_FOLLOWING;
                    case 610:
                        return Action.SUBMIT_POST;
                    case 611:
                        return Action.CANCEL_POST_COMPOSER;
                    case 612:
                        return Action.SELECT_LICENSE_STATUS;
                    case 613:
                        return Action.SELECT_VIEW_ONLY_STATUS;
                    case 614:
                        return Action.ACCEPT_AGREEMENT;
                    case 615:
                        return Action.VIEW_SOCIAL_FEED;
                    case 616:
                        return Action.EDIT_PROFILE;
                    case 617:
                        return Action.UPLOAD_PROFILE_IMAGE;
                    case 618:
                        return Action.EDIT_USERNAME;
                    case 619:
                        return Action.EDIT_BIO;
                    case 620:
                        return Action.ACTIVITY_ITEM_TAP;
                    case 621:
                        return Action.SOCIAL_GET_STARTED;
                    case 622:
                        return Action.SELECT_NOT_LICENSED;
                    case 623:
                        return Action.SELECT_LICENSED;
                    case 624:
                        return Action.VIEW_POSTS_ABOUT_INSTRUMENT;
                    default:
                        return null;
                }
            }
        }

        public static Action valueOf(String str) {
            return (Action) Enum.valueOf(Action.class, str);
        }

        public static Action[] values() {
            return (Action[]) $VALUES.clone();
        }
    }
}
