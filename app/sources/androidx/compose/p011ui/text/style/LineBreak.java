package androidx.compose.p011ui.text.style;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: LineBreak.android.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087@\u0018\u0000 \u001b2\u00020\u0001:\u0004\u001b\u001c\u001d\u001eB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0005J\u001a\u0010\u0010\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00128Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0005R\u0017\u0010\u0017\u001a\u00020\u00158Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0005R\u0017\u0010\u001a\u001a\u00020\u00188Fø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0005\u0088\u0001\u0003\u0092\u0001\u00020\u0002\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u001f"}, m3636d2 = {"Landroidx/compose/ui/text/style/LineBreak;", "", "", "mask", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "hashCode-impl", "hashCode", "other", "", "equals-impl", "(ILjava/lang/Object;)Z", "equals", "I", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "getStrategy-fcGXIks", "strategy", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "getStrictness-usljTpc", "strictness", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "getWordBreak-jp8hJ3c", "wordBreak", "Companion", "Strategy", "Strictness", "WordBreak", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@JvmInline
/* loaded from: classes.dex */
public final class LineBreak {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final int Heading;
    private static final int Paragraph;
    private static final int Simple;
    private static final int Unspecified;
    private final int mask;

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ LineBreak m7848boximpl(int i) {
        return new LineBreak(i);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7849constructorimpl(int i) {
        return i;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7850equalsimpl(int i, Object obj) {
        return (obj instanceof LineBreak) && i == ((LineBreak) obj).getMask();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7851equalsimpl0(int i, int i2) {
        return i == i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7855hashCodeimpl(int i) {
        return Integer.hashCode(i);
    }

    public boolean equals(Object obj) {
        return m7850equalsimpl(this.mask, obj);
    }

    public int hashCode() {
        return m7855hashCodeimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name and from getter */
    public final /* synthetic */ int getMask() {
        return this.mask;
    }

    private /* synthetic */ LineBreak(int i) {
        this.mask = i;
    }

    /* renamed from: getStrategy-fcGXIks, reason: not valid java name */
    public static final int m7852getStrategyfcGXIks(int i) {
        return Strategy.m7861constructorimpl(LineBreak_androidKt.unpackByte1(i));
    }

    /* renamed from: getStrictness-usljTpc, reason: not valid java name */
    public static final int m7853getStrictnessusljTpc(int i) {
        return Strictness.m7867constructorimpl(LineBreak_androidKt.unpackByte2(i));
    }

    /* renamed from: getWordBreak-jp8hJ3c, reason: not valid java name */
    public static final int m7854getWordBreakjp8hJ3c(int i) {
        return WordBreak.m7874constructorimpl(LineBreak_androidKt.unpackByte3(i));
    }

    public String toString() {
        return m7856toStringimpl(this.mask);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7856toStringimpl(int i) {
        return "LineBreak(strategy=" + ((Object) Strategy.m7863toStringimpl(m7852getStrategyfcGXIks(i))) + ", strictness=" + ((Object) Strictness.m7869toStringimpl(m7853getStrictnessusljTpc(i))) + ", wordBreak=" + ((Object) WordBreak.m7876toStringimpl(m7854getWordBreakjp8hJ3c(i))) + ')';
    }

    /* compiled from: LineBreak.android.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\u0005\u0010\u0006\u0012\u0004\b\t\u0010\u0003\u001a\u0004\b\u0007\u0010\bR&\u0010\n\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\n\u0010\u0006\u0012\u0004\b\f\u0010\u0003\u001a\u0004\b\u000b\u0010\bR&\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b\r\u0010\u0006\u0012\u0004\b\u000f\u0010\u0003\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, m3636d2 = {"Landroidx/compose/ui/text/style/LineBreak$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineBreak;", "Simple", "I", "getSimple-rAG3T2k", "()I", "getSimple-rAG3T2k$annotations", "Heading", "getHeading-rAG3T2k", "getHeading-rAG3T2k$annotations", "Unspecified", "getUnspecified-rAG3T2k", "getUnspecified-rAG3T2k$annotations", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* renamed from: getSimple-rAG3T2k, reason: not valid java name */
        public final int m7859getSimplerAG3T2k() {
            return LineBreak.Simple;
        }

        /* renamed from: getHeading-rAG3T2k, reason: not valid java name */
        public final int m7858getHeadingrAG3T2k() {
            return LineBreak.Heading;
        }

        /* renamed from: getUnspecified-rAG3T2k, reason: not valid java name */
        public final int m7860getUnspecifiedrAG3T2k() {
            return LineBreak.Unspecified;
        }
    }

    static {
        Strategy.Companion companion = Strategy.INSTANCE;
        int iM7866getSimplefcGXIks = companion.m7866getSimplefcGXIks();
        Strictness.Companion companion2 = Strictness.INSTANCE;
        int iM7872getNormalusljTpc = companion2.m7872getNormalusljTpc();
        WordBreak.Companion companion3 = WordBreak.INSTANCE;
        Simple = m7849constructorimpl(LineBreak_androidKt.packBytes(iM7866getSimplefcGXIks, iM7872getNormalusljTpc, companion3.m7877getDefaultjp8hJ3c()));
        Heading = m7849constructorimpl(LineBreak_androidKt.packBytes(companion.m7864getBalancedfcGXIks(), companion2.m7871getLooseusljTpc(), companion3.m7878getPhrasejp8hJ3c()));
        Paragraph = m7849constructorimpl(LineBreak_androidKt.packBytes(companion.m7865getHighQualityfcGXIks(), companion2.m7873getStrictusljTpc(), companion3.m7877getDefaultjp8hJ3c()));
        Unspecified = m7849constructorimpl(0);
    }

    /* compiled from: LineBreak.android.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000b"}, m3636d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "Companion", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @JvmInline
    public static final class Strategy {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int Simple = m7861constructorimpl(1);
        private static final int HighQuality = m7861constructorimpl(2);
        private static final int Balanced = m7861constructorimpl(3);
        private static final int Unspecified = m7861constructorimpl(0);

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7861constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7862equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* compiled from: LineBreak.android.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, m3636d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strategy$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineBreak$Strategy;", "Simple", "I", "getSimple-fcGXIks", "()I", "HighQuality", "getHighQuality-fcGXIks", "Balanced", "getBalanced-fcGXIks", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getSimple-fcGXIks, reason: not valid java name */
            public final int m7866getSimplefcGXIks() {
                return Strategy.Simple;
            }

            /* renamed from: getHighQuality-fcGXIks, reason: not valid java name */
            public final int m7865getHighQualityfcGXIks() {
                return Strategy.HighQuality;
            }

            /* renamed from: getBalanced-fcGXIks, reason: not valid java name */
            public final int m7864getBalancedfcGXIks() {
                return Strategy.Balanced;
            }
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7863toStringimpl(int i) {
            return m7862equalsimpl0(i, Simple) ? "Strategy.Simple" : m7862equalsimpl0(i, HighQuality) ? "Strategy.HighQuality" : m7862equalsimpl0(i, Balanced) ? "Strategy.Balanced" : m7862equalsimpl0(i, Unspecified) ? "Strategy.Unspecified" : "Invalid";
        }
    }

    /* compiled from: LineBreak.android.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000b"}, m3636d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "Companion", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @JvmInline
    public static final class Strictness {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int Default = m7867constructorimpl(1);
        private static final int Loose = m7867constructorimpl(2);
        private static final int Normal = m7867constructorimpl(3);
        private static final int Strict = m7867constructorimpl(4);
        private static final int Unspecified = m7867constructorimpl(0);

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7867constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7868equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* compiled from: LineBreak.android.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u001d\u0010\u000b\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u000b\u0010\u0006\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\r\u0010\u0006\u001a\u0004\b\u000e\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000f"}, m3636d2 = {"Landroidx/compose/ui/text/style/LineBreak$Strictness$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineBreak$Strictness;", "Default", "I", "getDefault-usljTpc", "()I", "Loose", "getLoose-usljTpc", "Normal", "getNormal-usljTpc", "Strict", "getStrict-usljTpc", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getDefault-usljTpc, reason: not valid java name */
            public final int m7870getDefaultusljTpc() {
                return Strictness.Default;
            }

            /* renamed from: getLoose-usljTpc, reason: not valid java name */
            public final int m7871getLooseusljTpc() {
                return Strictness.Loose;
            }

            /* renamed from: getNormal-usljTpc, reason: not valid java name */
            public final int m7872getNormalusljTpc() {
                return Strictness.Normal;
            }

            /* renamed from: getStrict-usljTpc, reason: not valid java name */
            public final int m7873getStrictusljTpc() {
                return Strictness.Strict;
            }
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7869toStringimpl(int i) {
            return m7868equalsimpl0(i, Default) ? "Strictness.None" : m7868equalsimpl0(i, Loose) ? "Strictness.Loose" : m7868equalsimpl0(i, Normal) ? "Strictness.Normal" : m7868equalsimpl0(i, Strict) ? "Strictness.Strict" : m7868equalsimpl0(i, Unspecified) ? "Strictness.Unspecified" : "Invalid";
        }
    }

    /* compiled from: LineBreak.android.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087@\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u000b"}, m3636d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "", "", "value", "constructor-impl", "(I)I", "", "toString-impl", "(I)Ljava/lang/String;", "toString", "Companion", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
    @JvmInline
    public static final class WordBreak {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);
        private static final int Default = m7874constructorimpl(1);
        private static final int Phrase = m7874constructorimpl(2);
        private static final int Unspecified = m7874constructorimpl(0);

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m7874constructorimpl(int i) {
            return i;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m7875equalsimpl0(int i, int i2) {
            return i == i2;
        }

        /* compiled from: LineBreak.android.kt */
        @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u001d\u0010\t\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u000b"}, m3636d2 = {"Landroidx/compose/ui/text/style/LineBreak$WordBreak$Companion;", "", "<init>", "()V", "Landroidx/compose/ui/text/style/LineBreak$WordBreak;", "Default", "I", "getDefault-jp8hJ3c", "()I", "Phrase", "getPhrase-jp8hJ3c", "ui-text_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            /* renamed from: getDefault-jp8hJ3c, reason: not valid java name */
            public final int m7877getDefaultjp8hJ3c() {
                return WordBreak.Default;
            }

            /* renamed from: getPhrase-jp8hJ3c, reason: not valid java name */
            public final int m7878getPhrasejp8hJ3c() {
                return WordBreak.Phrase;
            }
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m7876toStringimpl(int i) {
            return m7875equalsimpl0(i, Default) ? "WordBreak.None" : m7875equalsimpl0(i, Phrase) ? "WordBreak.Phrase" : m7875equalsimpl0(i, Unspecified) ? "WordBreak.Unspecified" : "Invalid";
        }
    }
}
