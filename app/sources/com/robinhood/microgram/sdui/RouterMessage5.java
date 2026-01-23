package com.robinhood.microgram.sdui;

import com.robinhood.enums.RhEnum;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RouterMessage.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \f2\b\u0012\u0004\u0012\u00020\u00000\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ScreenType;", "Lcom/robinhood/enums/RhEnum;", "", "serverValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getServerValue", "()Ljava/lang/String;", "CENTERED_CONTENT", "LIST", "HTML_CANVAS_CONTENT", "Companion", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.microgram.sdui.ScreenType, reason: use source file name */
/* loaded from: classes13.dex */
public final class RouterMessage5 implements RhEnum<RouterMessage5> {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ RouterMessage5[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final String serverValue;
    public static final RouterMessage5 CENTERED_CONTENT = new RouterMessage5("CENTERED_CONTENT", 0, "CenteredContentScreen");
    public static final RouterMessage5 LIST = new RouterMessage5("LIST", 1, "ListScreen");
    public static final RouterMessage5 HTML_CANVAS_CONTENT = new RouterMessage5("HTML_CANVAS_CONTENT", 2, "HtmlCanvasScreen");

    private static final /* synthetic */ RouterMessage5[] $values() {
        return new RouterMessage5[]{CENTERED_CONTENT, LIST, HTML_CANVAS_CONTENT};
    }

    public static EnumEntries<RouterMessage5> getEntries() {
        return $ENTRIES;
    }

    private RouterMessage5(String str, int i, String str2) {
        this.serverValue = str2;
    }

    @Override // com.robinhood.enums.RhEnum
    public String getServerValue() {
        return this.serverValue;
    }

    static {
        RouterMessage5[] routerMessage5Arr$values = $values();
        $VALUES = routerMessage5Arr$values;
        $ENTRIES = EnumEntries2.enumEntries(routerMessage5Arr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: RouterMessage.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/microgram/sdui/ScreenType$Companion;", "Lcom/robinhood/enums/RhEnum$Converter$Defaulted;", "Lcom/robinhood/microgram/sdui/ScreenType;", "<init>", "()V", "fromProtoValue", "string", "", "fromLegacyValue", "lib-microgram-sdui-models_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.microgram.sdui.ScreenType$Companion, reason: from kotlin metadata */
    public static final class Companion extends RhEnum.Converter.Defaulted<RouterMessage5> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
            super((Enum[]) RouterMessage5.getEntries().toArray(new RouterMessage5[0]), RouterMessage5.LIST, false, 4, null);
        }

        public final RouterMessage5 fromProtoValue(String string2) {
            Intrinsics.checkNotNullParameter(string2, "string");
            int iHashCode = string2.hashCode();
            if (iHashCode != -1418655086) {
                if (iHashCode != -1309572841) {
                    if (iHashCode == -668335607 && string2.equals("ProtoCenteredContentScreen")) {
                        return RouterMessage5.CENTERED_CONTENT;
                    }
                } else if (string2.equals("ProtoHtmlCanvasScreen")) {
                    return RouterMessage5.HTML_CANVAS_CONTENT;
                }
            } else if (string2.equals("ProtoListScreen")) {
                return RouterMessage5.LIST;
            }
            throw new NoSuchElementException("Unrecognized proto screen type: " + string2);
        }

        public final RouterMessage5 fromLegacyValue(String string2) {
            Intrinsics.checkNotNullParameter(string2, "string");
            int iHashCode = string2.hashCode();
            if (iHashCode != -1952199990) {
                if (iHashCode != 798715601) {
                    if (iHashCode == 1668364111 && string2.equals("HtmlCanvasScreen")) {
                        return RouterMessage5.HTML_CANVAS_CONTENT;
                    }
                } else if (string2.equals("CenteredContentScreen")) {
                    return RouterMessage5.CENTERED_CONTENT;
                }
            } else if (string2.equals("ListScreen")) {
                return RouterMessage5.LIST;
            }
            throw new NoSuchElementException("Unrecognized legacy screen type: " + string2);
        }
    }

    public static RouterMessage5 valueOf(String str) {
        return (RouterMessage5) Enum.valueOf(RouterMessage5.class, str);
    }

    public static RouterMessage5[] values() {
        return (RouterMessage5[]) $VALUES.clone();
    }
}
