package com.robinhood.android.odyssey.lib.view;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.libtradingtrends.contracts.TradingTrendsType;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SdTypedIcon.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdIconAsset;", "", "small", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "medium", "large", "<init>", "(Ljava/lang/String;ILcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getSmall", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getMedium", "getLarge", "DOCUMENTS", "LOCATION_FILL", "LOCK", "SEARCH", "BANKING", "DISCLOSURES", "DOWNLOAD", "QUESTION_FILLED", "DOT", "SPARKLE_BULLET", "WARNING_FILLED", "EDIT", TradingTrendsType.ROBINHOOD, "CARET_LEFT", "CARET_RIGHT", "CLOSE", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.view.SdIconAsset, reason: use source file name */
/* loaded from: classes10.dex */
final class SdTypedIcon {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SdTypedIcon[] $VALUES;
    public static final SdTypedIcon BANKING;
    public static final SdTypedIcon CARET_LEFT;
    public static final SdTypedIcon CARET_RIGHT;
    public static final SdTypedIcon CLOSE;
    public static final SdTypedIcon DISCLOSURES;
    public static final SdTypedIcon DOCUMENTS;
    public static final SdTypedIcon DOT;
    public static final SdTypedIcon DOWNLOAD;
    public static final SdTypedIcon EDIT;
    public static final SdTypedIcon LOCATION_FILL;
    public static final SdTypedIcon LOCK;
    public static final SdTypedIcon QUESTION_FILLED;
    public static final SdTypedIcon ROBINHOOD;
    public static final SdTypedIcon SEARCH;
    public static final SdTypedIcon SPARKLE_BULLET;
    public static final SdTypedIcon WARNING_FILLED;
    private final ServerToBentoAssetMapper2 large;
    private final ServerToBentoAssetMapper2 medium;
    private final ServerToBentoAssetMapper2 small;

    private static final /* synthetic */ SdTypedIcon[] $values() {
        return new SdTypedIcon[]{DOCUMENTS, LOCATION_FILL, LOCK, SEARCH, BANKING, DISCLOSURES, DOWNLOAD, QUESTION_FILLED, DOT, SPARKLE_BULLET, WARNING_FILLED, EDIT, ROBINHOOD, CARET_LEFT, CARET_RIGHT, CLOSE};
    }

    public static EnumEntries<SdTypedIcon> getEntries() {
        return $ENTRIES;
    }

    private SdTypedIcon(String str, int i, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, ServerToBentoAssetMapper2 serverToBentoAssetMapper22, ServerToBentoAssetMapper2 serverToBentoAssetMapper23) {
        this.small = serverToBentoAssetMapper2;
        this.medium = serverToBentoAssetMapper22;
        this.large = serverToBentoAssetMapper23;
    }

    public final ServerToBentoAssetMapper2 getSmall() {
        return this.small;
    }

    public final ServerToBentoAssetMapper2 getMedium() {
        return this.medium;
    }

    public final ServerToBentoAssetMapper2 getLarge() {
        return this.large;
    }

    static {
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.DOCUMENTS_24;
        DOCUMENTS = new SdTypedIcon("DOCUMENTS", 0, serverToBentoAssetMapper2, serverToBentoAssetMapper2, serverToBentoAssetMapper2);
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = ServerToBentoAssetMapper2.LOCATION_FILL_16;
        LOCATION_FILL = new SdTypedIcon("LOCATION_FILL", 1, serverToBentoAssetMapper22, serverToBentoAssetMapper22, ServerToBentoAssetMapper2.LOCATION_FILL_24);
        LOCK = new SdTypedIcon("LOCK", 2, ServerToBentoAssetMapper2.LOCK_12, ServerToBentoAssetMapper2.LOCK_16, ServerToBentoAssetMapper2.LOCK_24);
        ServerToBentoAssetMapper2 serverToBentoAssetMapper23 = ServerToBentoAssetMapper2.SEARCH_16;
        SEARCH = new SdTypedIcon("SEARCH", 3, serverToBentoAssetMapper23, serverToBentoAssetMapper23, ServerToBentoAssetMapper2.SEARCH_24);
        ServerToBentoAssetMapper2 serverToBentoAssetMapper24 = ServerToBentoAssetMapper2.BANKING_16;
        BANKING = new SdTypedIcon("BANKING", 4, serverToBentoAssetMapper24, serverToBentoAssetMapper24, ServerToBentoAssetMapper2.BANKING_24);
        ServerToBentoAssetMapper2 serverToBentoAssetMapper25 = ServerToBentoAssetMapper2.DISCLOSURES_24;
        DISCLOSURES = new SdTypedIcon("DISCLOSURES", 5, serverToBentoAssetMapper25, serverToBentoAssetMapper25, serverToBentoAssetMapper25);
        DOWNLOAD = new SdTypedIcon("DOWNLOAD", 6, ServerToBentoAssetMapper2.DOWNLOAD_12, ServerToBentoAssetMapper2.DOWNLOAD_16, ServerToBentoAssetMapper2.DOWNLOAD_24);
        QUESTION_FILLED = new SdTypedIcon("QUESTION_FILLED", 7, ServerToBentoAssetMapper2.QUESTION_FILLED_12, ServerToBentoAssetMapper2.QUESTION_FILLED_16, ServerToBentoAssetMapper2.QUESTION_FILLED_24);
        DOT = new SdTypedIcon("DOT", 8, ServerToBentoAssetMapper2.DOT_12, ServerToBentoAssetMapper2.DOT_16, ServerToBentoAssetMapper2.DOT_24);
        SPARKLE_BULLET = new SdTypedIcon("SPARKLE_BULLET", 9, ServerToBentoAssetMapper2.SPARKLE_BULLET_12, ServerToBentoAssetMapper2.SPARKLE_BULLET_16, ServerToBentoAssetMapper2.SPARKLE_BULLET_24);
        WARNING_FILLED = new SdTypedIcon("WARNING_FILLED", 10, ServerToBentoAssetMapper2.ALERT_FILLED_12, ServerToBentoAssetMapper2.ALERT_FILLED_16, ServerToBentoAssetMapper2.ALERT_FILLED_24);
        EDIT = new SdTypedIcon("EDIT", 11, ServerToBentoAssetMapper2.EDIT_12, ServerToBentoAssetMapper2.EDIT_16, ServerToBentoAssetMapper2.EDIT_24);
        ROBINHOOD = new SdTypedIcon(TradingTrendsType.ROBINHOOD, 12, ServerToBentoAssetMapper2.ROBINHOOD_12, ServerToBentoAssetMapper2.ROBINHOOD_16, ServerToBentoAssetMapper2.ROBINHOOD_24);
        CARET_LEFT = new SdTypedIcon("CARET_LEFT", 13, ServerToBentoAssetMapper2.CARET_LEFT_12, ServerToBentoAssetMapper2.CARET_LEFT_16, ServerToBentoAssetMapper2.CARET_LEFT_24);
        CARET_RIGHT = new SdTypedIcon("CARET_RIGHT", 14, ServerToBentoAssetMapper2.CARET_RIGHT_12, ServerToBentoAssetMapper2.CARET_RIGHT_16, ServerToBentoAssetMapper2.CARET_RIGHT_24);
        CLOSE = new SdTypedIcon("CLOSE", 15, ServerToBentoAssetMapper2.CLOSE_12, ServerToBentoAssetMapper2.CLOSE_16, ServerToBentoAssetMapper2.CLOSE_24);
        SdTypedIcon[] sdTypedIconArr$values = $values();
        $VALUES = sdTypedIconArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sdTypedIconArr$values);
    }

    public static SdTypedIcon valueOf(String str) {
        return (SdTypedIcon) Enum.valueOf(SdTypedIcon.class, str);
    }

    public static SdTypedIcon[] values() {
        return (SdTypedIcon[]) $VALUES.clone();
    }
}
