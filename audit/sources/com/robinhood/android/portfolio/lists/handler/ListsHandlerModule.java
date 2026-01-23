package com.robinhood.android.portfolio.lists.handler;

import com.android.shared.portfolio.lists.handler.CryptoHomeListsAdditionClickHandler;
import com.android.shared.portfolio.lists.handler.ListInstrumentClickHandler;
import com.android.shared.portfolio.lists.handler.ListsAlertPromptHandler;
import kotlin.Metadata;

/* compiled from: ListsHandlerModule.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\b\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/portfolio/lists/handler/ListsHandlerModule;", "", "<init>", "()V", "bindListsAdditionClickHandler", "Lcom/android/shared/portfolio/lists/handler/CryptoHomeListsAdditionClickHandler;", "bindListsAlertPromptHandler", "Lcom/android/shared/portfolio/lists/handler/ListsAlertPromptHandler;", "bindListInstrumentClickHandler", "Lcom/android/shared/portfolio/lists/handler/ListInstrumentClickHandler;", "lib-lists-handler_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class ListsHandlerModule {
    public static final ListsHandlerModule INSTANCE = new ListsHandlerModule();

    private ListsHandlerModule() {
    }

    public final CryptoHomeListsAdditionClickHandler bindListsAdditionClickHandler() {
        return TraderCryptoHomeListsAdditionClickHandler.INSTANCE;
    }

    public final ListsAlertPromptHandler bindListsAlertPromptHandler() {
        return TraderListsAlertPromptHandler.INSTANCE;
    }

    public final ListInstrumentClickHandler bindListInstrumentClickHandler() {
        return TraderListInstrumentClickHandler.INSTANCE;
    }
}
