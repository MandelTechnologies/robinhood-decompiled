package com.robinhood.rosetta.eventlogging;

import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import java.io.IOException;
import java.util.ArrayList;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import okio.ByteString;

/* compiled from: UserActionData.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dBC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0015\u001a\u00020\u0002H\u0017J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0096\u0002J\b\u0010\u001a\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\u0004H\u0016JB\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/rosetta/eventlogging/UserActionData;", "Lcom/squareup/wire/Message;", "", "action_name", "", "performance_data", "button_title", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "time", "", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILokio/ByteString;)V", "getAction_name", "()Ljava/lang/String;", "getPerformance_data", "getButton_title", "getItem", "getTime", "()I", "newBuilder", "equals", "", "other", "", "hashCode", "toString", "copy", "Companion", "data_platform.event_logging_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes19.dex */
public final class UserActionData extends Message {

    @JvmField
    public static final ProtoAdapter<UserActionData> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "actionName", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String action_name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "buttonTitle", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String button_title;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String item;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "performanceData", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String performance_data;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#INT32", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 4, tag = 5)
    private final int time;

    public UserActionData() {
        this(null, null, null, null, 0, null, 63, null);
    }

    public /* synthetic */ UserActionData(String str, String str2, String str3, String str4, int i, ByteString byteString, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? "" : str3, (i2 & 8) != 0 ? "" : str4, (i2 & 16) != 0 ? 0 : i, (i2 & 32) != 0 ? ByteString.EMPTY : byteString);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m24598newBuilder();
    }

    public final String getAction_name() {
        return this.action_name;
    }

    public final String getPerformance_data() {
        return this.performance_data;
    }

    public final String getButton_title() {
        return this.button_title;
    }

    public final String getItem() {
        return this.item;
    }

    public final int getTime() {
        return this.time;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserActionData(String action_name, String performance_data, String button_title, String item, int i, ByteString unknownFields) {
        super(ADAPTER, unknownFields);
        Intrinsics.checkNotNullParameter(action_name, "action_name");
        Intrinsics.checkNotNullParameter(performance_data, "performance_data");
        Intrinsics.checkNotNullParameter(button_title, "button_title");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        this.action_name = action_name;
        this.performance_data = performance_data;
        this.button_title = button_title;
        this.item = item;
        this.time = i;
    }

    @Deprecated
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m24598newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof UserActionData)) {
            return false;
        }
        UserActionData userActionData = (UserActionData) other;
        return Intrinsics.areEqual(unknownFields(), userActionData.unknownFields()) && Intrinsics.areEqual(this.action_name, userActionData.action_name) && Intrinsics.areEqual(this.performance_data, userActionData.performance_data) && Intrinsics.areEqual(this.button_title, userActionData.button_title) && Intrinsics.areEqual(this.item, userActionData.item) && this.time == userActionData.time;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = (((((((((unknownFields().hashCode() * 37) + this.action_name.hashCode()) * 37) + this.performance_data.hashCode()) * 37) + this.button_title.hashCode()) * 37) + this.item.hashCode()) * 37) + Integer.hashCode(this.time);
        this.hashCode = iHashCode;
        return iHashCode;
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("action_name=" + Internal.sanitize(this.action_name));
        arrayList.add("performance_data=" + Internal.sanitize(this.performance_data));
        arrayList.add("button_title=" + Internal.sanitize(this.button_title));
        arrayList.add("item=" + Internal.sanitize(this.item));
        arrayList.add("time=" + this.time);
        return CollectionsKt.joinToString$default(arrayList, ", ", "UserActionData{", "}", 0, null, null, 56, null);
    }

    public static /* synthetic */ UserActionData copy$default(UserActionData userActionData, String str, String str2, String str3, String str4, int i, ByteString byteString, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userActionData.action_name;
        }
        if ((i2 & 2) != 0) {
            str2 = userActionData.performance_data;
        }
        if ((i2 & 4) != 0) {
            str3 = userActionData.button_title;
        }
        if ((i2 & 8) != 0) {
            str4 = userActionData.item;
        }
        if ((i2 & 16) != 0) {
            i = userActionData.time;
        }
        if ((i2 & 32) != 0) {
            byteString = userActionData.unknownFields();
        }
        int i3 = i;
        ByteString byteString2 = byteString;
        return userActionData.copy(str, str2, str3, str4, i3, byteString2);
    }

    public final UserActionData copy(String action_name, String performance_data, String button_title, String item, int time, ByteString unknownFields) {
        Intrinsics.checkNotNullParameter(action_name, "action_name");
        Intrinsics.checkNotNullParameter(performance_data, "performance_data");
        Intrinsics.checkNotNullParameter(button_title, "button_title");
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(unknownFields, "unknownFields");
        return new UserActionData(action_name, performance_data, button_title, item, time, unknownFields);
    }

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(UserActionData.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<UserActionData>(fieldEncoding, orCreateKotlinClass, syntax) { // from class: com.robinhood.rosetta.eventlogging.UserActionData$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(UserActionData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                int size = value.unknownFields().size();
                if (!Intrinsics.areEqual(value.getAction_name(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getAction_name());
                }
                if (!Intrinsics.areEqual(value.getPerformance_data(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getPerformance_data());
                }
                if (!Intrinsics.areEqual(value.getButton_title(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getButton_title());
                }
                if (!Intrinsics.areEqual(value.getItem(), "")) {
                    size += ProtoAdapter.STRING.encodedSizeWithTag(4, value.getItem());
                }
                return value.getTime() != 0 ? size + ProtoAdapter.INT32.encodedSizeWithTag(5, Integer.valueOf(value.getTime())) : size;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, UserActionData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                if (!Intrinsics.areEqual(value.getAction_name(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAction_name());
                }
                if (!Intrinsics.areEqual(value.getPerformance_data(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPerformance_data());
                }
                if (!Intrinsics.areEqual(value.getButton_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getButton_title());
                }
                if (!Intrinsics.areEqual(value.getItem(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getItem());
                }
                if (value.getTime() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getTime()));
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, UserActionData value) throws IOException {
                Intrinsics.checkNotNullParameter(writer, "writer");
                Intrinsics.checkNotNullParameter(value, "value");
                writer.writeBytes(value.unknownFields());
                if (value.getTime() != 0) {
                    ProtoAdapter.INT32.encodeWithTag(writer, 5, (int) Integer.valueOf(value.getTime()));
                }
                if (!Intrinsics.areEqual(value.getItem(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getItem());
                }
                if (!Intrinsics.areEqual(value.getButton_title(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getButton_title());
                }
                if (!Intrinsics.areEqual(value.getPerformance_data(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getPerformance_data());
                }
                if (Intrinsics.areEqual(value.getAction_name(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getAction_name());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public UserActionData redact(UserActionData value) {
                Intrinsics.checkNotNullParameter(value, "value");
                return UserActionData.copy$default(value, null, null, null, null, 0, ByteString.EMPTY, 31, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // com.squareup.wire.ProtoAdapter
            public UserActionData decode(ProtoReader reader) throws IOException {
                Intrinsics.checkNotNullParameter(reader, "reader");
                long jBeginMessage = reader.beginMessage();
                String strDecode = "";
                String strDecode2 = "";
                String strDecode3 = strDecode2;
                int iIntValue = 0;
                String strDecode4 = strDecode3;
                while (true) {
                    int iNextTag = reader.nextTag();
                    if (iNextTag == -1) {
                        return new UserActionData(strDecode, strDecode4, strDecode2, strDecode3, iIntValue, reader.endMessageAndGetUnknownFields(jBeginMessage));
                    }
                    if (iNextTag == 1) {
                        strDecode = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 2) {
                        strDecode4 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 3) {
                        strDecode2 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 4) {
                        strDecode3 = ProtoAdapter.STRING.decode(reader);
                    } else if (iNextTag == 5) {
                        iIntValue = ProtoAdapter.INT32.decode(reader).intValue();
                    } else {
                        reader.readUnknownField(iNextTag);
                    }
                }
            }
        };
    }
}
