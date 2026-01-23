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
/* compiled from: SenderType.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SenderType;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "SENDER_TYPE_UNSPECIFIED", "USER", "CHATBOT", "SYSTEM", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class SenderType implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SenderType[] $VALUES;

    @JvmField
    public static final ProtoAdapter<SenderType> ADAPTER;
    public static final SenderType CHATBOT;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SenderType SENDER_TYPE_UNSPECIFIED;
    public static final SenderType SYSTEM;
    public static final SenderType USER;
    private final int value;

    private static final /* synthetic */ SenderType[] $values() {
        return new SenderType[]{SENDER_TYPE_UNSPECIFIED, USER, CHATBOT, SYSTEM};
    }

    @JvmStatic
    public static final SenderType fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<SenderType> getEntries() {
        return $ENTRIES;
    }

    private SenderType(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final SenderType senderType = new SenderType("SENDER_TYPE_UNSPECIFIED", 0, 0);
        SENDER_TYPE_UNSPECIFIED = senderType;
        USER = new SenderType("USER", 1, 1);
        CHATBOT = new SenderType("CHATBOT", 2, 2);
        SYSTEM = new SenderType("SYSTEM", 3, 3);
        SenderType[] senderTypeArr$values = $values();
        $VALUES = senderTypeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(senderTypeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(SenderType.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<SenderType>(orCreateKotlinClass, syntax, senderType) { // from class: com.robinhood.chatbot.proto.v1.SenderType$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public SenderType fromValue(int value) {
                return SenderType.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: SenderType.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/SenderType$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/chatbot/proto/v1/SenderType;", "fromValue", "value", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final SenderType fromValue(int value) {
            if (value == 0) {
                return SenderType.SENDER_TYPE_UNSPECIFIED;
            }
            if (value == 1) {
                return SenderType.USER;
            }
            if (value == 2) {
                return SenderType.CHATBOT;
            }
            if (value != 3) {
                return null;
            }
            return SenderType.SYSTEM;
        }
    }

    public static SenderType valueOf(String str) {
        return (SenderType) Enum.valueOf(SenderType.class, str);
    }

    public static SenderType[] values() {
        return (SenderType[]) $VALUES.clone();
    }
}
