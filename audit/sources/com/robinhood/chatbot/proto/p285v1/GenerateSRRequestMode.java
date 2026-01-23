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
/* compiled from: GenerateSRRequestMode.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \r2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestMode;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "GENERATE_SR_REQUEST_MODE_UNSPECIFIED", "GENERATE_SR_REQUEST_MODE_GREETING_ONLY", "GENERATE_SR_REQUEST_MODE_RESOLUTION_ONLY", "GENERATE_SR_REQUEST_MODE_GREETING_AND_RESOLUTION", "Companion", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes15.dex */
public final class GenerateSRRequestMode implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GenerateSRRequestMode[] $VALUES;

    @JvmField
    public static final ProtoAdapter<GenerateSRRequestMode> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final GenerateSRRequestMode GENERATE_SR_REQUEST_MODE_GREETING_AND_RESOLUTION;
    public static final GenerateSRRequestMode GENERATE_SR_REQUEST_MODE_GREETING_ONLY;
    public static final GenerateSRRequestMode GENERATE_SR_REQUEST_MODE_RESOLUTION_ONLY;
    public static final GenerateSRRequestMode GENERATE_SR_REQUEST_MODE_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ GenerateSRRequestMode[] $values() {
        return new GenerateSRRequestMode[]{GENERATE_SR_REQUEST_MODE_UNSPECIFIED, GENERATE_SR_REQUEST_MODE_GREETING_ONLY, GENERATE_SR_REQUEST_MODE_RESOLUTION_ONLY, GENERATE_SR_REQUEST_MODE_GREETING_AND_RESOLUTION};
    }

    @JvmStatic
    public static final GenerateSRRequestMode fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<GenerateSRRequestMode> getEntries() {
        return $ENTRIES;
    }

    private GenerateSRRequestMode(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final GenerateSRRequestMode generateSRRequestMode = new GenerateSRRequestMode("GENERATE_SR_REQUEST_MODE_UNSPECIFIED", 0, 0);
        GENERATE_SR_REQUEST_MODE_UNSPECIFIED = generateSRRequestMode;
        GENERATE_SR_REQUEST_MODE_GREETING_ONLY = new GenerateSRRequestMode("GENERATE_SR_REQUEST_MODE_GREETING_ONLY", 1, 1);
        GENERATE_SR_REQUEST_MODE_RESOLUTION_ONLY = new GenerateSRRequestMode("GENERATE_SR_REQUEST_MODE_RESOLUTION_ONLY", 2, 2);
        GENERATE_SR_REQUEST_MODE_GREETING_AND_RESOLUTION = new GenerateSRRequestMode("GENERATE_SR_REQUEST_MODE_GREETING_AND_RESOLUTION", 3, 3);
        GenerateSRRequestMode[] generateSRRequestModeArr$values = $values();
        $VALUES = generateSRRequestModeArr$values;
        $ENTRIES = EnumEntries2.enumEntries(generateSRRequestModeArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GenerateSRRequestMode.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<GenerateSRRequestMode>(orCreateKotlinClass, syntax, generateSRRequestMode) { // from class: com.robinhood.chatbot.proto.v1.GenerateSRRequestMode$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public GenerateSRRequestMode fromValue(int value) {
                return GenerateSRRequestMode.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: GenerateSRRequestMode.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestMode$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/chatbot/proto/v1/GenerateSRRequestMode;", "fromValue", "value", "", "chatbot.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GenerateSRRequestMode fromValue(int value) {
            if (value == 0) {
                return GenerateSRRequestMode.GENERATE_SR_REQUEST_MODE_UNSPECIFIED;
            }
            if (value == 1) {
                return GenerateSRRequestMode.GENERATE_SR_REQUEST_MODE_GREETING_ONLY;
            }
            if (value == 2) {
                return GenerateSRRequestMode.GENERATE_SR_REQUEST_MODE_RESOLUTION_ONLY;
            }
            if (value != 3) {
                return null;
            }
            return GenerateSRRequestMode.GENERATE_SR_REQUEST_MODE_GREETING_AND_RESOLUTION;
        }
    }

    public static GenerateSRRequestMode valueOf(String str) {
        return (GenerateSRRequestMode) Enum.valueOf(GenerateSRRequestMode.class, str);
    }

    public static GenerateSRRequestMode[] values() {
        return (GenerateSRRequestMode[]) $VALUES.clone();
    }
}
