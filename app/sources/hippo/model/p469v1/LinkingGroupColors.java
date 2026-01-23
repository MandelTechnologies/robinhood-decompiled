package hippo.model.p469v1;

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
/* compiled from: LinkingGroupColors.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \u00102\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0010B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, m3636d2 = {"Lhippo/model/v1/LinkingGroupColors;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "COLORS_EXTENDED_UNSPECIFIED", "COLORS_EXTENDED_HYDRO", "COLORS_EXTENDED_SOLDARK", "COLORS_EXTENDED_UV", "COLORS_EXTENDED_COSMONAUT", "COLORS_EXTENDED_BIOMELIGHT", "COLORS_EXTENDED_LUMEN", "Companion", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class LinkingGroupColors implements WireEnum {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ LinkingGroupColors[] $VALUES;

    @JvmField
    public static final ProtoAdapter<LinkingGroupColors> ADAPTER;
    public static final LinkingGroupColors COLORS_EXTENDED_BIOMELIGHT;
    public static final LinkingGroupColors COLORS_EXTENDED_COSMONAUT;
    public static final LinkingGroupColors COLORS_EXTENDED_HYDRO;
    public static final LinkingGroupColors COLORS_EXTENDED_LUMEN;
    public static final LinkingGroupColors COLORS_EXTENDED_SOLDARK;
    public static final LinkingGroupColors COLORS_EXTENDED_UNSPECIFIED;
    public static final LinkingGroupColors COLORS_EXTENDED_UV;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final int value;

    private static final /* synthetic */ LinkingGroupColors[] $values() {
        return new LinkingGroupColors[]{COLORS_EXTENDED_UNSPECIFIED, COLORS_EXTENDED_HYDRO, COLORS_EXTENDED_SOLDARK, COLORS_EXTENDED_UV, COLORS_EXTENDED_COSMONAUT, COLORS_EXTENDED_BIOMELIGHT, COLORS_EXTENDED_LUMEN};
    }

    @JvmStatic
    public static final LinkingGroupColors fromValue(int i) {
        return INSTANCE.fromValue(i);
    }

    public static EnumEntries<LinkingGroupColors> getEntries() {
        return $ENTRIES;
    }

    private LinkingGroupColors(String str, int i, int i2) {
        this.value = i2;
    }

    @Override // com.squareup.wire.WireEnum
    public int getValue() {
        return this.value;
    }

    static {
        final LinkingGroupColors linkingGroupColors = new LinkingGroupColors("COLORS_EXTENDED_UNSPECIFIED", 0, 0);
        COLORS_EXTENDED_UNSPECIFIED = linkingGroupColors;
        COLORS_EXTENDED_HYDRO = new LinkingGroupColors("COLORS_EXTENDED_HYDRO", 1, 1);
        COLORS_EXTENDED_SOLDARK = new LinkingGroupColors("COLORS_EXTENDED_SOLDARK", 2, 2);
        COLORS_EXTENDED_UV = new LinkingGroupColors("COLORS_EXTENDED_UV", 3, 3);
        COLORS_EXTENDED_COSMONAUT = new LinkingGroupColors("COLORS_EXTENDED_COSMONAUT", 4, 4);
        COLORS_EXTENDED_BIOMELIGHT = new LinkingGroupColors("COLORS_EXTENDED_BIOMELIGHT", 5, 5);
        COLORS_EXTENDED_LUMEN = new LinkingGroupColors("COLORS_EXTENDED_LUMEN", 6, 6);
        LinkingGroupColors[] linkingGroupColorsArr$values = $values();
        $VALUES = linkingGroupColorsArr$values;
        $ENTRIES = EnumEntries2.enumEntries(linkingGroupColorsArr$values);
        INSTANCE = new Companion(null);
        final KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(LinkingGroupColors.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new EnumAdapter<LinkingGroupColors>(orCreateKotlinClass, syntax, linkingGroupColors) { // from class: hippo.model.v1.LinkingGroupColors$Companion$ADAPTER$1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.squareup.wire.EnumAdapter
            public LinkingGroupColors fromValue(int value) {
                return LinkingGroupColors.INSTANCE.fromValue(value);
            }
        };
    }

    /* compiled from: LinkingGroupColors.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lhippo/model/v1/LinkingGroupColors$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lhippo/model/v1/LinkingGroupColors;", "fromValue", "value", "", "hippo.v1_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final LinkingGroupColors fromValue(int value) {
            switch (value) {
                case 0:
                    return LinkingGroupColors.COLORS_EXTENDED_UNSPECIFIED;
                case 1:
                    return LinkingGroupColors.COLORS_EXTENDED_HYDRO;
                case 2:
                    return LinkingGroupColors.COLORS_EXTENDED_SOLDARK;
                case 3:
                    return LinkingGroupColors.COLORS_EXTENDED_UV;
                case 4:
                    return LinkingGroupColors.COLORS_EXTENDED_COSMONAUT;
                case 5:
                    return LinkingGroupColors.COLORS_EXTENDED_BIOMELIGHT;
                case 6:
                    return LinkingGroupColors.COLORS_EXTENDED_LUMEN;
                default:
                    return null;
            }
        }
    }

    public static LinkingGroupColors valueOf(String str) {
        return (LinkingGroupColors) Enum.valueOf(LinkingGroupColors.class, str);
    }

    public static LinkingGroupColors[] values() {
        return (LinkingGroupColors[]) $VALUES.clone();
    }
}
