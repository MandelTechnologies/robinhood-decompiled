package com.robinhood.experiments;

import com.robinhood.enums.RhEnum;
import com.robinhood.experiments.variant.FullExtendedHoursVariant;
import java.lang.Enum;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Experiment.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001b\b&\u0018\u0000*\u0018\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002*\b\u0012\u0004\u0012\u0002H\u00010\u00032\b\u0012\u0004\u0012\u0002H\u00010\u0004:\u0017\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006!"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment;", "VariantT", "", "Lcom/robinhood/enums/RhEnum;", "Lcom/robinhood/experiments/ExperimentDeclaration;", "serverName", "", "obfuscatedName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "USERLEAP", "INBOX_MEDIA_UPLOAD", "ACH_TRANSFER_DAILY_LIMIT", "REVIEW_PROMPT_KILLSWITCH", "CASH_IN_APP_REUPGRADE", "CRYPTO_RESTRICTIONS_INFO_KS", "MOBILE_PLAID_EXPERIMENT", "CASH_LIMITED_INTEREST", "AUTO_DEPOSIT_RECURRING_INVESTMENTS_HOOK", "URL_REDIRECT_SERVICE", "SINGLE_HTTP_CALL_EVENT_LOGGING", "DIAGNOSTIC_EVENT_LOGGING", "RECURRING_FIND_AN_INVESTMENT", "PO_COMM_STRAT_INFO_BANNER_CDP_TOP_PAGE", "PO_COMM_STRAT_INFO_BANNER_CDP_WAITLIST", "INSTANT_INFO_DELIVERY_REVAMP", "OPTIONS_SERVER_DRIVEN_NOMENCLATURE", "MARITAL_STATUS_NUM_DEPENDENTS_UPGRADE_FLOW_CHECK", "PORTFOLIO_PERFORMANCE_CHART_VIEW", "SYP_POST_DD", "FULL_EXTENDED_HOURS", "FORCE_POST_CM", "NOA_REDIRECT_MESSAGING", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public abstract class Experiment<VariantT extends Enum<VariantT> & RhEnum<VariantT>> extends ExperimentDeclaration<VariantT> {
    public /* synthetic */ Experiment(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Experiment(String serverName, String str) {
        super(serverName, str, null);
        Intrinsics.checkNotNullParameter(serverName, "serverName");
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$USERLEAP;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class USERLEAP extends Experiment<SimpleVariant> {
        public static final USERLEAP INSTANCE = new USERLEAP();

        /* JADX WARN: Multi-variable type inference failed */
        private USERLEAP() {
            super("android-user-leap-surveys", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$INBOX_MEDIA_UPLOAD;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class INBOX_MEDIA_UPLOAD extends Experiment<SimpleVariant> {
        public static final INBOX_MEDIA_UPLOAD INSTANCE = new INBOX_MEDIA_UPLOAD();

        /* JADX WARN: Multi-variable type inference failed */
        private INBOX_MEDIA_UPLOAD() {
            super("android-inbox-media-upload", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$ACH_TRANSFER_DAILY_LIMIT;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class ACH_TRANSFER_DAILY_LIMIT extends Experiment<SimpleVariant> {
        public static final ACH_TRANSFER_DAILY_LIMIT INSTANCE = new ACH_TRANSFER_DAILY_LIMIT();

        /* JADX WARN: Multi-variable type inference failed */
        private ACH_TRANSFER_DAILY_LIMIT() {
            super("ach-transfer-daily-limit-experiment", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$REVIEW_PROMPT_KILLSWITCH;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class REVIEW_PROMPT_KILLSWITCH extends Experiment<SimpleVariant> {
        public static final REVIEW_PROMPT_KILLSWITCH INSTANCE = new REVIEW_PROMPT_KILLSWITCH();

        /* JADX WARN: Multi-variable type inference failed */
        private REVIEW_PROMPT_KILLSWITCH() {
            super("android-review-prompt-killswitch-v2", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$CASH_IN_APP_REUPGRADE;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CASH_IN_APP_REUPGRADE extends Experiment<SimpleVariant> {
        public static final CASH_IN_APP_REUPGRADE INSTANCE = new CASH_IN_APP_REUPGRADE();

        /* JADX WARN: Multi-variable type inference failed */
        private CASH_IN_APP_REUPGRADE() {
            super("android-cm-in-app-re-upgrade", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$CRYPTO_RESTRICTIONS_INFO_KS;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CRYPTO_RESTRICTIONS_INFO_KS extends Experiment<SimpleVariant> {
        public static final CRYPTO_RESTRICTIONS_INFO_KS INSTANCE = new CRYPTO_RESTRICTIONS_INFO_KS();

        /* JADX WARN: Multi-variable type inference failed */
        private CRYPTO_RESTRICTIONS_INFO_KS() {
            super("android-crypto-restrictions-info-ks", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$MOBILE_PLAID_EXPERIMENT;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MOBILE_PLAID_EXPERIMENT extends Experiment<SimpleVariant> {
        public static final MOBILE_PLAID_EXPERIMENT INSTANCE = new MOBILE_PLAID_EXPERIMENT();

        /* JADX WARN: Multi-variable type inference failed */
        private MOBILE_PLAID_EXPERIMENT() {
            super("plaid-android-experiment", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$CASH_LIMITED_INTEREST;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class CASH_LIMITED_INTEREST extends Experiment<SimpleVariant> {
        public static final CASH_LIMITED_INTEREST INSTANCE = new CASH_LIMITED_INTEREST();

        /* JADX WARN: Multi-variable type inference failed */
        private CASH_LIMITED_INTEREST() {
            super("cm-limited-interest", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$AUTO_DEPOSIT_RECURRING_INVESTMENTS_HOOK;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class AUTO_DEPOSIT_RECURRING_INVESTMENTS_HOOK extends Experiment<SimpleVariant> {
        public static final AUTO_DEPOSIT_RECURRING_INVESTMENTS_HOOK INSTANCE = new AUTO_DEPOSIT_RECURRING_INVESTMENTS_HOOK();

        /* JADX WARN: Multi-variable type inference failed */
        private AUTO_DEPOSIT_RECURRING_INVESTMENTS_HOOK() {
            super("android-auto-deposit-recurring-investments-hook", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$URL_REDIRECT_SERVICE;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class URL_REDIRECT_SERVICE extends Experiment<SimpleVariant> {
        public static final URL_REDIRECT_SERVICE INSTANCE = new URL_REDIRECT_SERVICE();

        /* JADX WARN: Multi-variable type inference failed */
        private URL_REDIRECT_SERVICE() {
            super("android-deeplink-secure-redirect", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$SINGLE_HTTP_CALL_EVENT_LOGGING;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SINGLE_HTTP_CALL_EVENT_LOGGING extends Experiment<SimpleVariant> {
        public static final SINGLE_HTTP_CALL_EVENT_LOGGING INSTANCE = new SINGLE_HTTP_CALL_EVENT_LOGGING();

        /* JADX WARN: Multi-variable type inference failed */
        private SINGLE_HTTP_CALL_EVENT_LOGGING() {
            super("android-single-http-call-event-logging-v2", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$DIAGNOSTIC_EVENT_LOGGING;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DIAGNOSTIC_EVENT_LOGGING extends Experiment<SimpleVariant> {
        public static final DIAGNOSTIC_EVENT_LOGGING INSTANCE = new DIAGNOSTIC_EVENT_LOGGING();

        /* JADX WARN: Multi-variable type inference failed */
        private DIAGNOSTIC_EVENT_LOGGING() {
            super("android-diagnostic-event-logging", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$RECURRING_FIND_AN_INVESTMENT;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class RECURRING_FIND_AN_INVESTMENT extends Experiment<SimpleVariant> {
        public static final RECURRING_FIND_AN_INVESTMENT INSTANCE = new RECURRING_FIND_AN_INVESTMENT();

        /* JADX WARN: Multi-variable type inference failed */
        private RECURRING_FIND_AN_INVESTMENT() {
            super("android-recurring-find-an-investment", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$PO_COMM_STRAT_INFO_BANNER_CDP_TOP_PAGE;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PO_COMM_STRAT_INFO_BANNER_CDP_TOP_PAGE extends Experiment<SimpleVariant> {
        public static final PO_COMM_STRAT_INFO_BANNER_CDP_TOP_PAGE INSTANCE = new PO_COMM_STRAT_INFO_BANNER_CDP_TOP_PAGE();

        /* JADX WARN: Multi-variable type inference failed */
        private PO_COMM_STRAT_INFO_BANNER_CDP_TOP_PAGE() {
            super("postoffice-comm-strat-info-banners-cdp-top-level", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$PO_COMM_STRAT_INFO_BANNER_CDP_WAITLIST;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PO_COMM_STRAT_INFO_BANNER_CDP_WAITLIST extends Experiment<SimpleVariant> {
        public static final PO_COMM_STRAT_INFO_BANNER_CDP_WAITLIST INSTANCE = new PO_COMM_STRAT_INFO_BANNER_CDP_WAITLIST();

        /* JADX WARN: Multi-variable type inference failed */
        private PO_COMM_STRAT_INFO_BANNER_CDP_WAITLIST() {
            super("postoffice-comm-strat-info-banners-cdp-waitlist", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$INSTANT_INFO_DELIVERY_REVAMP;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class INSTANT_INFO_DELIVERY_REVAMP extends Experiment<SimpleVariant> {
        public static final INSTANT_INFO_DELIVERY_REVAMP INSTANCE = new INSTANT_INFO_DELIVERY_REVAMP();

        /* JADX WARN: Multi-variable type inference failed */
        private INSTANT_INFO_DELIVERY_REVAMP() {
            super("instant-info-delivery-revamp", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$OPTIONS_SERVER_DRIVEN_NOMENCLATURE;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class OPTIONS_SERVER_DRIVEN_NOMENCLATURE extends Experiment<SimpleVariant> {
        public static final OPTIONS_SERVER_DRIVEN_NOMENCLATURE INSTANCE = new OPTIONS_SERVER_DRIVEN_NOMENCLATURE();

        /* JADX WARN: Multi-variable type inference failed */
        private OPTIONS_SERVER_DRIVEN_NOMENCLATURE() {
            super("android-options-server-driven-nomenclature", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$MARITAL_STATUS_NUM_DEPENDENTS_UPGRADE_FLOW_CHECK;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class MARITAL_STATUS_NUM_DEPENDENTS_UPGRADE_FLOW_CHECK extends Experiment<SimpleVariant> {
        public static final MARITAL_STATUS_NUM_DEPENDENTS_UPGRADE_FLOW_CHECK INSTANCE = new MARITAL_STATUS_NUM_DEPENDENTS_UPGRADE_FLOW_CHECK();

        /* JADX WARN: Multi-variable type inference failed */
        private MARITAL_STATUS_NUM_DEPENDENTS_UPGRADE_FLOW_CHECK() {
            super("marital-status-num-dependents-upgrade-flow-check", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$PORTFOLIO_PERFORMANCE_CHART_VIEW;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class PORTFOLIO_PERFORMANCE_CHART_VIEW extends Experiment<SimpleVariant> {
        public static final PORTFOLIO_PERFORMANCE_CHART_VIEW INSTANCE = new PORTFOLIO_PERFORMANCE_CHART_VIEW();

        /* JADX WARN: Multi-variable type inference failed */
        private PORTFOLIO_PERFORMANCE_CHART_VIEW() {
            super("portfolio-performance-chart-view", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$SYP_POST_DD;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class SYP_POST_DD extends Experiment<SimpleVariant> {
        public static final SYP_POST_DD INSTANCE = new SYP_POST_DD();

        /* JADX WARN: Multi-variable type inference failed */
        private SYP_POST_DD() {
            super("syp-post-dd", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$FULL_EXTENDED_HOURS;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/variant/FullExtendedHoursVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FULL_EXTENDED_HOURS extends Experiment<FullExtendedHoursVariant> {
        public static final FULL_EXTENDED_HOURS INSTANCE = new FULL_EXTENDED_HOURS();

        /* JADX WARN: Multi-variable type inference failed */
        private FULL_EXTENDED_HOURS() {
            super("full-extended-hours", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$FORCE_POST_CM;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class FORCE_POST_CM extends Experiment<SimpleVariant> {
        public static final FORCE_POST_CM INSTANCE = new FORCE_POST_CM();

        /* JADX WARN: Multi-variable type inference failed */
        private FORCE_POST_CM() {
            super("android-force-post-cm", null, 2, 0 == true ? 1 : 0);
        }
    }

    /* compiled from: Experiment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/experiments/Experiment$NOA_REDIRECT_MESSAGING;", "Lcom/robinhood/experiments/Experiment;", "Lcom/robinhood/experiments/SimpleVariant;", "<init>", "()V", "lib-experiments_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class NOA_REDIRECT_MESSAGING extends Experiment<SimpleVariant> {
        public static final NOA_REDIRECT_MESSAGING INSTANCE = new NOA_REDIRECT_MESSAGING();

        /* JADX WARN: Multi-variable type inference failed */
        private NOA_REDIRECT_MESSAGING() {
            super("noa-redirect-messaging", null, 2, 0 == true ? 1 : 0);
        }
    }
}
