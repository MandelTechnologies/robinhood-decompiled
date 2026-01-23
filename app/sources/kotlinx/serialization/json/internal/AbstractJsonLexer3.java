package kotlinx.serialization.json.internal;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.jvm.JvmField;

/* compiled from: AbstractJsonLexer.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u000b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lkotlinx/serialization/json/internal/CharMappings;", "", "<init>", "()V", "ESCAPE_2_CHAR", "", "CHAR_TO_TOKEN", "", "initEscape", "", "initCharToToken", "initC2ESC", "c", "", "esc", "", "initC2TC", "cl", "", "kotlinx-serialization-json"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: kotlinx.serialization.json.internal.CharMappings, reason: use source file name */
/* loaded from: classes14.dex */
public final class AbstractJsonLexer3 {

    @JvmField
    public static final byte[] CHAR_TO_TOKEN;

    @JvmField
    public static final char[] ESCAPE_2_CHAR;
    public static final AbstractJsonLexer3 INSTANCE;

    private AbstractJsonLexer3() {
    }

    static {
        AbstractJsonLexer3 abstractJsonLexer3 = new AbstractJsonLexer3();
        INSTANCE = abstractJsonLexer3;
        ESCAPE_2_CHAR = new char[117];
        CHAR_TO_TOKEN = new byte[EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE];
        abstractJsonLexer3.initEscape();
        abstractJsonLexer3.initCharToToken();
    }

    private final void initEscape() {
        for (int i = 0; i < 32; i++) {
            initC2ESC(i, 'u');
        }
        initC2ESC(8, 'b');
        initC2ESC(9, 't');
        initC2ESC(10, 'n');
        initC2ESC(12, 'f');
        initC2ESC(13, 'r');
        initC2ESC('/', '/');
        initC2ESC('\"', '\"');
        initC2ESC('\\', '\\');
    }

    private final void initCharToToken() {
        for (int i = 0; i < 33; i++) {
            initC2TC(i, (byte) 127);
        }
        initC2TC(9, (byte) 3);
        initC2TC(10, (byte) 3);
        initC2TC(13, (byte) 3);
        initC2TC(32, (byte) 3);
        initC2TC(',', (byte) 4);
        initC2TC(':', (byte) 5);
        initC2TC('{', (byte) 6);
        initC2TC('}', (byte) 7);
        initC2TC('[', (byte) 8);
        initC2TC(']', (byte) 9);
        initC2TC('\"', (byte) 1);
        initC2TC('\\', (byte) 2);
    }

    private final void initC2ESC(int c, char esc) {
        if (esc != 'u') {
            ESCAPE_2_CHAR[esc] = (char) c;
        }
    }

    private final void initC2ESC(char c, char esc) {
        initC2ESC((int) c, esc);
    }

    private final void initC2TC(int c, byte cl) {
        CHAR_TO_TOKEN[c] = cl;
    }

    private final void initC2TC(char c, byte cl) {
        initC2TC((int) c, cl);
    }
}
