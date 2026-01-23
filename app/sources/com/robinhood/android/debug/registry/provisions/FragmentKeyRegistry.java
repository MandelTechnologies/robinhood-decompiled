package com.robinhood.android.debug.registry.provisions;

import android.net.Uri;
import bff_money_movement.service.p019v1.NonOriginatedTransferTypeDto;
import com.robinhood.android.acats.contracts.AcatsFragmentKeys2;
import com.robinhood.android.acats.contracts.AcatsFragmentKeys3;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.education.contracts.AdvancedAlert4;
import com.robinhood.android.education.contracts.AlertHubSettingsKey;
import com.robinhood.android.gold.contracts.GoldDepositBoostHubFragmentKey;
import com.robinhood.android.history.contracts.PspGiftHistoryDetailFragmentKey;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.navigation.app.keys.data.InstrumentDetailSource;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.questionnaire.p219db.QuestionnaireContexts;
import com.robinhood.android.recommendations.contracts.RecommendationsRecurringHook;
import com.robinhood.android.security.contracts.PromptsMfaEnrollment;
import com.robinhood.android.transfers.contracts.AccountSpecificNonOriginatedTransferInfo;
import com.robinhood.models.advanced.alert.p302db.AlertHubSettings2;
import com.robinhood.models.api.appointments.ApiAppointment2;
import com.robinhood.models.p355ui.CallDescription;
import com.robinhood.models.p355ui.Channel;
import com.robinhood.models.p355ui.IssueDetail;
import com.robinhood.models.p355ui.appointments.Appointment;
import com.robinhood.models.serverdriven.p347db.RichText;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailV2FragmentKey;
import com.robinhood.shared.debug.lib.registry.config.Configuration;
import com.robinhood.shared.education.contracts.OrderTypeEducationFragmentKey;
import com.robinhood.shared.questionnaire.contracts.QuestionnaireReview;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey;
import com.robinhood.shared.settings.contracts.SettingsFragmentKey3;
import com.robinhood.shared.support.contracts.AppointmentsConfirmationFragmentKey;
import com.robinhood.shared.support.contracts.AppointmentsSchedulerFragmentKey;
import com.robinhood.shared.support.contracts.AppointmentsViewerFragmentKey;
import com.robinhood.shared.support.contracts.ConciergeOnboardingFragmentKey;
import com.robinhood.shared.support.contracts.ContactSupportFragmentKey;
import com.robinhood.shared.support.contracts.CxChatFragmentKey;
import com.robinhood.shared.support.contracts.PathfinderFragmentKey;
import com.robinhood.shared.support.contracts.ReviewCallDetailsFragmentKey;
import com.robinhood.utils.extensions.StringsKt;
import com.singular.sdk.internal.SLRemoteConfiguration;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import p479j$.time.Instant;

/* compiled from: FragmentKeyRegistry.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R1\u0010\u0006\u001a\"\u0012\u001e\u0012\u001c\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\n0\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\b0\u00078F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/debug/registry/provisions/FragmentKeyRegistry;", "", "<init>", "()V", "TEST_UUID", "Ljava/util/UUID;", "MAPPING", "", "Lkotlin/Pair;", "Lkotlin/reflect/KClass;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "", "Lcom/robinhood/shared/debug/lib/registry/config/Configuration$Fragment;", "getMAPPING", "()Ljava/util/Set;", "lib-debug-drawer-registry-provisions_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final class FragmentKeyRegistry {
    public static final FragmentKeyRegistry INSTANCE = new FragmentKeyRegistry();
    private static final UUID TEST_UUID = new UUID(0, 0);

    private FragmentKeyRegistry() {
    }

    public final Set<Tuples2<KClass<? extends FragmentKey>, List<Configuration.Fragment>>> getMAPPING() {
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(AcatsFragmentKeys3.class);
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        Tuples2 tuples2M3642to = Tuples4.m3642to(orCreateKotlinClass, CollectionsKt.listOf(new Configuration.Fragment("Testing", new AcatsFragmentKeys3(uuidRandomUUID), false, false, 12, null)));
        KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(AcatsFragmentKeys2.class);
        UUID uuidRandomUUID2 = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID2, "randomUUID(...)");
        Tuples2 tuples2M3642to2 = Tuples4.m3642to(orCreateKotlinClass2, CollectionsKt.listOf((Object[]) new Configuration.Fragment[]{new Configuration.Fragment("Acats In Testing", new AcatsFragmentKeys2.AcatsIn(uuidRandomUUID2), false, false, 12, null), new Configuration.Fragment("Acats Out Testing", new AcatsFragmentKeys2.AcatsOut(null), false, false, 12, null)}));
        KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(LegacyFragmentKey.EquityInstrumentDetail.class);
        InstrumentDetailSource instrumentDetailSource = InstrumentDetailSource.NONE;
        Configuration.Fragment fragment = new Configuration.Fragment("AAPL (Symbol)", new LegacyFragmentKey.EquityInstrumentDetail("AAPL", instrumentDetailSource, (String) null, 4, (DefaultConstructorMarker) null), false, false, 12, null);
        UUID uuidFromString = UUID.fromString("450dfc6d-5510-4d40-abfb-f633b7d9be3e");
        Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(...)");
        Tuples2 tuples2M3642to3 = Tuples4.m3642to(orCreateKotlinClass3, CollectionsKt.listOf((Object[]) new Configuration.Fragment[]{fragment, new Configuration.Fragment("AAPL (UUID)", new LegacyFragmentKey.EquityInstrumentDetail(uuidFromString, null, null, instrumentDetailSource, false, 22, null), false, false, 12, null)}));
        KClass orCreateKotlinClass4 = Reflection.getOrCreateKotlinClass(PathfinderFragmentKey.class);
        UUID uuid = TEST_UUID;
        Tuples2 tuples2M3642to4 = Tuples4.m3642to(orCreateKotlinClass4, CollectionsKt.listOf(new Configuration.Fragment("Testing", new PathfinderFragmentKey(uuid, null, 2, null), true, false, 8, null)));
        Tuples2 tuples2M3642to5 = Tuples4.m3642to(Reflection.getOrCreateKotlinClass(CxChatFragmentKey.InquiryId.class), CollectionsKt.listOf(new Configuration.Fragment("InquiryId", new CxChatFragmentKey.InquiryId(StringsKt.toUuid("a3aa91b6-a6a8-4dbf-b2eb-97d6c3be3cfc"), false, false, false, null, 28, null), true, false, 8, null)));
        Tuples2 tuples2M3642to6 = Tuples4.m3642to(Reflection.getOrCreateKotlinClass(LegacyFragmentKey.IpoLearningHub.class), CollectionsKt.listOf(new Configuration.Fragment("IpoLearningHub", new LegacyFragmentKey.IpoLearningHub(null, 1, null), false, false, 12, null)));
        Tuples2 tuples2M3642to7 = Tuples4.m3642to(Reflection.getOrCreateKotlinClass(ContactSupportFragmentKey.Debug.class), CollectionsKt.listOf(new Configuration.Fragment("Native Pathfinder", ContactSupportFragmentKey.Debug.INSTANCE, true, false, 8, null)));
        Tuples2 tuples2M3642to8 = Tuples4.m3642to(Reflection.getOrCreateKotlinClass(ConciergeOnboardingFragmentKey.class), CollectionsKt.listOf((Object[]) new Configuration.Fragment[]{new Configuration.Fragment("Default", new ConciergeOnboardingFragmentKey(false, 1, null), true, false, 8, null), new Configuration.Fragment("Skip Eligibility", new ConciergeOnboardingFragmentKey(false), true, false, 8, null)}));
        KClass orCreateKotlinClass5 = Reflection.getOrCreateKotlinClass(AppointmentsSchedulerFragmentKey.class);
        Configuration.Fragment fragment2 = new Configuration.Fragment("Default", new AppointmentsSchedulerFragmentKey("concierge-inbound-appointment", null, null, null, false, 30, null), true, false, 8, null);
        Configuration.Fragment fragment3 = new Configuration.Fragment("Shortcut to notes", new AppointmentsSchedulerFragmentKey("concierge-inbound-appointment", null, new AppointmentsSchedulerFragmentKey.Debug.ShortcutToNotes("test note"), null, false, 26, null), true, false, 8, null);
        Instant instant = Instant.parse("2025-04-16T09:00:00Z");
        Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
        Instant instant2 = Instant.parse("2025-04-16T09:30:00Z");
        Intrinsics.checkNotNullExpressionValue(instant2, "parse(...)");
        Tuples2 tuples2M3642to9 = Tuples4.m3642to(orCreateKotlinClass5, CollectionsKt.listOf((Object[]) new Configuration.Fragment[]{fragment2, fragment3, new Configuration.Fragment("Shortcut to review", new AppointmentsSchedulerFragmentKey("concierge-inbound-appointment", null, new AppointmentsSchedulerFragmentKey.Debug.ShortcutToReview(instant, instant2, "notes", "phone", "email"), null, false, 26, null), true, false, 8, null)}));
        Tuples2 tuples2M3642to10 = Tuples4.m3642to(Reflection.getOrCreateKotlinClass(AppointmentsViewerFragmentKey.class), CollectionsKt.listOf(new Configuration.Fragment("Default", new AppointmentsViewerFragmentKey("test-appointment-id", null, 2, null), true, false, 8, null)));
        KClass orCreateKotlinClass6 = Reflection.getOrCreateKotlinClass(AppointmentsConfirmationFragmentKey.Scheduled.class);
        Instant instant3 = Instant.parse("2025-04-16T12:00:00Z");
        Intrinsics.checkNotNullExpressionValue(instant3, "parse(...)");
        Instant instant4 = Instant.parse("2025-04-16T12:30:00Z");
        Intrinsics.checkNotNullExpressionValue(instant4, "parse(...)");
        ApiAppointment2 apiAppointment2 = ApiAppointment2.SCHEDULED;
        Tuples2 tuples2M3642to11 = Tuples4.m3642to(orCreateKotlinClass6, CollectionsKt.listOf(new Configuration.Fragment("Default", new AppointmentsConfirmationFragmentKey.Scheduled(new Appointment("id", instant3, instant4, apiAppointment2, "campaign_id", "User’s description they entered on the other page should show up here.", "TC.W", true), null, 2, null), true, false, 8, null)));
        KClass orCreateKotlinClass7 = Reflection.getOrCreateKotlinClass(AppointmentsConfirmationFragmentKey.Rescheduled.class);
        Instant instant5 = Instant.parse("2025-04-16T12:00:00Z");
        Intrinsics.checkNotNullExpressionValue(instant5, "parse(...)");
        Instant instant6 = Instant.parse("2025-04-16T12:30:00Z");
        Intrinsics.checkNotNullExpressionValue(instant6, "parse(...)");
        Tuples2 tuples2M3642to12 = Tuples4.m3642to(orCreateKotlinClass7, CollectionsKt.listOf(new Configuration.Fragment("Default", new AppointmentsConfirmationFragmentKey.Rescheduled(new Appointment("id", instant5, instant6, apiAppointment2, "campaign_id", "User’s description they entered on the other page should show up here.", "TC.W", true), null, 2, null), true, false, 8, null)));
        KClass orCreateKotlinClass8 = Reflection.getOrCreateKotlinClass(AppointmentsConfirmationFragmentKey.Cancelled.class);
        Instant instant7 = Instant.parse("2025-04-16T12:00:00Z");
        Intrinsics.checkNotNullExpressionValue(instant7, "parse(...)");
        Instant instant8 = Instant.parse("2025-04-16T12:30:00Z");
        Intrinsics.checkNotNullExpressionValue(instant8, "parse(...)");
        Tuples2 tuples2M3642to13 = Tuples4.m3642to(orCreateKotlinClass8, CollectionsKt.listOf(new Configuration.Fragment("Default", new AppointmentsConfirmationFragmentKey.Cancelled(new Appointment("id", instant7, instant8, ApiAppointment2.CANCELED, "campaign_id", "User’s description they entered on the other page should show up here.", "TC.W", false), null, 2, null), true, false, 8, null)));
        Tuples2 tuples2M3642to14 = Tuples4.m3642to(Reflection.getOrCreateKotlinClass(ReviewCallDetailsFragmentKey.class), CollectionsKt.listOf(new Configuration.Fragment("Default", new ReviewCallDetailsFragmentKey(uuid, new IssueDetail.Phone("Options", new RichText("description", CollectionsKt.emptyList()), new RichText("Disclosure, visit Robinhood for more information.", CollectionsKt.listOf(new RichText.Attribute(18, 9, Uri.parse("https://www.robinhood.com"), RichText.TextStyle.UNDERLINE, null))), new Channel.Phone("000-000-0000", new CallDescription("Is there anything else we should know?", new RichText("We’ll use any info you share to better assist you during your call.", CollectionsKt.emptyList()), 10, 5, "Ask a question or describe your issue.", 1)), true), null, false, 4, null), true, false, 8, null)));
        Tuples2 tuples2M3642to15 = Tuples4.m3642to(Reflection.getOrCreateKotlinClass(LegacyFragmentKey.ProgramDetail.class), CollectionsKt.listOf(new Configuration.Fragment("Default", new LegacyFragmentKey.ProgramDetail(StringsKt.toUuid("2b130520-90eb-11ec-b909-0242ac120002")), true, false, 8, null)));
        Tuples2 tuples2M3642to16 = Tuples4.m3642to(Reflection.getOrCreateKotlinClass(PspGiftHistoryDetailFragmentKey.class), CollectionsKt.listOf(new Configuration.Fragment("Default", new PspGiftHistoryDetailFragmentKey(StringsKt.toUuid("2b130520-90eb-11ec-b909-0242ac120002")), true, false, 8, null)));
        Tuples2 tuples2M3642to17 = Tuples4.m3642to(Reflection.getOrCreateKotlinClass(QuestionnaireReview.class), CollectionsKt.listOf((Object[]) new Configuration.Fragment[]{new Configuration.Fragment("Retirement recs traditional IRA questionnaire review", new QuestionnaireReview(QuestionnaireContexts.RETIREMENT_RECS_TRADITIONAL_IRA, null, null, null, null, 28, null), true, false, 8, null), new Configuration.Fragment("Retirement recs roth IRA questionnaire review", new QuestionnaireReview(QuestionnaireContexts.RETIREMENT_RECS_ROTH_IRA, null, null, null, null, 28, null), true, false, 8, null)}));
        Tuples2 tuples2M3642to18 = Tuples4.m3642to(Reflection.getOrCreateKotlinClass(PromptsMfaEnrollment.class), CollectionsKt.listOf((Object[]) new Configuration.Fragment[]{new Configuration.Fragment("Prompts Mfa Enrollment", new PromptsMfaEnrollment(false, "identifier"), true, false, 8, null), new Configuration.Fragment("Prompts Mfa Enrollment from Crypto Transfers", new PromptsMfaEnrollment(true, AnalyticsStrings.TAB_NAV_TAB_BAR_CRYPTO), true, false, 8, null)}));
        Tuples2 tuples2M3642to19 = Tuples4.m3642to(Reflection.getOrCreateKotlinClass(RecommendationsRecurringHook.class), CollectionsKt.listOf(new Configuration.Fragment("Recommendations Recurring Hook", new RecommendationsRecurringHook("FragmentKeyRegistry", "123456789", "Test", StringsKt.toUuid("00000000-0000-0000-0000-000000000000")), true, false, 8, null)));
        Tuples2 tuples2M3642to20 = Tuples4.m3642to(Reflection.getOrCreateKotlinClass(GoldDepositBoostHubFragmentKey.class), CollectionsKt.listOf(new Configuration.Fragment("Gold Deposit Boost Hub", new GoldDepositBoostHubFragmentKey(null, 1, null), false, false, 12, null)));
        KClass orCreateKotlinClass9 = Reflection.getOrCreateKotlinClass(CryptoDetailV2FragmentKey.class);
        UUID uuidFromString2 = UUID.fromString("9e41c8e5-bfb5-46b5-8fa9-3a55981702d1");
        Intrinsics.checkNotNullExpressionValue(uuidFromString2, "fromString(...)");
        Configuration.Fragment fragment4 = new Configuration.Fragment("CryptoDetailV2 BTC-EUR", new CryptoDetailV2FragmentKey.Crypto(uuidFromString2, null, 2, null), true, false, 8, null);
        UUID uuidFromString3 = UUID.fromString("3d961844-d360-45fc-989b-f6fca761d511");
        Intrinsics.checkNotNullExpressionValue(uuidFromString3, "fromString(...)");
        Tuples2 tuples2M3642to21 = Tuples4.m3642to(orCreateKotlinClass9, CollectionsKt.listOf((Object[]) new Configuration.Fragment[]{fragment4, new Configuration.Fragment("CryptoDetailV2 BTC-USD", new CryptoDetailV2FragmentKey.Crypto(uuidFromString3, null, 2, null), true, false, 8, null)}));
        Tuples2 tuples2M3642to22 = Tuples4.m3642to(Reflection.getOrCreateKotlinClass(SettingsFragmentKey.class), CollectionsKt.listOf((Object[]) new Configuration.Fragment[]{new Configuration.Fragment("LaunchType: LAUNCH_INVESTMENT_PROFILE", new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_INVESTMENT_PROFILE, false, false, false, null, null, null, null, false, 510, null), false, false, 12, null), new Configuration.Fragment("LaunchType: LAUNCH_UPDATE_ACCOUNT", new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_UPDATE_ACCOUNT, false, false, false, null, null, null, null, false, 510, null), false, false, 12, null), new Configuration.Fragment("LaunchType: LAUNCH_NOTIFICATION_SETTINGS", new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_NOTIFICATION_SETTINGS, false, false, false, null, null, null, null, false, 510, null), false, false, 12, null), new Configuration.Fragment("LaunchType: LAUNCH_OPTIONS_SETTINGS", new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_OPTIONS_SETTINGS, false, false, false, null, null, null, null, false, 510, null), false, false, 12, null), new Configuration.Fragment("LaunchType: LAUNCH_CASH_MANAGEMENT_SETTINGS", new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_CASH_MANAGEMENT_SETTINGS, false, false, false, null, null, null, null, false, 510, null), false, false, 12, null), new Configuration.Fragment("LaunchType: LAUNCH_APP_APPEARANCE_SETTINGS", new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_APP_APPEARANCE_SETTINGS, false, false, false, null, null, null, null, false, 510, null), false, false, 12, null), new Configuration.Fragment("LaunchType: LAUNCH_APP_AUTO_PLAY_SETTINGS", new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_APP_AUTO_PLAY_SETTINGS, false, false, false, null, null, null, null, false, 510, null), false, false, 12, null), new Configuration.Fragment("LaunchType: LAUNCH_DAY_TRADE_SETTINGS", new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_DAY_TRADE_SETTINGS, false, false, false, null, null, null, null, false, 510, null), false, false, 12, null), new Configuration.Fragment("LaunchType: LAUNCH_MARGIN_SETTINGS", new SettingsFragmentKey(SettingsFragmentKey3.LAUNCH_MARGIN_SETTINGS, false, false, false, null, null, null, null, false, 510, null), false, false, 12, null)}));
        KClass orCreateKotlinClass10 = Reflection.getOrCreateKotlinClass(AlertHubSettingsKey.class);
        AlertHubSettings2 alertHubSettings2 = AlertHubSettings2.CRYPTO;
        AdvancedAlert4 advancedAlert4 = AdvancedAlert4.DEEP_LINK;
        return SetsKt.setOf((Object[]) new Tuples2[]{tuples2M3642to, tuples2M3642to2, tuples2M3642to3, tuples2M3642to4, tuples2M3642to5, tuples2M3642to6, tuples2M3642to7, tuples2M3642to8, tuples2M3642to9, tuples2M3642to10, tuples2M3642to11, tuples2M3642to12, tuples2M3642to13, tuples2M3642to14, tuples2M3642to15, tuples2M3642to16, tuples2M3642to17, tuples2M3642to18, tuples2M3642to19, tuples2M3642to20, tuples2M3642to21, tuples2M3642to22, Tuples4.m3642to(orCreateKotlinClass10, CollectionsKt.listOf((Object[]) new Configuration.Fragment[]{new Configuration.Fragment("Crypto Deep Link", new AlertHubSettingsKey(alertHubSettings2, advancedAlert4), false, false, 12, null), new Configuration.Fragment("Stock Deep Link", new AlertHubSettingsKey(AlertHubSettings2.STOCK, advancedAlert4), false, false, 12, null)})), Tuples4.m3642to(Reflection.getOrCreateKotlinClass(LegacyFragmentKey.NewProductsLanding.class), CollectionsKt.listOf(new Configuration.Fragment("NewProducts", new LegacyFragmentKey.NewProductsLanding(SLRemoteConfiguration.Constants.DEBUG_JSON_KEY), false, false, 12, null))), Tuples4.m3642to(Reflection.getOrCreateKotlinClass(LegacyFragmentKey.EducationHome.class), CollectionsKt.listOf(new Configuration.Fragment("EducationHome", new LegacyFragmentKey.EducationHome(SLRemoteConfiguration.Constants.DEBUG_JSON_KEY), false, false, 12, null))), Tuples4.m3642to(Reflection.getOrCreateKotlinClass(LegacyFragmentKey.ProfileVisibility.class), CollectionsKt.listOf((Object[]) new Configuration.Fragment[]{new Configuration.Fragment("Without 'Set Up Profile' Button", new LegacyFragmentKey.ProfileVisibility(false), false, false, 12, null), new Configuration.Fragment("With 'Set Up Profile' Button", new LegacyFragmentKey.ProfileVisibility(true), false, false, 12, null)})), Tuples4.m3642to(Reflection.getOrCreateKotlinClass(OrderTypeEducationFragmentKey.class), CollectionsKt.listOf(new Configuration.Fragment("OrderTypeEducation (Recurring AAPL)", new OrderTypeEducationFragmentKey(new OrderTypeEducationFragmentKey.OrderTypeEducationConfiguration.Recurring(StringsKt.toUuid("450dfc6d-5510-4d40-abfb-f633b7d9be3e"), false, false, null, 14, null)), false, false, 12, null))), Tuples4.m3642to(Reflection.getOrCreateKotlinClass(AccountSpecificNonOriginatedTransferInfo.class), CollectionsKt.listOf((Object[]) new Configuration.Fragment[]{new Configuration.Fragment("Direct Deposits", new AccountSpecificNonOriginatedTransferInfo(NonOriginatedTransferTypeDto.f314DD), false, false, 12, null), new Configuration.Fragment("Incoming Wires", new AccountSpecificNonOriginatedTransferInfo(NonOriginatedTransferTypeDto.WIRE), false, false, 12, null)}))});
    }
}
