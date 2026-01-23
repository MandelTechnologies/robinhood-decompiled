package com.robinhood.android.questionnaire.p219db;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: QuestionnaireContexts.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/questionnaire/db/QuestionnaireContexts;", "", "<init>", "()V", "SUITABILITY", "", "SUITABILITY_ROTH_IRA", "SUITABILITY_TRADITIONAL_IRA", "SECOND_TRADE", "JOINT_ACCOUNT_SECOND_TRADE", "OPTIONS", "OPTIONS_ROTH_IRA", "OPTIONS_TRADITIONAL_IRA", "RETIREMENT_RECS_ROTH_IRA", "RETIREMENT_RECS_TRADITIONAL_IRA", "AML_REFRESH", "RETIREMENT_ADVISORY_ROTH_IRA", "RETIREMENT_ADVISORY_TRADITIONAL_IRA", "SLIP_RECOMMENDATIONS", "FUTURES_SUITABILITY", "FUTURES_UK_SUITABILITY", "FUTURES_UK_KNOWLEDGE_QUIZ", "MARGIN_EXPERIENCE", "MARGIN_KNOWLEDGE", "ADVISORY_INDIVIDUAL", "CAR_SUITABILITY", "CAR_SUITABILITY_RETRY", "CRYPTO_SCAM", "IRA_ACCOUNT_TYPE_RECO_2023", "IRA_ACCOUNT_TYPE_RECO_2024", "GRAPH_SUPPORTED_CONTEXTS", "", "getGRAPH_SUPPORTED_CONTEXTS", "()Ljava/util/List;", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class QuestionnaireContexts {
    public static final String ADVISORY_INDIVIDUAL = "advisory_individual";
    public static final String AML_REFRESH = "aml_refresh";
    public static final String FUTURES_SUITABILITY = "futures";
    public static final String FUTURES_UK_KNOWLEDGE_QUIZ = "futures_knowledge";
    public static final String JOINT_ACCOUNT_SECOND_TRADE = "ja_second_trade";
    public static final String MARGIN_EXPERIENCE = "margin_experience";
    public static final String MARGIN_KNOWLEDGE = "margin_knowledge";
    public static final String OPTIONS = "options";
    public static final String OPTIONS_ROTH_IRA = "options_roth_ira";
    public static final String OPTIONS_TRADITIONAL_IRA = "options_traditional_ira";
    public static final String RETIREMENT_RECS_ROTH_IRA = "retirement_recs_roth_ira";
    public static final String RETIREMENT_RECS_TRADITIONAL_IRA = "retirement_recs_traditional_ira";
    public static final String SECOND_TRADE = "second_trade";
    public static final String SLIP_RECOMMENDATIONS = "slip_recommendations";
    public static final String SUITABILITY = "suitability";
    public static final String SUITABILITY_ROTH_IRA = "suitability_roth_ira";
    public static final String SUITABILITY_TRADITIONAL_IRA = "suitability_traditional_ira";
    public static final QuestionnaireContexts INSTANCE = new QuestionnaireContexts();
    public static final String RETIREMENT_ADVISORY_ROTH_IRA = "advisory_roth_ira";
    public static final String RETIREMENT_ADVISORY_TRADITIONAL_IRA = "advisory_traditional_ira";
    public static final String FUTURES_UK_SUITABILITY = "futures_experience";
    private static final String IRA_ACCOUNT_TYPE_RECO_2023 = "ira_account_type_reco_2023";
    private static final String IRA_ACCOUNT_TYPE_RECO_2024 = "ira_account_type_reco_2024";
    public static final String CAR_SUITABILITY = "car_suitability";
    public static final String CAR_SUITABILITY_RETRY = "car_suitability_retry";
    public static final String CRYPTO_SCAM = "crypto_scam";
    private static final List<String> GRAPH_SUPPORTED_CONTEXTS = CollectionsKt.listOf((Object[]) new String[]{RETIREMENT_ADVISORY_ROTH_IRA, RETIREMENT_ADVISORY_TRADITIONAL_IRA, "futures", FUTURES_UK_SUITABILITY, IRA_ACCOUNT_TYPE_RECO_2023, IRA_ACCOUNT_TYPE_RECO_2024, CAR_SUITABILITY, CAR_SUITABILITY_RETRY, CRYPTO_SCAM});

    private QuestionnaireContexts() {
    }

    public final List<String> getGRAPH_SUPPORTED_CONTEXTS() {
        return GRAPH_SUPPORTED_CONTEXTS;
    }
}
