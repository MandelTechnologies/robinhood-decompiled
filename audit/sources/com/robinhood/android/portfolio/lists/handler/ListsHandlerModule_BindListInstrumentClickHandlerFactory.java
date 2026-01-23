package com.robinhood.android.portfolio.lists.handler;

import com.android.shared.portfolio.lists.handler.ListInstrumentClickHandler;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ListsHandlerModule_BindListInstrumentClickHandlerFactory.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0000H\u0007J\b\u0010\u0007\u001a\u00020\u0002H\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/portfolio/lists/handler/ListsHandlerModule_BindListInstrumentClickHandlerFactory;", "Ldagger/internal/Factory;", "Lcom/android/shared/portfolio/lists/handler/ListInstrumentClickHandler;", "<init>", "()V", "get", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "bindListInstrumentClickHandler", "lib-lists-handler_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class ListsHandlerModule_BindListInstrumentClickHandlerFactory implements Factory<ListInstrumentClickHandler> {
    public static final ListsHandlerModule_BindListInstrumentClickHandlerFactory INSTANCE = new ListsHandlerModule_BindListInstrumentClickHandlerFactory();

    private ListsHandlerModule_BindListInstrumentClickHandlerFactory() {
    }

    @Override // javax.inject.Provider
    public ListInstrumentClickHandler get() {
        return bindListInstrumentClickHandler();
    }

    @JvmStatic
    public static final ListsHandlerModule_BindListInstrumentClickHandlerFactory create() {
        return INSTANCE;
    }

    @JvmStatic
    public static final ListInstrumentClickHandler bindListInstrumentClickHandler() {
        Object objCheckNotNull = Preconditions.checkNotNull(ListsHandlerModule.INSTANCE.bindListInstrumentClickHandler(), "Cannot return null from a non-@Nullable @Provides method");
        Intrinsics.checkNotNullExpressionValue(objCheckNotNull, "checkNotNull(...)");
        return (ListInstrumentClickHandler) objCheckNotNull;
    }
}
