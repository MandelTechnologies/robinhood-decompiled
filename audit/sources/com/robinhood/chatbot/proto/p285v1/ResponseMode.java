package com.robinhood.chatbot.proto.p285v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.JvmField;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ResponseMode.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \u000f2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ResponseMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "RESPONSE_MODE_UNSPECIFIED", "RESOLUTION", "TRIAGE", "SEARCH", "SUPPORT_CHAT", "TEST_CHAT", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class ResponseMode implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ResponseMode[] $VALUES;

    @JvmField
    public static final ProtoAdapter<ResponseMode> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ResponseMode RESOLUTION;
    public static final ResponseMode RESPONSE_MODE_UNSPECIFIED;
    public static final ResponseMode SEARCH;
    public static final ResponseMode SUPPORT_CHAT;
    public static final ResponseMode TEST_CHAT;
    public static final ResponseMode TRIAGE;
    private final int value;

    private static final /* synthetic */ ResponseMode[] $values() {
        return new ResponseMode[]{RESPONSE_MODE_UNSPECIFIED, RESOLUTION, TRIAGE, SEARCH, SUPPORT_CHAT, TEST_CHAT};
    }

    @JvmStatic
    public static final ResponseMode fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<ResponseMode> getEntries() {
        return $ENTRIES;
    }

    private ResponseMode(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final ResponseMode responseMode = new ResponseMode("RESPONSE_MODE_UNSPECIFIED", 0, 0);
        RESPONSE_MODE_UNSPECIFIED = responseMode;
        RESOLUTION = new ResponseMode("RESOLUTION", 1, 1);
        TRIAGE = new ResponseMode("TRIAGE", 2, 2);
        SEARCH = new ResponseMode("SEARCH", 3, 3);
        SUPPORT_CHAT = new ResponseMode("SUPPORT_CHAT", 4, 4);
        TEST_CHAT = new ResponseMode("TEST_CHAT", 5, 5);
        ResponseMode[] responseModeArr$values = $values();
        $VALUES = responseModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(responseModeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ResponseMode.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<ResponseMode>(orCreateKotlinClass, syntax, responseMode) { // from class: com.robinhood.chatbot.proto.v1.ResponseMode$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public ResponseMode fromValue(int value) {
                return ResponseMode.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: ResponseMode.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/ResponseMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/chatbot/proto/v1/ResponseMode;", "fromValue", "value", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final ResponseMode fromValue(int value) {
            if (value == 0) {
                return ResponseMode.RESPONSE_MODE_UNSPECIFIED;
            }
            if (value == 1) {
                return ResponseMode.RESOLUTION;
            }
            if (value == 2) {
                return ResponseMode.TRIAGE;
            }
            if (value == 3) {
                return ResponseMode.SEARCH;
            }
            if (value == 4) {
                return ResponseMode.SUPPORT_CHAT;
            }
            if (value != 5) {
                return null;
            }
            return ResponseMode.TEST_CHAT;
        }
    }

    public static ResponseMode valueOf(String str) {
        return (ResponseMode) Enum.valueOf(ResponseMode.class, str);
    }

    public static ResponseMode[] values() {
        return (ResponseMode[]) $VALUES.clone();
    }
}
