package com.robinhood.android.portfolio.lists.handler;

import com.android.shared.portfolio.lists.handler.ListsAlertPromptHandler;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListsHandlerModule_BindListsAlertPromptHandlerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/lists/handler/ListsHandlerModule_BindListsAlertPromptHandlerFactory;", "Ldagger/internal/Factory;", "Lcom/android/shared/portfolio/lists/handler/ListsAlertPromptHandler;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "bindListsAlertPromptHandler", "lib-lists-handler_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ListsHandlerModule_BindListsAlertPromptHandlerFactory implements Factory<ListsAlertPromptHandler> {
    public static final ListsHandlerModule_BindListsAlertPromptHandlerFactory INSTANCE = new ListsHandlerModule_BindListsAlertPromptHandlerFactory();

    private ListsHandlerModule_BindListsAlertPromptHandlerFactory() {
    }

    @Override // javax.inject.Provider
    public ListsAlertPromptHandler get() {
        return bindListsAlertPromptHandler();
    }

    @JvmStatic
    public static final ListsHandlerModule_BindListsAlertPromptHandlerFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final ListsAlertPromptHandler bindListsAlertPromptHandler() {
        Object objCheckNotNull = Preconditions.checkNotNull(ListsHandlerModule.INSTANCE.bindListsAlertPromptHandler(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (ListsAlertPromptHandler) objCheckNotNull;
    }
}
