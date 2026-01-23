package com.robinhood.android.questionnaire.api;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.questionnaire.api.ApiSummaryAnswerContent;
import com.robinhood.utils.moshi.JsonAdapterBinding;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiSummaryAnswerContent_Unsupported_AdapterModule_ProvideAdapterFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/questionnaire/api/ApiSummaryAnswerContent_Unsupported_AdapterModule_ProvideAdapterFactory;", "Ldagger/internal/Factory;", "Lcom/robinhood/utils/moshi/JsonAdapterBinding;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "provideAdapter", "lib-models-questionnaire_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.questionnaire.api.ApiSummaryAnswerContent_Unsupported_AdapterModule_ProvideAdapterFactory */
/* loaded from: classes17.dex */
public final class C25976xe366a95e implements Factory<JsonAdapterBinding> {
    public static final C25976xe366a95e INSTANCE = new C25976xe366a95e();

    private C25976xe366a95e() {
    }

    @Override // javax.inject.Provider
    public JsonAdapterBinding get() {
        return provideAdapter();
    }

    @JvmStatic
    public static final C25976xe366a95e create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final JsonAdapterBinding provideAdapter() {
        Object objCheckNotNull = Preconditions.checkNotNull(ApiSummaryAnswerContent.Unsupported.AdapterModule.INSTANCE.provideAdapter(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (JsonAdapterBinding) objCheckNotNull;
    }
}
