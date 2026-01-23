package androidx.media3.p014ui;

import android.content.res.Resources;
import android.text.TextUtils;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Util;
import java.util.Locale;

/* loaded from: classes4.dex */
public class DefaultTrackNameProvider implements TrackNameProvider {
    private final Resources resources;

    public DefaultTrackNameProvider(Resources resources) {
        this.resources = (Resources) Assertions.checkNotNull(resources);
    }

    @Override // androidx.media3.p014ui.TrackNameProvider
    public String getTrackName(Format format2) {
        String strBuildLanguageOrLabelString;
        int iInferPrimaryTrackType = inferPrimaryTrackType(format2);
        if (iInferPrimaryTrackType == 2) {
            strBuildLanguageOrLabelString = joinWithSeparator(buildRoleString(format2), buildResolutionString(format2), buildBitrateString(format2));
        } else if (iInferPrimaryTrackType == 1) {
            strBuildLanguageOrLabelString = joinWithSeparator(buildLanguageOrLabelString(format2), buildAudioChannelString(format2), buildBitrateString(format2));
        } else {
            strBuildLanguageOrLabelString = buildLanguageOrLabelString(format2);
        }
        if (strBuildLanguageOrLabelString.length() != 0) {
            return strBuildLanguageOrLabelString;
        }
        String str = format2.language;
        if (str == null || str.trim().isEmpty()) {
            return this.resources.getString(R$string.exo_track_unknown);
        }
        return this.resources.getString(R$string.exo_track_unknown_name, str);
    }

    private String buildResolutionString(Format format2) {
        int i = format2.width;
        int i2 = format2.height;
        if (i == -1 || i2 == -1) {
            return "";
        }
        return this.resources.getString(R$string.exo_track_resolution, Integer.valueOf(i), Integer.valueOf(i2));
    }

    private String buildBitrateString(Format format2) {
        int i = format2.bitrate;
        if (i == -1) {
            return "";
        }
        return this.resources.getString(R$string.exo_track_bitrate, Float.valueOf(i / 1000000.0f));
    }

    private String buildAudioChannelString(Format format2) {
        int i = format2.channelCount;
        if (i == -1 || i < 1) {
            return "";
        }
        if (i == 1) {
            return this.resources.getString(R$string.exo_track_mono);
        }
        if (i == 2) {
            return this.resources.getString(R$string.exo_track_stereo);
        }
        if (i == 6 || i == 7) {
            return this.resources.getString(R$string.exo_track_surround_5_point_1);
        }
        if (i == 8) {
            return this.resources.getString(R$string.exo_track_surround_7_point_1);
        }
        return this.resources.getString(R$string.exo_track_surround);
    }

    private String buildLanguageOrLabelString(Format format2) {
        String strJoinWithSeparator = joinWithSeparator(buildLanguageString(format2), buildRoleString(format2));
        return TextUtils.isEmpty(strJoinWithSeparator) ? buildLabelString(format2) : strJoinWithSeparator;
    }

    private String buildLabelString(Format format2) {
        return TextUtils.isEmpty(format2.label) ? "" : format2.label;
    }

    private String buildLanguageString(Format format2) {
        String str = format2.language;
        if (TextUtils.isEmpty(str) || "und".equals(str)) {
            return "";
        }
        Locale localeForLanguageTag = Util.SDK_INT >= 21 ? Locale.forLanguageTag(str) : new Locale(str);
        Locale defaultDisplayLocale = Util.getDefaultDisplayLocale();
        String displayName = localeForLanguageTag.getDisplayName(defaultDisplayLocale);
        if (TextUtils.isEmpty(displayName)) {
            return "";
        }
        try {
            int iOffsetByCodePoints = displayName.offsetByCodePoints(0, 1);
            return displayName.substring(0, iOffsetByCodePoints).toUpperCase(defaultDisplayLocale) + displayName.substring(iOffsetByCodePoints);
        } catch (IndexOutOfBoundsException unused) {
            return displayName;
        }
    }

    private String buildRoleString(Format format2) throws Resources.NotFoundException {
        String strJoinWithSeparator;
        if ((format2.roleFlags & 2) == 0) {
            strJoinWithSeparator = "";
        } else {
            strJoinWithSeparator = this.resources.getString(R$string.exo_track_role_alternate);
        }
        if ((format2.roleFlags & 4) != 0) {
            strJoinWithSeparator = joinWithSeparator(strJoinWithSeparator, this.resources.getString(R$string.exo_track_role_supplementary));
        }
        if ((format2.roleFlags & 8) != 0) {
            strJoinWithSeparator = joinWithSeparator(strJoinWithSeparator, this.resources.getString(R$string.exo_track_role_commentary));
        }
        return (format2.roleFlags & 1088) != 0 ? joinWithSeparator(strJoinWithSeparator, this.resources.getString(R$string.exo_track_role_closed_captions)) : strJoinWithSeparator;
    }

    private String joinWithSeparator(String... strArr) {
        String string2 = "";
        for (String str : strArr) {
            if (str.length() > 0) {
                string2 = TextUtils.isEmpty(string2) ? str : this.resources.getString(R$string.exo_item_list, string2, str);
            }
        }
        return string2;
    }

    private static int inferPrimaryTrackType(Format format2) {
        int trackType = MimeTypes.getTrackType(format2.sampleMimeType);
        if (trackType != -1) {
            return trackType;
        }
        if (MimeTypes.getVideoMediaMimeType(format2.codecs) != null) {
            return 2;
        }
        if (MimeTypes.getAudioMediaMimeType(format2.codecs) != null) {
            return 1;
        }
        if (format2.width == -1 && format2.height == -1) {
            return (format2.channelCount == -1 && format2.sampleRate == -1) ? -1 : 1;
        }
        return 2;
    }
}
