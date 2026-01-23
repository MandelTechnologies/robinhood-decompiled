package com.robinhood.android.odyssey.lib.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.libtradingtrends.contracts.TradingTrendsType;
import com.robinhood.models.api.serverdrivenui.component.ApiSdIcon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: SdIconDrawableRes.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u001a\b\u0086\u0081\u0002\u0018\u0000 \u001c2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u001cB'\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdIconDrawableRes;", "", "smallIcon", "", "mediumIcon", "largeIcon", "<init>", "(Ljava/lang/String;IIII)V", "getSmallIcon", "()I", "getMediumIcon", "getLargeIcon", "DOCUMENTS", "LOCATION_FILL", "LOCK", "SEARCH", "BANKING", "DISCLOSURES", "DOWNLOAD", "QUESTION_FILLED", "DOT", "SPARKLE_BULLET", "WARNING_FILLED", "EDIT", TradingTrendsType.ROBINHOOD, "CARET_LEFT", "CARET_RIGHT", "CLOSE", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class SdIconDrawableRes {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ SdIconDrawableRes[] $VALUES;
    public static final SdIconDrawableRes BANKING;
    public static final SdIconDrawableRes CARET_LEFT;
    public static final SdIconDrawableRes CARET_RIGHT;
    public static final SdIconDrawableRes CLOSE;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final SdIconDrawableRes DISCLOSURES;
    public static final SdIconDrawableRes DOCUMENTS;
    public static final SdIconDrawableRes DOT;
    public static final SdIconDrawableRes DOWNLOAD;
    public static final SdIconDrawableRes EDIT;
    public static final SdIconDrawableRes LOCATION_FILL;
    public static final SdIconDrawableRes LOCK;
    public static final SdIconDrawableRes QUESTION_FILLED;
    public static final SdIconDrawableRes ROBINHOOD;
    public static final SdIconDrawableRes SEARCH;
    public static final SdIconDrawableRes SPARKLE_BULLET;
    public static final SdIconDrawableRes WARNING_FILLED;
    private final int largeIcon;
    private final int mediumIcon;
    private final int smallIcon;

    private static final /* synthetic */ SdIconDrawableRes[] $values() {
        return new SdIconDrawableRes[]{DOCUMENTS, LOCATION_FILL, LOCK, SEARCH, BANKING, DISCLOSURES, DOWNLOAD, QUESTION_FILLED, DOT, SPARKLE_BULLET, WARNING_FILLED, EDIT, ROBINHOOD, CARET_LEFT, CARET_RIGHT, CLOSE};
    }

    public static EnumEntries<SdIconDrawableRes> getEntries() {
        return $ENTRIES;
    }

    private SdIconDrawableRes(String str, int i, int i2, int i3, int i4) {
        this.smallIcon = i2;
        this.mediumIcon = i3;
        this.largeIcon = i4;
    }

    public final int getSmallIcon() {
        return this.smallIcon;
    }

    public final int getMediumIcon() {
        return this.mediumIcon;
    }

    public final int getLargeIcon() {
        return this.largeIcon;
    }

    static {
        int i = C20690R.drawable.ic_rds_documents_24dp;
        DOCUMENTS = new SdIconDrawableRes("DOCUMENTS", 0, i, i, i);
        int i2 = C20690R.drawable.ic_rds_location_fill_16dp;
        LOCATION_FILL = new SdIconDrawableRes("LOCATION_FILL", 1, i2, i2, C20690R.drawable.ic_rds_location_fill_24dp);
        LOCK = new SdIconDrawableRes("LOCK", 2, C20690R.drawable.ic_rds_lock_12dp, C20690R.drawable.ic_rds_lock_16dp, C20690R.drawable.ic_rds_lock_24dp);
        int i3 = C20690R.drawable.ic_rds_search_16dp;
        SEARCH = new SdIconDrawableRes("SEARCH", 3, i3, i3, C20690R.drawable.ic_rds_search_24dp);
        int i4 = C20690R.drawable.ic_rds_banking_16dp;
        BANKING = new SdIconDrawableRes("BANKING", 4, i4, i4, C20690R.drawable.ic_rds_banking_24dp);
        int i5 = C20690R.drawable.ic_rds_disclosures_16dp;
        DISCLOSURES = new SdIconDrawableRes("DISCLOSURES", 5, i5, i5, C20690R.drawable.ic_rds_disclosures_24dp);
        DOWNLOAD = new SdIconDrawableRes("DOWNLOAD", 6, C20690R.drawable.ic_rds_download_12dp, C20690R.drawable.ic_rds_download_16dp, C20690R.drawable.ic_rds_download_24dp);
        QUESTION_FILLED = new SdIconDrawableRes("QUESTION_FILLED", 7, C20690R.drawable.ic_rds_question_filled_12dp, C20690R.drawable.ic_rds_question_filled_16dp, C20690R.drawable.ic_rds_question_filled_24dp);
        DOT = new SdIconDrawableRes("DOT", 8, C20690R.drawable.ic_rds_dot_12dp, C20690R.drawable.ic_rds_dot_16dp, C20690R.drawable.ic_rds_dot_24dp);
        SPARKLE_BULLET = new SdIconDrawableRes("SPARKLE_BULLET", 9, C20690R.drawable.ic_rds_sparkle_bullet_12dp, C20690R.drawable.ic_rds_sparkle_bullet_16dp, C20690R.drawable.ic_rds_sparkle_bullet_24dp);
        WARNING_FILLED = new SdIconDrawableRes("WARNING_FILLED", 10, C20690R.drawable.ic_rds_alert_filled_12dp, C20690R.drawable.ic_rds_alert_filled_16dp, C20690R.drawable.ic_rds_alert_filled_24dp);
        EDIT = new SdIconDrawableRes("EDIT", 11, C20690R.drawable.ic_rds_edit_12dp, C20690R.drawable.ic_rds_edit_16dp, C20690R.drawable.ic_rds_edit_24dp);
        ROBINHOOD = new SdIconDrawableRes(TradingTrendsType.ROBINHOOD, 12, C20690R.drawable.ic_rds_robinhood_12dp, C20690R.drawable.ic_rds_robinhood_16dp, C20690R.drawable.ic_rds_robinhood_24dp);
        CARET_LEFT = new SdIconDrawableRes("CARET_LEFT", 13, C20690R.drawable.ic_rds_caret_left_12dp, C20690R.drawable.ic_rds_caret_left_16dp, C20690R.drawable.ic_rds_caret_left_24dp);
        CARET_RIGHT = new SdIconDrawableRes("CARET_RIGHT", 14, C20690R.drawable.ic_rds_caret_right_12dp, C20690R.drawable.ic_rds_caret_right_16dp, C20690R.drawable.ic_rds_caret_right_24dp);
        CLOSE = new SdIconDrawableRes("CLOSE", 15, C20690R.drawable.ic_rds_close_12dp, C20690R.drawable.ic_rds_close_16dp, C20690R.drawable.ic_rds_close_24dp);
        SdIconDrawableRes[] sdIconDrawableResArr$values = $values();
        $VALUES = sdIconDrawableResArr$values;
        $ENTRIES = EnumEntries2.enumEntries(sdIconDrawableResArr$values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: SdIconDrawableRes.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u0013\u0010\t\u001a\u0004\u0018\u00010\n*\u00020\u0006H\u0002¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/view/SdIconDrawableRes$Companion;", "", "<init>", "()V", "getDrawable", "Landroid/graphics/drawable/Drawable;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdIcon;", "context", "Landroid/content/Context;", "getDrawableRes", "", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdIcon;)Ljava/lang/Integer;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {

        /* compiled from: SdIconDrawableRes.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;
            public static final /* synthetic */ int[] $EnumSwitchMapping$1;

            static {
                int[] iArr = new int[ApiSdIcon.IconType.values().length];
                try {
                    iArr[ApiSdIcon.IconType.DOCUMENTS.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[ApiSdIcon.IconType.LOCATION_FILL.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[ApiSdIcon.IconType.LOCK.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[ApiSdIcon.IconType.SEARCH.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[ApiSdIcon.IconType.BANKING.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[ApiSdIcon.IconType.DISCLOSURES.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[ApiSdIcon.IconType.DOWNLOAD.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[ApiSdIcon.IconType.QUESTION_FILLED.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[ApiSdIcon.IconType.DOT.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[ApiSdIcon.IconType.SPARKLE_BULLET.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                try {
                    iArr[ApiSdIcon.IconType.WARNING_FILLED.ordinal()] = 11;
                } catch (NoSuchFieldError unused11) {
                }
                try {
                    iArr[ApiSdIcon.IconType.EDIT.ordinal()] = 12;
                } catch (NoSuchFieldError unused12) {
                }
                try {
                    iArr[ApiSdIcon.IconType.ROBINHOOD.ordinal()] = 13;
                } catch (NoSuchFieldError unused13) {
                }
                try {
                    iArr[ApiSdIcon.IconType.CARET_LEFT.ordinal()] = 14;
                } catch (NoSuchFieldError unused14) {
                }
                try {
                    iArr[ApiSdIcon.IconType.CARET_RIGHT.ordinal()] = 15;
                } catch (NoSuchFieldError unused15) {
                }
                try {
                    iArr[ApiSdIcon.IconType.CLOSE.ordinal()] = 16;
                } catch (NoSuchFieldError unused16) {
                }
                try {
                    iArr[ApiSdIcon.IconType.UNSUPPORTED.ordinal()] = 17;
                } catch (NoSuchFieldError unused17) {
                }
                $EnumSwitchMapping$0 = iArr;
                int[] iArr2 = new int[ApiSdIcon.IconSize.values().length];
                try {
                    iArr2[ApiSdIcon.IconSize.SMALL.ordinal()] = 1;
                } catch (NoSuchFieldError unused18) {
                }
                try {
                    iArr2[ApiSdIcon.IconSize.MEDIUM.ordinal()] = 2;
                } catch (NoSuchFieldError unused19) {
                }
                try {
                    iArr2[ApiSdIcon.IconSize.LARGE.ordinal()] = 3;
                } catch (NoSuchFieldError unused20) {
                }
                $EnumSwitchMapping$1 = iArr2;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Drawable getDrawable(ApiSdIcon apiSdIcon, Context context) {
            Intrinsics.checkNotNullParameter(apiSdIcon, "<this>");
            Intrinsics.checkNotNullParameter(context, "context");
            Integer drawableRes = getDrawableRes(apiSdIcon);
            if (drawableRes != null) {
                return context.getDrawable(drawableRes.intValue());
            }
            return null;
        }

        private final Integer getDrawableRes(ApiSdIcon apiSdIcon) {
            SdIconDrawableRes sdIconDrawableRes;
            int smallIcon;
            switch (WhenMappings.$EnumSwitchMapping$0[apiSdIcon.getData().getType().ordinal()]) {
                case 1:
                    sdIconDrawableRes = SdIconDrawableRes.DOCUMENTS;
                    break;
                case 2:
                    sdIconDrawableRes = SdIconDrawableRes.LOCATION_FILL;
                    break;
                case 3:
                    sdIconDrawableRes = SdIconDrawableRes.LOCK;
                    break;
                case 4:
                    sdIconDrawableRes = SdIconDrawableRes.SEARCH;
                    break;
                case 5:
                    sdIconDrawableRes = SdIconDrawableRes.BANKING;
                    break;
                case 6:
                    sdIconDrawableRes = SdIconDrawableRes.DISCLOSURES;
                    break;
                case 7:
                    sdIconDrawableRes = SdIconDrawableRes.DOWNLOAD;
                    break;
                case 8:
                    sdIconDrawableRes = SdIconDrawableRes.QUESTION_FILLED;
                    break;
                case 9:
                    sdIconDrawableRes = SdIconDrawableRes.DOT;
                    break;
                case 10:
                    sdIconDrawableRes = SdIconDrawableRes.SPARKLE_BULLET;
                    break;
                case 11:
                    sdIconDrawableRes = SdIconDrawableRes.WARNING_FILLED;
                    break;
                case 12:
                    sdIconDrawableRes = SdIconDrawableRes.EDIT;
                    break;
                case 13:
                    sdIconDrawableRes = SdIconDrawableRes.ROBINHOOD;
                    break;
                case 14:
                    sdIconDrawableRes = SdIconDrawableRes.CARET_LEFT;
                    break;
                case 15:
                    sdIconDrawableRes = SdIconDrawableRes.CARET_RIGHT;
                    break;
                case 16:
                    sdIconDrawableRes = SdIconDrawableRes.CLOSE;
                    break;
                case 17:
                    sdIconDrawableRes = null;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            if (sdIconDrawableRes == null) {
                return null;
            }
            int i = WhenMappings.$EnumSwitchMapping$1[apiSdIcon.getData().getSize().ordinal()];
            if (i == 1) {
                smallIcon = sdIconDrawableRes.getSmallIcon();
            } else if (i == 2) {
                smallIcon = sdIconDrawableRes.getMediumIcon();
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                smallIcon = sdIconDrawableRes.getLargeIcon();
            }
            return Integer.valueOf(smallIcon);
        }
    }

    public static SdIconDrawableRes valueOf(String str) {
        return (SdIconDrawableRes) Enum.valueOf(SdIconDrawableRes.class, str);
    }

    public static SdIconDrawableRes[] values() {
        return (SdIconDrawableRes[]) $VALUES.clone();
    }
}
