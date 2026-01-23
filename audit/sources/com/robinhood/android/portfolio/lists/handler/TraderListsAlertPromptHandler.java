package com.robinhood.android.portfolio.lists.handler;

import androidx.fragment.app.DialogFragment;
import com.android.shared.portfolio.lists.handler.ListsAlertPromptHandler;
import com.robinhood.android.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TraderListsAlertPromptHandler.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/portfolio/lists/handler/TraderListsAlertPromptHandler;", "Lcom/android/shared/portfolio/lists/handler/ListsAlertPromptHandler;", "<init>", "()V", "createAlertPromptBottomSheet", "Landroidx/fragment/app/DialogFragment;", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "onAlertPromptBottomSheetShown", "", "lib-lists-handler_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes11.dex */
public final class TraderListsAlertPromptHandler implements ListsAlertPromptHandler {
    public static final TraderListsAlertPromptHandler INSTANCE = new TraderListsAlertPromptHandler();

    @Override // com.android.shared.portfolio.lists.handler.ListsAlertPromptHandler
    public DialogFragment createAlertPromptBottomSheet(Navigator navigator) {
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        return null;
    }

    @Override // com.android.shared.portfolio.lists.handler.ListsAlertPromptHandler
    public void onAlertPromptBottomSheetShown() {
    }

    private TraderListsAlertPromptHandler() {
    }
}
