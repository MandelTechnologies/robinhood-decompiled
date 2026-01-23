package com.robinhood.android.common.shareholder.view;

import android.os.Parcelable;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.models.serverdriven.experimental.api.ShareholderEventLoggingContext;
import com.robinhood.models.serverdriven.experimental.api.ShareholderEventNavigationRow;
import com.robinhood.models.serverdriven.experimental.api.ShareholderEventSection;
import com.robinhood.rosetta.eventlogging.Boolean;
import com.robinhood.rosetta.eventlogging.ShareholderQAContext;
import com.robinhood.shareholderx.models.p401db.CompanyIcon;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: utils.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004\u001a\n\u0010\u0005\u001a\u00020\u0006*\u00020\u0007\u001a\u001a\u0010\b\u001a\u00020\t\"\b\b\u0000\u0010\n*\u00020\u000b*\b\u0012\u0004\u0012\u0002H\n0\f¨\u0006\r"}, m3636d2 = {"getThemedUrl", "", "Lcom/robinhood/shareholderx/models/db/CompanyIcon;", "overlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "toQAEventSection", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext$EventSection;", "Lcom/robinhood/models/serverdriven/experimental/api/ShareholderEventSection;", "getLoggingContext", "Lcom/robinhood/rosetta/eventlogging/ShareholderQAContext;", "T", "Landroid/os/Parcelable;", "Lcom/robinhood/models/serverdriven/experimental/api/ShareholderEventNavigationRow;", "feature-lib-shareholderx_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class UtilsKt {

    /* compiled from: utils.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[DayNightOverlay.values().length];
            try {
                iArr[DayNightOverlay.DAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DayNightOverlay.NIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[ShareholderEventSection.values().length];
            try {
                iArr2[ShareholderEventSection.NEW.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[ShareholderEventSection.PAST.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[ShareholderEventSection.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public static final String getThemedUrl(CompanyIcon companyIcon, DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(companyIcon, "<this>");
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        int i = WhenMappings.$EnumSwitchMapping$0[overlay.ordinal()];
        if (i == 1) {
            return companyIcon.getLightUrl();
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return companyIcon.getDarkUrl();
    }

    public static final ShareholderQAContext.EventSection toQAEventSection(ShareholderEventSection shareholderEventSection) {
        Intrinsics.checkNotNullParameter(shareholderEventSection, "<this>");
        int i = WhenMappings.$EnumSwitchMapping$1[shareholderEventSection.ordinal()];
        if (i == 1) {
            return ShareholderQAContext.EventSection.EVENT_NEW;
        }
        if (i == 2) {
            return ShareholderQAContext.EventSection.EVENT_PAST;
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return ShareholderQAContext.EventSection.EVENT_SECTION_UNSPECIFIED;
    }

    public static final <T extends Parcelable> ShareholderQAContext getLoggingContext(ShareholderEventNavigationRow<? extends T> shareholderEventNavigationRow) {
        String event_slug;
        ShareholderQAContext.EventSection qAEventSection;
        ShareholderEventSection event_section;
        Intrinsics.checkNotNullParameter(shareholderEventNavigationRow, "<this>");
        ShareholderEventLoggingContext logging_context = shareholderEventNavigationRow.getLogging_context();
        if (logging_context == null || (event_slug = logging_context.getEvent_slug()) == null) {
            event_slug = "";
        }
        String str = event_slug;
        ShareholderQAContext.EntryPoint entryPoint = ShareholderQAContext.EntryPoint.STOCK_DETAIL_EARNINGS_ROW;
        ShareholderQAContext.EventState eventState = ShareholderQAContext.EventState.EVENT_STATE_UNSPECIFIED;
        Boolean r5 = Boolean.BOOLEAN_UNSPECIFIED;
        ShareholderQAContext.VoteButtonState voteButtonState = ShareholderQAContext.VoteButtonState.VOTE_BUTTON_STATE_UNSPECIFIED;
        ShareholderEventLoggingContext logging_context2 = shareholderEventNavigationRow.getLogging_context();
        if (logging_context2 == null || (event_section = logging_context2.getEvent_section()) == null || (qAEventSection = toQAEventSection(event_section)) == null) {
            qAEventSection = ShareholderQAContext.EventSection.EVENT_SECTION_UNSPECIFIED;
        }
        return new ShareholderQAContext(str, entryPoint, eventState, r5, voteButtonState, qAEventSection, null, 64, null);
    }
}
