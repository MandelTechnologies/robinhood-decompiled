package com.robinhood.prediction_markets.proto.p361v1.idl;

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
/* compiled from: GameTag.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u000e2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GameTag;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "GAME_TAG_UNSPECIFIED", "GAME_TAG_IS_LIVE", "GAME_TAG_RED_ZONE", "GAME_TAG_RECENT_TOUCHDOWN", "GAME_TAG_CLOSE_GAME", "Companion", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class GameTag implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ GameTag[] $VALUES;

    @JvmField
    public static final ProtoAdapter<GameTag> ADAPTER;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final GameTag GAME_TAG_CLOSE_GAME;
    public static final GameTag GAME_TAG_IS_LIVE;
    public static final GameTag GAME_TAG_RECENT_TOUCHDOWN;
    public static final GameTag GAME_TAG_RED_ZONE;
    public static final GameTag GAME_TAG_UNSPECIFIED;
    private final int value;

    private static final /* synthetic */ GameTag[] $values() {
        return new GameTag[]{GAME_TAG_UNSPECIFIED, GAME_TAG_IS_LIVE, GAME_TAG_RED_ZONE, GAME_TAG_RECENT_TOUCHDOWN, GAME_TAG_CLOSE_GAME};
    }

    @JvmStatic
    public static final GameTag fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<GameTag> getEntries() {
        return $ENTRIES;
    }

    private GameTag(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final GameTag gameTag = new GameTag("GAME_TAG_UNSPECIFIED", 0, 0);
        GAME_TAG_UNSPECIFIED = gameTag;
        GAME_TAG_IS_LIVE = new GameTag("GAME_TAG_IS_LIVE", 1, 1);
        GAME_TAG_RED_ZONE = new GameTag("GAME_TAG_RED_ZONE", 2, 2);
        GAME_TAG_RECENT_TOUCHDOWN = new GameTag("GAME_TAG_RECENT_TOUCHDOWN", 3, 3);
        GAME_TAG_CLOSE_GAME = new GameTag("GAME_TAG_CLOSE_GAME", 4, 4);
        GameTag[] gameTagArr$values = $values();
        $VALUES = gameTagArr$values;
        $ENTRIES = EnumEntries2.enumEntries(gameTagArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(GameTag.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<GameTag>(orCreateKotlinClass, syntax, gameTag) { // from class: com.robinhood.prediction_markets.proto.v1.idl.GameTag$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public GameTag fromValue(int value) {
                return GameTag.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: GameTag.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/prediction_markets/proto/v1/idl/GameTag$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lcom/robinhood/prediction_markets/proto/v1/idl/GameTag;", "fromValue", "value", "", "prediction_markets.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final GameTag fromValue(int value) {
            if (value == 0) {
                return GameTag.GAME_TAG_UNSPECIFIED;
            }
            if (value == 1) {
                return GameTag.GAME_TAG_IS_LIVE;
            }
            if (value == 2) {
                return GameTag.GAME_TAG_RED_ZONE;
            }
            if (value == 3) {
                return GameTag.GAME_TAG_RECENT_TOUCHDOWN;
            }
            if (value != 4) {
                return null;
            }
            return GameTag.GAME_TAG_CLOSE_GAME;
        }
    }

    public static GameTag valueOf(String str) {
        return (GameTag) Enum.valueOf(GameTag.class, str);
    }

    public static GameTag[] values() {
        return (GameTag[]) $VALUES.clone();
    }
}
