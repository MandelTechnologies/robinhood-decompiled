package com.robinhood.android.optionsupgrade.knowledgecheckneeded;

import android.content.res.Resources;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.optionsupgrade.C25121R;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededViewState;
import com.robinhood.android.udf.StateProvider;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import p479j$.time.ZoneId;
import p479j$.time.ZonedDateTime;
import p479j$.time.format.DateTimeFormatter;

/* compiled from: OptionOnboardingKnowledgeCheckNeededStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededDataState;", "Lcom/robinhood/android/optionsupgrade/knowledgecheckneeded/OptionOnboardingKnowledgeCheckNeededViewState;", "resources", "Landroid/content/res/Resources;", "<init>", "(Landroid/content/res/Resources;)V", "reduce", "dataState", "feature-options-upgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class OptionOnboardingKnowledgeCheckNeededStateProvider implements StateProvider<OptionOnboardingKnowledgeCheckNeededDataState, OptionOnboardingKnowledgeCheckNeededViewState> {
    public static final int $stable = 8;
    private final Resources resources;

    public OptionOnboardingKnowledgeCheckNeededStateProvider(Resources resources) {
        Intrinsics.checkNotNullParameter(resources, "resources");
        this.resources = resources;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public OptionOnboardingKnowledgeCheckNeededViewState reduce(OptionOnboardingKnowledgeCheckNeededDataState dataState) throws Resources.NotFoundException {
        OptionOnboardingKnowledgeCheckNeededViewState.SupportCardState supportCardState;
        String string2;
        String str;
        DateTimeFormatter dateTimeFormatterOfPattern;
        DateTimeFormatter dateTimeFormatterOfPattern2;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        boolean z = (dataState.getChatStartTime() == null || dataState.getChatEndTime() == null || dataState.getNow() == null || dataState.getNow().compareTo(dataState.getChatStartTime()) < 0 || dataState.getNow().compareTo(dataState.getChatEndTime()) > 0) ? false : true;
        boolean z2 = z && dataState.getChatEnabled() && !dataState.isWeekend();
        String string3 = this.resources.getString(C25121R.string.gated_options_onboarding_knowledge_check_needed_title);
        Intrinsics.checkNotNullExpressionValue(string3, "getString(...)");
        if (dataState.getChatHidden()) {
            supportCardState = null;
        } else {
            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.CHAT_24;
            String string4 = this.resources.getString(C25121R.string.gated_options_onboarding_knowledge_check_needed_chat_now_title);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(...)");
            if (dataState.getChatEnabled() && !dataState.isWeekend() && z) {
                str = null;
            } else {
                if (dataState.getChatEnabled() && !dataState.isHoliday() && !dataState.isHalfDay() && dataState.getChatStartTime() != null && dataState.getChatEndTime() != null) {
                    ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
                    ZonedDateTime zonedDateTimeAtZone = dataState.getChatStartTime().atZone(zoneIdSystemDefault);
                    ZonedDateTime zonedDateTimeAtZone2 = dataState.getChatEndTime().atZone(zoneIdSystemDefault);
                    if (zonedDateTimeAtZone.getMinute() == 0) {
                        dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("ha");
                    } else {
                        dateTimeFormatterOfPattern = DateTimeFormatter.ofPattern("h[:mm]a");
                    }
                    String str2 = dateTimeFormatterOfPattern.format(zonedDateTimeAtZone);
                    if (zonedDateTimeAtZone2.getMinute() == 0) {
                        dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("ha z");
                    } else {
                        dateTimeFormatterOfPattern2 = DateTimeFormatter.ofPattern("h[:mm]a z");
                    }
                    string2 = this.resources.getString(C25121R.string.f4817xe4bcdb8a, str2, dateTimeFormatterOfPattern2.format(zonedDateTimeAtZone2));
                } else {
                    string2 = this.resources.getString(C25121R.string.f4819x8f276bb8);
                }
                str = string2;
            }
            supportCardState = new OptionOnboardingKnowledgeCheckNeededViewState.SupportCardState(serverToBentoAssetMapper2, string4, str, z2, dataState.getChatNowCardIsLoading());
        }
        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = ServerToBentoAssetMapper2.PHONE_24;
        String string5 = this.resources.getString(C25121R.string.f4818xbae25505);
        Intrinsics.checkNotNullExpressionValue(string5, "getString(...)");
        return new OptionOnboardingKnowledgeCheckNeededViewState(string3, supportCardState, new OptionOnboardingKnowledgeCheckNeededViewState.SupportCardState(serverToBentoAssetMapper22, string5, dataState.getAppointmentEnabled() ? null : this.resources.getString(C25121R.string.f4819x8f276bb8), dataState.getAppointmentEnabled(), dataState.getScheduleCallCardIsLoading()), dataState.getDisclosureMarkdown());
    }
}
